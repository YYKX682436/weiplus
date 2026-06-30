package hr3;

/* loaded from: classes9.dex */
public class u8 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f365583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.w8 f365584e;

    public u8(hr3.w8 w8Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f365584e = w8Var;
        this.f365583d = u3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qk.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "onSceneEnd, errType: %d, errCode: %d, errMsg: %s, scene: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) {
            gm0.j1.d().q(30, this);
            hr3.w8 w8Var = this.f365584e;
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).J();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "onSceneEnd, respUsername: " + J2);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_25d9ac85a4bc", true);
                w8Var.getClass();
                if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetWxGame", "updateContact, contact: %s, respUsername: %s", n17, J2);
                } else {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).getClass();
                        oVar = r01.z.b(d17);
                        if (oVar == null) {
                            oVar.f66748xdec927b = J2;
                        }
                        ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).getClass();
                        r01.q3.cj().d(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetWxGame", "updateContact, insert contact fail");
                    } else {
                        c01.e2.m0(n17);
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).getClass();
                            r01.q3.cj().mo880xb970c2b9(oVar);
                        } else {
                            qk.q6 q6Var = (qk.q6) i95.n0.c(qk.q6.class);
                            java.lang.String d18 = n18.d1();
                            ((c01.p0) q6Var).getClass();
                            qk.o b17 = r01.z.b(d18);
                            if (b17 == null || b17.U0()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "updateBizInfoInNeed, shouldUpdate");
                                c01.n8.a().c(n18.d1(), 15);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetWxGame", "updateBizInfoInNeed, last check time:" + n18.f318109p1);
                                c01.n8.a().c(n18.d1(), 15);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                qk.q6 q6Var2 = (qk.q6) i95.n0.c(qk.q6.class);
                java.lang.String d19 = n17.d1();
                ((c01.p0) q6Var2).getClass();
                qk.o b18 = r01.z.b(d19);
                if (b18 != null) {
                    ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).wi(b18);
                }
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetWxGame", "onSceneEnd, fail");
                if (4 == i17 && -24 == i18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, 1).show();
                }
            }
            this.f365583d.dismiss();
            w8Var.b();
        }
    }
}
