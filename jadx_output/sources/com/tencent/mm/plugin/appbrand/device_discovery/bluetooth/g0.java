package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class g0 implements com.tencent.mm.plugin.appbrand.headless.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z f77882c;

    public g0(java.lang.String str, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar) {
        this.f77880a = str;
        this.f77881b = monitoredBluetoothDeviceInfo;
        this.f77882c = zVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void a(int i17, java.lang.String str) {
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeApp fail, deviceId: " + this.f77880a + ", errCode: " + i17 + ", errMsg: " + str);
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(this.f77881b, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77924m, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.f0(i17));
        java.lang.Object obj = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77910i;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar = this.f77882c;
        synchronized (obj) {
            ((java.util.HashSet) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77911j).remove(zVar);
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.a(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a, this.f77882c.f77979a);
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void onSuccess(java.lang.String processName) {
        java.util.Set<com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo> set;
        java.lang.String i17;
        kotlin.jvm.internal.o.g(processName, "processName");
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "startWeApp success, deviceId: " + this.f77880a);
        java.lang.Object obj = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77910i;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar = this.f77882c;
        synchronized (obj) {
            ((java.util.HashSet) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77913l).add(zVar);
            ((java.util.HashSet) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77911j).remove(zVar);
            set = (java.util.Set) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77912k).remove(zVar);
        }
        if (set != null) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar2 = this.f77882c;
            for (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo deviceInfo : set) {
                zVar2.getClass();
                kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
                com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
                com.tencent.luggage.sdk.processes.s c17 = a17.c(zVar2.f77979a, zVar2.f77980b);
                if (c17 != null && (i17 = ((com.tencent.mm.plugin.appbrand.task.k) a17.f(c17)).i()) != null) {
                    com.tencent.mm.ipcinvoker.f.a(i17, deviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.y.f77976d, null);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a aVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77903b;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f77881b;
        synchronized (aVar) {
            ((android.util.ArraySet) aVar.f77864b).add(new android.util.Pair(monitoredBluetoothDeviceInfo, processName));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBleKeepAlive", "registerKeepAlive: " + monitoredBluetoothDeviceInfo + " processName: " + processName);
        com.tencent.mm.ipcinvoker.d0.a(processName, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b(aVar, processName, monitoredBluetoothDeviceInfo));
    }
}
