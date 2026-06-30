package dt;

/* loaded from: classes9.dex */
public class s4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public s4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5933x3dfbb514) abstractC20979x809547d1).f136237g.f89565a;
        if (f9Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "resend msg, type:%d", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
            if (f9Var.g3()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.f(f9Var);
            } else if (f9Var.J2()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.e(f9Var);
            } else if (f9Var.C2()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.c(f9Var);
            } else if (f9Var.b3()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.g(f9Var);
            } else if (f9Var.L2()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.d(f9Var);
            } else if (f9Var.m2()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.a(f9Var);
            } else if (f9Var.k2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendAppMsg, msgId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                java.lang.String j17 = f9Var.j();
                int A0 = f9Var.A0();
                java.lang.String Q0 = f9Var.Q0();
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (c01.v1.x(Q0, false) && j17 != null && A0 == 0) {
                    j17 = c01.w9.u(j17);
                }
                ot0.q v17 = ot0.q.v(j17);
                if ((v17 == null || 19 != v17.f430199i) && (v17 == null || 24 != v17.f430199i)) {
                    long o17 = c01.w9.o(f9Var.Q0());
                    if (o17 == f9Var.mo78012x3fdd41df()) {
                        o17++;
                    }
                    f9Var.e1(o17);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                    if (v17 == null || !ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
                        android.util.Pair z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
                        if (z17 == null || z17.second != null) {
                            c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
                        }
                    } else {
                        dk5.w.f316499a.b(f9Var, "file_resend_from_event");
                    }
                } else {
                    dk5.m2.f316264a.a(f9Var.Q0(), f9Var, true);
                }
            } else if (f9Var.E2()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.b(f9Var);
            } else if (f9Var.m78014x7b98c171() || f9Var.Y2()) {
                long o18 = c01.w9.o(f9Var.Q0());
                if (o18 == f9Var.mo78012x3fdd41df()) {
                    o18++;
                }
                f9Var.e1(o18);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
                if (g17 != null) {
                    g17.n(f9Var.Q0());
                    g17.f496545j = f9Var.mo78012x3fdd41df();
                    g17.U = 128;
                    ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                    t21.o2.Ui().C(g17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendMsgLogic", "resendVideoMsg, msgId:%d, msgtime: %d, infotime:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()), java.lang.Long.valueOf(g17.f496545j));
                }
                if (c01.d9.b().E()) {
                    t21.d3.C(f9Var.z0());
                } else {
                    db5.t7.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
            } else {
                f9Var.r1(5);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "resendMsg, unknown msg type");
            }
        }
        return false;
    }
}
