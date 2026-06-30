package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1269;
    public static final java.lang.String NAME = "openSingleStickerView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenSingleStickerView", "data:%s", jSONObject);
        java.lang.String optString = jSONObject.optString("md5");
        java.lang.String optString2 = jSONObject.optString("emojiInfoBuf");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSingleStickerView", "md5 or emojiInfoBuf is empty");
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest jsApiOpenSingleStickerView$OpenEmojiSinglePageRequest = new com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest();
        jsApiOpenSingleStickerView$OpenEmojiSinglePageRequest.f80836d = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.emoji.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.emoji.n(this, e9Var, i17);
        android.app.Activity Z0 = e9Var.Z0();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(Z0, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenSingleStickerView$OpenEmojiSinglePageRequest, nVar, null);
    }
}
