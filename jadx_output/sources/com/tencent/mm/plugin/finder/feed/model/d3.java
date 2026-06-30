package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d3 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader f107791d;

    public d3(com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader) {
        this.f107791d = finderLikedFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit");
        com.tencent.mm.plugin.finder.feed.model.e3 e3Var = new com.tencent.mm.plugin.finder.feed.model.e3(0, 0, "", 0, 0, 16, null);
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = this.f107791d;
        if (finderLikedFeedLoader.f107472d) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderLikedFeedLoader.getCache();
            e3Var.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderLikedFeedLoader.getCache();
            e3Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            e3Var.setIncrementList(bu2.d0.i(bu2.e0.f24498a, 2, null, 2, null));
        }
        return e3Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.List list;
        java.util.ArrayList arrayList;
        if (!(iVar instanceof bq.n0) || !(fVar instanceof r45.d71)) {
            return null;
        }
        if (i17 == 0 && i18 == 0) {
            yr2.a aVar = yr2.a.f464659a;
            r45.d71 d71Var = (r45.d71) fVar;
            r45.sq2 sq2Var = (r45.sq2) d71Var.getCustom(8);
            java.util.LinkedList list2 = d71Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getLiked_list(...)");
            aVar.b(sq2Var, list2, 3965);
            java.util.LinkedList list3 = d71Var.getList(1);
            kotlin.jvm.internal.o.f(list3, "getLiked_list(...)");
            if (list3.size() > 0) {
                java.lang.Object obj = list3.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                com.tencent.mars.xlog.Log.i(getTAG(), "onGYNetEnd list:" + list3.size() + " firstItem:" + pm0.b0.g((com.tencent.mm.protocal.protobuf.FinderObject) obj));
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd list:");
            sb6.append(list3.size());
            sb6.append(", continueFlag:");
            sb6.append(d71Var.getInteger(3));
            sb6.append(", maxId:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.k0(list3);
            sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getDisplayId()) : null);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            bq.n0 n0Var = (bq.n0) iVar;
            boolean z17 = n0Var.f23497o != 2 && com.tencent.mm.sdk.platformtools.t8.K0(n0Var.f23498p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list3) {
                if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            cu2.t tVar = cu2.u.f222441a;
            java.util.List j17 = tVar.j(arrayList2, 4, this.f107791d.getContextObj());
            if (z17 && n0Var.f23500r != 1 && n0Var.f23499q) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(j17, 10));
                java.util.Iterator it = ((java.util.ArrayList) j17).iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
                }
                tVar.m(arrayList3, 4, "", z17);
            }
            list = j17;
        } else {
            list = null;
        }
        boolean z18 = (i17 == 0 && i18 == 0 && ((r45.d71) fVar).getInteger(3) != 1) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.e3 e3Var = new com.tencent.mm.plugin.finder.feed.model.e3(i17, i18, str, 0, 0, 16, null);
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()));
            }
        } else {
            arrayList = null;
        }
        e3Var.setIncrementList(arrayList);
        e3Var.setPullType(((bq.n0) iVar).f23497o);
        r45.d71 d71Var2 = (r45.d71) fVar;
        e3Var.setLastBuffer(d71Var2.getByteString(2));
        e3Var.setHasMore(z18);
        e3Var.f107822a = d71Var2.getInteger(4);
        return e3Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = this.f107791d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) finderLikedFeedLoader.getLastItemOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        return new bq.n0((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : feedObject2.getDisplayId(), finderLikedFeedLoader.getLastBuffer(), 2, null, finderLikedFeedLoader.getContextObj(), 0, false, 104, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = this.f107791d;
        return new bq.n0(0L, finderLikedFeedLoader.getLastBuffer(), 1, null, finderLikedFeedLoader.getContextObj(), 0, false, 104, null);
    }
}
