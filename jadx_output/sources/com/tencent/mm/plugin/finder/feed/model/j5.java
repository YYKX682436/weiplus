package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j5 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f108085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader) {
        super(finderPoiFeedLoader, false, 1, null);
        this.f108085a = finderPoiFeedLoader;
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
        response.getHasMore();
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = this.f108085a;
        finderPoiFeedLoader.getClass();
        int i17 = 4;
        if ((pullType == 0 || pullType == 4) && s3Var.f463523h > 0) {
            s3Var.f463518c = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiFeedLoader", "[onFetchRefreshDone]  reason=" + s3Var);
        java.util.List incrementList = response.getIncrementList();
        int size = incrementList != null ? incrementList.size() : 0;
        if (response.getHasMore()) {
            if (size <= finderPoiFeedLoader.getDataList().size()) {
                i17 = 2;
            }
        } else if (finderPoiFeedLoader.getDataList().size() == 0 || size == 0 || finderPoiFeedLoader.getDataList().size() <= size) {
            java.util.List incrementList2 = response.getIncrementList();
            if (incrementList2 != null && incrementList2.containsAll(kz5.n0.S0(finderPoiFeedLoader.getDataList()))) {
                i17 = 6;
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.i5(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(i17, response.getIncrementList(), response.getIsNeedClear(), null, 8, null), s3Var, this.f108085a, lVar, response));
    }
}
