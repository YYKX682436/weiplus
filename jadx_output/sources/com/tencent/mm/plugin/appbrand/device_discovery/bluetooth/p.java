package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f77946d;

    public p(yz5.l lVar) {
        this.f77946d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.List list = kz5.p0.f313996d;
        yz5.l lVar = this.f77946d;
        if (bundle == null) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
            t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync, data is null");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(list)));
            return;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo.class.getClassLoader());
        java.util.List parcelableArrayList = bundle.getParcelableArrayList("List_MonitoredBluetoothDeviceInfo");
        if (parcelableArrayList != null) {
            list = parcelableArrayList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) obj2;
            if (monitoredBluetoothDeviceInfo.isValid()) {
                z17 = true;
            } else {
                t91.a.f416567a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync, deviceInfo: " + monitoredBluetoothDeviceInfo + " is invalid");
                z17 = false;
            }
            if (z17) {
                arrayList.add(obj2);
            }
        }
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
    }
}
