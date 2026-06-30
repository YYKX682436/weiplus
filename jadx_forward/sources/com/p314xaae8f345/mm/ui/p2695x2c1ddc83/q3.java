package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p3 f289532d;

    public q3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p3 p3Var) {
        this.f289532d = p3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p3 p3Var = this.f289532d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLongClickListener", "dismiss conv confirm:%s", p3Var.f289491d.f289573g);
        p3Var.f289491d.d(14);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.w4(p3Var.f289491d.f289573g) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.W3(p3Var.f289491d.f289573g)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).n(p3Var.f289491d.f289573g);
        } else {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str = p3Var.f289491d.f289573g;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str)) {
                rv.u2 u2Var2 = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String str2 = p3Var.f289491d.f289573g;
                ((qv.o) u2Var2).getClass();
                if (!r01.z.g(str2)) {
                    c01.h2.j(p3Var.f289491d.f289573g);
                }
            }
            r01.q3.aj().z0(p3Var.f289491d.f289573g);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(p3Var.f289491d.f289573g);
        }
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String str3 = p3Var.f289491d.f289573g;
        ((ce0.e) jVar).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(str3, 14);
    }
}
