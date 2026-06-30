package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes.dex */
public final class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34705x366c91de = 1193;

    /* renamed from: NAME */
    public static final java.lang.String f34706x24728b = "pushNativeWebView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("url") : null;
        java.lang.Boolean valueOf = optString != null ? java.lang.Boolean.valueOf(r26.i0.n(optString, "#wechat_redirect", false)) : null;
        java.lang.Boolean valueOf2 = jSONObject != null ? java.lang.Boolean.valueOf(jSONObject.optBoolean("disableShareMenu", true)) : null;
        android.content.Context mo50352x76847179 = lVar != null ? lVar.mo50352x76847179() : null;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", optString);
        intent.putExtra("forceHideShare", valueOf2);
        intent.putExtra("needRedirect", valueOf);
        j45.l.j(mo50352x76847179, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPushNativeWebView", "url: " + optString);
    }
}
