package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/FinderProfileTemplateLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderProfileFeedLoader;", "com/tencent/mm/plugin/finder/feed/bp", "com/tencent/mm/plugin/finder/feed/cp", "com/tencent/mm/plugin/finder/feed/dp", "com/tencent/mm/plugin/finder/feed/ep", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader */
/* loaded from: classes2.dex */
public final class C13786x77595290 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13851x3762f023 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f187639d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dp f187640e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bp f187641f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f187642g;

    public C13786x77595290(java.lang.String str, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f187639d = str;
        this.f187640e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dp.f188113d;
        this.f187641f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bp.f187936d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ep(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13851x3762f023, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        this.f187641f = m56388xcaeb60d0().isEmpty() ^ true ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bp.f187938f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bp.f187937e;
        if (m56362x40f3992d(response) || response.getHasMore() || (aVar = this.f187642g) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}
