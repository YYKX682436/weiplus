package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.Scope */
/* loaded from: classes13.dex */
public final class C1762x4c04e34 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> f5897x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zza();
    final int zza;
    private final java.lang.String zzb;

    public C1762x4c04e34(int i17, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "scopeUri must not be null or empty");
        this.zza = i17;
        this.zzb = str;
    }

    /* renamed from: equals */
    public boolean m17841xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34) {
            return this.zzb.equals(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34) obj).zzb);
        }
        return false;
    }

    /* renamed from: getScopeUri */
    public java.lang.String m17842x5ecdbbee() {
        return this.zzb;
    }

    /* renamed from: hashCode */
    public int m17843x8cdac1b() {
        return this.zzb.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m17844x9616526c() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zza;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, m17842x5ecdbbee(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1762x4c04e34(java.lang.String str) {
        this(1, str);
    }
}
