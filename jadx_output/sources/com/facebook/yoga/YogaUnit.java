package com.facebook.yoga;

/* loaded from: classes15.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);

    private final int mIntValue;

    YogaUnit(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaUnit fromInt(int i17) {
        if (i17 == 0) {
            return UNDEFINED;
        }
        if (i17 == 1) {
            return POINT;
        }
        if (i17 == 2) {
            return PERCENT;
        }
        if (i17 == 3) {
            return AUTO;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
