package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
public final class zzq extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzq> f6008x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzr();
    private final boolean zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;

    public zzq(boolean z17, java.lang.String str, int i17, int i18) {
        this.zza = z17;
        this.zzb = str;
        this.zzc = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzy.zza(i17) - 1;
        this.zzd = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzd.zza(i18) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 1, this.zza);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.zzb, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.zzc);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.zzd);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzd.zza(this.zzd);
    }

    public final int zzd() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzy.zza(this.zzc);
    }
}
