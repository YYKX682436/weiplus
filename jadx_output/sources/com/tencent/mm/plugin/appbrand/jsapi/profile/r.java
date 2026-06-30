package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes.dex */
public final class r extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1193;
    public static final java.lang.String NAME = "pushNativeWebView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("url") : null;
        java.lang.Boolean valueOf = optString != null ? java.lang.Boolean.valueOf(r26.i0.n(optString, "#wechat_redirect", false)) : null;
        java.lang.Boolean valueOf2 = jSONObject != null ? java.lang.Boolean.valueOf(jSONObject.optBoolean("disableShareMenu", true)) : null;
        android.content.Context context = lVar != null ? lVar.getContext() : null;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", optString);
        intent.putExtra("forceHideShare", valueOf2);
        intent.putExtra("needRedirect", valueOf);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPushNativeWebView", "url: " + optString);
    }
}
