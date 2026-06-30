package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaDisplay */
/* loaded from: classes11.dex */
public enum EnumC1563x7a128c12 {
    FLEX(0),
    NONE(1);


    /* renamed from: mIntValue */
    private final int f5117x46224e4f;

    EnumC1563x7a128c12(int i17) {
        this.f5117x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1563x7a128c12 m16783xdc92efe5(int i17) {
        if (i17 == 0) {
            return FLEX;
        }
        if (i17 == 1) {
            return NONE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m16786x2124a6c2() {
        return this.f5117x46224e4f;
    }
}
