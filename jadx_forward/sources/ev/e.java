package ev;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        w21.w0 j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5936xb513ba50) abstractC20979x809547d1).f136240g.f89851a;
        if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).cj() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(f9Var.Q0())) {
            cg0.d dVar = new cg0.d(f9Var.Q0(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var));
            dVar.f122589i = 0;
            p15.e eVar = new p15.e();
            eVar.m126728xdc93280d(f9Var.G);
            dVar.f122583c = eVar;
            z15.b bVar = new z15.b();
            if (f9Var.U1() != null) {
                bVar.m126728xdc93280d(f9Var.S1());
            }
            dVar.f122585e = bVar;
            dVar.f122584d = g45.b.f350379a.b(f9Var);
            dVar.f122586f = true;
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).getClass();
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).fj(new jg0.x(dVar));
        } else {
            int m124847x74d37ac6 = (int) f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            java.util.HashMap hashMap = w21.x0.f524044a;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(Q0, m124847x74d37ac6);
            if (Li.m124847x74d37ac6() != 0) {
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(Li);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(Li)) && (j17 = w21.x0.j(((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(Li))) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f524018b)) {
                    j17.f524025i = 3;
                    j17.f524022f = 0;
                    j17.f524026j = java.lang.System.currentTimeMillis() / 1000;
                    j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
                    j17.f524017a = 8648;
                    w21.x0.w(j17);
                    if (j17.f524029m == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f524019c)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLogic", " failed msg id:" + j17.f524029m + " user:" + j17.f524019c);
                    } else {
                        Li.r1(1);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
                        w21.p0.Bi().e();
                    }
                }
            }
        }
        return false;
    }
}
