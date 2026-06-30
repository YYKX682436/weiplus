package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494;

/* loaded from: classes3.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter {

    /* renamed from: h, reason: collision with root package name */
    public boolean f202381h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f202382i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f202383m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 loader) {
        super(loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f202381h = true;
        gk2.e eVar = gk2.e.f354004n;
        this.f202382i = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T;
        gk2.e eVar2 = gk2.e.f354004n;
        this.f202383m = eVar2 != null && ((mm2.n0) eVar2.a(mm2.n0.class)).f410806r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c() {
        return new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter$generateAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type == so2.c3.class.hashCode() ? new on2.j2() : new on2.f2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.n.this);
            }
        }, this.f204084d.m56388xcaeb60d0(), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.Presenter
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback callback) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.g(callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f204084d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 c13869x297bc248 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248) abstractC13919x46aff122 : null;
        if (c13869x297bc248 != null) {
            c13869x297bc248.f189021i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.l(this, callback);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14617x82f7e804.ViewCallback viewCallback = this.f204086f;
        if (viewCallback == null || (m82555x4905e9fa = viewCallback.a().m82555x4905e9fa()) == null) {
            return;
        }
        ym5.a1.g(m82555x4905e9fa, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1553x1523d749.p1555x373fe494.m(this));
    }
}
