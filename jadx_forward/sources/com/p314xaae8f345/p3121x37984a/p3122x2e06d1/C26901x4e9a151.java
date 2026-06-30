package com.p314xaae8f345.p3121x37984a.p3122x2e06d1;

/* renamed from: com.tencent.wcdb.base.Value */
/* loaded from: classes12.dex */
public class C26901x4e9a151 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f57827x7118e671 = false;

    /* renamed from: value */
    private final java.lang.Object f57828x6ac9171;

    /* renamed from: com.tencent.wcdb.base.Value$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$wcdb$winq$ColumnType */
        static final /* synthetic */ int[] f57829x1da28687;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.m108124xcee59d22().length];
            f57829x1da28687 = iArr;
            try {
                iArr[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f57829x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f57829x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Float.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f57829x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Text.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f57829x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.BLOB.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public C26901x4e9a151() {
        this.f57828x6ac9171 = null;
    }

    /* renamed from: equals */
    public boolean m106354xb2c87fbf(java.lang.Object obj) {
        if (obj == this || obj == this.f57828x6ac9171) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151) {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 = (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151) obj;
            int i17 = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151.AnonymousClass1.f57829x1da28687[m106364xfb85f7b0().ordinal()];
            if (i17 == 1) {
                return c26901x4e9a151.m106361xfb822ef2() == 0;
            }
            if (i17 == 2) {
                return ((java.lang.Long) this.f57828x6ac9171).longValue() == c26901x4e9a151.m106361xfb822ef2();
            }
            if (i17 == 3) {
                return ((java.lang.Double) this.f57828x6ac9171).doubleValue() == c26901x4e9a151.m106358x160e9ec7();
            }
            if (i17 == 4) {
                return this.f57828x6ac9171.equals(c26901x4e9a151.m106363xfb85ada3());
            }
            if (i17 == 5) {
                return java.util.Arrays.equals((byte[]) this.f57828x6ac9171, c26901x4e9a151.m106355xfb7d1bf3());
            }
        }
        return java.util.Objects.deepEquals(obj, this.f57828x6ac9171);
    }

    /* renamed from: getBLOB */
    public byte[] m106355xfb7d1bf3() {
        java.lang.Object obj = this.f57828x6ac9171;
        if (obj == null) {
            return null;
        }
        return obj instanceof byte[] ? (byte[]) obj : obj.toString().getBytes();
    }

    /* renamed from: getBool */
    public boolean m106356xfb7da360() {
        return m106361xfb822ef2() != 0;
    }

    /* renamed from: getByte */
    public byte m106357xfb7dc97e() {
        return (byte) m106361xfb822ef2();
    }

    /* renamed from: getDouble */
    public double m106358x160e9ec7() {
        java.lang.Object obj = this.f57828x6ac9171;
        if (!(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Long)) {
            if (!(obj instanceof java.lang.String)) {
                return 0.0d;
            }
            try {
                return java.lang.Double.parseDouble((java.lang.String) obj);
            } catch (java.lang.NumberFormatException unused) {
                return 0.0d;
            }
        }
        return ((java.lang.Double) obj).doubleValue();
    }

    /* renamed from: getFloat */
    public float m106359x746dc8a6() {
        return (float) m106358x160e9ec7();
    }

    /* renamed from: getInt */
    public int m106360xb58848b9() {
        return (int) m106361xfb822ef2();
    }

    /* renamed from: getLong */
    public long m106361xfb822ef2() {
        java.lang.Object obj = this.f57828x6ac9171;
        if (!(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String)) {
                return 0L;
            }
            try {
                return java.lang.Long.parseLong((java.lang.String) obj);
            } catch (java.lang.NumberFormatException unused) {
                return 0L;
            }
        }
        return ((java.lang.Long) obj).longValue();
    }

    /* renamed from: getShort */
    public short m106362x75232ac6() {
        return (short) m106361xfb822ef2();
    }

    /* renamed from: getText */
    public java.lang.String m106363xfb85ada3() {
        java.lang.Object obj = this.f57828x6ac9171;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof byte[]) {
            return new java.lang.String((byte[]) obj);
        }
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* renamed from: getType */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 m106364xfb85f7b0() {
        java.lang.Object obj = this.f57828x6ac9171;
        if (obj == null) {
            return com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls == java.lang.Long.class) {
            return com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer;
        }
        if (cls == java.lang.String.class) {
            return com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Text;
        }
        if (cls == byte[].class) {
            return com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.BLOB;
        }
        if (cls == java.lang.Double.class) {
            return com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Float;
        }
        throw new java.lang.AssertionError();
    }

    /* renamed from: hashCode */
    public int m106365x8cdac1b() {
        java.lang.Object obj = this.f57828x6ac9171;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C26901x4e9a151(boolean z17) {
        this.f57828x6ac9171 = java.lang.Long.valueOf(z17 ? 1L : 0L);
    }

    public C26901x4e9a151(byte b17) {
        this.f57828x6ac9171 = java.lang.Long.valueOf(b17);
    }

    public C26901x4e9a151(int i17) {
        this.f57828x6ac9171 = java.lang.Long.valueOf(i17);
    }

    public C26901x4e9a151(long j17) {
        this.f57828x6ac9171 = java.lang.Long.valueOf(j17);
    }

    public C26901x4e9a151(float f17) {
        this.f57828x6ac9171 = java.lang.Double.valueOf(f17);
    }

    public C26901x4e9a151(double d17) {
        this.f57828x6ac9171 = java.lang.Double.valueOf(d17);
    }

    public C26901x4e9a151(java.lang.String str) {
        this.f57828x6ac9171 = str;
    }

    public C26901x4e9a151(byte[] bArr) {
        this.f57828x6ac9171 = bArr;
    }

    public C26901x4e9a151(java.lang.Object obj) {
        if (obj == null) {
            this.f57828x6ac9171 = null;
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls != java.lang.Long.class && cls != java.lang.Double.class && cls != java.lang.String.class && cls != byte[].class) {
            if (cls != java.lang.Integer.class && cls != java.lang.Short.class && cls != java.lang.Byte.class) {
                if (cls == java.lang.Float.class) {
                    this.f57828x6ac9171 = java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue());
                    return;
                } else {
                    this.f57828x6ac9171 = obj.toString();
                    return;
                }
            }
            this.f57828x6ac9171 = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
            return;
        }
        this.f57828x6ac9171 = obj;
    }

    public C26901x4e9a151(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151) {
        this(c26901x4e9a151 == null ? null : c26901x4e9a151.f57828x6ac9171);
    }
}
