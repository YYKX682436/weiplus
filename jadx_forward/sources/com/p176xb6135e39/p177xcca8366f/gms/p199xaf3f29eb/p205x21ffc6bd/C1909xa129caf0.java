package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.GetServiceRequest */
/* loaded from: classes13.dex */
public class C1909xa129caf0 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1909xa129caf0> f5942x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzn();
    static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[0];
    static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[0];
    final int zzc;
    final int zzd;
    final int zze;
    java.lang.String zzf;
    android.os.IBinder zzg;
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] zzh;
    android.os.Bundle zzi;
    android.accounts.Account zzj;
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zzk;
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] zzl;
    final boolean zzm;
    final int zzn;
    boolean zzo;
    private final java.lang.String zzp;

    public C1909xa129caf0(int i17, int i18, int i19, java.lang.String str, android.os.IBinder iBinder, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] c1762x4c04e34Arr, android.os.Bundle bundle, android.accounts.Account account, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] c1702x28db12d6Arr2, boolean z17, int i27, boolean z18, java.lang.String str2) {
        c1762x4c04e34Arr = c1762x4c04e34Arr == null ? zza : c1762x4c04e34Arr;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        c1702x28db12d6Arr = c1702x28db12d6Arr == null ? zzb : c1702x28db12d6Arr;
        c1702x28db12d6Arr2 = c1702x28db12d6Arr2 == null ? zzb : c1702x28db12d6Arr2;
        this.zzc = i17;
        this.zzd = i18;
        this.zze = i19;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i17 < 2) {
            this.zzj = iBinder != null ? com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.BinderC1896x732e2374.m18075x604f3dae(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b.Stub.m18179xbd0d1927(iBinder)) : null;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = c1762x4c04e34Arr;
        this.zzi = bundle;
        this.zzk = c1702x28db12d6Arr;
        this.zzl = c1702x28db12d6Arr2;
        this.zzm = z17;
        this.zzn = i27;
        this.zzo = z18;
        this.zzp = str2;
    }

    /* renamed from: getExtraArgs */
    public android.os.Bundle m18160xf04bc257() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zzn.zza(this, parcel, i17);
    }

    public final java.lang.String zza() {
        return this.zzp;
    }
}
