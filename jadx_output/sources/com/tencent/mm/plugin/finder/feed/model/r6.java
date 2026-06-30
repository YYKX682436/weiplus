package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class r6 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader f108294a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader) {
        super(finderProfileLiveUserPageTimeLineLoader, false, 1, null);
        this.f108294a = finderProfileLiveUserPageTimeLineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        super.mergeRefresh(response, lVar);
        com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader = this.f108294a;
        finderProfileLiveUserPageTimeLineLoader.getDataList().clear();
        java.util.AbstractCollection dataList = finderProfileLiveUserPageTimeLineLoader.getDataList();
        java.util.List incrementList = response.getIncrementList();
        dataList.addAll(incrementList != null ? kz5.n0.S0(incrementList) : new java.util.ArrayList());
    }
}
