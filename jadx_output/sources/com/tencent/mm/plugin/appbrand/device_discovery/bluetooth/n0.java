package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class n0 implements com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f77929a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k1 f77930b = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k1();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f77931c;

    /* renamed from: d, reason: collision with root package name */
    public volatile yz5.a f77932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o0 f77933e;

    public n0(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o0 o0Var) {
        this.f77933e = o0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1
    public void a(java.lang.String deviceId, boolean z17) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        this.f77933e.f77936b.a(deviceId, z17);
        if (z17) {
            return;
        }
        if (30000 < android.os.SystemClock.elapsedRealtime() - this.f77929a) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k1 k1Var = this.f77930b;
            k1Var.getClass();
            t91.a.f416567a.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "reset#RetryDelayMillsResolver");
            synchronized (k1Var) {
                k1Var.f77914a = 1;
            }
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m0 m0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m0(this, deviceId);
        if (this.f77931c) {
            this.f77932d = m0Var;
        } else {
            m0Var.invoke();
        }
    }
}
