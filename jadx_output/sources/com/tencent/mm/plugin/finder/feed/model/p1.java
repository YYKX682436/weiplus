package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p1 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f108241d;

    public p1(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f108241d = finderFeedShareRelativeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.y1 y1Var = new com.tencent.mm.plugin.finder.feed.model.y1(0, 0, "", "", null, null, 0, null, null, 480, null);
        y1Var.setPullType(1000);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108241d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderFeedShareRelativeListLoader.getCache();
        if (cache != null) {
            java.util.ArrayList arrayList = cache.f108300a;
            if (!(true ^ (arrayList == null || arrayList.isEmpty()))) {
                cache = null;
            }
            if (cache != null) {
                java.lang.String tag = getTAG();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AuthorSingleFlowFetcher callInit: use old data list, size: ");
                java.util.ArrayList arrayList2 = cache.f108300a;
                sb6.append(arrayList2.size());
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                y1Var.setIncrementList(arrayList2);
                com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderFeedShareRelativeListLoader.getCache();
                y1Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
            }
        }
        return y1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        r45.bv0 bv0Var = fVar instanceof r45.bv0 ? (r45.bv0) fVar : null;
        if (bv0Var == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.y1 y1Var = new com.tencent.mm.plugin.finder.feed.model.y1(i17, i18, str, "", null, null, 0, null, null, com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, null);
        y1Var.setHasMore((i17 == 0 && i18 == 0 && bv0Var.getInteger(3) == 0) ? false : true);
        db2.s sVar = iVar instanceof db2.s ? (db2.s) iVar : null;
        y1Var.setPullType(sVar != null ? sVar.f228147t : 0);
        y1Var.setLastBuffer(bv0Var.getByteString(2));
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list = ((r45.bv0) fVar).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        int d17 = hc2.d0.d(3);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108241d;
        java.util.List V0 = kz5.n0.V0(tVar.j(list, d17, finderFeedShareRelativeListLoader.getContextObj()));
        java.lang.Object Z = kz5.n0.Z(finderFeedShareRelativeListLoader.getDataList());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Z instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Z : null;
        if (y1Var.getPullType() == 0 && baseFinderFeed != null) {
            kz5.h0.B(V0, new com.tencent.mm.plugin.finder.feed.model.o1(baseFinderFeed));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(V0, 10));
        java.util.Iterator it = V0.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        y1Var.setIncrementList(arrayList);
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderAuthorSingleFlow incrementList size: ");
        java.util.List incrementList = y1Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        sb6.append(", hasMore=");
        sb6.append(y1Var.getHasMore());
        sb6.append(", pullType=");
        sb6.append(y1Var.getPullType());
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        return y1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108241d;
        if (finderFeedShareRelativeListLoader.f107440n) {
            return null;
        }
        db2.s sVar = new db2.s(finderFeedShareRelativeListLoader.f107433d, finderFeedShareRelativeListLoader.f107435f, 3, finderFeedShareRelativeListLoader.getLastBuffer(), finderFeedShareRelativeListLoader.getContextObj());
        sVar.f228147t = 2;
        return sVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108241d;
        if (finderFeedShareRelativeListLoader.f107440n) {
            return null;
        }
        return new db2.s(finderFeedShareRelativeListLoader.f107433d, finderFeedShareRelativeListLoader.f107435f, 3, null, finderFeedShareRelativeListLoader.getContextObj());
    }
}
