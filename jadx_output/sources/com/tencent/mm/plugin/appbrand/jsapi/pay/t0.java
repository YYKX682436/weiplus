package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.x0 f82672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.pay.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        super(0);
        this.f82671d = str;
        this.f82672e = x0Var;
        this.f82673f = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f82671d;
        sb6.append(str);
        sb6.append(" onDestroy stopListen");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.pay.x0.C(this.f82672e, this.f82673f, str);
        return jz5.f0.f302826a;
    }
}
