package com.xfl.bean;

public class Car {

    private String speed;


    private String height;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed='" + speed + '\'' +
                ", height='" + height + '\'' +
                '}';
    }



}
