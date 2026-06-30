package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(0);
        this.f77870d = monitoredBluetoothDeviceInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f77870d;
        java.lang.String str = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
        kotlin.jvm.internal.o.d(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77905d;
        concurrentHashMap.put(str, monitoredBluetoothDeviceInfo);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 gattConnectListener = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77909h.getValue();
        kotlin.jvm.internal.o.g(gattConnectListener, "gattConnectListener");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.getClass();
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1 o0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77963b ? new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o0(str, gattConnectListener) : new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p0(str, gattConnectListener);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77906e;
        concurrentHashMap2.put(str, o0Var);
        if (!o0Var.a()) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "doMonitor, autoConnectGatt to " + str + " fail");
            concurrentHashMap2.remove(str);
            concurrentHashMap.remove(str);
        }
        return jz5.f0.f302826a;
    }
}
