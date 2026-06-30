package com.facebook.yoga;

/* loaded from: classes11.dex */
public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);

    private final int mIntValue;

    YogaPositionType(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaPositionType fromInt(int i17) {
        if (i17 == 0) {
            return RELATIVE;
        }
        if (i17 == 1) {
            return ABSOLUTE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
