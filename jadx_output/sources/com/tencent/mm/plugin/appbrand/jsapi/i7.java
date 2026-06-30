package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class i7 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 427;
    private static final java.lang.String NAME = "launchApplication";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        D(jSONObject, "invoke", "");
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("schemeUrl");
        java.lang.String optString3 = jSONObject.optString("parameter");
        int P = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("alertType"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("operateDirectly"), 0);
        java.lang.String optString4 = jSONObject.optString("extInfo");
        java.lang.String optString5 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        java.lang.String optString6 = jSONObject.optString("signature");
        java.lang.String optString7 = jSONObject.optString("sourceInfo");
        java.lang.String optString8 = jSONObject.optString("bizInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s, pkg:%s, signature:%s", optString, optString2, optString4, optString3, optString5, optString6);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(optString5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplication", "appid and scheme is null or nil");
            e9Var.a(i17, o("fail:appid and scheme is null or nil"));
            D(jSONObject, "fail", "fail:appid and scheme is null or nil");
            return;
        }
        java.lang.String appId = e9Var.getAppId();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null) {
            str = V0.X1();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplication", "getCurrentPageView is null");
            str = null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                bundle.putString("current_page_url", java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        bundle.putString("current_page_appid", appId);
        bundle.putString("current_page_biz_info", optString8);
        bundle.putString("current_page_source_info", optString7);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.k14();
        lVar.f70665b = new r45.l14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/checklaunchapp";
        lVar.f70667d = 1125;
        r45.k14 k14Var = (r45.k14) lVar.a().f70710a.f70684a;
        k14Var.f378292d = appId;
        k14Var.f378293e = optString;
        int i18 = ((com.tencent.mm.plugin.appbrand.o6) e9Var.t3()).l2().f87790f;
        k14Var.f378294f = i18;
        k14Var.f378295g = str;
        k14Var.f378296h = optString2;
        k14Var.f378297i = P;
        k14Var.f378298m = 1;
        k14Var.f378299n = P2;
        k14Var.f378301p = optString5;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s, operateDirectly : %s)", appId, optString, java.lang.Integer.valueOf(i18), k14Var.f378295g, k14Var.f378296h, java.lang.Integer.valueOf(k14Var.f378297i), java.lang.Integer.valueOf(k14Var.f378299n));
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.d7(this, e9Var, i17, jSONObject, optString2, bundle, optString5, optString6, optString3, optString, optString4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        if (r14 == 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        if (r14 == 2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        r0 = mq0.z.f330649w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        r0 = mq0.z.f330648v;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(org.json.JSONObject r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.i7.D(org.json.JSONObject, java.lang.String, java.lang.String):void");
    }
}
