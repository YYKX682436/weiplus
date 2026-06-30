package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLikedFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/d3", "com/tencent/mm/plugin/finder/feed/model/e3", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader */
/* loaded from: classes2.dex */
public final class C13867x8e7f7db8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f189005d;

    /* renamed from: e, reason: collision with root package name */
    public int f189006e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f189007f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f189008g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f189009h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13867x8e7f7db8(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0 scene, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f189005d = z17;
        this.f189007f = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d3(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g3(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: getPageName */
    public int mo55586xaf11af30() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response)) {
            return;
        }
        this.f189007f = response.getHasMore();
        if (!(2 == response.getPullType()) || response.getHasMore() || (aVar = this.f189008g) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchRefreshDone */
    public void mo55428xcbba01e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55428xcbba01e2(response);
        if (response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3) {
            this.f189006e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3) response).f189355a;
            yz5.l lVar = this.f189009h;
            if (lVar != null) {
                lVar.mo146xb9724478(response);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: remove */
    public int mo56120xc84af884(long j17, boolean z17) {
        java.lang.Object obj;
        java.util.Iterator it = m56387xe6796cde().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((so2.j5) obj).mo2128x1ed62e84() == j17) {
                break;
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (!this.f189005d) {
            if (j5Var != null && j5Var.h() == 9) {
                return -1;
            }
        }
        return super.mo56120xc84af884(j17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: removeByLocalId */
    public int mo56122xd0e1816b(long j17, boolean z17) {
        java.lang.Object obj;
        java.util.Iterator it = m56387xe6796cde().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((so2.j5) obj).mo2128x1ed62e84() == j17) {
                break;
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (!this.f189005d) {
            if (j5Var != null && j5Var.h() == 9) {
                return -1;
            }
        }
        return super.mo56122xd0e1816b(j17, z17);
    }
}
