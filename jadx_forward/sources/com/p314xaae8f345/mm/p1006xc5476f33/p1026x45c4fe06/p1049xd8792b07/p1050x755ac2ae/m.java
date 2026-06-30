package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class m implements wu5.h {
    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "EnableMonitorBluetoothDevice#" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a;
        u0Var.getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159501g) {
            t91.a.f498100a.b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, isSupportLE is false");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159437c;
        t91.a.f498100a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, curIsMonitor: " + z17);
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159437c = true;
        u0Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.c1() { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.c1
            /* renamed from: onBluetoothStateChange */
            public final void mo50221xc065fc92(boolean z18) {
                t91.a aVar = t91.a.f498100a;
                aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothStateChange, isOn: " + z18);
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159437c) {
                    aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothStateChange, isMonitor is false");
                    return;
                }
                if (!z18) {
                    java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159438d).values().iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a.m((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) it.next());
                    }
                    return;
                }
                java.util.List f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a.f();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : f17) {
                    if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) obj).f65993x76c8545d) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a.e((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59) it6.next());
                    arrayList2.add(jz5.f0.f384359a);
                }
            }
        });
    }
}
