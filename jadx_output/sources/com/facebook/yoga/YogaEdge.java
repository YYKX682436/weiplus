package com.facebook.yoga;

/* loaded from: classes15.dex */
public enum YogaEdge {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);

    private final int mIntValue;

    YogaEdge(int i17) {
        this.mIntValue = i17;
    }

    public static com.facebook.yoga.YogaEdge fromInt(int i17) {
        switch (i17) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}
