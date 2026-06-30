package f21;

/* loaded from: classes8.dex */
public class c0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public c0() {
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        gm0.j1.n().f354821b.a(160, this);
        gm0.j1.n().f354821b.g(new f21.g0(5));
    }

    public final void a() {
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        gm0.j1.n().f354821b.q(160, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof com.p314xaae8f345.mm.p944x882e457a.q1) && ((com.p314xaae8f345.mm.p944x882e457a.q1) m1Var).u() == 5) {
            int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
            if (mo808xfb85f7b0 != 159) {
                if (mo808xfb85f7b0 == 160) {
                    if (i17 == 0 && i18 == 0) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        c17.w(81939, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    }
                    a();
                    return;
                }
                return;
            }
            if (i17 != 0 || i18 != 0) {
                a();
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c18.w(81939, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            f21.i0[] D0 = f21.r0.Bi().D0(5);
            if (D0 == null || D0.length == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LangPackageUpdater", "error no pkg found.");
                a();
                return;
            }
            f21.i0 i0Var = D0[0];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LangPackageUpdater", "dkregcode Pkg id:" + i0Var.f340446a + " version:" + i0Var.f340447b + " status:" + i0Var.f340451f + " type:" + i0Var.f340452g);
            if (5 != i0Var.f340451f) {
                a();
            } else {
                gm0.j1.n().f354821b.g(new f21.f0(i0Var.f340446a, 5));
            }
        }
    }
}
