package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class x3 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader f108448d;

    public x3(com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader finderLiveReservedNoticeListLoader) {
        this.f108448d = finderLiveReservedNoticeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader finderLiveReservedNoticeListLoader = this.f108448d;
        com.tencent.mm.plugin.finder.feed.model.y3 y3Var = new com.tencent.mm.plugin.finder.feed.model.y3(finderLiveReservedNoticeListLoader, i17, i18, str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (fVar instanceof r45.tu1) {
            r45.tu1 tu1Var = (r45.tu1) fVar;
            java.util.LinkedList<r45.s72> list = tu1Var.getList(1);
            if (list != null) {
                for (r45.s72 s72Var : list) {
                    arrayList.add(new so2.s2(s72Var.getInteger(0), (com.tencent.mm.protocal.protobuf.FinderContact) s72Var.getCustom(1), (r45.h32) s72Var.getCustom(2), (r45.c32) s72Var.getCustom(3)));
                }
            }
            y3Var.setIncrementList(arrayList);
            y3Var.setLastBuffer(finderLiveReservedNoticeListLoader.getLastBuffer());
            y3Var.setHasMore(tu1Var.getBoolean(3));
        }
        return y3Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return new ke2.h0(this.f108448d.getLastBuffer());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        return new ke2.h0(this.f108448d.getLastBuffer());
    }
}
