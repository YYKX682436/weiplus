package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class b4 {
    public b4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(r45.qt2 qt2Var, java.util.List extStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport " + extStats.size());
        if (!bq.t.f105056s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, 18054, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, 18054, extStats, null);
    }

    public final void b(r45.qt2 qt2Var, r45.jn0 extStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSingleFeedFlowReporter", "sendExtStatsReport ".concat(pm0.v.u(extStats.m75942xfb822ef2(0))));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendExtStatsReport jumpInfoList=[");
        java.util.LinkedList m75941xfb821914 = extStats.m75941xfb821914(9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getJumpinfo_report_list(...)");
        sb6.append(kz5.n0.g0(m75941xfb821914, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a4.f206480d, 31, null));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSingleFeedFlowReporter", sb6.toString());
        if (!bq.t.f105056s.a()) {
            gm0.j1.d().g(new db2.g5(qt2Var, 18054, extStats, (java.lang.String) null));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.j1.f((cq.k) c17, qt2Var, 18054, kz5.c0.d(extStats), null);
    }
}
