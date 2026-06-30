package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ze implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.he f294152d;

    public ze(com.p314xaae8f345.mm.ui.he heVar) {
        this.f294152d = heVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ORDER_CENTER_TAB_ME_REDDOT_LONG_SYNC;
        com.p314xaae8f345.mm.ui.he heVar = this.f294152d;
        if (obj == u3Var) {
            heVar.b();
            return;
        }
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        heVar.getClass();
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.we(heVar));
        if (o17 == 143618) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.pe(heVar));
        } else if (o17 == 204817 || o17 == 204820) {
            heVar.b();
        }
    }
}
