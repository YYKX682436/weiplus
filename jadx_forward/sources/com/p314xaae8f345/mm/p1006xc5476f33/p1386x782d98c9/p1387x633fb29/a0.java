package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class a0 extends u32.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 f180376d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var) {
        this.f180376d = d0Var;
    }

    @Override // u32.j0
    public void Y6(long j17, int i17, int i18, int i19, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", a42.i.f(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMApplicationContext is null");
            return;
        }
        if (4 == i18) {
            u32.h1.a().a(j17);
            long[] b17 = v32.a.b("shut_down_device");
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 d0Var = this.f180376d;
            if (b17 != null && b17.length != 0) {
                for (long j19 : b17) {
                    if (j19 == j17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel in the shut down device list, deviceId = %d", java.lang.Long.valueOf(j19));
                        d0Var.b(j19);
                        if (!v32.a.d("shut_down_device", j19)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "removeFromSharedPreferences failed!!!");
                        }
                    }
                }
            }
            if (d0Var.f180402e.get(java.lang.Long.valueOf(j17)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device connect strategy(%d)", d0Var.f180402e.get(java.lang.Long.valueOf(j17)));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5334xb5332e2c c5334xb5332e2c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5334xb5332e2c();
                c5334xb5332e2c.e();
                if (!c5334xb5332e2c.f135649g.f87868a || (((java.lang.Integer) d0Var.f180402e.get(java.lang.Long.valueOf(j17))).intValue() & 1) != 1) {
                    d0Var.b(j17);
                }
            } else {
                d0Var.b(j17);
            }
        }
        if (i17 != i18) {
            v32.b b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().b1(j17 + "");
            if (b18 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.f66602x6bae49ad)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "get hdinfo by mac failed : %d", java.lang.Long.valueOf(j17));
                return;
            }
            u32.v d17 = u32.h1.a().d(j17);
            if (d17 != null) {
                d17.f505916e = i18;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "get connect state faild : %d", java.lang.Long.valueOf(j17));
            }
            if (i18 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "newState = EMMACCS_connected");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di();
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0.n(b18.f66602x6bae49ad, b18.f66613x4b6e88aa, i18, b18.f66606x5fdff396);
            }
        }
    }
}
