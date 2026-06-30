package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class np extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f190123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f190125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f190126g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(db5.g4 g4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(1);
        this.f190123d = g4Var;
        this.f190124e = abstractC14490x69736cb5;
        this.f190125f = krVar;
        this.f190126g = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ((java.util.ArrayList) this.f190123d.f309877d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f190124e;
        boolean z17 = !abstractC14490x69736cb5.getFeedObject().m59203x7541886a(103);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f190125f;
        if (z17) {
            this.f190123d.j(103, (java.lang.CharSequence) it.f384375e, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
        } else {
            this.f190123d.j(103, krVar.f188763d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
        }
        boolean m59203x7541886a = abstractC14490x69736cb5.getFeedObject().m59203x7541886a(102);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f190126g;
        if (!m59203x7541886a) {
            o25.y1 y1Var = krVar.D;
            db5.g4 zeroLineMenu = k0Var.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(zeroLineMenu, "zeroLineMenu");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).Ri(k0Var, zeroLineMenu);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr.i(krVar, k0Var);
        return jz5.f0.f384359a;
    }
}
