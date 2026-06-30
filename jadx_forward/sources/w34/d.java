package w34;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f524254a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f524255b = "";

    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            if (c()) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f524255b)) {
                    java.lang.String str2 = f524255b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                    return str2;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: this aPhone supports HarmonyOS but propertyName is null or nil");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                    return "0.0.0";
                }
                f524255b = "0.0.0";
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                java.lang.String str3 = (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: propertyName is " + str + ", this aPhone supports HarmonyOS but harmonyOSVersion is null or nil");
                } else {
                    f524255b = str3;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getHarmonyInfoFromSystemProperties: propertyName is " + str + ", " + th6.toString());
        }
        java.lang.String str4 = f524255b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHarmonyInfoFromSystemProperties", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return str4;
    }

    public static int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            if (c()) {
                int i17 = android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "pure_mode_state", -1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return i17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.getPureMode: " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPureMode", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return -1;
    }

    public static boolean c() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            i17 = f524254a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.isSupportHarmonyOS: " + th6.toString());
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return true;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return false;
        }
        f524254a = 2;
        java.lang.Object d17 = d("com.huawei.system.BuildEx", "getOsBrand");
        if (d17 instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) d17;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && "harmony".equals(str)) {
                f524254a = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.HarmonyOSUtils", "AdDeviceInfo.HarmonyOSUtils.isSupportHarmonyOS: this aPhone not supports HarmonyOS and osNameStr is " + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        return false;
    }

    public static java.lang.Object d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
        try {
            java.lang.Object invoke = java.lang.Class.forName(str).getMethod(str2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return invoke;
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "reflectInvokeStatic, error", e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.HarmonyOSUtils", "reflectInvokeStatic, error", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reflectInvokeStatic", "com.tencent.mm.plugin.sns.ad.device.utils.HarmonyOSUtils");
            return null;
        }
    }
}
