package com.facebook.yoga;

/* loaded from: classes15.dex */
public enum YogaFlexDirection {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int mIntValue;

    YogaFlexDirection(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaFlexDirection fromInt(int i17) {
        if (i17 == 0) {
            return COLUMN;
        }
        if (i17 == 1) {
            return COLUMN_REVERSE;
        }
        if (i17 == 2) {
            return ROW;
        }
        if (i17 == 3) {
            return ROW_REVERSE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    public int intValue() {
        return this.mIntValue;
    }
}
