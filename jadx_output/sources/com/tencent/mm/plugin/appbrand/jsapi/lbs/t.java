package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class t implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 f81481d;

    public t(com.tencent.mm.plugin.appbrand.jsapi.lbs.u uVar, com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var) {
        this.f81481d = k1Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.DESTROYED) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.DESTROYED, uninit");
            this.f81481d.j();
            return;
        }
        if (bVar == u81.b.SUSPEND) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.SUSPEND, suspendListening");
            com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var = this.f81481d;
            k1Var.f81439o = false;
            k1Var.l(3);
            return;
        }
        if (bVar == u81.b.FOREGROUND) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.FOREGROUND, resumeListening");
            com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var2 = this.f81481d;
            if (k1Var2.f81439o) {
                k1Var2.f81439o = false;
                return;
            } else {
                k1Var2.l(4);
                return;
            }
        }
        if (bVar == u81.b.BACKGROUND) {
            if (this.f81481d.f81441q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.BACKGROUND, do nothing");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.BACKGROUND, stopListening");
            com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var3 = this.f81481d;
            k1Var3.f81439o = false;
            k1Var3.l(2);
        }
    }
}
