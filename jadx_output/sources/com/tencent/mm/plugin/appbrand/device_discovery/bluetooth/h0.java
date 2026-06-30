package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f77886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z f77889g;

    public h0(l81.b1 b1Var, java.lang.String str, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar) {
        this.f77886d = b1Var;
        this.f77887e = str;
        this.f77888f = monitoredBluetoothDeviceInfo;
        this.f77889g = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.headless.j jVar = com.tencent.mm.plugin.appbrand.headless.j.f78304a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.g0 g0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.g0(this.f77887e, this.f77888f, this.f77889g);
        l81.b1 bundle = this.f77886d;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        try {
            java.lang.String str = "HeadlessStart[" + bundle.f317014b + "][" + bundle.f317016c + "][" + bundle.f317026h + ']';
            jVar.c(bundle, new com.tencent.mm.plugin.appbrand.headless.f(jVar.b(str), g0Var, str));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandHeadlessStartService", th6, "headless start failed ", new java.lang.Object[0]);
            g0Var.a(-11, th6.getMessage());
        }
    }
}
