package c01;

/* loaded from: classes9.dex */
public abstract class i0 {
    public static void a(java.lang.String str, boolean z17) {
        iz5.a.g(null, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            return;
        }
        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() | 2048);
        c01.e2.g0(n17, true);
        if (z17) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null && n17.k2()) {
                if (r01.z.o(str) || r01.z.m(str)) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("officialaccounts") == null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4("officialaccounts");
                        l4Var.f2();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(str);
                    l4Var2.n1(java.lang.System.currentTimeMillis());
                    l4Var2.T1("officialaccounts");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var2);
                } else if (r01.z.h(str)) {
                    qk.o b17 = r01.z.b(str);
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(b17.f66739xdfb76cc2) == null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(b17.f66739xdfb76cc2);
                        l4Var3.f2();
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var3);
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var4 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(str);
                    l4Var4.n1(java.lang.System.currentTimeMillis());
                    l4Var4.T1(b17.y0());
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var4);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizConversationLogic", "setPlacedTop username = " + str);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(str);
        }
    }
}
