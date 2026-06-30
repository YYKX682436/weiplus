package com.tencent.mm.plugin.appbrand.ad.jsapi;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 756;
    public static final java.lang.String NAME = "showSplashAdMenu";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        boolean optBoolean = jSONObject.optBoolean("showMenu", false);
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        java.lang.String optString2 = jSONObject.optString("icon", "");
        java.lang.String appId = e9Var.getAppId();
        java.util.Map map = i81.j.f289592a;
        i81.a0.b(appId).f289558b = optBoolean;
        i81.a0.b(e9Var.getAppId()).f289560d = optString;
        i81.a0.b(e9Var.getAppId()).f289559c = optString2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShowMenuAd[AppBrandSplashAd]", "showSplashAdMenu, showMenuAd:%s, title:%s, icon:%s", java.lang.Boolean.valueOf(optBoolean), optString, optString2);
        e9Var.a(i17, o("ok"));
    }
}
