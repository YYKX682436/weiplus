package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class bm implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f187929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em f187930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f187931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f187932g;

    public bm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, in5.s0 s0Var) {
        this.f187929d = abstractC14490x69736cb5;
        this.f187930e = emVar;
        this.f187931f = k0Var;
        this.f187932g = s0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f187929d;
        boolean i17 = hc2.b0.i(abstractC14490x69736cb5);
        in5.s0 s0Var = this.f187932g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f187931f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar2 = this.f187930e;
        if (i17 && emVar2.d0()) {
            g4Var.b(108, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0, com.p314xaae8f345.mm.R.raw.f80075x444ae503);
            boolean z17 = false;
            emVar = emVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.u(y4Var, g4Var, emVar2.f187954d, abstractC14490x69736cb5.getFeedObject().getMediaType(), 206, 205, abstractC14490x69736cb5.getFeedObject().m59278x9c961f1e() == 1, false, 64, null);
            y4Var.g(emVar.f187954d, g4Var, abstractC14490x69736cb5);
            y4Var.a(emVar.f187954d, g4Var, abstractC14490x69736cb5);
            y4Var.d(emVar.f187954d, abstractC14490x69736cb5, g4Var);
            so2.u1 u1Var = abstractC14490x69736cb5 instanceof so2.u1 ? (so2.u1) abstractC14490x69736cb5 : null;
            if (u1Var != null && u1Var.i2()) {
                z17 = true;
            }
            if (z17) {
                if (hc2.o0.g(abstractC14490x69736cb5.getFeedObject().getFeedObject()) && y4Var.c0(emVar.f187954d)) {
                    g4Var.g(304, emVar.f187954d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyt), com.p314xaae8f345.mm.R.raw.f78720xdc0b46be);
                } else {
                    g4Var.g(303, emVar.f187954d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyx), com.p314xaae8f345.mm.R.raw.f78725x84d17fa6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em.Z(emVar, abstractC14490x69736cb5, g4Var, k0Var);
            y4Var.c(emVar.f187954d, g4Var, abstractC14490x69736cb5, s0Var);
        } else {
            emVar = emVar2;
            if (!hc2.b0.i(abstractC14490x69736cb5)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em.Z(emVar, abstractC14490x69736cb5, g4Var, k0Var);
                y4Var.c(emVar.f187954d, g4Var, abstractC14490x69736cb5, s0Var);
                if (!emVar.d0()) {
                    y4Var.z(emVar.f187954d, abstractC14490x69736cb5, g4Var);
                }
                g4Var.b(101, com.p314xaae8f345.mm.R.C30867xcad56011.gys, com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
                y4Var.q(emVar.f187954d, g4Var, abstractC14490x69736cb5);
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = emVar.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        y4Var.p(abstractActivityC21394xb3d2c0cf, abstractC14490x69736cb5, g4Var);
        y4Var.e(emVar.f187954d, abstractC14490x69736cb5, g4Var);
        y4Var.j(emVar.f187954d, abstractC14490x69736cb5, g4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.b(g4Var);
    }
}
