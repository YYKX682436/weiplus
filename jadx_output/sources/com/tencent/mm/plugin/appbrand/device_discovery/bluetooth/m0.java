package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 f77917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var, java.lang.String str) {
        super(0);
        this.f77917d = n0Var;
        this.f77918e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        int i19;
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.String str = this.f77918e;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n0 n0Var = this.f77917d;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l0 l0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l0(str, n0Var);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k1 k1Var = n0Var.f77930b;
        synchronized (k1Var) {
            i17 = k1Var.f77914a;
        }
        long pow = ((int) java.lang.Math.pow(2.0f, i17 - 1)) * 5000;
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "resolve#RetryDelayMillsResolver, curBackoffFactor: " + i17 + ", retryDelayMills: " + pow);
        synchronized (k1Var) {
            i18 = k1Var.f77914a;
            int i27 = i18 + 1;
            k1Var.f77914a = i27;
            if (10 < i27) {
                k1Var.f77914a = 1;
            }
            i19 = k1Var.f77914a;
        }
        aVar.a("MicroMsg.AppBrand.AutoConnectGattRetryStrategy", "updateBackoffFactor#RetryDelayMillsResolver, oldBackoffFactor: " + i18 + ", newBackoffFactor: " + i19);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(l0Var, pow, false);
        return jz5.f0.f302826a;
    }
}
