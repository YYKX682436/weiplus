package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 f77890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f77891e;

    public h1(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i1 i1Var, l75.k0 k0Var) {
        this.f77890d = i1Var;
        this.f77891e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77890d.getClass();
        l75.k0 k0Var = this.f77891e;
        if (!com.tencent.mm.plugin.appbrand.utils.k1.b(k0Var, "MonitoredBluetoothDeviceInfo")) {
            t91.a.f416567a.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, not need");
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.k4 k4Var = new com.tencent.mm.plugin.appbrand.utils.k4(k0Var, k0Var.b(), null);
        try {
            try {
                t91.a aVar = t91.a.f416567a;
                aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, v1 exists, start migrate to v2");
                if (k0Var.A("MonitoredBluetoothDeviceInfoV2", "INSERT INTO MonitoredBluetoothDeviceInfoV2 SELECT * FROM MonitoredBluetoothDeviceInfo;")) {
                    aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, migrate to v2 success, delete v1");
                    if (com.tencent.mm.plugin.appbrand.utils.k1.a(k0Var, "MonitoredBluetoothDeviceInfo")) {
                        aVar.a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed, delete v1 success");
                    }
                }
            } catch (java.lang.Exception e17) {
                t91.a.f416567a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "migrateFromV1IfNeed fail");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", e17, "migrateFromV1IfNeed fail", new java.lang.Object[0]);
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
