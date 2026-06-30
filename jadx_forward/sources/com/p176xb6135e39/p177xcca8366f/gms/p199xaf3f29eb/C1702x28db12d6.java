package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.Feature */
/* loaded from: classes13.dex */
public class C1702x28db12d6 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6> f5822x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzc();
    private final java.lang.String zza;

    @java.lang.Deprecated
    private final int zzb;
    private final long zzc;

    public C1702x28db12d6(java.lang.String str, int i17, long j17) {
        this.zza = str;
        this.zzb = i17;
        this.zzc = j17;
    }

    /* renamed from: equals */
    public final boolean m17611xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d6 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6) obj;
            if (((m17612xfb82e301() != null && m17612xfb82e301().equals(c1702x28db12d6.m17612xfb82e301())) || (m17612xfb82e301() == null && c1702x28db12d6.m17612xfb82e301() == null)) && m17613x52c258a2() == c1702x28db12d6.m17613x52c258a2()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getName */
    public java.lang.String m17612xfb82e301() {
        return this.zza;
    }

    /* renamed from: getVersion */
    public long m17613x52c258a2() {
        long j17 = this.zzc;
        return j17 == -1 ? this.zzb : j17;
    }

    /* renamed from: hashCode */
    public final int m17614x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(m17612xfb82e301(), java.lang.Long.valueOf(m17613x52c258a2()));
    }

    /* renamed from: toString */
    public final java.lang.String m17615x9616526c() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper m18191xbe50cd3a = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18191xbe50cd3a(this);
        m18191xbe50cd3a.add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, m17612xfb82e301());
        m18191xbe50cd3a.add("version", java.lang.Long.valueOf(m17613x52c258a2()));
        return m18191xbe50cd3a.m18192x9616526c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 1, m17612xfb82e301(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, this.zzb);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18341xac298afb(parcel, 3, m17613x52c258a2());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1702x28db12d6(java.lang.String str, long j17) {
        this.zza = str;
        this.zzc = j17;
        this.zzb = -1;
    }
}
