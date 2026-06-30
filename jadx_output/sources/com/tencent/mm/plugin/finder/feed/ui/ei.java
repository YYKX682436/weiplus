package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ei extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader f109985d;

    public ei(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader) {
        this.f109985d = finderPostPreviewFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.internal.b0 b0Var = new com.tencent.mm.plugin.finder.feed.model.internal.b0();
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader = this.f109985d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderPostPreviewFeedLoader.getCache();
        b0Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderPostPreviewFeedLoader.getCache();
        b0Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        b0Var.setHasMore(true);
        return b0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        return null;
    }
}
