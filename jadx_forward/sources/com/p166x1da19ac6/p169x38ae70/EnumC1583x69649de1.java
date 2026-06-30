package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaPrintOptions */
/* loaded from: classes.dex */
public enum EnumC1583x69649de1 {
    LAYOUT(1),
    STYLE(2),
    CHILDREN(4);


    /* renamed from: mIntValue */
    private final int f5201x46224e4f;

    EnumC1583x69649de1(int i17) {
        this.f5201x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1583x69649de1 m17058xdc92efe5(int i17) {
        if (i17 == 1) {
            return LAYOUT;
        }
        if (i17 == 2) {
            return STYLE;
        }
        if (i17 == 4) {
            return CHILDREN;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m17061x2124a6c2() {
        return this.f5201x46224e4f;
    }
}
