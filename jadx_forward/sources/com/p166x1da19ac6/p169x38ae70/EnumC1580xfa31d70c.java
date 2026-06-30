package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaNodeType */
/* loaded from: classes.dex */
public enum EnumC1580xfa31d70c {
    DEFAULT(0),
    TEXT(1);


    /* renamed from: mIntValue */
    private final int f5187x46224e4f;

    EnumC1580xfa31d70c(int i17) {
        this.f5187x46224e4f = i17;
    }

    /* renamed from: fromInt */
    public static com.p166x1da19ac6.p169x38ae70.EnumC1580xfa31d70c m17040xdc92efe5(int i17) {
        if (i17 == 0) {
            return DEFAULT;
        }
        if (i17 == 1) {
            return TEXT;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
    }

    /* renamed from: intValue */
    public int m17043x2124a6c2() {
        return this.f5187x46224e4f;
    }
}
