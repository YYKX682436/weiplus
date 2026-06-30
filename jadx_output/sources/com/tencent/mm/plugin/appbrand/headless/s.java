package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class s implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.y f78306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f78308c;

    public s(com.tencent.mm.plugin.appbrand.headless.y yVar, com.tencent.mm.plugin.appbrand.o6 o6Var, yz5.a aVar) {
        this.f78306a = yVar;
        this.f78307b = o6Var;
        this.f78308c = aVar;
    }

    @Override // ph1.d
    public final void a(ph1.g gVar) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "run()-ensureEntryModuleLoadedAndCallback, appId:" + this.f78306a.f78318d.f77278d + ", instanceId:" + this.f78306a.f78318d.f47277w + ", sessionId:" + this.f78306a.f78318d.f47276v + ", loadModuleResult:" + gVar);
        if (ph1.g.OK != gVar) {
            l81.v0 v0Var = this.f78306a.f78321g;
            if (v0Var != null) {
                l81.v0.b(v0Var, -9, null, 2, null);
            }
            this.f78308c.invoke();
            return;
        }
        this.f78307b.N.f425432a.s(u81.u.AWAKE_IN_BACKGROUND, null);
        com.tencent.mm.plugin.appbrand.headless.y yVar = this.f78306a;
        if (yVar.f78322h != null) {
            com.tencent.mm.plugin.appbrand.o6 runtime = this.f78307b;
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config = yVar.f78318d;
            kotlin.jvm.internal.o.g(runtime, "runtime");
            kotlin.jvm.internal.o.g(config, "config");
            t91.a aVar = t91.a.f416567a;
            aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "deliverOnBluetoothDeviceFound, runtime(" + runtime.f74803n + ')');
            android.os.PersistableBundle persistableBundle = config.V;
            android.os.PersistableBundle persistableBundle2 = persistableBundle != null ? persistableBundle.getPersistableBundle("DeviceDiscovery_bluetoothDeviceInfo") : null;
            if (persistableBundle2 != null) {
                monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                monitoredBluetoothDeviceInfo.field_appId = persistableBundle2.getString("appid");
                monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = persistableBundle2.getString("bluetoothDeviceId");
                monitoredBluetoothDeviceInfo.field_wechatToken = persistableBundle2.getString("deviceId");
                monitoredBluetoothDeviceInfo.field_versionType = persistableBundle2.getInt("envVersion");
                monitoredBluetoothDeviceInfo.field_entryPackage = persistableBundle2.getString("entryPackage");
            } else {
                monitoredBluetoothDeviceInfo = null;
            }
            boolean z17 = (persistableBundle != null ? persistableBundle.getInt("DeviceDiscovery_isBluetoothDeviceConnected") : 0) != 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deliverOnBluetoothDeviceFound, appId: ");
            sb6.append(monitoredBluetoothDeviceInfo != null ? monitoredBluetoothDeviceInfo.field_appId : null);
            sb6.append(", deviceId: ");
            sb6.append(monitoredBluetoothDeviceInfo != null ? monitoredBluetoothDeviceInfo.field_bluetoothDeviceId : null);
            sb6.append(", isConnected: ");
            sb6.append(z17);
            aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", sb6.toString());
            if (monitoredBluetoothDeviceInfo == null || !monitoredBluetoothDeviceInfo.isValid()) {
                aVar.b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "deliverOnBluetoothDeviceFound, deviceInfo is invalid");
            } else {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77923i, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.w0(runtime));
                aVar.a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "onFound, appId: " + monitoredBluetoothDeviceInfo.field_appId + ", deviceId: " + monitoredBluetoothDeviceInfo.field_bluetoothDeviceId + ", isConnected: " + z17);
                new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0(monitoredBluetoothDeviceInfo).u(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.y0(z17, monitoredBluetoothDeviceInfo));
            }
        }
        l81.v0 v0Var2 = this.f78306a.f78321g;
        if (v0Var2 != null) {
            v0Var2.onSuccess();
        }
        this.f78308c.invoke();
    }
}
