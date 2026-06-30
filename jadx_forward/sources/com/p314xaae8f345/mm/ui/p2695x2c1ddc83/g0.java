package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class g0 implements vg3.p4 {
    @Override // vg3.p4
    public void C0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 l0Var, boolean[] zArr) {
    }

    @Override // vg3.p4
    public void S0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        if (l0Var == null || l4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l4Var.h1())) {
            return;
        }
        java.lang.String str = l0Var.f535944b;
        if (!"insert".equals(str) && !"update".equals(str)) {
            "delete".equals(str);
            return;
        }
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String h17 = l4Var.h1();
        ((py.a) iVar).getClass();
        if (c01.v1.y(h17)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().getClass();
            ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).Zi(l4Var, true, !"conversationboxservice".equals(l4Var.W0()));
        }
    }

    @Override // vg3.p4
    public void W(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        if (z17) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String h17 = l4Var.h1();
            ((py.a) iVar).getClass();
            if (c01.v1.y(h17)) {
                l4Var.T1("conversationboxservice");
            }
        }
    }
}
