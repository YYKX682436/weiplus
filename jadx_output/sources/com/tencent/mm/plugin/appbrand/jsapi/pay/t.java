package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class t implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f82667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.v f82670g;

    public t(com.tencent.mm.plugin.appbrand.jsapi.pay.v vVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82670g = vVar;
        this.f82667d = activity;
        this.f82668e = c0Var;
        this.f82669f = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "mmOnActivityResult, resultCode = " + i18);
        com.tencent.mm.plugin.appbrand.jsapi.pay.v vVar = this.f82670g;
        int i19 = this.f82669f;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82668e;
        if (i18 != -1) {
            c0Var.a(i19, vVar.o("cancel"));
            return;
        }
        if (intent != null && intent.hasExtra("url")) {
            android.content.Intent intent2 = new android.content.Intent();
            if (intent.hasExtra("view_port_code")) {
                intent2.putExtra("view_port_code", intent.getStringExtra("view_port_code"));
            }
            try {
                intent2.putExtra("rawUrl", intent.getStringExtra("url"));
                j45.l.j(this.f82667d, "webview", ".ui.tools.WebViewUI", intent2, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "loadUrl ex: %s", e17.getMessage());
            }
        }
        c0Var.a(i19, vVar.o("ok"));
    }
}
