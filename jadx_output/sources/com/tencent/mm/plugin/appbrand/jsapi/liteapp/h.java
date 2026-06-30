package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes7.dex */
public final class h implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f81539a;

    public h(com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f81539a = tVar;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        kotlin.jvm.internal.o.g(liteAppView, "liteAppView");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(this.f81539a.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.liteapp.g(liteAppView));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLiteAppView", "startLiteAppView success");
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertLiteAppView", "startLiteAppView fail");
    }
}
