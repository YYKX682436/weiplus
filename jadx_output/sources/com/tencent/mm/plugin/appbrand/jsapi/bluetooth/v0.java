package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class v0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80116d;

    public v0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var) {
        this.f80116d = w0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i(this.f80116d.f80124e, "onDestroy");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(this.f80116d, false, 1, null);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77903b.c(this.f80116d.f80123d.f74803n, this.f80116d.f80123d.f74805p.f77281g, bm5.f1.a());
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i(this.f80116d.f80124e, "onResume");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = this.f80116d;
        java.util.concurrent.Future future = w0Var.f80136t;
        if (future == null) {
            com.tencent.mars.xlog.Log.i(w0Var.f80124e, "consumeDelayDisableOnResume, disableFuture is null");
            return;
        }
        if (future.isDone()) {
            com.tencent.mars.xlog.Log.i(w0Var.f80124e, "consumeDelayDisableOnResume, disableFuture is done");
        } else if (future.cancel(false)) {
            com.tencent.mars.xlog.Log.i(w0Var.f80124e, "consumeDelayDisableOnResume, canceled, do real disable");
            w0Var.b();
        }
    }
}
