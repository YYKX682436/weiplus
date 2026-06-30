package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x4 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader f108449d;

    public x4(com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader) {
        this.f108449d = finderMemberTimelineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.w4 w4Var = new com.tencent.mm.plugin.finder.feed.model.w4(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader = this.f108449d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderMemberTimelineLoader.getCache();
        w4Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderMemberTimelineLoader.getCache();
        w4Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return w4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        if (!(iVar instanceof bq.w) || !(fVar instanceof r45.pr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.pr0) fVar).f383324f == 0) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.w4 w4Var = new com.tencent.mm.plugin.finder.feed.model.w4(i17, i18, str);
        r45.pr0 pr0Var = (r45.pr0) fVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> object = pr0Var.f383322d;
        kotlin.jvm.internal.o.f(object, "object");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : object) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 73728)));
        }
        w4Var.setIncrementList(arrayList);
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList object2 = pr0Var.f383322d;
        kotlin.jvm.internal.o.f(object2, "object");
        tVar.j(object2, 73728, this.f108449d.getContextObj());
        bq.w wVar = (bq.w) iVar;
        if (wVar.f23537p != 2) {
            java.util.List incrementList = w4Var.getIncrementList();
            kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            tVar.m(incrementList, 73728, "", true);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList2 = w4Var.getIncrementList();
        sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberTimelineLoader", sb6.toString());
        w4Var.setPullType(wVar.f23537p);
        w4Var.setLastBuffer(pr0Var.f383323e);
        w4Var.setHasMore(z17);
        return w4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader = this.f108449d;
        return new bq.w(finderMemberTimelineLoader.getContextObj(), finderMemberTimelineLoader.f107520d, finderMemberTimelineLoader.f107521e, finderMemberTimelineLoader.getLastBuffer(), finderMemberTimelineLoader.f107522f, 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader = this.f108449d;
        return new bq.w(finderMemberTimelineLoader.getContextObj(), finderMemberTimelineLoader.f107520d, finderMemberTimelineLoader.f107521e, finderMemberTimelineLoader.getLastBuffer(), finderMemberTimelineLoader.f107522f, 0);
    }
}
