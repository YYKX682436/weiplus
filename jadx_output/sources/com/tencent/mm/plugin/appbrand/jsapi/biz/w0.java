package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class w0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f80019d;

    public w0(com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f80019d = x0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        u81.h hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "onRunningStateChanged appId:" + str + " state:" + bVar);
        if ((bVar == null ? -1 : com.tencent.mm.plugin.appbrand.jsapi.biz.v0.f80018a[bVar.ordinal()]) != 1) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f80019d.f80020g;
        if (appBrandRuntime != null && (hVar = appBrandRuntime.N) != null) {
            hVar.c(this);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f80019d.f80020g;
        if (appBrandRuntime2 != null) {
            appBrandRuntime2.S();
        }
    }
}
