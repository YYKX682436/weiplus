package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.GooglePlayServicesUtilLight */
/* loaded from: classes13.dex */
public class C1713x90a1c9c9 {

    /* renamed from: GMS_AVAILABILITY_NOTIFICATION_ID */
    static final int f5836xb63c70dd = 10436;

    /* renamed from: GMS_GENERAL_ERROR_NOTIFICATION_ID */
    static final int f5837x1e32b7cf = 39789;

    /* renamed from: GOOGLE_PLAY_GAMES_PACKAGE */
    public static final java.lang.String f5838x29a28a83 = "com.google.android.play.games";

    /* renamed from: GOOGLE_PLAY_SERVICES_PACKAGE */
    @java.lang.Deprecated
    public static final java.lang.String f5839x1100896a = "com.google.android.gms";

    /* renamed from: GOOGLE_PLAY_SERVICES_VERSION_CODE */
    @java.lang.Deprecated
    public static final int f5840x7aedca50 = 12451000;

    /* renamed from: GOOGLE_PLAY_STORE_PACKAGE */
    public static final java.lang.String f5841x5fbc30a3 = "com.android.vending";
    static boolean zza;
    private static boolean zzb;

    /* renamed from: sCanceledAvailabilityNotification */
    @java.lang.Deprecated
    static final java.util.concurrent.atomic.AtomicBoolean f5842x7f5be832 = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean();

    @java.lang.Deprecated
    /* renamed from: cancelAvailabilityErrorNotifications */
    public static void m17668x9b3d7995(android.content.Context context) {
        if (!f5842x7f5be832.getAndSet(true)) {
            try {
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
                if (notificationManager == null) {
                } else {
                    notificationManager.cancel(f5836xb63c70dd);
                }
            } catch (java.lang.SecurityException unused) {
            }
        }
    }

    /* renamed from: enableUsingApkIndependentContext */
    public static void m17669x4894c1d0() {
        zzc.set(true);
    }

    @java.lang.Deprecated
    /* renamed from: ensurePlayServicesAvailable */
    public static void m17670x6c218d99(android.content.Context context, int i17) {
        int mo17631x402556f4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17631x402556f4(context, i17);
        if (mo17631x402556f4 != 0) {
            android.content.Intent mo17626x91cd42da = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17626x91cd42da(context, mo17631x402556f4, "e");
            if (mo17626x91cd42da != null) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1711xec211afd(mo17631x402556f4, "Google Play Services not available", mo17626x91cd42da);
            }
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1710x6991fbce(mo17631x402556f4);
        }
    }

    @java.lang.Deprecated
    /* renamed from: getApkVersion */
    public static int m17671x3f509b12(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @java.lang.Deprecated
    /* renamed from: getClientVersion */
    public static int m17672xeb61b2d7(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(true);
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1990x36406441.m18532xeb61b2d7(context, context.getPackageName());
    }

    @java.lang.Deprecated
    /* renamed from: getErrorPendingIntent */
    public static android.app.PendingIntent m17673xc1b32be1(int i17, android.content.Context context, int i18) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17627x6703115(context, i17, i18);
    }

    @java.lang.Deprecated
    /* renamed from: getErrorString */
    public static java.lang.String m17674x94a1bf03(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb.zza(i17);
    }

    @java.lang.Deprecated
    /* renamed from: getGooglePlayServicesAvailabilityRecoveryIntent */
    public static android.content.Intent m17675x5a3d642d(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17626x91cd42da(null, i17, null);
    }

    /* renamed from: getRemoteContext */
    public static android.content.Context m17676x14cfd6d3(android.content.Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: getRemoteResource */
    public static android.content.res.Resources m17677x92a7476a(android.content.Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: honorsDebugCertificates */
    public static boolean m17678x5882f166(android.content.Context context) {
        if (!zza) {
            try {
                android.content.pm.PackageInfo m18639xffec0de = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de("com.google.android.gms", 64);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.m17688x9cf0d20b(context);
                if (m18639xffec0de == null || com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.zzb(m18639xffec0de, false) || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.zzb(m18639xffec0de, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            } finally {
                zza = true;
            }
        }
        return zzb || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18566x58e1d359();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: isGooglePlayServicesAvailable */
    public static int m17679x402556f4(android.content.Context context) {
        return m17680x402556f4(context, f5840x7aedca50);
    }

    @java.lang.Deprecated
    /* renamed from: isGooglePlayServicesUid */
    public static boolean m17681x6510ccbb(android.content.Context context, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2013x19c49f26.m18622x6510ccbb(context, i17);
    }

    @java.lang.Deprecated
    /* renamed from: isPlayServicesPossiblyUpdating */
    public static boolean m17682x244e0a07(android.content.Context context, int i17) {
        if (i17 == 18) {
            return true;
        }
        if (i17 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @java.lang.Deprecated
    /* renamed from: isPlayStorePossiblyUpdating */
    public static boolean m17683xe90c3e0e(android.content.Context context, int i17) {
        if (i17 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    /* renamed from: isRestrictedUserProfile */
    public static boolean m17684xa0c9d4f9(android.content.Context context) {
        if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18599xc07674b()) {
            return false;
        }
        java.lang.Object systemService = context.getSystemService("user");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(systemService);
        android.os.Bundle applicationRestrictions = ((android.os.UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @java.lang.Deprecated
    /* renamed from: isSidewinderDevice */
    public static boolean m17685xb99a998c(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18562x52511796(context);
    }

    @java.lang.Deprecated
    /* renamed from: isUserRecoverableError */
    public static boolean m17686x19567a1f(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 3 || i17 == 9;
    }

    @java.lang.Deprecated
    /* renamed from: uidHasPackageName */
    public static boolean m17687x7093a567(android.content.Context context, int i17, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2013x19c49f26.m18623x7093a567(context, i17, str);
    }

    public static boolean zza(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18602x4727d397()) {
            try {
                java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m17684xa0c9d4f9(context);
    }

    @java.lang.Deprecated
    /* renamed from: isGooglePlayServicesAvailable */
    public static int m17680x402556f4(android.content.Context context, int i17) {
        android.content.pm.PackageInfo packageInfo;
        try {
            context.getResources().getString(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.R.C1721xcad56011.f5845xcb01d1bc);
        } catch (java.lang.Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            int zza2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1954x394b67.zza(context);
            if (zza2 != 0) {
                if (zza2 != f5840x7aedca50) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1707xaa14c9c7(zza2);
                }
            } else {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1709x2f870e08();
            }
        }
        boolean z17 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18568xbed280e8(context) || com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.zzb(context)) ? false : true;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(i17 >= 0);
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (z17) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.m17688x9cf0d20b(context);
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.zzb(packageInfo2, true)) {
                if (z17) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(packageInfo);
                    if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1714x7f70b655.zzb(packageInfo, true)) {
                        java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                    }
                }
                if (!z17 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.zza.zza(packageInfo2.versionCode) < com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.zza.zza(i17)) {
                        return 2;
                    }
                    android.content.pm.ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                            android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e17);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
                java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
            } else {
                java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            }
            return 9;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }
}
