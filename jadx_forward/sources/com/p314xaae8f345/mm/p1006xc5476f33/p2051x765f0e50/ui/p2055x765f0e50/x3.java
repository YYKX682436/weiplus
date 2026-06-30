package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class x3 {
    public x3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(boolean z17) {
        java.lang.Object l17 = gm0.j1.u().c().l(147457, null);
        java.lang.Long l18 = l17 instanceof java.lang.Long ? (java.lang.Long) l17 : null;
        long longValue = l18 != null ? l18.longValue() : 0L;
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Ni("labs_browse", z17);
        long j17 = z17 ? longValue & (-67108865) : longValue | 67108864;
        if (!z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("com.tencent.xin.newLife.internalKV." + new kk.v(gm0.j1.b().h()), 2, null).A("newlife_jump_top_story_show_time", 0);
        }
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j17));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 56;
        p53Var.f464295e = z17 ? 1 : 0;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch  " + p53Var.f464294d + ' ' + p53Var.f464295e);
    }
}
