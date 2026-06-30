package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80114d;

    public t0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var) {
        this.f80114d = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = this.f80114d;
        com.tencent.mars.xlog.Log.i(w0Var.f80124e, "run#onConnectStateChange, do disable");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(w0Var, false, 1, null);
    }
}
