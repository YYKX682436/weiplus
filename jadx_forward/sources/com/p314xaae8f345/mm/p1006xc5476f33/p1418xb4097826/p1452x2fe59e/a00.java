package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class a00 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f187706a;

    public a00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var) {
        this.f187706a = g00Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187706a.f188334f, "request init onPoiRequest type=" + type);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f187706a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "request init route1,hasLocationPermission=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(g00Var.f188333e, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f187706a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "request init onPoiPageRequest type=" + type);
        g00Var.l(-3, type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190549d ? so2.g5.f491895d : so2.g5.f491896e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz forbiddenReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forbiddenReason, "forbiddenReason");
        this.f187706a.l(-4, forbiddenReason.i());
    }
}
