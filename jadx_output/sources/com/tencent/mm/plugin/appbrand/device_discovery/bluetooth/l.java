package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class l implements wu5.h {
    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "DisableMonitorBluetoothDevice#" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.getClass();
        if (!com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77968g) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, isSupportLE is false");
            return;
        }
        boolean z17 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77904c;
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "disableMonitor, curIsMonitor: " + z17);
        if (z17) {
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77905d).values().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.m((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) it.next());
            }
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.c(null);
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77904c = false;
        }
    }
}
