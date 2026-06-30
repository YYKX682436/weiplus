package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b2 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader f107716d;

    public b2(com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader) {
        this.f107716d = finderFloatBallDetailLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f107716d;
        com.tencent.mm.plugin.finder.feed.model.c2 c2Var = new com.tencent.mm.plugin.finder.feed.model.c2(finderFloatBallDetailLoader, 0, 0, "");
        c2Var.setPullType(1000);
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderFloatBallDetailLoader.getCache();
        if (cache != null && (arrayList = cache.f108300a) != null) {
            com.tencent.mars.xlog.Log.i(getTAG(), "fetchInit: use old data list, size: " + arrayList.size());
            c2Var.setIncrementList(arrayList);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderFloatBallDetailLoader.getCache();
            c2Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
            java.lang.Object a07 = kz5.n0.a0(arrayList, 0);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a07 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) a07 : null;
            if (baseFinderFeed != null) {
                finderFloatBallDetailLoader.f107453d = baseFinderFeed.getItemId();
                java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
                kotlin.jvm.internal.o.g(objectNonceId, "<set-?>");
                finderFloatBallDetailLoader.f107454e = objectNonceId;
            }
        }
        return c2Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        yz5.p pVar;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f107716d;
        if (i17 == 0 && i18 == 0) {
            r45.h51 h51Var = fVar instanceof r45.h51 ? (r45.h51) fVar : null;
            if (h51Var != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2)) != null) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1));
                p17.t1(true);
                com.tencent.mm.plugin.finder.feed.model.c2 c2Var = new com.tencent.mm.plugin.finder.feed.model.c2(finderFloatBallDetailLoader, i17, i18, str);
                c2Var.setIncrementList(kz5.b0.c(p17));
                c2Var.setPullType(0);
                return c2Var;
            }
        } else if (!hc2.p.b(i17, i18) && (pVar = finderFloatBallDetailLoader.f107455f) != null) {
            pVar.invoke(java.lang.Integer.valueOf(i18), str);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public /* bridge */ /* synthetic */ com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f107716d;
        long j17 = finderFloatBallDetailLoader.f107453d;
        java.lang.String str = finderFloatBallDetailLoader.f107454e;
        r45.qt2 contextObj = finderFloatBallDetailLoader.getContextObj();
        return new db2.g4(j17, str, contextObj != null ? contextObj.getInteger(5) : 0, 2, "", true, null, null, 0L, null, false, false, null, finderFloatBallDetailLoader.getContextObj(), 0, null, false, null, null, null, null, null, 0, 0, null, null, true, null, null, 469753792, null);
    }
}
