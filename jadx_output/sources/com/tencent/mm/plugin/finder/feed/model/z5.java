package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class z5 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader f108510d;

    public z5(com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader) {
        this.f108510d = finderPostPlaySquareContainerLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit");
        com.tencent.mm.plugin.finder.feed.model.a6 a6Var = new com.tencent.mm.plugin.finder.feed.model.a6(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader = this.f108510d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderPostPlaySquareContainerLoader.getCache();
        a6Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderPostPlaySquareContainerLoader.getCache();
        a6Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return a6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.feed.model.a6 a6Var = new com.tencent.mm.plugin.finder.feed.model.a6(i17, i18, str);
        if ((fVar instanceof r45.j91) && (iVar instanceof db2.l1)) {
            boolean z17 = (i17 == 0 && i18 == 0 && ((r45.j91) fVar).getInteger(3) <= 0) ? false : true;
            r45.j91 j91Var = (r45.j91) fVar;
            java.util.LinkedList<r45.eq2> list = j91Var.getList(4);
            kotlin.jvm.internal.o.f(list, "getContainer_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.eq2 eq2Var : list) {
                java.lang.String string = eq2Var.getString(0);
                java.lang.String str2 = string == null ? "" : string;
                java.lang.String string2 = eq2Var.getString(1);
                java.lang.String str3 = string2 == null ? "" : string2;
                long j17 = eq2Var.getLong(2);
                int integer = eq2Var.getInteger(4);
                java.util.List list2 = eq2Var.getList(3);
                if (list2 == null) {
                    list2 = kz5.p0.f313996d;
                }
                java.util.List list3 = list2;
                int i19 = this.f108510d.f107573d;
                java.lang.String string3 = j91Var.getString(5);
                arrayList.add(new so2.t4(str2, str3, j17, integer, list3, string3 == null ? "" : string3, i19));
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            a6Var.setResponse(fVar);
            a6Var.setIncrementList(V0);
            db2.l1 l1Var = (db2.l1) iVar;
            if (l1Var.f228052t != 2) {
                cu2.t tVar = cu2.u.f222441a;
                java.util.List incrementList = a6Var.getIncrementList();
                kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.RVFeed>");
                tVar.m(incrementList, 0, "", true);
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("containerList size: ");
            java.util.List incrementList2 = a6Var.getIncrementList();
            sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            a6Var.setPullType(l1Var.f228052t);
            a6Var.setLastBuffer(j91Var.getByteString(2));
            a6Var.setHasMore(z17);
        }
        return a6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader = this.f108510d;
        db2.l1 l1Var = new db2.l1(finderPostPlaySquareContainerLoader.getContextObj(), finderPostPlaySquareContainerLoader.f107574e, finderPostPlaySquareContainerLoader.getLastBuffer(), 0, finderPostPlaySquareContainerLoader.f107573d);
        l1Var.f228052t = 2;
        return l1Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader = this.f108510d;
        db2.l1 l1Var = new db2.l1(finderPostPlaySquareContainerLoader.getContextObj(), finderPostPlaySquareContainerLoader.f107574e, finderPostPlaySquareContainerLoader.getLastBuffer(), 0, finderPostPlaySquareContainerLoader.f107573d);
        l1Var.f228052t = 0;
        return l1Var;
    }
}
