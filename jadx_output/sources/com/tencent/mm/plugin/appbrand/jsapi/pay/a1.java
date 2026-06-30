package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class a1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.b1 f82579c;

    public a1(com.tencent.mm.plugin.appbrand.jsapi.pay.b1 b1Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82579c = b1Var;
        this.f82577a = c0Var;
        this.f82578b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "mmOnActivityResult, resultCode = " + i18);
        com.tencent.mm.plugin.appbrand.jsapi.pay.b1 b1Var = this.f82579c;
        int i19 = this.f82578b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82577a;
        if (i18 != -1) {
            c0Var.a(i19, b1Var.o("fail"));
            return false;
        }
        if (intent == null || !intent.getBooleanExtra("cancel", false)) {
            c0Var.a(i19, b1Var.o("ok"));
            return true;
        }
        c0Var.a(i19, b1Var.o("cancel"));
        return true;
    }
}
