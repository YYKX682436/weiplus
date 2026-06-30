package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaLayoutType {
    LAYOUT(0),
    MEASURE(1),
    CACHED_LAYOUT(2),
    CACHED_MEASURE(3);

    private final int mIntValue;

    YogaLayoutType(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaLayoutType fromInt(int i17) {
        if (i17 == 0) {
            return LAYOUT;
        }
        if (i17 == 1) {
            return MEASURE;
        }
        if (i17 == 2) {
            return CACHED_LAYOUT;
        }
        if (i17 == 3) {
            return CACHED_MEASURE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
