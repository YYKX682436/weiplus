package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public class h3 extends com.tencent.matrix.lifecycle.g {
    public h3(com.tencent.mm.plugin.exdevice.model.l3 l3Var) {
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        try {
            if (gm0.j1.a()) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
                boolean z17 = n17 != null && n17.r2();
                boolean D0 = com.tencent.mm.plugin.exdevice.model.l3.fj().D0(gm0.j1.b().k());
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onEnterBackground haveWeSport:%s isNeedDeleteAllData:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(D0));
                if (z17 || !D0) {
                    return;
                }
                final s32.d fj6 = com.tencent.mm.plugin.exdevice.model.l3.fj();
                fj6.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankInfoStg", "deleteAllData() called");
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: s32.d$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankInfoStg", "run: ret:%s", java.lang.Boolean.valueOf(s32.d.this.f402464d.A("HardDeviceRankInfo", "delete from HardDeviceRankInfo")));
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.SubCoreExDevice", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SubCoreExDevice", "Exited deep background");
    }
}
