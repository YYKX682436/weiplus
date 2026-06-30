package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public class e implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    private e() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77903b;
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBleKeepAlive", "unregisterKeepAlive: " + str);
        synchronized (aVar) {
            java.util.Iterator it = ((android.util.ArraySet) aVar.f77864b).iterator();
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = null;
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                if ((((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) pair.first).field_appId + ((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) pair.first).field_versionType + ((java.lang.String) pair.second)).equals(str)) {
                    monitoredBluetoothDeviceInfo = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) pair.first;
                    it.remove();
                }
            }
            ((android.util.ArraySet) aVar.f77865c).remove(monitoredBluetoothDeviceInfo);
        }
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
