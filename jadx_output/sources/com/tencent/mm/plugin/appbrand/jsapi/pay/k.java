package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class k implements com.tencent.mm.plugin.appbrand.jsapi.pay.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.l f82618c;

    public k(com.tencent.mm.plugin.appbrand.jsapi.pay.l lVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82618c = lVar;
        this.f82616a = c0Var;
        this.f82617b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.h
    public void a(int i17, int i18, java.lang.String str, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBindPaymentCard", "onPayResult: " + i17 + ", " + i18 + ", " + str);
        com.tencent.mm.plugin.appbrand.jsapi.pay.l lVar = this.f82618c;
        int i19 = this.f82617b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82616a;
        if (i17 != 1) {
            c0Var.a(i19, lVar.o("fail"));
        } else {
            c0Var.a(i19, lVar.o("ok"));
        }
    }
}
