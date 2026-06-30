package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class r extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final ey2.u f108277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader f108278e;

    public r(com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader finderColumnFeedListLoader, ey2.u uVar) {
        this.f108278e = finderColumnFeedListLoader;
        this.f108277d = uVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.s sVar = new com.tencent.mm.plugin.finder.feed.model.s(0, 0, "", false, 8, null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache = this.f108278e.getCache();
        if (cache != null) {
            sVar.setIncrementList(cache.f108300a);
            sVar.setLastBuffer(cache.f108301b);
            sVar.setHasMore(false);
        }
        return sVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.l) || !(fVar instanceof r45.cy0)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.s sVar = new com.tencent.mm.plugin.finder.feed.model.s(i17, i18, str, false, 8, null);
        r45.cy0 cy0Var = (r45.cy0) fVar;
        sVar.setHasMore(cy0Var.getInteger(3) != 0);
        if (i17 == 0 && i18 == 0) {
            sVar.setLastBuffer(cy0Var.getByteString(2));
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = cy0Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 1)));
            }
            sVar.setIncrementList(arrayList);
            cu2.t tVar = cu2.u.f222441a;
            java.util.LinkedList list2 = cy0Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getObject(...)");
            tVar.j(list2, 1, this.f108278e.getContextObj());
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dealOnSceneEnd] errType:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(", pullType:");
        sb6.append(sVar.getPullType());
        sb6.append(" incrementList size: ");
        java.util.List incrementList = sVar.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        sb6.append(" hasMore:");
        sb6.append(sVar.getHasMore());
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        return sVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ey2.u uVar = this.f108277d;
        if (uVar != null) {
            uVar.Q6();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        return null;
    }
}
