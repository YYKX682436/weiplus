package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public final class DeviceProperties {
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

    private DeviceProperties() {
    }

    public static boolean isAuto(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z17 = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z17 = true;
            }
            zzj = java.lang.Boolean.valueOf(z17);
        }
        return zzj.booleanValue();
    }

    public static boolean isBstar(android.content.Context context) {
        if (zzm == null) {
            boolean z17 = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z17 = true;
            }
            zzm = java.lang.Boolean.valueOf(z17);
        }
        return zzm.booleanValue();
    }

    public static boolean isFoldable(android.content.Context context) {
        if (zzc == null) {
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
            boolean z17 = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR() && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                z17 = true;
            }
            zzc = java.lang.Boolean.valueOf(z17);
        }
        return zzc.booleanValue();
    }

    public static boolean isLatchsky(android.content.Context context) {
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
    
        if (isXr(r4) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isPhone(android.content.Context r4) {
        /*
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zza
            if (r0 != 0) goto L76
            boolean r0 = isFoldable(r4)
            r1 = 1
            if (r0 != 0) goto L70
            boolean r0 = isTablet(r4)
            r2 = 0
            if (r0 != 0) goto L6f
            boolean r0 = isWearable(r4)
            if (r0 != 0) goto L6f
            boolean r0 = zzb(r4)
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzi
            if (r0 != 0) goto L32
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "org.chromium.arc"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzi = r0
        L32:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzi
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6f
            boolean r0 = isAuto(r4)
            if (r0 != 0) goto L6f
            boolean r0 = isTv(r4)
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzl
            if (r0 != 0) goto L5a
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "com.google.android.feature.AMATI_EXPERIENCE"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzl = r0
        L5a:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzl
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6f
            boolean r0 = isBstar(r4)
            if (r0 != 0) goto L6f
            boolean r4 = isXr(r4)
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r1 = r2
        L70:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zza = r4
        L76:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zza
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isPhone(android.content.Context):boolean");
    }

    public static boolean isSevenInchTablet(android.content.Context context) {
        return zzc(context.getResources());
    }

    public static boolean isSidewinder(android.content.Context context) {
        return zza(context);
    }

    public static boolean isTablet(android.content.Context context) {
        return isTablet(context.getResources());
    }

    public static boolean isTv(android.content.Context context) {
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

    public static boolean isUserBuild() {
        int i17 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(android.os.Build.TYPE);
    }

    public static boolean isWearable(android.content.Context context) {
        return zzd(context.getPackageManager());
    }

    public static boolean isWearableWithoutPlayStore(android.content.Context context) {
        if (isWearable(context) && !com.google.android.gms.common.util.PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || com.google.android.gms.common.util.PlatformVersion.isAtLeastR();
        }
        return false;
    }

    public static boolean isXr(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzn == null) {
            zzn = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return zzn.booleanValue();
    }

    public static boolean zza(android.content.Context context) {
        if (zzf == null) {
            boolean z17 = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
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
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z17 = true;
            }
            zze = java.lang.Boolean.valueOf(z17);
        }
        return zze.booleanValue();
    }

    public static boolean isTablet(android.content.res.Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = java.lang.Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }
}
