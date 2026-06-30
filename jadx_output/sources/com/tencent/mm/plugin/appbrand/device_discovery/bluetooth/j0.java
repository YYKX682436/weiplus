package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(0);
        this.f77900d = monitoredBluetoothDeviceInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f77900d.field_bluetoothDeviceId;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1 b1Var = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1) ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77906e).remove(str);
        if (b1Var != null && !b1Var.disconnect()) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "undoMonitor, disAutoConnect to " + str + " fail");
        }
        ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77905d).remove(str);
        return jz5.f0.f302826a;
    }
}
