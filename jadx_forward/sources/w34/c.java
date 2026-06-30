package w34;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f524251a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f524252b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.lang.String f524253c;

    static {
        new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentHashMap();
        f524253c = "";
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static java.lang.String a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long currentTimeMillis;
        boolean e17;
        org.json.JSONObject a17;
        long currentTimeMillis2;
        long j17;
        long j18;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        java.lang.String str5 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetWebViewUAInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            currentTimeMillis = java.lang.System.currentTimeMillis();
            e17 = w34.a.e();
            java.lang.String b17 = x34.a.b(context, e17);
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            a17 = x34.b.a(context);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (b17 == null) {
                b17 = "";
            }
            a17.put("chrome_version", b17);
            currentTimeMillis2 = java.lang.System.currentTimeMillis();
            j17 = currentTimeMillis3 - currentTimeMillis;
            j18 = currentTimeMillis2 - currentTimeMillis3;
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "access$100";
            str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
            str3 = "doGetWebViewUAInfo";
        }
        if (j17 >= 2000 || j18 >= 1000) {
            try {
            } catch (java.lang.Throwable th7) {
                th = th7;
                str3 = "doGetWebViewUAInfo";
                str = "access$100";
                str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 5);
                ca4.e0.a("webview_ua_info", "webViewUAInfoErr", 0, 0, th.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                return str5;
            }
            if (java.lang.System.currentTimeMillis() % 10 == 0) {
                str = "access$100";
                str4 = "doGetWebViewUAInfo";
                try {
                    ca4.e0.a("webview_ua_info", "ua_time_cost", (int) j17, (int) j18, "");
                    java.lang.String jSONObject = a17.toString();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, visitDexOrODex=" + e17 + ", chromeVerCost=" + j17 + ", total=" + (currentTimeMillis2 - currentTimeMillis) + ", info=" + jSONObject);
                    str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str2);
                    str5 = jSONObject;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
                    str3 = str4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 5);
                    ca4.e0.a("webview_ua_info", "webViewUAInfoErr", 0, 0, th.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                    return str5;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                return str5;
            }
        }
        str4 = "doGetWebViewUAInfo";
        str = "access$100";
        java.lang.String jSONObject2 = a17.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.doGetWebViewUAInfo, visitDexOrODex=" + e17 + ", chromeVerCost=" + j17 + ", total=" + (currentTimeMillis2 - currentTimeMillis) + ", info=" + jSONObject2);
        str2 = "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str2);
        str5 = jSONObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        return str5;
    }

    public static java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f524252b)) {
                java.lang.String str = f524252b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                return str;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String property = java.lang.System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            f524252b = property;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", sysUa" + f524252b);
            java.lang.String str2 = f524252b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str2;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getAndroidUserAgent: " + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAndroidUserAgent", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return "";
        }
    }

    public static java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f524251a)) {
            java.lang.String str = f524251a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        try {
            java.lang.String n17 = wo.w0.n();
            f524251a = n17;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDeviceInfo.DeviceInfoUtils", "oaid is empty");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.DeviceInfoUtils", "AdDeviceInfo.DeviceInfoUtils.getOAID: " + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1896, 12);
            ca4.e0.a("oaid_empty2", "exp", 0, 0, "");
        }
        java.lang.String str2 = f524251a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return str2;
    }

    public static java.lang.String d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 9);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f524253c)) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 10);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1893, 11);
            }
            java.lang.String str = f524253c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
            return str;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new w34.b());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String c17 = p34.o.c("wv_ua_info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, useLocal, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", value=" + c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
        return c17;
    }
}
