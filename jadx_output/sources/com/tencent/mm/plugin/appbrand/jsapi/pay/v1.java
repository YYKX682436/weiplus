package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class v1 implements com.tencent.mm.plugin.appbrand.jsapi.pay.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vd1.g f82687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.y1 f82689e;

    public v1(com.tencent.mm.plugin.appbrand.jsapi.pay.y1 y1Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, vd1.g gVar, java.lang.String str) {
        this.f82689e = y1Var;
        this.f82685a = d0Var;
        this.f82686b = i17;
        this.f82687c = gVar;
        this.f82688d = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.h
    public void a(int i17, int i18, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        vd1.g gVar;
        if (i17 == 1) {
            str2 = "ok";
        } else if (i17 != 2) {
            str2 = "fail cancel";
        } else {
            str2 = "fail:" + str;
        }
        java.lang.String p17 = this.f82689e.p(str2, map);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestPayment", "onPayResult result:%d, callbackStr:%s", java.lang.Integer.valueOf(i17), p17);
        int i19 = this.f82686b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82685a;
        d0Var.a(i19, p17);
        if (i17 == 1 || (gVar = this.f82687c) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.model.u0.a(gVar, d0Var.getAppId(), p17);
    }
}
