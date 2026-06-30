package com.google.android.gms.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzn {
    private static volatile com.google.android.gms.common.internal.zzag zze;
    private static android.content.Context zzg;
    static final com.google.android.gms.common.zzl zza = new com.google.android.gms.common.zzf(com.google.android.gms.common.zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final com.google.android.gms.common.zzl zzb = new com.google.android.gms.common.zzg(com.google.android.gms.common.zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final com.google.android.gms.common.zzl zzc = new com.google.android.gms.common.zzh(com.google.android.gms.common.zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final com.google.android.gms.common.zzl zzd = new com.google.android.gms.common.zzi(com.google.android.gms.common.zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final java.lang.Object zzf = new java.lang.Object();

    public static com.google.android.gms.common.zzx zza(java.lang.String str, com.google.android.gms.common.zzj zzjVar, boolean z17, boolean z18) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z17, z18);
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static com.google.android.gms.common.zzx zzb(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        return zzi(str, z17, false, false, true);
    }

    public static com.google.android.gms.common.zzx zzc(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        return zzi(str, z17, false, false, false);
    }

    public static /* synthetic */ java.lang.String zzd(boolean z17, java.lang.String str, com.google.android.gms.common.zzj zzjVar) {
        boolean z18 = false;
        if (!z17 && zzh(str, zzjVar, true, false).zza) {
            z18 = true;
        }
        java.lang.String str2 = true != z18 ? "not allowed" : "debug cert rejected";
        java.security.MessageDigest zza2 = com.google.android.gms.common.util.AndroidUtilsLight.zza("SHA-256");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zza2);
        return java.lang.String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.Hex.bytesToStringLowercase(zza2.digest(zzjVar.zzf())), java.lang.Boolean.valueOf(z17), "12451000.false");
    }

    public static synchronized void zze(android.content.Context context) {
        synchronized (com.google.android.gms.common.zzn.class) {
            if (zzg == null) {
                if (context != null) {
                    zzg = context.getApplicationContext();
                }
            }
        }
    }

    public static boolean zzf() {
        boolean z17;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            zzj();
            z17 = zze.zzg();
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
            z17 = false;
        } catch (java.lang.Throwable th6) {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th6;
        }
        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z17;
    }

    public static boolean zzg() {
        boolean z17;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            zzj();
            z17 = zze.zzi();
        } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
            z17 = false;
        } catch (java.lang.Throwable th6) {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th6;
        }
        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z17;
    }

    private static com.google.android.gms.common.zzx zzh(final java.lang.String str, final com.google.android.gms.common.zzj zzjVar, final boolean z17, boolean z18) {
        try {
            zzj();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg);
            try {
                return zze.zzh(new com.google.android.gms.common.zzs(str, zzjVar, z17, z18), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzg.getPackageManager())) ? com.google.android.gms.common.zzx.zzb() : new com.google.android.gms.common.zzv(new java.util.concurrent.Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return com.google.android.gms.common.zzn.zzd(z17, str, zzjVar);
                    }
                }, null);
            } catch (android.os.RemoteException e17) {
                return com.google.android.gms.common.zzx.zzd("module call", e17);
            }
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e18) {
            return com.google.android.gms.common.zzx.zzd("module init: ".concat(java.lang.String.valueOf(e18.getMessage())), e18);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    private static com.google.android.gms.common.zzx zzi(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.google.android.gms.common.zzx zzd2;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg);
            try {
                zzj();
                com.google.android.gms.common.zzo zzoVar = new com.google.android.gms.common.zzo(str, z17, false, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzg), false, true);
                try {
                    com.google.android.gms.common.zzq zze2 = z27 ? zze.zze(zzoVar) : zze.zzf(zzoVar);
                    if (zze2.zzb()) {
                        zzd2 = com.google.android.gms.common.zzx.zzf(zze2.zzc());
                    } else {
                        java.lang.String zza2 = zze2.zza();
                        android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = zze2.zzd() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
                        if (zza2 == null) {
                            zza2 = "error checking package certificate";
                        }
                        zzd2 = com.google.android.gms.common.zzx.zzg(zze2.zzc(), zze2.zzd(), zza2, nameNotFoundException);
                    }
                } catch (android.os.RemoteException e17) {
                    zzd2 = com.google.android.gms.common.zzx.zzd("module call", e17);
                }
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e18) {
                zzd2 = com.google.android.gms.common.zzx.zzd("module init: ".concat(java.lang.String.valueOf(e18.getMessage())), e18);
            }
            return zzd2;
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void zzj() {
        if (zze != null) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = com.google.android.gms.common.internal.zzaf.zzb(com.google.android.gms.dynamite.DynamiteModule.load(zzg, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
