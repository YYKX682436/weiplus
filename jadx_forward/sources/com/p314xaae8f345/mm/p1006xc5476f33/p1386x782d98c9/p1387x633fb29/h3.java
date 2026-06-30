package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public class h3 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {
    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3 l3Var) {
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        try {
            if (gm0.j1.a()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
                boolean z17 = n17 != null && n17.r2();
                boolean D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj().D0(gm0.j1.b().k());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onEnterBackground haveWeSport:%s isNeedDeleteAllData:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(D0));
                if (z17 || !D0) {
                    return;
                }
                final s32.d fj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj();
                fj6.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankInfoStg", "deleteAllData() called");
                ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: s32.d$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankInfoStg", "run: ret:%s", java.lang.Boolean.valueOf(s32.d.this.f483997d.A("HardDeviceRankInfo", "delete from HardDeviceRankInfo")));
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.SubCoreExDevice", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SubCoreExDevice", "Exited deep background");
    }
}
