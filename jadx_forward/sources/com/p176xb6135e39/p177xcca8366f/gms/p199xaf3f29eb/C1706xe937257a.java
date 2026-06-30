package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.GoogleApiAvailabilityLight */
/* loaded from: classes13.dex */
public class C1706xe937257a {

    /* renamed from: GOOGLE_PLAY_SERVICES_PACKAGE */
    public static final java.lang.String f5826x1100896a = "com.google.android.gms";

    /* renamed from: GOOGLE_PLAY_STORE_PACKAGE */
    public static final java.lang.String f5828x5fbc30a3 = "com.android.vending";

    /* renamed from: TRACKING_SOURCE_DIALOG */
    static final java.lang.String f5829x2a502264 = "d";

    /* renamed from: TRACKING_SOURCE_NOTIFICATION */
    static final java.lang.String f5830xd4025d07 = "n";

    /* renamed from: GOOGLE_PLAY_SERVICES_VERSION_CODE */
    public static final int f5827x7aedca50 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a();

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a m17641x9cf0d20b() {
        return zza;
    }

    /* renamed from: cancelAvailabilityErrorNotifications */
    public void m17642x9b3d7995(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17668x9b3d7995(context);
    }

    /* renamed from: getApkVersion */
    public int m17643x3f509b12(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17671x3f509b12(context);
    }

    /* renamed from: getClientVersion */
    public int mo17621xeb61b2d7(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17672xeb61b2d7(context);
    }

    @java.lang.Deprecated
    /* renamed from: getErrorResolutionIntent */
    public android.content.Intent m17644x91cd42da(int i17) {
        return mo17626x91cd42da(null, i17, null);
    }

    /* renamed from: getErrorResolutionPendingIntent */
    public android.app.PendingIntent mo17627x6703115(android.content.Context context, int i17, int i18) {
        return m17645x6703115(context, i17, i18, null);
    }

    /* renamed from: getErrorString */
    public java.lang.String mo17629x94a1bf03(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17674x94a1bf03(i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: isGooglePlayServicesAvailable */
    public int mo17630x402556f4(android.content.Context context) {
        return mo17631x402556f4(context, f5827x7aedca50);
    }

    /* renamed from: isPlayServicesPossiblyUpdating */
    public boolean m17646x244e0a07(android.content.Context context, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17682x244e0a07(context, i17);
    }

    /* renamed from: isPlayStorePossiblyUpdating */
    public boolean m17647xe90c3e0e(android.content.Context context, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17683xe90c3e0e(context, i17);
    }

    /* renamed from: isUninstalledAppPossiblyUpdating */
    public boolean m17648x87a2c935(android.content.Context context, java.lang.String str) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.zza(context, str);
    }

    /* renamed from: isUserResolvableError */
    public boolean mo17632xd322c280(int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17686x19567a1f(i17);
    }

    /* renamed from: verifyGooglePlayServicesIsAvailable */
    public void m17649x4d3e953b(android.content.Context context, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17670x6c218d99(context, i17);
    }

    /* renamed from: getErrorResolutionIntent */
    public android.content.Intent mo17626x91cd42da(android.content.Context context, int i17, java.lang.String str) {
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                return null;
            }
            android.net.Uri fromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1996x45d55849.m18568xbed280e8(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gcore_");
        sb6.append(f5827x7aedca50);
        sb6.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(str);
        }
        sb6.append("-");
        if (context != null) {
            sb6.append(context.getPackageName());
        }
        sb6.append("-");
        if (context != null) {
            try {
                sb6.append(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String sb7 = sb6.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter(dm.i4.f66865x76d1ec5a, "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(sb7)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb7);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* renamed from: getErrorResolutionPendingIntent */
    public android.app.PendingIntent m17645x6703115(android.content.Context context, int i17, int i18, java.lang.String str) {
        android.content.Intent mo17626x91cd42da = mo17626x91cd42da(context, i17, str);
        if (mo17626x91cd42da == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, i18, mo17626x91cd42da, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzd.zza | 134217728);
    }

    /* renamed from: isGooglePlayServicesAvailable */
    public int mo17631x402556f4(android.content.Context context, int i17) {
        int m17680x402556f4 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17680x402556f4(context, i17);
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17682x244e0a07(context, m17680x402556f4)) {
            return 18;
        }
        return m17680x402556f4;
    }
}
