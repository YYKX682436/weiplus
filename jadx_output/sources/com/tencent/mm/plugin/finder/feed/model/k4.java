package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class k4 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader f108114d;

    public k4(com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader) {
        this.f108114d = finderMemberFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.i4 i4Var = new com.tencent.mm.plugin.finder.feed.model.i4(0, 0, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader = this.f108114d;
        java.util.List mergeLocalData = mergeLocalData(arrayList, finderMemberFeedLoader.f107507e, 0, Integer.MAX_VALUE);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (finderMemberFeedLoader.f107510h == 0) {
            java.util.Iterator it = mergeLocalData.iterator();
            while (it.hasNext()) {
                arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
            }
        }
        i4Var.setIncrementList(arrayList2);
        return i4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.List j17;
        java.lang.Object obj;
        if (!(iVar instanceof bq.w) || !(fVar instanceof r45.pr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.pr0) fVar).f383324f == 0) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.i4 i4Var = new com.tencent.mm.plugin.finder.feed.model.i4(i17, i18, str);
        r45.pr0 pr0Var = (r45.pr0) fVar;
        java.util.LinkedList linkedList = pr0Var.f383322d;
        boolean z18 = linkedList == null || linkedList.isEmpty();
        com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader = this.f108114d;
        if (z18) {
            j17 = kz5.p0.f313996d;
        } else {
            cu2.t tVar = cu2.u.f222441a;
            java.util.LinkedList object = pr0Var.f383322d;
            kotlin.jvm.internal.o.f(object, "object");
            j17 = tVar.j(object, 73728, finderMemberFeedLoader.getContextObj());
        }
        bq.w wVar = (bq.w) iVar;
        if (wVar.f23537p == 0) {
            j17 = mergeLocalData(j17, wVar.f23536o, 0, Integer.MAX_VALUE);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next());
            int i19 = finderMemberFeedLoader.f107510h;
            if (i19 == 0) {
                p17.getUdfKv().put("tab_seat", "视频");
            } else if (i19 == 1) {
                p17.getUdfKv().put("tab_seat", "直播回放");
            }
            arrayList.add(p17);
        }
        i4Var.setIncrementList(arrayList);
        if (wVar.f23537p != 2) {
            java.util.List incrementList = i4Var.getIncrementList();
            if (!(incrementList instanceof java.util.List)) {
                incrementList = null;
            }
            if (incrementList != null) {
                cu2.u.f222441a.m(incrementList, 73728, "", true);
            }
        }
        java.util.LinkedList<java.lang.Long> preload_object_list = pr0Var.f383325g;
        kotlin.jvm.internal.o.f(preload_object_list, "preload_object_list");
        for (java.lang.Long l17 : preload_object_list) {
            java.util.LinkedList object2 = pr0Var.f383322d;
            kotlin.jvm.internal.o.f(object2, "object");
            java.util.Iterator it6 = object2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (l17 != null && ((com.tencent.mm.protocal.protobuf.FinderObject) obj).getId() == l17.longValue()) {
                    break;
                }
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
            if (finderObject != null) {
                ((com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).Bi(finderObject, 204, 1);
            }
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        java.lang.String str2 = finderMemberFeedLoader.f107507e;
        java.lang.String f17 = xy2.c.f(finderMemberFeedLoader.getContextObj());
        java.util.LinkedList object3 = pr0Var.f383322d;
        kotlin.jvm.internal.o.f(object3, "object");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(object3, 10));
        java.util.Iterator it7 = object3.iterator();
        while (it7.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it7.next()).getId()));
        }
        ((c61.p2) ybVar).Rj(str2, f17, arrayList2);
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = i4Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        i4Var.setPullType(wVar.f23537p);
        i4Var.setLastBuffer(pr0Var.f383323e);
        i4Var.setHasMore(z17);
        return i4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader = this.f108114d;
        return new bq.w(finderMemberFeedLoader.getContextObj(), finderMemberFeedLoader.f107507e, finderMemberFeedLoader.f107508f, finderMemberFeedLoader.getLastBuffer(), finderMemberFeedLoader.f107510h, 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader = this.f108114d;
        return new bq.w(finderMemberFeedLoader.getContextObj(), finderMemberFeedLoader.f107507e, finderMemberFeedLoader.f107508f, null, finderMemberFeedLoader.f107510h, 0);
    }

    public final java.util.List mergeLocalData(java.util.List list, java.lang.String str, int i17, int i18) {
        boolean z17;
        boolean z18;
        if (!(str.length() == 0)) {
            com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader = this.f108114d;
            r45.qt2 contextObj = finderMemberFeedLoader.getContextObj();
            if (kotlin.jvm.internal.o.b(str, contextObj != null ? contextObj.getString(18) : null)) {
                com.tencent.mm.plugin.finder.feed.model.internal.p0.Companion.getClass();
                z17 = com.tencent.mm.plugin.finder.feed.model.internal.p0.DEBUG;
                if (z17) {
                    hc2.j0.a(list, "nowList");
                }
                com.tencent.mars.xlog.Log.i(getTAG(), "mergeLocalData start " + i17 + " end " + i18);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList h17 = cu2.u.f222441a.h(str, i17, i18);
                java.util.ArrayList<com.tencent.mm.plugin.finder.storage.FinderItem> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : h17) {
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
                    if (finderItem.getFinderObject().getObjectType() != 2 && finderItem.isMemberFeed() && (finderMemberFeedLoader.supportMemberFeedType() & finderItem.getLocalMemberFeedType()) > 0 && !finderItem.isNewLifeConnectFeed()) {
                        arrayList.add(obj);
                    }
                }
                linkedList.addAll(list);
                pm0.v.b0(arrayList, new com.tencent.mm.plugin.finder.feed.model.j4(list));
                linkedList.addAll(0, arrayList);
                com.tencent.mm.plugin.finder.feed.model.internal.p0.Companion.getClass();
                z18 = com.tencent.mm.plugin.finder.feed.model.internal.p0.DEBUG;
                if (z18) {
                    hc2.j0.a(linkedList, "newList");
                }
                com.tencent.mars.xlog.Log.i(getTAG(), "dblist size:" + arrayList.size());
                for (com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 : arrayList) {
                    com.tencent.mars.xlog.Log.i(getTAG(), "dblist item, localId:" + finderItem2.getLocalId() + ", id:" + finderItem2.getId());
                }
                return linkedList;
            }
        }
        return list;
    }
}
