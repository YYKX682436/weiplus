package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class d0 {

    /* renamed from: g, reason: collision with root package name */
    public static int f180397g;

    /* renamed from: a, reason: collision with root package name */
    public u32.r f180398a;

    /* renamed from: b, reason: collision with root package name */
    public u32.j1 f180399b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f180400c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f180401d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f180402e;

    /* renamed from: f, reason: collision with root package name */
    public u32.g0 f180403f = null;

    public d0() {
        u32.h1.c().f180540b = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.t(this);
        if (this.f180399b == null) {
            this.f180399b = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a0(this);
        }
        this.f180400c = new java.util.HashMap();
        this.f180401d = new java.util.HashMap();
        this.f180402e = new java.util.HashMap();
    }

    public void a(java.lang.String str, long j17, int i17, boolean z17) {
        v32.a.d("shut_down_device", j17);
        u32.r rVar = this.f180398a;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Bind exdeviceService");
            u32.r rVar2 = new u32.r();
            this.f180398a = rVar2;
            rVar2.f505889d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.w(this, i17, str, j17, z17);
            rVar2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            return;
        }
        if (rVar == null || rVar.f505890e) {
            c(str, j17, i17, z17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "ExdeviceService setConnected");
        u32.r rVar3 = this.f180398a;
        rVar3.f505889d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.x(this, i17, str, j17, z17);
        rVar3.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public void b(long j17) {
        if (u32.h1.c().f180539a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now stop the devide channel : %d, result : %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(((u32.k1) u32.h1.c().f180539a).e(j17)));
        }
    }

    public void c(java.lang.String str, long j17, int i17, boolean z17) {
        boolean z18;
        boolean z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "doConnect");
        boolean z27 = false;
        if (z17) {
            synchronized (this) {
                int n17 = gm0.j1.n().f354821b.n();
                if (n17 != 4 && n17 != 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
                } else if (this.f180401d.containsKey(java.lang.Long.valueOf(j17))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is syncing data : %s, %d, Just leave!!!", str, java.lang.Long.valueOf(j17));
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.y(this, j17, str, i17), false);
                    long e17 = a42.i.e();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now sync time out is : %d", java.lang.Long.valueOf(e17));
                    b4Var.c(e17, e17);
                    this.f180401d.put(java.lang.Long.valueOf(j17), b4Var);
                    if (u32.h1.c().f180539a != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "start channel now : %s, %d", str, java.lang.Long.valueOf(j17));
                        z27 = ((u32.k1) u32.h1.c().f180539a).d(j17, i17, this.f180399b);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null");
                    }
                }
            }
        } else {
            if (gm0.j1.n().f354821b.n() != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
            } else {
                java.util.HashMap hashMap = this.f180400c;
                if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is connecting, reset timer : brand name = %s, deviceid = %d, bluetooth version = %d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) hashMap.get(java.lang.Long.valueOf(j17));
                    b4Var2.d();
                    b4Var2.c(30000L, 30000L);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "the device is not connecting, brand name = %s, deviceid = %d, bluetooth version = %d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z(this, j17, str, i17), false);
                    b4Var3.c(30000L, 30000L);
                    hashMap.put(java.lang.Long.valueOf(j17), b4Var3);
                }
                if (u32.h1.c().f180539a == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null, Just leave, brand name is %s, device id is %d, bluetooth version is %d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                } else {
                    u32.v d17 = u32.h1.a().d(j17);
                    if (d17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "Device unbond: %s", java.lang.Long.valueOf(j17));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, connectState = %d ", java.lang.Integer.valueOf(d17.f505916e));
                        int i18 = d17.f505916e;
                        if (i18 != 2) {
                            z18 = true;
                            if (i18 != 1) {
                                ((u32.k1) u32.h1.c().f180539a).d(j17, i17, this.f180399b);
                            }
                        } else {
                            z18 = true;
                        }
                        z19 = z18;
                        z27 = z19;
                    }
                }
            }
            z19 = false;
            z27 = z19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", java.lang.Boolean.valueOf(z27));
    }

    public void d(int i17, u32.g0 g0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "scanLogic, bluetooth version = %d", java.lang.Integer.valueOf(i17));
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
            return;
        }
        this.f180403f = g0Var;
        u32.r rVar = this.f180398a;
        if (rVar == null || !rVar.f505890e) {
            if (this.f180398a == null) {
                this.f180398a = new u32.r();
            }
            u32.r rVar2 = this.f180398a;
            rVar2.f505889d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c0(this, i17, i17);
            rVar2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
        if (u32.h1.c().f180539a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            return;
        }
        if (((u32.k1) u32.h1.c().f180539a).b(i17, this.f180403f)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
    }

    public synchronized void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "setConnectMode, mode = %d", java.lang.Integer.valueOf(i17));
        f180397g = i17;
    }

    public boolean f(boolean z17) {
        long[] jArr;
        if (u32.h1.c().f180539a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher is null!");
            return false;
        }
        u32.k1 k1Var = (u32.k1) u32.h1.c().f180539a;
        k1Var.getClass();
        try {
            jArr = k1Var.f505851a.N3();
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "getDeviceList failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
            jArr = null;
        }
        if (jArr == null || jArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "connectedDevices = null or connectedDevices.length = 0");
            return false;
        }
        for (long j17 : jArr) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "deviceId = %s", java.lang.Long.valueOf(j17));
            v32.b W0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().W0(j17);
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "Get device info failed, deviceId = %s", java.lang.Long.valueOf(j17));
            } else if (z17 && (1 & W0.f66603x2e78a306) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device is not close after exit chatting, deviceId = %s", java.lang.Long.valueOf(j17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel, deviceId = %s", java.lang.Long.valueOf(j17));
                ((u32.k1) u32.h1.c().f180539a).e(j17);
            }
        }
        return true;
    }
}
