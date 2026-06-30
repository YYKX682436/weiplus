package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
public final class zzs extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzs> f6009x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzt();
    private final java.lang.String zza;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzs(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zzjVar, boolean z17, boolean z18) {
        this.zza = str;
        this.zzb = zzjVar;
        this.zzc = z17;
        this.zzd = z18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.zza;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 1, str, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zzjVar = this.zzb;
        if (zzjVar == null) {
            zzjVar = null;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18332xcaa5c694(parcel, 2, zzjVar, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, this.zzc);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 4, this.zzd);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public zzs(java.lang.String str, android.os.IBinder iBinder, boolean z17, boolean z18) {
        this.zza = str;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzk zzkVar = null;
        if (iBinder != null) {
            try {
                com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzd = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzz.zzg(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(zzd);
                if (bArr != null) {
                    zzkVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzk(bArr);
                }
            } catch (android.os.RemoteException unused) {
            }
        }
        this.zzb = zzkVar;
        this.zzc = z17;
        this.zzd = z18;
    }
}
