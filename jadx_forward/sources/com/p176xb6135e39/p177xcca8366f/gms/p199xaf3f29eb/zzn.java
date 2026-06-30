package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzn {
    private static volatile com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1953x394b66 zze;
    private static android.content.Context zzg;
    static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzl zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzl zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzg(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzl zzc = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzh(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzl zzd = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzi(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final java.lang.Object zzf = new java.lang.Object();

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zzjVar, boolean z17, boolean z18) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z17, z18);
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzb(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        return zzi(str, z17, false, false, true);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzc(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        return zzi(str, z17, false, false, false);
    }

    public static /* synthetic */ java.lang.String zzd(boolean z17, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zzjVar) {
        boolean z18 = false;
        if (!z17 && zzh(str, zzjVar, true, false).zza) {
            z18 = true;
        }
        java.lang.String str2 = true != z18 ? "not allowed" : "debug cert rejected";
        java.security.MessageDigest zza2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1986xd2c94e94.zza("SHA-256");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zza2);
        return java.lang.String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.Hex.m18572x9601077a(zza2.digest(zzjVar.zzf())), java.lang.Boolean.valueOf(z17), "12451000.false");
    }

    public static synchronized void zze(android.content.Context context) {
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.class) {
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
        } catch (android.os.RemoteException | com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException unused) {
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
        } catch (android.os.RemoteException | com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException unused) {
            z17 = false;
        } catch (java.lang.Throwable th6) {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th6;
        }
        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z17;
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzh(final java.lang.String str, final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzj zzjVar, final boolean z17, boolean z18) {
        try {
            zzj();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzg);
            try {
                return zze.zzh(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzs(str, zzjVar, z17, z18), com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(zzg.getPackageManager())) ? com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzb() : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzv(new java.util.concurrent.Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzn.zzd(z17, str, zzjVar);
                    }
                }, null);
            } catch (android.os.RemoteException e17) {
                return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzd("module call", e17);
            }
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException e18) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzd("module init: ".concat(java.lang.String.valueOf(e18.getMessage())), e18);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzi(java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx zzd2;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzg);
            try {
                zzj();
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzo zzoVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzo(str, z17, false, com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(zzg), false, true);
                try {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzq zze2 = z27 ? zze.zze(zzoVar) : zze.zzf(zzoVar);
                    if (zze2.zzb()) {
                        zzd2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzf(zze2.zzc());
                    } else {
                        java.lang.String zza2 = zze2.zza();
                        android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = zze2.zzd() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
                        if (zza2 == null) {
                            zza2 = "error checking package certificate";
                        }
                        zzd2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzg(zze2.zzc(), zze2.zzd(), zza2, nameNotFoundException);
                    }
                } catch (android.os.RemoteException e17) {
                    zzd2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzd("module call", e17);
                }
            } catch (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException e18) {
                zzd2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx.zzd("module init: ".concat(java.lang.String.valueOf(e18.getMessage())), e18);
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
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractBinderC1952x394b65.zzb(com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.m18691x32c4e6(zzg, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.f6017xdb783536, "com.google.android.gms.googlecertificates").m18693x83a782ea("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
