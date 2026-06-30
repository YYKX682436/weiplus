package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaEdge */
/* loaded from: classes15.dex */
public enum EnumC1564xc2573c6d {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);


    /* renamed from: mIntValue */
    private final int f5125x46224e4f;

    EnumC1564xc2573c6d(int i17) {
        this.f5125x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1564xc2573c6d m16789xdc92efe5(int i17) {
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

    /* renamed from: intValue */
    public int m16792x2124a6c2() {
        return this.f5125x46224e4f;
    }
}
