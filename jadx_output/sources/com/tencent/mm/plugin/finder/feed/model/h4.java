package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h4 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader f107913a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader) {
        super(finderMemberAllFeedLoader, false, 1, null);
        this.f107913a = finderMemberAllFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        if (response.getPullType() != 0) {
            super.mergeRefresh(response, lVar);
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.g4(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(7, response.getIncrementList(), false, null, 12, null), new ym5.s3(0), lVar, response, this.f107913a));
        }
    }
}
