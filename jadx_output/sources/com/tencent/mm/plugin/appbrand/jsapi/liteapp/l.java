package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
public class l implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.liteapp.m f81542a;

    public l(com.tencent.mm.plugin.appbrand.jsapi.liteapp.m mVar) {
        this.f81542a = mVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp fail");
        com.tencent.mm.plugin.appbrand.jsapi.liteapp.m mVar = this.f81542a;
        mVar.f81544e.a(mVar.f81545f, mVar.f81548i.o("fail"));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "jsApiOpenLiteApp success. forcePortrait:%b openType:%d", java.lang.Boolean.valueOf(this.f81542a.f81548i.f81559i), java.lang.Integer.valueOf(this.f81542a.f81546g.f360657i));
        com.tencent.mm.plugin.appbrand.jsapi.liteapp.m mVar = this.f81542a;
        if (mVar.f81548i.f81559i && mVar.f81546g.f360657i == 1) {
            ((android.app.Activity) mVar.f81547h).setRequestedOrientation(1);
        }
        com.tencent.mm.plugin.appbrand.jsapi.liteapp.m mVar2 = this.f81542a;
        mVar2.f81544e.a(mVar2.f81545f, mVar2.f81548i.o("ok"));
        com.tencent.mm.plugin.appbrand.jsapi.liteapp.u uVar = this.f81542a.f81548i;
        if (uVar.f81557g) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.appbrand.jsapi.liteapp.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.n(uVar);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(nVar, 1000L, false);
        }
    }
}
