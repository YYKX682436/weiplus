package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* renamed from: com.google.android.gms.auth.TokenData */
/* loaded from: classes13.dex */
public class C1639x7fd99923 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923> f5361x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzn();

    /* renamed from: zzaa */
    private final java.lang.Long f5362x394b60;

    /* renamed from: zzab */
    private final boolean f5363x394b61;

    /* renamed from: zzac */
    private final boolean f5364x394b62;

    /* renamed from: zzad */
    private final java.util.List<java.lang.String> f5365x394b63;
    private final int zzy;
    private final java.lang.String zzz;

    public C1639x7fd99923(int i17, java.lang.String str, java.lang.Long l17, boolean z17, boolean z18, java.util.List<java.lang.String> list) {
        this.zzy = i17;
        this.zzz = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f5362x394b60 = l17;
        this.f5363x394b61 = z17;
        this.f5364x394b62 = z18;
        this.f5365x394b63 = list;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 zzd(android.os.Bundle bundle, java.lang.String str) {
        bundle.setClassLoader(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923.class.getClassLoader());
        return (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923) bundle2.getParcelable("TokenData");
    }

    /* renamed from: equals */
    public boolean m17314xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 c1639x7fd99923 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923) obj;
        return android.text.TextUtils.equals(this.zzz, c1639x7fd99923.zzz) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f5362x394b60, c1639x7fd99923.f5362x394b60) && this.f5363x394b61 == c1639x7fd99923.f5363x394b61 && this.f5364x394b62 == c1639x7fd99923.f5364x394b62 && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f5365x394b63, c1639x7fd99923.f5365x394b63);
    }

    /* renamed from: hashCode */
    public int m17315x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.zzz, this.f5362x394b60, java.lang.Boolean.valueOf(this.f5363x394b61), java.lang.Boolean.valueOf(this.f5364x394b62), this.f5365x394b63);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.zzz, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18344xaf7bb21a(parcel, 3, this.f5362x394b60, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 4, this.f5363x394b61);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, this.f5364x394b62);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 6, this.f5365x394b63, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zze() {
        return this.zzz;
    }
}
