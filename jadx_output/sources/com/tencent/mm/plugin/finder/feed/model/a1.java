package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class a1 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader f107695d;

    public a1(com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader) {
        this.f107695d = finderFavFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit initCount ");
        com.tencent.mm.plugin.finder.feed.model.b1 b1Var = new com.tencent.mm.plugin.finder.feed.model.b1(0, 0, "", 0, 0, null);
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = this.f107695d;
        if (finderFavFeedLoader.f107409e) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderFavFeedLoader.getCache();
            b1Var.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderFavFeedLoader.getCache();
            b1Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            bu2.d0 d0Var = bu2.e0.f24498a;
            finderFavFeedLoader.getClass();
            b1Var.setIncrementList(bu2.d0.i(d0Var, 10, null, 2, null));
        }
        return b1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.i0) || !(fVar instanceof r45.x51)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = this.f107695d;
        if (i17 == 0 && i18 == 0) {
            yr2.a aVar = yr2.a.f464659a;
            r45.x51 x51Var = (r45.x51) fVar;
            r45.sq2 sq2Var = (r45.sq2) x51Var.getCustom(7);
            java.util.LinkedList list = x51Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            aVar.b(sq2Var, list, 3966);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list2 = x51Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getObject(...)");
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list2) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kotlin.jvm.internal.o.d(finderObject);
                ((com.tencent.mm.plugin.finder.report.o3) c17).cl(finderObject, finderFavFeedLoader.getContextObj());
            }
        }
        bq.i0 i0Var = (bq.i0) iVar;
        com.tencent.mm.protobuf.f fVar2 = i0Var.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        long j17 = ((r45.w51) fVar2).getLong(6);
        com.tencent.mars.xlog.Log.i(getTAG(), "dealOnSceneEnd activeTopicId:" + finderFavFeedLoader.f107414m + " topicId:" + j17);
        long j18 = finderFavFeedLoader.f107414m;
        com.tencent.mm.protobuf.f fVar3 = i0Var.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        if (j18 != ((r45.w51) fVar3).getLong(6)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.x51) fVar).getInteger(3) == 0) ? false : true;
        finderFavFeedLoader.f107413i = (i17 == 0 && i18 == 0) ? com.tencent.mm.plugin.finder.feed.model.c1.f107744f : com.tencent.mm.plugin.finder.feed.model.c1.f107745g;
        r45.x51 x51Var2 = (r45.x51) fVar;
        com.tencent.mm.plugin.finder.feed.model.b1 b1Var = new com.tencent.mm.plugin.finder.feed.model.b1(i17, i18, str, x51Var2.getInteger(4), 0, x51Var2.getList(8));
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list3 = x51Var2.getList(1);
        kotlin.jvm.internal.o.f(list3, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : list3) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject2);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject2, 256)));
        }
        b1Var.setIncrementList(arrayList);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list4 = x51Var2.getList(1);
        kotlin.jvm.internal.o.f(list4, "getObject(...)");
        tVar.j(list4, 256, finderFavFeedLoader.getContextObj());
        if (i0Var.f23490o != 2) {
            if (j17 == 0 && finderFavFeedLoader.f107413i == com.tencent.mm.plugin.finder.feed.model.c1.f107744f) {
                java.util.List incrementList = b1Var.getIncrementList();
                kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
                tVar.m(incrementList, 256, "", true);
            }
            b1Var.f107714a = x51Var2.getInteger(4);
            x51Var2.getInteger(5);
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = b1Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        b1Var.setPullType(i0Var.f23490o);
        b1Var.setLastBuffer(x51Var2.getByteString(2));
        b1Var.setHasMore(z17);
        return b1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.fetch(obj, callback, z17);
        com.tencent.mm.plugin.finder.feed.model.c1 c1Var = com.tencent.mm.plugin.finder.feed.model.c1.f107743e;
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = this.f107695d;
        finderFavFeedLoader.getClass();
        finderFavFeedLoader.f107413i = c1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = this.f107695d;
        bq.i0 i0Var = new bq.i0(finderFavFeedLoader.f107408d, finderFavFeedLoader.getLastBuffer(), finderFavFeedLoader.getContextObj(), finderFavFeedLoader.f107414m, 0, 16, null);
        i0Var.f23490o = 2;
        return i0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = this.f107695d;
        bq.i0 i0Var = new bq.i0(finderFavFeedLoader.f107408d, finderFavFeedLoader.getLastBuffer(), finderFavFeedLoader.getContextObj(), finderFavFeedLoader.f107414m, 0, 16, null);
        i0Var.f23490o = 0;
        return i0Var;
    }
}
