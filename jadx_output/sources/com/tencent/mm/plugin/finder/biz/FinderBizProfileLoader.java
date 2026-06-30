package com.tencent.mm.plugin.finder.biz;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "ab2/z", "ab2/a0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderBizProfileLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f102768d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102769e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f102770f;

    /* renamed from: g, reason: collision with root package name */
    public long f102771g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f102772h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.lx f102773i;

    /* renamed from: m, reason: collision with root package name */
    public int f102774m;

    /* renamed from: n, reason: collision with root package name */
    public int f102775n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f102776o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f102777p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f102778q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f102779r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f102780s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderBizProfileLoader(java.lang.String bizUsername, r45.qt2 qt2Var, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        z17 = (i17 & 4) != 0 ? false : z17;
        z18 = (i17 & 8) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        this.f102768d = bizUsername;
        this.f102769e = z17;
        this.f102770f = z18;
        this.f102773i = new com.tencent.mm.plugin.finder.convert.lx(getDataList(), new ab2.c0(this));
        this.f102778q = new java.util.LinkedList();
    }

    public final java.util.List c(java.util.LinkedList list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List j17 = cu2.u.f222441a.j(arrayList, 2, getContextObj());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        return arrayList2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new ab2.z(this);
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed d() {
        int size = getDataList().size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            so2.j5 j5Var = (so2.j5) getDataList().get(size);
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (baseFinderFeed.getFeedObject().getId() != 0) {
                    return baseFinderFeed;
                }
            }
        }
    }

    public final void e() {
        if (this.f102776o) {
            return;
        }
        this.f102776o = true;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f0Var.f310116d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127833n0).getValue()).r()).intValue();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new ab2.b0(this, f0Var, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 21;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.util.List incrementList;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        long j17 = this.f102771g;
        if (j17 != 0 && (incrementList = response.getIncrementList()) != null) {
            int i17 = 0;
            for (java.lang.Object obj : incrementList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (baseFinderFeed.getFeedObject().getId() == j17) {
                        if (isRefreshOperation(response) && i17 <= 7) {
                            this.f102774m = 0;
                        }
                        baseFinderFeed.v1(true);
                        getDispatcher().a();
                    }
                }
                i17 = i18;
            }
        }
        if (isInitOperation(response)) {
            if (this.f102775n == 1) {
                e();
                return;
            }
            return;
        }
        if (2 == response.getPullType()) {
            this.f102777p = false;
        }
        response.getHasMore();
        yz5.l lVar = this.f102772h;
        if (lVar != null) {
            lVar.invoke(response);
        }
        java.util.LinkedList linkedList = this.f102778q;
        java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
        linkedList.clear();
        java.util.Iterator it = linkedList2.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchLoadMoreDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchLoadMoreDone(response);
        if (this.f102776o) {
            int i17 = 0;
            for (java.lang.Object obj : getDataList()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (baseFinderFeed.getFeedObject().getId() == this.f102771g) {
                        baseFinderFeed.v1(true);
                        getDispatcher().b(i17, 1);
                        this.f102776o = false;
                        yz5.l lVar = this.f102779r;
                        if (lVar != null) {
                            lVar.invoke(java.lang.Integer.valueOf(i17));
                            return;
                        }
                        return;
                    }
                }
                i17 = i18;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        if (this.f102776o && this.f102777p) {
            return false;
        }
        this.f102777p = true;
        return super.requestLoadMore(z17);
    }
}
