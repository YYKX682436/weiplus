package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class b00 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f187869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f187870b;

    public b00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var, boolean z17) {
        this.f187869a = g00Var;
        this.f187870b = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.b(this.f187869a, "requestLoadMore_onPoiRequest_" + type);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f187869a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "requestLoadMore hasLocationPermission=" + z17);
        g00Var.f188330b.i1(-3);
        g00Var.f188333e.mo55589x84fe90a(this.f187870b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187869a.f188334f, "requestLoadMore onFrozen type=" + type);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.g(this.f187869a, "requestLoadMore", -3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz.f190484d, type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190549d ? so2.g5.f491895d : so2.g5.f491896e, 0L, 16, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz forbiddenReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forbiddenReason, "forbiddenReason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.g(this.f187869a, "requestLoadMoreNoPermission", -4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rz.f190484d, forbiddenReason.i(), 0L, 16, null);
    }
}
