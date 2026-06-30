package com.facebook.yoga;

/* loaded from: classes15.dex */
public enum YogaJustify {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int mIntValue;

    YogaJustify(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaJustify fromInt(int i17) {
        if (i17 == 0) {
            return FLEX_START;
        }
        if (i17 == 1) {
            return CENTER;
        }
        if (i17 == 2) {
            return FLEX_END;
        }
        if (i17 == 3) {
            return SPACE_BETWEEN;
        }
        if (i17 == 4) {
            return SPACE_AROUND;
        }
        if (i17 == 5) {
            return SPACE_EVENLY;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
