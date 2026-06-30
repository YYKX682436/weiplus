package dp3;

/* loaded from: classes9.dex */
public abstract class g {
    public static gp3.q a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        gp3.q qVar = new gp3.q(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.N)) {
            qVar.N = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575114kt5);
        } else {
            qVar.N = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575111kt2);
        }
        qVar.M = new dp3.e(c16774xbacd37e9, context);
        return qVar;
    }

    public static void b(int i17, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        if (i17 != 0) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.g(context, c16774xbacd37e9.D);
                return;
            } else {
                if (i17 != 2) {
                    return;
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, c16774xbacd37e9.N, false);
                return;
            }
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c16774xbacd37e9.C, true);
        if (n17 == null || !n17.r2()) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a0(context, c16774xbacd37e9.C);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.S(context, c16774xbacd37e9.C);
        }
    }
}
