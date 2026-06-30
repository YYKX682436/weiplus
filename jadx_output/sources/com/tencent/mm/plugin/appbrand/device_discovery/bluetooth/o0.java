package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class o0 implements com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77935a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 f77936b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f77937c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 f77938d;

    public o0(java.lang.String deviceId, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 gattConnectListener) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(gattConnectListener, "gattConnectListener");
        this.f77935a = deviceId;
        this.f77936b = gattConnectListener;
        this.f77937c = "MicroMsg.AppBrand.AutoConnectGattRetryStrategy#" + hashCode();
        this.f77938d = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public boolean a() {
        t91.a aVar = t91.a.f416567a;
        aVar.a(this.f77937c, "connect");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0 u0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var = this.f77938d;
        n0Var.getClass();
        aVar.a(n0Var.f77933e.f77937c, "get#gattConnectListenerWithRetry");
        n0Var.f77929a = android.os.SystemClock.elapsedRealtime();
        return u0Var.a(this.f77935a, n0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public void b() {
        t91.a aVar = t91.a.f416567a;
        aVar.a(this.f77937c, "pauseConnect");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var = this.f77938d;
        n0Var.getClass();
        aVar.a(n0Var.f77933e.f77937c, "pause#gattConnectListenerWithRetry");
        n0Var.f77931c = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public void c(boolean z17) {
        t91.a aVar = t91.a.f416567a;
        aVar.a(this.f77937c, "resumeConnect, canReset: " + z17);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var = this.f77938d;
        n0Var.getClass();
        aVar.a(n0Var.f77933e.f77937c, "resume#gattConnectListenerWithRetry, canReset: " + z17);
        n0Var.f77931c = false;
        if (z17) {
            aVar.a(n0Var.f77933e.f77937c, "reset#gattConnectListenerWithRetry");
            n0Var.f77929a = -1L;
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k1 k1Var = n0Var.f77930b;
            k1Var.getClass();
            aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
            synchronized (k1Var) {
                k1Var.f77914a = 1;
            }
        }
        yz5.a aVar2 = n0Var.f77932d;
        if (aVar2 != null) {
            ((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m0) aVar2).invoke();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public boolean disconnect() {
        t91.a aVar = t91.a.f416567a;
        aVar.a(this.f77937c, "disconnect");
        boolean b17 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.b(this.f77935a);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var = this.f77938d;
        n0Var.getClass();
        aVar.a(n0Var.f77933e.f77937c, "reset#gattConnectListenerWithRetry");
        n0Var.f77929a = -1L;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k1 k1Var = n0Var.f77930b;
        k1Var.getClass();
        aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
        synchronized (k1Var) {
            k1Var.f77914a = 1;
        }
        return b17;
    }
}
