package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class m implements wu5.h {
    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "EnableMonitorBluetoothDevice#" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0 u0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a;
        u0Var.getClass();
        if (!com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77968g) {
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, isSupportLE is false");
            return;
        }
        boolean z17 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77904c;
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, curIsMonitor: " + z17);
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77904c = true;
        u0Var.c(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c1() { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1
            @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c1
            public final void onBluetoothStateChange(boolean z18) {
                t91.a aVar = t91.a.f416567a;
                aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothStateChange, isOn: " + z18);
                if (!com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77904c) {
                    aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothStateChange, isMonitor is false");
                    return;
                }
                if (!z18) {
                    java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77905d).values().iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.m((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) it.next());
                    }
                    return;
                }
                java.util.List f17 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.f();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : f17) {
                    if (!((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) obj).field_isBlocked) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.e((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) it6.next());
                    arrayList2.add(jz5.f0.f302826a);
                }
            }
        });
    }
}
