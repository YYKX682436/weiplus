package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b0 f77875a = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b0();

    public static final void b(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77921g, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a1.f77871a);
        if (!com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.j(monitoredBluetoothDeviceInfo, z17) || z17) {
            return;
        }
        java.lang.String field_appId = monitoredBluetoothDeviceInfo.field_appId;
        kotlin.jvm.internal.o.f(field_appId, "field_appId");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1 b1Var = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77906e).get(str);
        if (b1Var != null) {
            b1Var.b();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77908g;
        java.lang.Object obj = concurrentHashMap.get(field_appId);
        if (obj == null) {
            obj = new java.util.concurrent.ConcurrentHashMap();
            concurrentHashMap.put(field_appId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        if (map.get(str) == null) {
            map.put(str, java.lang.Boolean.FALSE);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1
    public final void a(java.lang.String deviceId, boolean z17) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, deviceId: " + deviceId + ", isConnected: " + z17);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77905d).get(deviceId);
        if (monitoredBluetoothDeviceInfo == null) {
            aVar.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, deviceInfo is null");
            return;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77907f.add(deviceId);
            b(monitoredBluetoothDeviceInfo, z17, deviceId);
        } else if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77907f.remove(deviceId)) {
            aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onConnectStateChange, maybe device away");
        } else {
            b(monitoredBluetoothDeviceInfo, z17, deviceId);
        }
    }
}
