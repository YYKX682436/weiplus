package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.v0 {
    @Override // com.tencent.mm.plugin.appbrand.v0
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "AppBrandLifeCycle mHCELifeCycleListener onCreate");
        super.b();
        com.tencent.mm.plugin.appbrand.jsapi.nfc.d.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a, 21, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "AppBrandLifeCycle mHCELifeCycleListener onDestroy");
        com.tencent.mm.plugin.appbrand.jsapi.nfc.d.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a, 24, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "AppBrandLifeCycle mHCELifeCycleListener onPause");
        super.e(w0Var);
        com.tencent.mm.plugin.appbrand.jsapi.nfc.d.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a, 23, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "AppBrandLifeCycle mHCELifeCycleListener onResume");
        super.g();
        com.tencent.mm.plugin.appbrand.jsapi.nfc.d.a(com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82399a, 22, null);
    }
}
