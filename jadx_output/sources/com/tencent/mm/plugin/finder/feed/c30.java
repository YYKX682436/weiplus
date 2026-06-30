package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c30 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader f106453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader) {
        super(nativeDramaGridLoader, false, 1, null);
        this.f106453a = nativeDramaGridLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        int pullType = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(pullType);
        s3Var.f463522g = response.getPullType() != 0;
        s3Var.f463521f = response.getHasMore();
        int errType = response.getErrType();
        com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader = this.f106453a;
        if (errType == 0 && response.getErrCode() == 0) {
            s3Var.f463517b = 1;
            if (pullType == 0 || pullType == 4 || pullType == 1) {
                if (s3Var.f463523h > 0 || nativeDramaGridLoader.getDataListJustForAdapter().size() <= 0) {
                    s3Var.f463518c = null;
                } else {
                    s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.erb);
                }
            }
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.o2z);
            s3Var.f463517b = -1;
        }
        com.tencent.mars.xlog.Log.i(nativeDramaGridLoader.getB(), "[onFetchRefreshDone] tabType=" + nativeDramaGridLoader.f106166e + " opType:4 isNeedClear:" + response.getIsNeedClear() + " reason=" + s3Var);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.b30(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(4, response.getIncrementList(), response.getIsNeedClear(), response.getRequest()), s3Var, this.f106453a, lVar, response));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h
    public boolean sameFeed(com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var, com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var2) {
        so2.j5 existFeed = (so2.j5) r0Var;
        so2.j5 compareFeed = (so2.j5) r0Var2;
        kotlin.jvm.internal.o.g(existFeed, "existFeed");
        kotlin.jvm.internal.o.g(compareFeed, "compareFeed");
        so2.j5 j5Var = compareFeed;
        return super.sameFeed(existFeed, j5Var) || ((existFeed instanceof com.tencent.mm.plugin.finder.feed.model.d5) && (compareFeed instanceof com.tencent.mm.plugin.finder.feed.model.d5) && existFeed.d(j5Var) == 0);
    }
}
