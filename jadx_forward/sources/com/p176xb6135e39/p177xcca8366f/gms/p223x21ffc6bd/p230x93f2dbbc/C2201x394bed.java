package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzer */
/* loaded from: classes13.dex */
public final class C2201x394bed extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements java.lang.Iterable<java.lang.String> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed> f6525x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2203x394bef();

    /* renamed from: zzafy */
    private final android.os.Bundle f6526x6f021b4;

    public C2201x394bed(android.os.Bundle bundle) {
        this.f6526x6f021b4 = bundle;
    }

    public final java.lang.Object get(java.lang.String str) {
        return this.f6526x6f021b4.get(str);
    }

    /* renamed from: getLong */
    public final java.lang.Long m19077xfb822ef2(java.lang.String str) {
        return java.lang.Long.valueOf(this.f6526x6f021b4.getLong(str));
    }

    /* renamed from: getString */
    public final java.lang.String m19078x2fec8307(java.lang.String str) {
        return this.f6526x6f021b4.getString(str);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2202x394bee(this);
    }

    /* renamed from: size */
    public final int m19079x35e001() {
        return this.f6526x6f021b4.size();
    }

    /* renamed from: toString */
    public final java.lang.String m19080x9616526c() {
        return this.f6526x6f021b4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 2, m19082x394c5d(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    /* renamed from: zzbh */
    public final java.lang.Double m19081x394b86(java.lang.String str) {
        return java.lang.Double.valueOf(this.f6526x6f021b4.getDouble(str));
    }

    /* renamed from: zzif */
    public final android.os.Bundle m19082x394c5d() {
        return new android.os.Bundle(this.f6526x6f021b4);
    }
}
