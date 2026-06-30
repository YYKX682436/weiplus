package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class t4 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.u4 f83456c;

    public t4(com.tencent.mm.plugin.appbrand.jsapi.u4 u4Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f83456c = u4Var;
        this.f83454a = e9Var;
        this.f83455b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.u4 u4Var = this.f83456c;
        if (i17 != (u4Var.hashCode() & 65535)) {
            return false;
        }
        int i19 = this.f83455b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83454a;
        if (i18 != -1 || intent == null) {
            if (i18 == 0) {
                e9Var.a(i19, u4Var.o("cancel"));
                return true;
            }
            e9Var.a(i19, u4Var.o("fail"));
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String stringExtra = intent.getStringExtra("choose_invoice_title_info");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseInvoiceTitle", "choose_invoice_title_info is : ".concat(stringExtra));
        hashMap.put("invoiceTitleInfo", stringExtra);
        e9Var.a(i19, u4Var.p("ok", hashMap));
        return true;
    }
}
