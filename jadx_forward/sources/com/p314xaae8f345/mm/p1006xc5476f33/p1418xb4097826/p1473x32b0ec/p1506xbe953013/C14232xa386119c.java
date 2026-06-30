package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "wh2/v", "wh2/w", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader */
/* loaded from: classes2.dex */
public final class C14232xa386119c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193227d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193228e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f193229f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f193230g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f193231h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14232xa386119c(java.lang.String targetUsername, java.lang.String myUsername, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUsername, "targetUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myUsername, "myUsername");
        this.f193227d = targetUsername;
        this.f193228e = myUsername;
        this.f193229f = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new wh2.v(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new wh2.x(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: onDead */
    public void mo56109xc39876e3() {
        super.mo56109xc39876e3();
        this.f193230g = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(response);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (this.f193229f) {
            super.mo55587xb461ee3d(response);
            if (m56362x40f3992d(response)) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
                return;
            }
        }
        if (2 == response.getPullType()) {
            m56376x569eb6fd(false);
        }
        yz5.l lVar = this.f193230g;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
