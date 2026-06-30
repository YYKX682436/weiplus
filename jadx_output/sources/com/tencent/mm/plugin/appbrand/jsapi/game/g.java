package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1513;
    public static final java.lang.String NAME = "showGameRewardsCapsuleBanner";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        k91.z zVar;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowGameRewardsCapsuleBanner", "invoke");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("configKey") : null;
        if (optString != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.CapsuleBannerConfig capsuleBannerConfig = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77230y0;
            zVar = (capsuleBannerConfig == null || android.text.TextUtils.isEmpty(capsuleBannerConfig.f77234d)) ? null : capsuleBannerConfig.a(capsuleBannerConfig.f77234d, optString);
        } else {
            zVar = null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.game.j jVar = com.tencent.mm.plugin.appbrand.jsapi.game.j.f81260a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.d5a);
        mi1.z0 z0Var = mi1.z0.f326739e;
        jVar.a("MicroMsg.JsApiShowGameRewardsCapsuleBanner", e9Var, zVar, valueOf, com.tencent.mm.R.string.mgj, 256, 33);
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
