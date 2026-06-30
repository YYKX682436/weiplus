package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class y implements java.lang.Iterable, java.io.Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.y f127245e = new com.p176xb6135e39.p283xc50a8b8b.w(com.p176xb6135e39.p283xc50a8b8b.w6.f127183c);

    /* renamed from: f, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.u f127246f;

    /* renamed from: d, reason: collision with root package name */
    public int f127247d = 0;

    static {
        f127246f = com.p176xb6135e39.p283xc50a8b8b.i.a() ? new com.p176xb6135e39.p283xc50a8b8b.x(null) : new com.p176xb6135e39.p283xc50a8b8b.s(null);
    }

    public static int e(int i17, int i18, int i19) {
        int i27 = i18 - i17;
        if ((i17 | i18 | i27 | (i19 - i18)) >= 0) {
            return i27;
        }
        if (i17 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
            sb6.append("Beginning index: ");
            sb6.append(i17);
            sb6.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb6.toString());
        }
        if (i18 < i17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(66);
            sb7.append("Beginning index larger than ending index: ");
            sb7.append(i17);
            sb7.append(", ");
            sb7.append(i18);
            throw new java.lang.IndexOutOfBoundsException(sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(37);
        sb8.append("End index: ");
        sb8.append(i18);
        sb8.append(" >= ");
        sb8.append(i19);
        throw new java.lang.IndexOutOfBoundsException(sb8.toString());
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y g(byte[] bArr, int i17, int i18) {
        e(i17, i17 + i18, bArr.length);
        return new com.p176xb6135e39.p283xc50a8b8b.w(f127246f.a(bArr, i17, i18));
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y h(java.lang.String str) {
        return new com.p176xb6135e39.p283xc50a8b8b.w(str.getBytes(com.p176xb6135e39.p283xc50a8b8b.w6.f127181a));
    }

    public abstract byte d(int i17);

    /* renamed from: equals */
    public abstract boolean mo20935xb2c87fbf(java.lang.Object obj);

    /* renamed from: hashCode */
    public final int m20956x8cdac1b() {
        int i17 = this.f127247d;
        if (i17 == 0) {
            int mo20907x35e001 = mo20907x35e001();
            i17 = n(mo20907x35e001, 0, mo20907x35e001);
            if (i17 == 0) {
                i17 = 1;
            }
            this.f127247d = i17;
        }
        return i17;
    }

    /* renamed from: isEmpty */
    public final boolean m20957x7aab3243() {
        return mo20907x35e001() == 0;
    }

    public abstract void j(byte[] bArr, int i17, int i18, int i19);

    public abstract byte k(int i17);

    public abstract boolean l();

    public abstract com.p176xb6135e39.p283xc50a8b8b.d0 m();

    public abstract int n(int i17, int i18, int i19);

    public abstract com.p176xb6135e39.p283xc50a8b8b.y o(int i17, int i18);

    public abstract java.lang.String p(java.nio.charset.Charset charset);

    public final java.lang.String r() {
        return mo20907x35e001() == 0 ? "" : p(com.p176xb6135e39.p283xc50a8b8b.w6.f127181a);
    }

    public abstract void s(com.p176xb6135e39.p283xc50a8b8b.p pVar);

    /* renamed from: size */
    public abstract int mo20907x35e001();

    /* renamed from: toString */
    public final java.lang.String m20958x9616526c() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(mo20907x35e001());
        objArr[2] = mo20907x35e001() <= 50 ? com.p176xb6135e39.p283xc50a8b8b.ma.a(this) : java.lang.String.valueOf(com.p176xb6135e39.p283xc50a8b8b.ma.a(o(0, 47))).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
