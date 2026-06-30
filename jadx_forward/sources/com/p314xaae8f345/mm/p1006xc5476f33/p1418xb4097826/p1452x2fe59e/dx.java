package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class dx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f188123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f188124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f188127h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(db5.g4 g4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(1);
        this.f188123d = g4Var;
        this.f188124e = abstractC14490x69736cb5;
        this.f188125f = i17;
        this.f188126g = pzVar;
        this.f188127h = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ((java.util.ArrayList) this.f188123d.f309877d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f188124e;
        if (abstractC14490x69736cb5 instanceof so2.h1) {
            int i17 = this.f188125f;
            if (i17 == 1) {
                abstractC14490x69736cb5.getFeedObject().m59422xb121f1ef(7);
            } else if (i17 == 3) {
                abstractC14490x69736cb5.getFeedObject().m59422xb121f1ef(1);
            }
        }
        boolean z17 = !abstractC14490x69736cb5.getFeedObject().m59203x7541886a(103);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188126g;
        if (z17) {
            this.f188123d.j(103, (java.lang.CharSequence) it.f384375e, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f409598n;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = pzVar.f190288g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((b92.d1) zbVar).sj(u1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        } else {
            this.f188123d.j(103, pzVar.f190288g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
        }
        boolean m59203x7541886a = abstractC14490x69736cb5.getFeedObject().m59203x7541886a(102);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f188127h;
        if (!m59203x7541886a) {
            o25.y1 y1Var = pzVar.f190299r;
            db5.g4 zeroLineMenu = k0Var.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(zeroLineMenu, "zeroLineMenu");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).Ri(k0Var, zeroLineMenu);
        }
        hc2.f1.C(k0Var, pzVar.f190288g);
        return jz5.f0.f384359a;
    }
}
