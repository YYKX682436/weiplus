package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaMeasureMode */
/* loaded from: classes11.dex */
public enum EnumC1572x4c7bf71 {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* renamed from: mIntValue */
    private final int f5160x46224e4f;

    EnumC1572x4c7bf71(int i17) {
        this.f5160x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1572x4c7bf71 m16826xdc92efe5(int i17) {
        if (i17 == 0) {
            return UNDEFINED;
        }
        if (i17 == 1) {
            return EXACTLY;
        }
        if (i17 == 2) {
            return AT_MOST;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m16829x2124a6c2() {
        return this.f5160x46224e4f;
    }
}
