package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class q0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80093d;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var) {
        this.f80093d = w0Var;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        if (u81.b.BACKGROUND == bVar) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = this.f80093d;
            if (w0Var.f80135s.isEmpty()) {
                com.tencent.mars.xlog.Log.i(w0Var.f80124e, "onRunningStateChanged, disable");
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(w0Var, false, 1, null);
            }
        }
    }
}
