package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.m1.class)
/* loaded from: classes9.dex */
public final class h9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.m1 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).getClass();
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262440c).clear();
    }

    @Override // yn.d
    public void Y(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, in5.w0 w0Var) {
        java.util.LinkedList linkedList;
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262439b || w0Var == null || (linkedList = w0Var.f374689i) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            in5.c cVar = ((in5.x0) it.next()).f374691a;
            rd5.d dVar = cVar instanceof rd5.d ? (rd5.d) cVar : null;
            qg0.g0 g0Var = (qg0.g0) i95.n0.c(qg0.g0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar != null ? dVar.f475787d.f526833b : null;
            ((pg0.p3) g0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262438a;
            if (f9Var != null) {
                if (i1Var.c(f9Var) || i1Var.b(f9Var)) {
                    ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.h1(f9Var), "WcPayMessageReporter-WxPluginMessage");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262438a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262439b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_pay_msg_report_config, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayPluginMessageReportor", "[isOpenSwitch] " + com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.i1.f262439b + ' ');
    }
}
