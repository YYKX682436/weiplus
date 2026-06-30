package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1593;
    public static final java.lang.String NAME = "showPCHandoffCapsuleBanner";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        k91.z zVar;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowPCHandoffCapsuleBanner", "invoke");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("configKey") : null;
        if (optString != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig capsuleBannerConfig = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77230y0;
            zVar = (capsuleBannerConfig == null || android.text.TextUtils.isEmpty(capsuleBannerConfig.f77235e)) ? null : capsuleBannerConfig.a(capsuleBannerConfig.f77235e, optString);
        } else {
            zVar = null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.game.j jVar = com.tencent.mm.plugin.appbrand.jsapi.game.j.f81260a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.btd);
        mi1.z0 z0Var = mi1.z0.f326739e;
        jVar.a("MicroMsg.JsApiShowPCHandoffCapsuleBanner", e9Var, zVar, valueOf, com.tencent.mm.R.string.f491090nf0, 512, 29);
        if (e9Var != null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
        }
    }
}
