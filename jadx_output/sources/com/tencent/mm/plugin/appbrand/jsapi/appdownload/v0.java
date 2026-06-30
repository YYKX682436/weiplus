package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class v0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 671;
    public static final java.lang.String NAME = "jumpDownloaderWidgetForNative";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString("appId");
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest jsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest();
        jsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest.f78875d = optString;
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.r0 r0Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.r0(this, e9Var, i17);
        android.app.Activity Z0 = e9Var.Z0();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(Z0, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiJumpDownloaderWidgetForNative$JumpDownloadWidgetRequest, r0Var, null);
    }
}
