package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
public final class zzo extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzo> f6007x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzp();
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzo(java.lang.String str, boolean z17, boolean z18, android.os.IBinder iBinder, boolean z19, boolean z27) {
        this.zza = str;
        this.zzb = z17;
        this.zzc = z18;
        this.zzd = (android.content.Context) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b.Stub.m18671xbd0d1927(iBinder));
        this.zze = z19;
        this.zzf = z27;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.zza;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 1, str, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, this.zzb);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, this.zzc);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18332xcaa5c694(parcel, 4, com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(this.zzd), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, this.zze);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 6, this.zzf);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
