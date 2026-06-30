package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class a0 extends u32.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f98843d;

    public a0(com.tencent.mm.plugin.exdevice.model.d0 d0Var) {
        this.f98843d = d0Var;
    }

    @Override // u32.j0
    public void Y6(long j17, int i17, int i18, int i19, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", a42.i.f(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (com.tencent.mm.sdk.platformtools.x2.f193071a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMApplicationContext is null");
            return;
        }
        if (4 == i18) {
            u32.h1.a().a(j17);
            long[] b17 = v32.a.b("shut_down_device");
            com.tencent.mm.plugin.exdevice.model.d0 d0Var = this.f98843d;
            if (b17 != null && b17.length != 0) {
                for (long j19 : b17) {
                    if (j19 == j17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel in the shut down device list, deviceId = %d", java.lang.Long.valueOf(j19));
                        d0Var.b(j19);
                        if (!v32.a.d("shut_down_device", j19)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "removeFromSharedPreferences failed!!!");
                        }
                    }
                }
            }
            if (d0Var.f98869e.get(java.lang.Long.valueOf(j17)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device connect strategy(%d)", d0Var.f98869e.get(java.lang.Long.valueOf(j17)));
                com.tencent.mm.autogen.events.ExDeviceChattingUIStateEvent exDeviceChattingUIStateEvent = new com.tencent.mm.autogen.events.ExDeviceChattingUIStateEvent();
                exDeviceChattingUIStateEvent.e();
                if (!exDeviceChattingUIStateEvent.f54116g.f6335a || (((java.lang.Integer) d0Var.f98869e.get(java.lang.Long.valueOf(j17))).intValue() & 1) != 1) {
                    d0Var.b(j17);
                }
            } else {
                d0Var.b(j17);
            }
        }
        if (i17 != i18) {
            v32.b b18 = com.tencent.mm.plugin.exdevice.model.l3.Ui().b1(j17 + "");
            if (b18 == null || com.tencent.mm.sdk.platformtools.t8.K0(b18.field_brandName)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectManager", "get hdinfo by mac failed : %d", java.lang.Long.valueOf(j17));
                return;
            }
            u32.v d17 = u32.h1.a().d(j17);
            if (d17 != null) {
                d17.f424383e = i18;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectManager", "get connect state faild : %d", java.lang.Long.valueOf(j17));
            }
            if (i18 == 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ExdeviceConnectManager", "newState = EMMACCS_connected");
            } else {
                com.tencent.mm.plugin.exdevice.model.l3.Di();
                com.tencent.mm.plugin.exdevice.model.o0.n(b18.field_brandName, b18.field_url, i18, b18.field_deviceID);
            }
        }
    }
}
