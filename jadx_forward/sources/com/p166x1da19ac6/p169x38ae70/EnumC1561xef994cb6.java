package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaDimension */
/* loaded from: classes.dex */
public enum EnumC1561xef994cb6 {
    WIDTH(0),
    HEIGHT(1);


    /* renamed from: mIntValue */
    private final int f5110x46224e4f;

    EnumC1561xef994cb6(int i17) {
        this.f5110x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1561xef994cb6 m16771xdc92efe5(int i17) {
        if (i17 == 0) {
            return WIDTH;
        }
        if (i17 == 1) {
            return HEIGHT;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m16774x2124a6c2() {
        return this.f5110x46224e4f;
    }
}
