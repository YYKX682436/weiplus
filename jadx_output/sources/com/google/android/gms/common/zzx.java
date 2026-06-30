package com.google.android.gms.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class zzx {
    private static final com.google.android.gms.common.zzx zze = new com.google.android.gms.common.zzx(true, 3, 1, null, null);
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
    public static com.google.android.gms.common.zzx zzb() {
        return zze;
    }

    public static com.google.android.gms.common.zzx zzc(java.lang.String str) {
        return new com.google.android.gms.common.zzx(false, 1, 5, str, null);
    }

    public static com.google.android.gms.common.zzx zzd(java.lang.String str, java.lang.Throwable th6) {
        return new com.google.android.gms.common.zzx(false, 1, 5, str, th6);
    }

    public static com.google.android.gms.common.zzx zzf(int i17) {
        return new com.google.android.gms.common.zzx(true, i17, 1, null, null);
    }

    public static com.google.android.gms.common.zzx zzg(int i17, int i18, java.lang.String str, java.lang.Throwable th6) {
        return new com.google.android.gms.common.zzx(false, i17, i18, str, th6);
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
