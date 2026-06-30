package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaDimension {
    WIDTH(0),
    HEIGHT(1);

    private final int mIntValue;

    YogaDimension(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaDimension fromInt(int i17) {
        if (i17 == 0) {
            return WIDTH;
        }
        if (i17 == 1) {
            return HEIGHT;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
