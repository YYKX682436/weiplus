package com.facebook.yoga;

/* loaded from: classes11.dex */
public enum YogaOverflow {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);

    private final int mIntValue;

    YogaOverflow(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaOverflow fromInt(int i17) {
        if (i17 == 0) {
            return VISIBLE;
        }
        if (i17 == 1) {
            return HIDDEN;
        }
        if (i17 == 2) {
            return SCROLL;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
