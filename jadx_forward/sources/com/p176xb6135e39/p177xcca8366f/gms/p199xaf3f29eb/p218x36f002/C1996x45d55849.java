package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.DeviceProperties */
/* loaded from: classes13.dex */
public final class C1996x45d55849 {
    private static java.lang.Boolean zza;
    private static java.lang.Boolean zzb;
    private static java.lang.Boolean zzc;
    private static java.lang.Boolean zzd;
    private static java.lang.Boolean zze;
    private static java.lang.Boolean zzf;
    private static java.lang.Boolean zzg;
    private static java.lang.Boolean zzh;
    private static java.lang.Boolean zzi;
    private static java.lang.Boolean zzj;
    private static java.lang.Boolean zzk;
    private static java.lang.Boolean zzl;
    private static java.lang.Boolean zzm;
    private static java.lang.Boolean zzn;

    private C1996x45d55849() {
    }

    /* renamed from: isAuto */
    public static boolean m18556xb9a0b9f9(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z17 = false;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z17 = true;
            }
            zzj = java.lang.Boolean.valueOf(z17);
        }
        return zzj.booleanValue();
    }

    /* renamed from: isBstar */
    public static boolean m18557x7a83b2aa(android.content.Context context) {
        if (zzm == null) {
            boolean z17 = false;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18609xacc9ec66() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z17 = true;
            }
            zzm = java.lang.Boolean.valueOf(z17);
        }
        return zzm.booleanValue();
    }

    /* renamed from: isFoldable */
    public static boolean m18558xe23d6025(android.content.Context context) {
        if (zzc == null) {
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
            boolean z17 = false;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18609xacc9ec66() && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                z17 = true;
            }
            zzc = java.lang.Boolean.valueOf(z17);
        }
        return zzc.booleanValue();
    }

    /* renamed from: isLatchsky */
    public static boolean m18559x7a894ba7(android.content.Context context) {
        if (zzg == null) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            boolean z17 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z17 = true;
            }
            zzg = java.lang.Boolean.valueOf(z17);
        }
        return zzg.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (m18569x3175c4(r4) == false) goto L32;
     */
    /* renamed from: isPhone */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18560x7b43ea64(android.content.Context r4) {
        /*
            java.lang.Boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zza
            if (r0 != 0) goto L76
            boolean r0 = m18558xe23d6025(r4)
            r1 = 1
            if (r0 != 0) goto L70
            boolean r0 = m18563xf3a43030(r4)
            r2 = 0
            if (r0 != 0) goto L6f
            boolean r0 = m18567xa53304a3(r4)
            if (r0 != 0) goto L6f
            boolean r0 = zzb(r4)
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzi
            if (r0 != 0) goto L32
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "org.chromium.arc"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzi = r0
        L32:
            java.lang.Boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzi
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6f
            boolean r0 = m18556xb9a0b9f9(r4)
            if (r0 != 0) goto L6f
            boolean r0 = m18565x31754c(r4)
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzl
            if (r0 != 0) goto L5a
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "com.google.android.feature.AMATI_EXPERIENCE"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzl = r0
        L5a:
            java.lang.Boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzl
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6f
            boolean r0 = m18557x7a83b2aa(r4)
            if (r0 != 0) goto L6f
            boolean r4 = m18569x3175c4(r4)
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r1 = r2
        L70:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zza = r4
        L76:
            java.lang.Boolean r4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zza
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18560x7b43ea64(android.content.Context):boolean");
    }

    /* renamed from: isSevenInchTablet */
    public static boolean m18561x396850b3(android.content.Context context) {
        return zzc(context.getResources());
    }

    /* renamed from: isSidewinder */
    public static boolean m18562x52511796(android.content.Context context) {
        return zza(context);
    }

    /* renamed from: isTablet */
    public static boolean m18563xf3a43030(android.content.Context context) {
        return m18564xf3a43030(context.getResources());
    }

    /* renamed from: isTv */
    public static boolean m18565x31754c(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzk == null) {
            boolean z17 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z17 = false;
            }
            zzk = java.lang.Boolean.valueOf(z17);
        }
        return zzk.booleanValue();
    }

    /* renamed from: isUserBuild */
    public static boolean m18566x58e1d359() {
        int i17 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
        return "user".equals(android.os.Build.TYPE);
    }

    /* renamed from: isWearable */
    public static boolean m18567xa53304a3(android.content.Context context) {
        return zzd(context.getPackageManager());
    }

    /* renamed from: isWearableWithoutPlayStore */
    public static boolean m18568xbed280e8(android.content.Context context) {
        if (m18567xa53304a3(context) && !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18605xacc9ec62()) {
            return true;
        }
        if (zza(context)) {
            return !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63() || com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18609xacc9ec66();
        }
        return false;
    }

    /* renamed from: isXr */
    public static boolean m18569x3175c4(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzn == null) {
            zzn = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return zzn.booleanValue();
    }

    public static boolean zza(android.content.Context context) {
        if (zzf == null) {
            boolean z17 = false;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18602x4727d397() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z17 = true;
            }
            zzf = java.lang.Boolean.valueOf(z17);
        }
        return zzf.booleanValue();
    }

    public static boolean zzb(android.content.Context context) {
        if (zzh == null) {
            boolean z17 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z17 = false;
            }
            zzh = java.lang.Boolean.valueOf(z17);
        }
        return zzh.booleanValue();
    }

    public static boolean zzc(android.content.res.Resources resources) {
        boolean z17 = false;
        if (resources == null) {
            return false;
        }
        if (zzd == null) {
            android.content.res.Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z17 = true;
            }
            zzd = java.lang.Boolean.valueOf(z17);
        }
        return zzd.booleanValue();
    }

    public static boolean zzd(android.content.pm.PackageManager packageManager) {
        if (zze == null) {
            boolean z17 = false;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18601xc171897b() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z17 = true;
            }
            zze = java.lang.Boolean.valueOf(z17);
        }
        return zze.booleanValue();
    }

    /* renamed from: isTablet */
    public static boolean m18564xf3a43030(android.content.res.Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = java.lang.Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }
}
