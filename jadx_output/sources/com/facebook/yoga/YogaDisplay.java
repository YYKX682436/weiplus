package com.facebook.yoga;

/* loaded from: classes11.dex */
public enum YogaDisplay {
    FLEX(0),
    NONE(1);

    private final int mIntValue;

    YogaDisplay(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaDisplay fromInt(int i17) {
        if (i17 == 0) {
            return FLEX;
        }
        if (i17 == 1) {
            return NONE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
