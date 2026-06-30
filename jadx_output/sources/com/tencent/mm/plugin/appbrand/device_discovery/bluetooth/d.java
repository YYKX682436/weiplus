package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public class d implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    private d() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo;
        final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77903b;
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBleKeepAlive", "scheduleRestart: " + str);
        synchronized (aVar) {
            java.util.Iterator it = ((android.util.ArraySet) aVar.f77864b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    monitoredBluetoothDeviceInfo = null;
                    break;
                }
                android.util.Pair pair = (android.util.Pair) it.next();
                if ((((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) pair.first).field_appId + ((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) pair.first).field_versionType + ((java.lang.String) pair.second)).equals(str)) {
                    monitoredBluetoothDeviceInfo = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) pair.first;
                    break;
                }
            }
        }
        if (monitoredBluetoothDeviceInfo != null) {
            synchronized (aVar) {
                ((android.util.ArraySet) aVar.f77865c).add(monitoredBluetoothDeviceInfo);
                ((android.util.ArraySet) aVar.f77864b).remove(new android.util.Pair(monitoredBluetoothDeviceInfo, str));
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar2 = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a.this;
                    aVar2.getClass();
                    android.util.ArraySet arraySet = new android.util.ArraySet();
                    synchronized (aVar2) {
                        arraySet.addAll(aVar2.f77865c);
                        ((android.util.ArraySet) aVar2.f77865c).clear();
                    }
                    java.util.Iterator it6 = arraySet.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo2 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) it6.next();
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBleKeepAlive", "restart: " + monitoredBluetoothDeviceInfo2);
                        if (aVar2.b()) {
                            aVar2.f77863a.j(monitoredBluetoothDeviceInfo2, true);
                            synchronized (aVar2) {
                                ((java.util.ArrayList) aVar2.f77866d).add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                            }
                        }
                    }
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(runnable, 5000L, null);
        }
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
