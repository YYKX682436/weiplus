package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class yz implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 f192748a;

    public yz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var) {
        this.f192748a = g00Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.b(this.f192748a, "onUserVisibleFocused_onPoiRequest_" + type);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f192748a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "onUserVisibleFocused route1 hasLocationPermission=" + z17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00.a(g00Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g00 g00Var = this.f192748a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g00Var.f188334f, "onUserVisibleFocused onFrozen type=" + type);
        g00Var.l(-3, type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sz.f190549d ? so2.g5.f491895d : so2.g5.f491896e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uz
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qz forbiddenReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forbiddenReason, "forbiddenReason");
        this.f192748a.l(-4, forbiddenReason.i());
    }
}
