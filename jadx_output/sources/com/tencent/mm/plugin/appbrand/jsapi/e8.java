package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class e8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 288;
    public static final java.lang.String NAME = "navigateBackApplication";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = ((com.tencent.mm.plugin.appbrand.o6) yVar.t3()).u0().D;
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String str = com.tencent.mm.plugin.appbrand.m6.b(yVar.t3().f74803n).f85716i;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateBackApplication", "navigate back Application, businessType:%s", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.appbrand.m6.a(yVar.getAppId()).f85720m = true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            if (optString2 == null) {
                optString2 = "{}";
            }
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs(optString, optString2, str, 0), com.tencent.mm.plugin.appbrand.jsapi.d8.class, null);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77323e) || !((i18 = appBrandLaunchReferrer.f77322d) == 4 || i18 == 7)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateBackApplication", "navigateBackApplication appid %s,launchScene %d", appBrandLaunchReferrer.f77323e, java.lang.Integer.valueOf(appBrandLaunchReferrer.f77322d));
            yVar.a(i17, o("fail:not from opensdk"));
            return;
        } else {
            java.lang.String str2 = appBrandLaunchReferrer.f77323e;
            if (optString2 == null) {
                optString2 = "{}";
            }
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs(str2, optString2, str, 0), com.tencent.mm.plugin.appbrand.jsapi.d8.class, null);
        }
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, u(str3, jSONObject2));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        yVar.j(new com.tencent.mm.plugin.appbrand.jsapi.b8(this, yVar), 1000L);
    }
}
