package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 f187316d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var) {
        this.f187316d = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var = this.f187316d;
        w3Var.getClass();
        r45.qw0 qw0Var = new r45.qw0();
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (v17.length() > 0) {
            qw0Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = w3Var.f187491d.L0("FinderEntrance");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkDoSync] hasEntranceRedDot=");
        sb6.append(L0 != null);
        sb6.append(" checkInfo=");
        sb6.append(w3Var.b(qw0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExpiredHandler", sb6.toString());
        if (L0 == null || qw0Var.m75939xb282bd08(0) != 1) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_RED_DOT_EXPIRED_COUNT_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_RED_DOT_EXPIRED_LAST_TIME_LONG_SYNC;
        long t17 = c18.t(u3Var2, 0L);
        if (t17 <= 0) {
            t17 = L0.f65879x2261f6f2;
            if (t17 <= 0) {
                t17 = c01.id.c();
            }
        }
        long c19 = c01.id.c() - t17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExpiredHandler", "[checkDoSync] diffTime=" + c19 + "ms checkCount=" + r17 + ", checkInfo=" + w3Var.b(qw0Var));
        if (r17 >= qw0Var.m75939xb282bd08(2) || c19 < qw0Var.m75939xb282bd08(1) * 1000) {
            return;
        }
        w3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExpiredHandler", "innerCheckDoSync...");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.e(826259965, 8);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(c01.id.c()));
    }
}
