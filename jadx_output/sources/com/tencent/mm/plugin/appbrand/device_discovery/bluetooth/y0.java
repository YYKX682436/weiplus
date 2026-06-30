package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f77977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(boolean z17, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(1);
        this.f77977d = z17;
        this.f77978e = monitoredBluetoothDeviceInfo;
    }

    public static final void a(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
        java.lang.String field_appId = monitoredBluetoothDeviceInfo.field_appId;
        kotlin.jvm.internal.o.f(field_appId, "field_appId");
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "stopStatWeApp， appId: ".concat(field_appId));
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77961c.remove(field_appId);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a;
        java.lang.String field_appId2 = monitoredBluetoothDeviceInfo.field_appId;
        kotlin.jvm.internal.o.f(field_appId2, "field_appId");
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppSuspend, appId: ".concat(field_appId2));
        uk0.a.c(new com.tencent.mm.ipcinvoker.type.IPCString(field_appId2), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i0.f77895d, null, 4, null);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.e9 appService = (com.tencent.mm.plugin.appbrand.e9) obj;
        kotlin.jvm.internal.o.g(appService, "appService");
        if (this.f77977d) {
            t91.a.f416567a.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, isConnected, not need stat");
        } else {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
            java.lang.String field_appId = this.f77978e.field_appId;
            kotlin.jvm.internal.o.f(field_appId, "field_appId");
            t91.a aVar = t91.a.f416567a;
            aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "startStatWeApp， appId: ".concat(field_appId));
            if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77961c.add(field_appId)) {
                u81.h hVar = appService.t3().N;
                if (hVar == null) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f77978e;
                    aVar.b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, appRunningStateController is null");
                    a(monitoredBluetoothDeviceInfo);
                } else if (u81.b.DESTROYED == hVar.b()) {
                    aVar.b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, weApp is destroyed");
                    a(this.f77978e);
                } else if (u81.b.SUSPEND == hVar.b()) {
                    a(this.f77978e);
                } else {
                    hVar.a(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.x0(hVar, this.f77978e));
                }
            } else {
                aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, already start stat");
            }
        }
        return jz5.f0.f302826a;
    }
}
