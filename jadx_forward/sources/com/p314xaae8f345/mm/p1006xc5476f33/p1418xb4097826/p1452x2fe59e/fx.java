package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class fx implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f188318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f188320g;

    public fx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f188317d = pzVar;
        this.f188318e = abstractC14490x69736cb5;
        this.f188319f = i17;
        this.f188320g = k0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        ec2.d e27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188317d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pzVar.f190288g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f188318e;
        int i17 = this.f188319f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f188320g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4 N = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.N(y4Var, abstractActivityC21394xb3d2c0cf, abstractC14490x69736cb5, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dx(g4Var, abstractC14490x69736cb5, i17, pzVar, k0Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ex(g4Var, k0Var, pzVar), 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f188318e;
        boolean z17 = abstractC14490x69736cb52 instanceof so2.h1;
        if (z17) {
            int i18 = this.f188319f;
            if (i18 == 1) {
                abstractC14490x69736cb52.getFeedObject().m59422xb121f1ef(7);
            } else if (i18 == 3) {
                abstractC14490x69736cb52.getFeedObject().m59422xb121f1ef(1);
            }
        }
        if (!N.f183792i) {
            if (z17 && ((so2.h1) abstractC14490x69736cb52).f491914h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "showLongClickForwardGuide");
                int color = pzVar.f190288g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
                db5.h4 h4Var = new db5.h4(g4Var.f309879f, 102, 0);
                h4Var.f309901i = N.f183788e;
                h4Var.d(com.p314xaae8f345.mm.R.raw.f79181x28396080, color);
                h4Var.f309908s = N.f183784a;
                h4Var.F = java.lang.Boolean.TRUE;
                ((java.util.ArrayList) g4Var.f309877d).add(h4Var);
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = pzVar.f190288g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
                y4Var.B(abstractActivityC21394xb3d2c0cf2, g4Var, abstractC14490x69736cb52, N);
            }
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f409595m;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = pzVar.f190288g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((b92.d1) zbVar).sj(u1Var, abstractC14490x69736cb52, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = pzVar.f190288g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        y4Var.C(abstractActivityC21394xb3d2c0cf3, g4Var, abstractC14490x69736cb52, N);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = pzVar.f190288g;
        y4Var.l(context, g4Var, abstractC14490x69736cb52);
        y4Var.E(g4Var, N);
        y4Var.i(context, g4Var, abstractC14490x69736cb52, N);
        y4Var.o(context, g4Var, abstractC14490x69736cb52);
        y4Var.A(context, g4Var, abstractC14490x69736cb52);
        y4Var.D(context, g4Var, abstractC14490x69736cb52);
        y4Var.w(context, g4Var, abstractC14490x69736cb52);
        y4Var.v(context, abstractC14490x69736cb52, g4Var);
        y4Var.F(context, abstractC14490x69736cb52, g4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bj(abstractC14490x69736cb52.mo2128x1ed62e84(), nyVar.f216913n);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 != null && (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) != null) {
            e27.a(new ec2.a(16, abstractC14490x69736cb52.mo2128x1ed62e84(), abstractC14490x69736cb52.w()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.a(g4Var);
    }
}
