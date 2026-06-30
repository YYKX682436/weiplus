package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzyw */
/* loaded from: classes13.dex */
public abstract class AbstractC2383x394e5e implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {

    /* renamed from: zzbqx */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e f7208x6f026c9 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2404x394e78.f7261x6f02700);

    /* renamed from: zzbqy */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2387x394e67 f7209x6f026ca;

    /* renamed from: zzboc */
    private int f7210x6f02676 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2384x394e5f c2384x394e5f = null;
        f7209x6f026ca = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2382x394e5d.m19368x394da3() ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2390x394e6a(c2384x394e5f) : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2385x394e60(c2384x394e5f);
    }

    public static int zzb(int i17, int i18, int i19) {
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

    /* renamed from: zzfi */
    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e m19371x394c03(java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69(str.getBytes(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2404x394e78.f7260x4d50f80));
    }

    /* renamed from: equals */
    public abstract boolean mo19372xb2c87fbf(java.lang.Object obj);

    /* renamed from: hashCode */
    public final int m19373x8cdac1b() {
        int i17 = this.f7210x6f02676;
        if (i17 == 0) {
            int mo19374x35e001 = mo19374x35e001();
            i17 = zza(mo19374x35e001, 0, mo19374x35e001);
            if (i17 == 0) {
                i17 = 1;
            }
            this.f7210x6f02676 = i17;
        }
        return i17;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2384x394e5f(this);
    }

    /* renamed from: size */
    public abstract int mo19374x35e001();

    /* renamed from: toString */
    public final java.lang.String m19375x9616526c() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(mo19374x35e001()));
    }

    public abstract int zza(int i17, int i18, int i19);

    /* renamed from: zzae */
    public abstract byte mo19376x394b64(int i17);

    public abstract com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e zzb(int i17, int i18);

    /* renamed from: zzsx */
    public final int m19377x394da5() {
        return this.f7210x6f02676;
    }
}
