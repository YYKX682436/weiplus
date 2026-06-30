package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class xo implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zo f192621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192622e;

    public xo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zo zoVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f192621d = zoVar;
        this.f192622e = abstractC14490x69736cb5;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zo zoVar = this.f192621d;
        zoVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f192622e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        boolean N0 = feed.N0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = zoVar.f187954d;
        if (N0 && !zl2.q4.f555466a.C(feed)) {
            g4Var.b(108, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0, com.p314xaae8f345.mm.R.raw.f80075x444ae503);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "context");
            if (feed.getFeedObject().m59303x7d1523() || !y4Var.c0(activity)) {
                g4Var.g(107, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwf), com.p314xaae8f345.mm.R.raw.f80064x214d7a07);
            } else {
                g4Var.g(106, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572896cv4), com.p314xaae8f345.mm.R.raw.f80065x5d7d9c0);
            }
            if (!zoVar.f192817y.P && (feed.h() == 4 || feed.h() == 2)) {
                g4Var.g(112, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwi), com.p314xaae8f345.mm.R.raw.f79193x1302dbaa);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        y4Var.k(activity, g4Var, feed);
        if (!feed.N0()) {
            zl2.q4 q4Var = zl2.q4.f555466a;
            if (q4Var.C(feed)) {
                q4Var.a(g4Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1")), V6.m75945x2fec8307(1), java.lang.Integer.valueOf(V6.m75939xb282bd08(5)).toString(), null, null, false, 112, null);
            }
            int i17 = zoVar.f187960m;
            if (i17 != 3 && i17 != 1 && i17 != 35) {
                y4Var.h(activity, g4Var, feed);
            }
            g4Var.g(101, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gys), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
        }
        y4Var.m(activity, g4Var, feed);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.b(g4Var);
    }
}
