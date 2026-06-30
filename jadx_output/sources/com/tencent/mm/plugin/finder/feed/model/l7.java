package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l7 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader f108156d;

    public l7(com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader finderRelatedLoader) {
        this.f108156d = finderRelatedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.k7 k7Var = new com.tencent.mm.plugin.finder.feed.model.k7(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader finderRelatedLoader = this.f108156d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderRelatedLoader.getCache();
        k7Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderRelatedLoader.getCache();
        k7Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return k7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        db2.r5 r5Var = iVar instanceof db2.r5 ? (db2.r5) iVar : null;
        if (r5Var == null) {
            return null;
        }
        boolean N = (i17 == 0 && i18 == 0) ? r5Var.N() : true;
        com.tencent.mm.plugin.finder.feed.model.k7 k7Var = new com.tencent.mm.plugin.finder.feed.model.k7(i17, i18, str);
        java.util.LinkedList M = r5Var.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 256)));
        }
        k7Var.setIncrementList(arrayList);
        cu2.u.f222441a.j(r5Var.M(), 1, this.f108156d.getContextObj());
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = k7Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        k7Var.setPullType(r5Var.f228145m);
        com.tencent.mm.modelbase.o oVar = r5Var.f228142g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        k7Var.setLastBuffer(((r45.aa1) fVar2).getByteString(2));
        k7Var.setHasMore(N);
        return k7Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader finderRelatedLoader = this.f108156d;
        return new bq.v0(finderRelatedLoader.f107633d, finderRelatedLoader.getLastBuffer(), 2, finderRelatedLoader.f107634e, finderRelatedLoader.f107635f, finderRelatedLoader.f107636g, finderRelatedLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        return null;
    }
}
