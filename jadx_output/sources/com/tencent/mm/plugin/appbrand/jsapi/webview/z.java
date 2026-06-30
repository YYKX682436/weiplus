package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public final class z implements com.tencent.mm.plugin.appbrand.jsapi.webview.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.c0 f83900c;

    public z(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.webview.c0 c0Var2) {
        this.f83898a = c0Var;
        this.f83899b = i17;
        this.f83900c = c0Var2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.k
    public final void onDone() {
        com.tencent.mars.xlog.Log.i("Luggage.JsApiTranslateHTMLWebView", "translateHTMLWebView startTrans done");
        com.tencent.mm.plugin.appbrand.jsapi.webview.c0 c0Var = this.f83900c;
        c0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f83898a.a(this.f83899b, c0Var.u(str, jSONObject));
    }
}
