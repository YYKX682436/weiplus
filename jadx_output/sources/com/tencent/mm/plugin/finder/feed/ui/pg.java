package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class pg extends com.tencent.mm.plugin.finder.feed.r10 {
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI finderMusicTopicVideoFlowUI, int i17, com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader) {
        super(finderMusicTopicVideoFlowUI, 2, i17, finderTopicFeedLoader);
        this.E = finderMusicTopicVideoFlowUI;
    }

    @Override // com.tencent.mm.plugin.finder.feed.r10, com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        final com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI finderMusicTopicVideoFlowUI = this.E;
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI$createPresenter$1$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI.this.g7() ? (type == 2 || type == 4 || type == 9 || type == 3001 || type == 3002) ? new ca2.f() : new com.tencent.mm.plugin.finder.convert.z2() : new com.tencent.mm.plugin.finder.storage.f80(this.f107155d, null, 0, null, 14, null).g(type, null, null);
            }
        };
    }
}
