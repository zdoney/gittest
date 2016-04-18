package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float a = value * 9;
        a /= 5.0;
        a += 32;
        return new Fahrenheit(a);
    }


    public String toString()
        {
            // TODO: Complete this method
            return "" + value + " C";
        }
}
