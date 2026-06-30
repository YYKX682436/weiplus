package l44;

/* loaded from: classes4.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f397698a;

    public static void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkRespHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdResp", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1724, 5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdResp", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            if (w34.a.a() && w34.d.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportRespIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1724, 3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportRespIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                if (w34.d.b() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportRespIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    g0Var.A(1724, 4);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportRespIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRespHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
    }

    public static byte[] b(java.lang.String str, int i17, boolean z17, long j17, boolean z18) {
        boolean z19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1724, 6);
            jSONObject.put("ua", v34.b.e());
            boolean c17 = w34.d.c();
            if (w34.a.a() && c17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportReqIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1724, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportReqIsSupportHarmonyOS", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("is_harmony_os", c17);
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52919x5302ea51, w34.d.a("hw_sc.build.platform.version"));
                int b17 = w34.d.b();
                if (b17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportReqIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                    g0Var.A(1724, 2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportReqIsPureMode", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                }
                jSONObject2.put("harmony_pure_mode", b17);
                jSONObject.put("HarmonyInfo", jSONObject2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                jSONObject.put("sessionKeyAd", str);
            }
            java.lang.String c18 = c();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
                g0Var.A(1724, 9);
            } else {
                jSONObject.put("oaid", c18);
                g0Var.A(1724, 7);
            }
            org.json.JSONObject d17 = d();
            if (d17 != null) {
                jSONObject.put("webview_ua_info", d17);
                g0Var.A(1724, 8);
            }
            jSONObject.put("adPullRecords", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w0.y0());
            if (e()) {
                jSONObject.put("supportCapability", l44.e.a());
            }
            java.lang.String e17 = m54.j.e();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                jSONObject.put("vangoghLibVersion", e17);
            }
            org.json.JSONObject a17 = l44.f3.a();
            if (a17 != null) {
                jSONObject.putOpt("localAdRecords", a17);
            }
            synchronized (l44.h3.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                z19 = f397698a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOldSnsTimeLine", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            }
            jSONObject.putOpt("oldSnsTimeline", java.lang.Boolean.valueOf(z19));
            r34.h.a(jSONObject, i17, j17, z17, z18);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.lang.String jSONObject3 = jSONObject.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPassThroughInfoHelper", "getAdPassThroughInfo, timeCost = " + (currentTimeMillis2 - currentTimeMillis) + ", ret = " + jSONObject3);
            byte[] bytes = jSONObject3.getBytes();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return bytes;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", th6.toString());
            byte[] bArr = new byte[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return bArr;
        }
    }

    public static java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReqReportOaid", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        java.lang.String d17 = v34.b.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPassThroughInfoHelper", "getOAID, value=" + d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        return d17;
    }

    public static org.json.JSONObject d() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReqReportWebViewUaBuildInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            if (w34.a.d()) {
                str = w34.c.d(false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPassThroughInfoHelper", "getWebViewBuildInfoJson, value=" + str);
            if (!android.text.TextUtils.isEmpty(str)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                return jSONObject;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", "getWebViewBuildInfoJson, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWebViewBuildInfoJson", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        return null;
    }

    public static boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_req_support_hevc_and_webp, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPassThroughInfoHelper", "isReqSupportHevcAndWebP, value is " + Ni);
            boolean z17 = Ni > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", "isReqSupportHevcAndWebP, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReqSupportHevcAndWebP", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return true;
        }
    }

    public static void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReqIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        ((ku5.t0) ku5.t0.f394148d).g(new l44.g3(str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendGetHttpReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
    }
}
