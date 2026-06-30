package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u2 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader f108388a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader) {
        super(finderLbsLoader, false, 1, null);
        this.f108388a = finderLbsLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(0);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f463517b = 1;
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8f);
            s3Var.f463517b = -1;
        }
        s3Var.f463522g = response.getPullType() != 0;
        s3Var.f463521f = response.getHasMore();
        if (s3Var.f463523h > 0 || this.f108388a.getDataListJustForAdapter().size() <= 0) {
            s3Var.f463518c = null;
        } else {
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f8h);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.t2(this, new com.tencent.mm.plugin.finder.feed.model.internal.y0(4, response.getIncrementList(), false, null, 12, null), s3Var, this.f108388a, lVar, response));
    }
}
