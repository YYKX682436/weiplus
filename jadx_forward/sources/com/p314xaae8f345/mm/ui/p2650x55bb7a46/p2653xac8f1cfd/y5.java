package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 f281815d;

    public y5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var) {
        this.f281815d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity g17;
        int i17;
        android.app.Activity g18;
        int i18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        ot0.q v17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var = this.f281815d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = c6Var.f280406d;
        b5Var.f280234o = "";
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> p07 = b5Var.p0();
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.u(p07)) {
            db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.car), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z5(c6Var));
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        b5Var.f280230h.getClass();
        java.util.LinkedList linkedList = (java.util.LinkedList) p07;
        int size = linkedList.size();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (size == 1 && (f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList.get(0)) != null && (f9Var.k2() || f9Var.t2())) {
            if (f9Var.n2() && (v17 = ot0.q.v(f9Var.j())) != null && ez.v0.f339310a.k(java.lang.Integer.valueOf(v17.f430199i))) {
                db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cez), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a6(c6Var));
                return;
            }
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.v(f9Var, b5Var.f280231i, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) b5Var.f280113d.f542241c.a(sb5.f.class))).f280286r));
            c17.i("preChatName", b5Var.f280230h.d1());
            c17.i("preMsgIndex", 0);
            c17.i("sendAppMsgScene", 1);
            ((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).wi("adExtStr", c17, f9Var);
            c4Var.f87855h = a17;
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e2.j(b5Var.f280113d.g(), c5303xc75d2f73, b5Var.f280230h.d1(), p07, false, true, o72.c2.a())) {
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : p07) {
                if (f9Var2.k2()) {
                    v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                    ot0.u.a(f9Var2);
                    ((u90.a) vVar).getClass();
                    com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                } else {
                    ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                    com.p314xaae8f345.mm.p959x883644fd.e.f153038a.getClass();
                }
            }
            c6Var.b(c5303xc75d2f73);
            java.util.Iterator it = b5Var.p0().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next(), 0);
            }
            return;
        }
        if (((java.util.LinkedList) b5Var.p0()).size() <= 1) {
            if (c4Var.f87859l == com.p314xaae8f345.mm.R.C30867xcad56011.cds) {
                db5.e1.s(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cds, java.lang.Integer.valueOf((int) ((((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Bj() / 1024) / 1024))), "");
                return;
            } else {
                db5.e1.i(b5Var.f280113d.g(), c4Var.f87859l, 0);
                return;
            }
        }
        android.app.Activity g19 = b5Var.f280113d.g();
        if (c4Var.f87859l >= 0) {
            g17 = b5Var.f280113d.g();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.caq;
        } else {
            g17 = b5Var.f280113d.g();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.cap;
        }
        java.lang.String string = g17.getString(i17);
        if (c4Var.f87859l >= 0) {
            g18 = b5Var.f280113d.g();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1;
        } else {
            g18 = b5Var.f280113d.g();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
        }
        db5.e1.A(g19, string, "", g18.getString(i18), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b6(c6Var, p07, c5303xc75d2f73), null);
    }
}
