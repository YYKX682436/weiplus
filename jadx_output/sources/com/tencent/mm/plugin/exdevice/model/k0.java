package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class k0 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o0 f98958d;

    public k0(com.tencent.mm.plugin.exdevice.model.o0 o0Var) {
        this.f98958d = o0Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.exdevice.model.o0 o0Var = this.f98958d;
        o0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "receive SyncExdeviceDataEvent");
        int n17 = gm0.j1.n().f273288b.n();
        if (n17 != 4 && n17 != 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "net work state is not connected, now state is %d", java.lang.Integer.valueOf(n17));
            return;
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("DeviceAutoSyncClose");
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "handleSyncExdeviceDataEvent, auto sync has close : %s", d17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || !d17.equalsIgnoreCase("1")) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "auto sync has closed, ignore this sync request");
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "not allowed to sync exdevice data");
            return;
        }
        com.tencent.mm.plugin.exdevice.model.a2 a2Var = com.tencent.mm.plugin.exdevice.model.a2.INSTANCE;
        if (a2Var.e(false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "now need to get bound iot harddevices");
            a2Var.h();
        }
        if (!lq1.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "now sdk version not support ble device : %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return;
        }
        if (!lq1.a.e()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "Bluetooth is not open, Just leave");
            return;
        }
        com.tencent.mm.plugin.exdevice.model.l3.Bi().getClass();
        if (com.tencent.mm.plugin.exdevice.model.d0.f98864g == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "it is in brand");
        } else if (a2Var.d(false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "now need to get bound harddevices");
            a2Var.f(null, new com.tencent.mm.plugin.exdevice.model.g0(o0Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "now do not need to get bound device, do sync directly");
            o0Var.b();
        }
    }
}
