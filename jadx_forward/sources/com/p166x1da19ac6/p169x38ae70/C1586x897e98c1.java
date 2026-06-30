package com.p166x1da19ac6.p169x38ae70;

/* renamed from: com.facebook.yoga.YogaValue */
/* loaded from: classes15.dex */
public class C1586x897e98c1 {

    /* renamed from: unit */
    public final com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834 f5251x36d984;

    /* renamed from: value */
    public final float f5252x6ac9171;

    /* renamed from: UNDEFINED */
    static final com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 f5249x68377130 = new com.p166x1da19ac6.p169x38ae70.C1586x897e98c1(Float.NaN, com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.UNDEFINED);

    /* renamed from: ZERO */
    static final com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 f5250x29f6a8 = new com.p166x1da19ac6.p169x38ae70.C1586x897e98c1(0.0f, com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.POINT);

    /* renamed from: AUTO */
    static final com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 f5248x1ed5af = new com.p166x1da19ac6.p169x38ae70.C1586x897e98c1(Float.NaN, com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.AUTO);

    /* renamed from: com.facebook.yoga.YogaValue$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$facebook$yoga$YogaUnit */
        static final /* synthetic */ int[] f5253x2406ffed;

        static {
            int[] iArr = new int[com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.m17066xcee59d22().length];
            f5253x2406ffed = iArr;
            try {
                iArr[com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.UNDEFINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f5253x2406ffed[com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.POINT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f5253x2406ffed[com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.PERCENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f5253x2406ffed[com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.AUTO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public C1586x897e98c1(float f17, com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834 enumC1585xc25ea834) {
        this.f5252x6ac9171 = f17;
        this.f5251x36d984 = enumC1585xc25ea834;
    }

    /* renamed from: parse */
    public static com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 m17069x6581ab3(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? f5249x68377130 : "auto".equals(str) ? f5248x1ed5af : str.endsWith("%") ? new com.p166x1da19ac6.p169x38ae70.C1586x897e98c1(java.lang.Float.parseFloat(str.substring(0, str.length() - 1)), com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.PERCENT) : new com.p166x1da19ac6.p169x38ae70.C1586x897e98c1(java.lang.Float.parseFloat(str), com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.POINT);
    }

    /* renamed from: equals */
    public boolean m17070xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p166x1da19ac6.p169x38ae70.C1586x897e98c1)) {
            return false;
        }
        com.p166x1da19ac6.p169x38ae70.C1586x897e98c1 c1586x897e98c1 = (com.p166x1da19ac6.p169x38ae70.C1586x897e98c1) obj;
        com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834 enumC1585xc25ea834 = this.f5251x36d984;
        if (enumC1585xc25ea834 == c1586x897e98c1.f5251x36d984) {
            return enumC1585xc25ea834 == com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.UNDEFINED || enumC1585xc25ea834 == com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.AUTO || java.lang.Float.compare(this.f5252x6ac9171, c1586x897e98c1.f5252x6ac9171) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m17071x8cdac1b() {
        return java.lang.Float.floatToIntBits(this.f5252x6ac9171) + this.f5251x36d984.m17067x2124a6c2();
    }

    /* renamed from: toString */
    public java.lang.String m17072x9616526c() {
        int i17 = com.p166x1da19ac6.p169x38ae70.C1586x897e98c1.AnonymousClass1.f5253x2406ffed[this.f5251x36d984.ordinal()];
        if (i17 == 1) {
            return "undefined";
        }
        if (i17 == 2) {
            return java.lang.Float.toString(this.f5252x6ac9171);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return "auto";
            }
            throw new java.lang.IllegalStateException();
        }
        return this.f5252x6ac9171 + "%";
    }

    public C1586x897e98c1(float f17, int i17) {
        this(f17, com.p166x1da19ac6.p169x38ae70.EnumC1585xc25ea834.m17064xdc92efe5(i17));
    }
}
