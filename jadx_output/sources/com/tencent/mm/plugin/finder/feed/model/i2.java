package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i2 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader f107936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader) {
        super(finderFriendLikeLoader, false, 1, null);
        this.f107936a = finderFriendLikeLoader;
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
        if ((pullType == 0 || pullType == 4) && s3Var.f463523h > 0) {
            s3Var.f463518c = null;
        }
        com.tencent.mars.xlog.Log.i(this.f107936a.getB(), "[onFetchRefreshDone]  reason=" + s3Var);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.h2(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(7, response.getIncrementList(), response.getIsNeedClear(), null, 8, null), s3Var, this.f107936a, lVar, response));
    }
}
