package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.s f80857c;

    public n(com.tencent.mm.plugin.appbrand.jsapi.emoji.s sVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f80857c = sVar;
        this.f80855a = e9Var;
        this.f80856b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult jsApiOpenSingleStickerView$OpenEmojiSinglePageResult = (com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.emoji.s sVar = this.f80857c;
        int i17 = this.f80856b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f80855a;
        if (jsApiOpenSingleStickerView$OpenEmojiSinglePageResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSingleStickerView", "onReceiveResult is null");
            sVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, sVar.u(str2, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSingleStickerView", "onReceiveResult:%b", java.lang.Boolean.valueOf(jsApiOpenSingleStickerView$OpenEmojiSinglePageResult.f80837d));
        if (jsApiOpenSingleStickerView$OpenEmojiSinglePageResult.f80837d) {
            sVar.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str4 != null ? str4 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, sVar.u(str2, jSONObject2));
            return;
        }
        sVar.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        e9Var.a(i17, sVar.u(str2, jSONObject3));
    }
}
