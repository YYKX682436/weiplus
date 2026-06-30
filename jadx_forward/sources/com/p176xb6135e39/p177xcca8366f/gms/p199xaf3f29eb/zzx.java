package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class zzx {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zze = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx(true, 3, 1, null, null);
    final boolean zza;
    final java.lang.String zzb;
    final java.lang.Throwable zzc;
    final int zzd;

    private zzx(boolean z17, int i17, int i18, java.lang.String str, java.lang.Throwable th6) {
        this.zza = z17;
        this.zzd = i17;
        this.zzb = str;
        this.zzc = th6;
    }

    @java.lang.Deprecated
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzb() {
        return zze;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc(java.lang.String str) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx(false, 1, 5, str, null);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzd(java.lang.String str, java.lang.Throwable th6) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx(false, 1, 5, str, th6);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzf(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx(true, i17, 1, null, null);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzg(int i17, int i18, java.lang.String str, java.lang.Throwable th6) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx(false, i17, i18, str, th6);
    }

    public java.lang.String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }
}
