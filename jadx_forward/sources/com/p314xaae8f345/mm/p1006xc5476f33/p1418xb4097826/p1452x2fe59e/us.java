package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class us extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f190343h = c1163xf1deaba4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void b(fc2.t ev6) {
        in5.s0 s0Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6.f342529o != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SingleFeedReport", "onCenterFeedChange: ".concat(pm0.v.u(ev6.f342525k)));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190343h;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f190336a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            int i17 = nyVar != null ? nyVar.f216913n : 0;
            if (i17 == 6 || i17 == 23 || c22848x6ddd90cf == null || (s0Var = (in5.s0) in5.n0.Y(c22848x6ddd90cf, ev6.f342525k, false, 2, null)) == null || (obj = s0Var.f374658i) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 != null) {
                r45.im2 m76783x771fad0f = abstractC14490x69736cb5.getFeedObject().m59240x7c94657b().m76783x771fad0f();
                if ((m76783x771fad0f != null ? (r45.lu2) m76783x771fad0f.m75936x14adae67(0) : null) != null) {
                    r45.lu2 lu2Var = (r45.lu2) m76783x771fad0f.m75936x14adae67(0);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lu2Var != null ? lu2Var.m75945x2fec8307(0) : null)) {
                        return;
                    }
                    cl0.g gVar = new cl0.g();
                    gVar.h("feedid", pm0.v.u(ev6.f342525k));
                    r45.lu2 lu2Var2 = (r45.lu2) m76783x771fad0f.m75936x14adae67(0);
                    gVar.h("query_word", lu2Var2 != null ? lu2Var2.m75945x2fec8307(0) : null);
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
                    java.lang.String gVar2 = gVar.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                    java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 0, "hotsearch_timelinespot", t17, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void c() {
        this.f190343h = null;
    }
}
