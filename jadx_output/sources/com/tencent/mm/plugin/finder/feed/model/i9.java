package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i9 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader f107955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader) {
        super(finderTopicFeedLoader, false, 1, null);
        this.f107955a = finderTopicFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public int findMergeIndex(java.util.ArrayList srcList, java.util.List newList, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(srcList, "srcList");
        kotlin.jvm.internal.o.g(newList, "newList");
        if (this.f107955a.f107668d == 4 && newList.size() == 1 && (newList.get(0) instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            java.lang.Object obj2 = newList.get(0);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2).getFeedObject().getFeedObject().getId() == 0) {
                return 1;
            }
        }
        return super.findMergeIndex(srcList, newList, i17, obj);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(1);
        java.util.List incrementList = response.getIncrementList();
        s3Var.f463522g = incrementList != null ? incrementList.isEmpty() : true;
        s3Var.f463521f = response.getHasMore();
        s3Var.f463520e = response;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 1 : 5, response.getIncrementList(), false, null, 12, null);
        com.tencent.mars.xlog.Log.i(this.f107955a.getF123427d(), "mergeLoadMore hasMore: " + response.getHasMore());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.g9(this, y0Var, s3Var, this.f107955a, lVar, response));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(response.getPullType() == 1 ? 3 : 4);
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getPullType() == 1 ? 3 : 4, response.getIncrementList(), false, null, 12, null);
        s3Var.f463521f = response.getHasMore();
        s3Var.f463520e = response;
        com.tencent.mars.xlog.Log.i(this.f107955a.getF123427d(), "mergeRefresh hasMore: " + response.getHasMore() + ", pullType = " + response.getPullType());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.h9(this, y0Var, s3Var, this.f107955a, lVar, response));
    }
}
