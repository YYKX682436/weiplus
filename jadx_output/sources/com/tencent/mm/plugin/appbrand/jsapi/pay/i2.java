package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class i2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.k2 f82613f;

    public i2(com.tencent.mm.plugin.appbrand.jsapi.pay.k2 k2Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f82613f = k2Var;
        this.f82611d = e9Var;
        this.f82612e = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.pay.k2 k2Var = this.f82613f;
        if (i17 != (k2Var.hashCode() & 65535)) {
            return;
        }
        k2Var.f82623g = false;
        int intExtra = intent != null ? intent.getIntExtra("key_err_code", 1) : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestVirtualPayment", "resultCode:%d,result:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intExtra));
        int i19 = this.f82612e;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82611d;
        if (i18 != -1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(intExtra));
            e9Var.a(i19, k2Var.p("cancel", hashMap));
        } else {
            if (intExtra == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestVirtualPayment", "requestIAP ok");
                e9Var.a(i19, k2Var.o("ok"));
                return;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.lang.String stringExtra = intent.getStringExtra("key_err_msg");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap2.put("errCode", java.lang.Integer.valueOf(intExtra));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestVirtualPayment", "requestVirtualPayment errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra), stringExtra);
            e9Var.a(i19, k2Var.p("fail ".concat(stringExtra), hashMap2));
        }
    }
}
