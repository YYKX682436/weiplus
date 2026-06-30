package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f273971a;

    /* renamed from: b, reason: collision with root package name */
    public static int f273972b;

    /* renamed from: c, reason: collision with root package name */
    public static int f273973c;

    /* renamed from: d, reason: collision with root package name */
    public static int f273974d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f273975e = "" + android.os.Build.VERSION.SDK_INT;

    /* renamed from: f, reason: collision with root package name */
    public static int f273976f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f273977g = "market://details?id=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f273978h = false;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f273979i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f273980j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f273981k = false;

    public static java.lang.String a(android.content.Context context, int i17) {
        return b(context, i17, f273978h);
    }

    public static java.lang.String b(android.content.Context context, int i17, boolean z17) {
        java.lang.String str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274650m)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274650m;
        }
        int i18 = (i17 >> 8) & 255;
        if (i18 == 0) {
            str = "" + ((i17 >> 24) & 15) + "." + ((i17 >> 16) & 255);
        } else {
            str = "" + ((i17 >> 24) & 15) + "." + ((i17 >> 16) & 255) + "." + i18;
        }
        int i19 = i17 & 268435455;
        if (context != null) {
            try {
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                if (packageInfo != null) {
                    i19 = packageInfo.versionCode;
                    str = packageInfo.versionName;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.ChannelUtil", e17, "", new java.lang.Object[0]);
            }
        }
        if (z17) {
            return str + "_" + i19;
        }
        java.lang.String[] split = str.split("\\.");
        if (split == null || split.length < 4) {
            return str;
        }
        java.lang.String str2 = split[0] + "." + split[1];
        if (split[2].trim().equals("0")) {
            return str2;
        }
        return str2 + "." + split[2];
    }

    public static boolean c() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (!yp5.a.f545942a.a()) {
            return true;
        }
        int intValue = java.lang.Integer.decode(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g).intValue() & 255;
        return intValue >= 64 && intValue <= 79;
    }

    public static int d(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.ChannelUtil", e17.getMessage());
            return 0;
        }
    }

    public static void e(android.content.Context context) {
        try {
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274655r;
            if (i17 != -1) {
                f273972b = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.ChannelUtil", "setup channel id from BuildConfig, id = " + f273972b);
                return;
            }
            int parseInt = java.lang.Integer.parseInt((java.lang.String) ((java.util.HashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.b2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(context.getAssets().open("channel.ini")))).get("CHANNEL"));
            f273972b = parseInt;
            if (parseInt == 1) {
                f273971a = 1;
            }
            com.p314xaae8f345.mm.app.C5000x71a2fa35.f134791m.e(java.lang.String.valueOf(f273972b));
            com.p314xaae8f345.mm.app.C4999x403c3a42.f134760h.f135089s.e(java.lang.String.valueOf(f273972b));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.ChannelUtil", "setup channel id from channel.ini failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.ChannelUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
