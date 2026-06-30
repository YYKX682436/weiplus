package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j2 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader f108081d;

    public j2(com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader) {
        this.f108081d = finderInteractionSearchFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit initCount ");
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = new com.tencent.mm.plugin.finder.feed.model.internal.IResponse(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = this.f108081d;
        if (finderInteractionSearchFeedLoader.f107460d) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderInteractionSearchFeedLoader.getCache();
            iResponse.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderInteractionSearchFeedLoader.getCache();
            iResponse.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            iResponse.setIncrementList(bu2.d0.i(bu2.e0.f24498a, 22, null, 2, null));
        }
        return iResponse;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.q1) || !(fVar instanceof r45.ou2)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.ou2) fVar).getInteger(2) == 0) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.k2[] k2VarArr = com.tencent.mm.plugin.finder.feed.model.k2.f108112d;
        com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = this.f108081d;
        finderInteractionSearchFeedLoader.getClass();
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = new com.tencent.mm.plugin.finder.feed.model.internal.IResponse(i17, i18, str);
        r45.ou2 ou2Var = (r45.ou2) fVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ou2Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 524288)));
        }
        iResponse.setIncrementList(arrayList);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list2 = ou2Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getObject_list(...)");
        tVar.j(list2, 524288, finderInteractionSearchFeedLoader.getContextObj());
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = iResponse.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        iResponse.setPullType(((bq.q1) iVar).f23520o);
        iResponse.setLastBuffer(ou2Var.getByteString(3));
        iResponse.setHasMore(z17);
        return iResponse;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        com.tencent.mm.plugin.finder.feed.model.k2[] k2VarArr = com.tencent.mm.plugin.finder.feed.model.k2.f108112d;
        this.f108081d.getClass();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = this.f108081d;
        bq.q1 q1Var = new bq.q1(finderInteractionSearchFeedLoader.f107461e, finderInteractionSearchFeedLoader.f107464h, finderInteractionSearchFeedLoader.f107462f, finderInteractionSearchFeedLoader.f107463g, finderInteractionSearchFeedLoader.getLastBuffer(), finderInteractionSearchFeedLoader.getContextObj());
        q1Var.f23520o = 2;
        return q1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = this.f108081d;
        bq.q1 q1Var = new bq.q1(finderInteractionSearchFeedLoader.f107461e, finderInteractionSearchFeedLoader.f107464h, finderInteractionSearchFeedLoader.f107462f, finderInteractionSearchFeedLoader.f107463g, finderInteractionSearchFeedLoader.getLastBuffer(), finderInteractionSearchFeedLoader.getContextObj());
        q1Var.f23520o = 0;
        return q1Var;
    }
}
