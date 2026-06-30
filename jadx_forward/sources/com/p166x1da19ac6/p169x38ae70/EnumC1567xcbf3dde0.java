package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaJustify */
/* loaded from: classes15.dex */
public enum EnumC1567xcbf3dde0 {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);


    /* renamed from: mIntValue */
    private final int f5141x46224e4f;

    EnumC1567xcbf3dde0(int i17) {
        this.f5141x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1567xcbf3dde0 m16807xdc92efe5(int i17) {
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

    /* renamed from: intValue */
    public int m16810x2124a6c2() {
        return this.f5141x46224e4f;
    }
}
