package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class c5 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader f107750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader) {
        super(finderMixAllFeedLoader, false, 1, null);
        this.f107750a = finderMixAllFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        int pullType = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(pullType);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8a);
            s3Var.f463517b = 1;
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8x);
            s3Var.f463517b = -1;
        }
        s3Var.f463522g = response.getPullType() != 0;
        s3Var.f463521f = response.getHasMore();
        int i17 = 4;
        if ((pullType == 0 || pullType == 4) && s3Var.f463523h > 0) {
            s3Var.f463518c = null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f107750a;
        com.tencent.mars.xlog.Log.i(finderMixAllFeedLoader.getB(), "FinderMixAllFeedLoader_" + finderMixAllFeedLoader.f107526e + '_' + finderMixAllFeedLoader.f107527f + " [onFetchRefreshDone] reason=" + s3Var + " dataList(" + finderMixAllFeedLoader.getDataList().hashCode() + ") size=" + finderMixAllFeedLoader.getDataList().size());
        java.util.List incrementList = response.getIncrementList();
        int size = incrementList != null ? incrementList.size() : 0;
        if (response.getHasMore()) {
            if (size <= finderMixAllFeedLoader.getDataList().size()) {
                i17 = 2;
            }
        } else if (finderMixAllFeedLoader.getDataList().size() == 0 || size == 0 || finderMixAllFeedLoader.getDataList().size() <= size) {
            i17 = 6;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.b5(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(i17, response.getIncrementList(), response.getIsNeedClear(), null, 8, null), s3Var, this.f107750a, lVar, response));
        java.lang.String b17 = finderMixAllFeedLoader.getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMixAllFeedLoader_");
        sb6.append(finderMixAllFeedLoader.f107526e);
        sb6.append('_');
        sb6.append(finderMixAllFeedLoader.f107527f);
        sb6.append(" mergeRefresh dataList(");
        sb6.append(finderMixAllFeedLoader.getDataList().hashCode());
        sb6.append(") size=");
        sb6.append(finderMixAllFeedLoader.getDataList().size());
        sb6.append(' ');
        java.util.AbstractCollection<so2.j5> dataList = finderMixAllFeedLoader.getDataList();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        for (so2.j5 j5Var : dataList) {
            arrayList.add("type=" + j5Var.h() + ",id=" + j5Var.getItemId());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h
    public boolean sameFeed(com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var, com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var2) {
        so2.j5 existFeed = (so2.j5) r0Var;
        so2.j5 compareFeed = (so2.j5) r0Var2;
        kotlin.jvm.internal.o.g(existFeed, "existFeed");
        kotlin.jvm.internal.o.g(compareFeed, "compareFeed");
        if (!(existFeed instanceof so2.a0) || !(compareFeed instanceof so2.a0) || existFeed.d(compareFeed) != 0) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f107750a;
        com.tencent.mars.xlog.Log.i(finderMixAllFeedLoader.getB(), "FinderMixAllFeedLoader_" + finderMixAllFeedLoader.f107526e + '_' + finderMixAllFeedLoader.f107527f + " sameFeed existFeed=" + pm0.v.u(existFeed.getItemId()) + ",compareFeed=" + pm0.v.u(compareFeed.getItemId()) + " when merge");
        return true;
    }
}
