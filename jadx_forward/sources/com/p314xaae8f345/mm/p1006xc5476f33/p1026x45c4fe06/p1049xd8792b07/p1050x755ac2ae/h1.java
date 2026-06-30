package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.i1 f159423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f159424e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.i1 i1Var, l75.k0 k0Var) {
        this.f159423d = i1Var;
        this.f159424e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f159423d.getClass();
        l75.k0 k0Var = this.f159424e;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k1.b(k0Var, "MonitoredBluetoothDeviceInfo")) {
            t91.a.f498100a.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, not need");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4(k0Var, k0Var.b(), null);
        try {
            try {
                t91.a aVar = t91.a.f498100a;
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, v1 exists, start migrate to v2");
                if (k0Var.A("MonitoredBluetoothDeviceInfoV2", "INSERT INTO MonitoredBluetoothDeviceInfoV2 SELECT * FROM MonitoredBluetoothDeviceInfo;")) {
                    aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, migrate to v2 success, delete v1");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k1.a(k0Var, "MonitoredBluetoothDeviceInfo")) {
                        aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, delete v1 success");
                    }
                }
            } catch (java.lang.Exception e17) {
                t91.a.f498100a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed fail");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", e17, "migrateFromV1IfNeed fail", new java.lang.Object[0]);
            }
            wz5.a.a(k4Var, null);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                wz5.a.a(k4Var, th6);
                throw th7;
            }
        }
    }
}
