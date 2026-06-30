package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class y0 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader f108470a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader) {
        super(finderEmojiListLoader, false, 1, null);
        this.f108470a = finderEmojiListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(0);
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 2 : 7, response.getIncrementList(), false, null, 12, null);
        com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader finderEmojiListLoader = this.f108470a;
        finderEmojiListLoader.checkIsNeedUiThread(true, new com.tencent.mm.plugin.finder.feed.model.x0(this, y0Var, s3Var, lVar, response, finderEmojiListLoader));
    }
}
