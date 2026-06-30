package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.x0 f82681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.pay.x0 x0Var) {
        super(0);
        this.f82679d = d0Var;
        this.f82680e = str;
        this.f82681f = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.w0 d17;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82679d;
        if (d0Var.getAppId() != null && ((d17 = com.tencent.mm.plugin.appbrand.x0.d(d0Var.getAppId())) == com.tencent.mm.plugin.appbrand.w0.CLOSE || d17 == com.tencent.mm.plugin.appbrand.w0.BACK)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = this.f82680e;
            sb6.append(str);
            sb6.append(" onBackground stopListen");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", sb6.toString());
            com.tencent.mm.plugin.appbrand.jsapi.pay.x0.C(this.f82681f, d0Var, str);
        }
        return jz5.f0.f302826a;
    }
}
