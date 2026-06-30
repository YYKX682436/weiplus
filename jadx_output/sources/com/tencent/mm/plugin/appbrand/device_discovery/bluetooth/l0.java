package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 f77916e;

    public l0(java.lang.String str, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var) {
        this.f77915d = str;
        this.f77916e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0 u0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var = this.f77916e;
        n0Var.getClass();
        t91.a.f416567a.a(n0Var.f77933e.f77937c, "get#gattConnectListenerWithRetry");
        n0Var.f77929a = android.os.SystemClock.elapsedRealtime();
        u0Var.a(this.f77915d, n0Var);
    }
}
