package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d f192881i;

    /* renamed from: m, reason: collision with root package name */
    public final int f192882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 loader, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d galleryConfig, int i17) {
        super(context, 0, 0, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryConfig, "galleryConfig");
        this.f192881i = galleryConfig;
        this.f192882m = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public in5.s c() {
        return this.f192881i.a(this.f192882m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
        if (a1Var != null) {
            a1Var.r(this.f188689e.m56388xcaeb60d0());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(this.f188689e, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(this.f188689e, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.m(callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f188690f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf o17 = a1Var != null ? a1Var.o() : null;
        if (o17 == null) {
            return;
        }
        o17.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.z(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void v() {
        this.f188689e.mo56155xd210094c();
    }
}
