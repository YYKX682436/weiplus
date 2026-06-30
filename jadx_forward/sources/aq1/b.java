package aq1;

/* loaded from: classes12.dex */
public class b implements en1.j {
    @Override // en1.j
    /* renamed from: onAuthResponse */
    public void mo8828x48bdb988(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        r45.sr6 sr6Var = vgVar.f424548a;
        if ((sr6Var.f467484d & 2) != 0) {
            r45.i1 i1Var = sr6Var.f467486f;
            if (!z17) {
                c01.d9.b().b(i1Var.f458178n);
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            c01.b9.f118602c.b(com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, false, true));
            if (i1Var.f458173f != 0) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) c01.d9.b().y()).y0(i1Var.f458173f + "@qqim", 3);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i1Var.f458173f, 3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BigBallAuthHandle", "summerauth updateProfile acctsect not set!");
        }
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1 c5591x5fe952d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1();
            c5591x5fe952d1.f135915g.f88564a = false;
            c5591x5fe952d1.e();
        } else {
            gm0.j1.e().j(new aq1.a(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(2, 8);
    }

    @Override // en1.j
    /* renamed from: onRegResponse */
    public void mo8829x6279e596(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String r17 = c01.z1.r();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        c01.b9.f118602c.b(com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, false, true));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i17, 3);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) c01.d9.b().y()).y0(ciVar.f424447a.f473927h, 2);
        if (i17 != 0) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) c01.d9.b().y()).y0(i17 + "@qqim", 3);
        }
    }
}
