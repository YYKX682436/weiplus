package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class j3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3 f280783d;

    public j3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3 h3Var) {
        this.f280783d = h3Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBypComponent", "onNotifyChange " + str);
        if (!w0Var.f398506a.equals("FinderContact")) {
            java.lang.String str2 = w0Var.f398506a;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            if (!str2.equals("FinderMsgContactStorage")) {
                return;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3 h3Var = this.f280783d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(h3Var.f280113d.x(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            n17.M1(h3Var.f280113d.u().P0());
        }
        h3Var.f280113d.S(n17, null);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) h3Var.f280113d.f542241c.a(sb5.z0.class))).C();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) h3Var.f280113d.f542241c.a(sb5.z0.class))).J0(true);
        h3Var.f280113d.J();
        h3Var.C();
        h3Var.n0();
    }
}
