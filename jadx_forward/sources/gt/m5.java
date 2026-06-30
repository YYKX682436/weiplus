package gt;

/* loaded from: classes9.dex */
public class m5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5879xb1f5f7c c5879xb1f5f7c = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5879xb1f5f7c) abstractC20979x809547d1;
        if (gm0.j1.a() && (f9Var = c5879xb1f5f7c.f136187g.f89742a) != null) {
            java.lang.String Q0 = f9Var.Q0();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(Q0)) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().z0(Q0 + "_unreadCount", "0"), 0) + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().P2(Q0 + "_unreadCount", P + "");
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(Q0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.a(k91.k4.e(Q0), p17 != null ? p17.d1() : 0);
            }
        }
        return false;
    }
}
