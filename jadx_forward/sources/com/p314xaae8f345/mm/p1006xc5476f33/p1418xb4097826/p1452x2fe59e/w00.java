package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class w00 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.l f192478i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w00(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 feedLoader, jz5.l lVar) {
        super(context, i17, i18, feedLoader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        this.f192478i = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public in5.s c() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTingAudioCollectionUIContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == ms2.b.class.hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eu(true, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w00.this.f192478i);
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("TingAudioCollectionPresenter", "type invalid", new java.lang.Object[0]);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
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
        this.f188689e.mo56368x4487ec3f(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TingAudioCollectionPresenter", "loadMoreData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(this.f188689e, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0
    public void v() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TingAudioCollectionPresenter", "requestRefresh");
        this.f188689e.mo56155xd210094c();
    }
}
