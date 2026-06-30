package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class r4 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.s4 f82894c;

    public r4(com.tencent.mm.plugin.appbrand.jsapi.s4 s4Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f82894c = s4Var;
        this.f82892a = e9Var;
        this.f82893b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.s4 s4Var = this.f82894c;
        int i19 = s4Var.f82923g;
        int i27 = this.f82893b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82892a;
        if (i19 != i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseInvoice", "onActivityResult mismatch requestCode, with appId:%s, callbackId:%d", e9Var.getAppId(), java.lang.Integer.valueOf(i27));
            e9Var.a(i27, s4Var.o("fail:internal error"));
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i18 != -1) {
            if (i18 == 0) {
                e9Var.a(i27, s4Var.o("cancel"));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseInvoice", "callback cancel");
                return true;
            }
            e9Var.a(i27, s4Var.o("fail"));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseInvoice", "callback fail");
            return true;
        }
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("choose_invoice_info");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap.put("invoiceInfo", stringExtra);
        }
        e9Var.a(i27, s4Var.p("ok", hashMap));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseInvoice", "callback ok values = " + hashMap);
        return true;
    }
}
