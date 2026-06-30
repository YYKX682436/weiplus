package com.facebook.yoga;

/* loaded from: classes11.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int mIntValue;

    YogaDirection(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaDirection fromInt(int i17) {
        if (i17 == 0) {
            return INHERIT;
        }
        if (i17 == 1) {
            return LTR;
        }
        if (i17 == 2) {
            return RTL;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
