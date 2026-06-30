package com.facebook.yoga;

/* loaded from: classes15.dex */
public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int mIntValue;

    YogaWrap(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaWrap fromInt(int i17) {
        if (i17 == 0) {
            return NO_WRAP;
        }
        if (i17 == 1) {
            return WRAP;
        }
        if (i17 == 2) {
            return WRAP_REVERSE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
