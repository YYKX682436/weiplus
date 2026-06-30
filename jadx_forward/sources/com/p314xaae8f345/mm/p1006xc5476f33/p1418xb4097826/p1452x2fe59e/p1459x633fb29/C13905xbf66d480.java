package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileNativeDramaLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderProfileFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/s6", "com/tencent/mm/plugin/finder/feed/model/t6", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileNativeDramaLoader */
/* loaded from: classes2.dex */
public final class C13905xbf66d480 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13851x3762f023 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f189127d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f189128e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f189129f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f189130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13905xbf66d480(java.lang.String finderUsername, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f189127d = finderUsername;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s6(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13851x3762f023, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response) || (lVar = this.f189128e) == null) {
            return;
        }
        lVar.mo146xb9724478((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6) response);
    }
}
