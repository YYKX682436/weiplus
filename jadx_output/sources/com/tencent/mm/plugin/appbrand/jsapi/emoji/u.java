package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes.dex */
public class u extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1268;
    public static final java.lang.String NAME = "openStickerSetView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenStickerSetView", "data:%s", jSONObject);
        java.lang.String optString = jSONObject.optString("productId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenStickerSetView", "productId is empty");
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        if (optString == null) {
            optString = "";
        }
        qk.c0 c0Var = new qk.c0(optString);
        c0Var.f364198g = 26;
        c0Var.f364155a = 42;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenStickerSetView", "start EmojiStoreDetailUI");
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenStickerSetView", "emoticon liteapp service not found");
            e9Var.a(i17, o("fail:internal error"));
            return;
        }
        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(e9Var.Z0(), c0Var);
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
