package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLongFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderFloatBallDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLongFeedDetailUI extends com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI {
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 203;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI, com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        super.h7();
        if (getIntent().getBooleanExtra("KEY_CHECK_FEED_VALID", false)) {
            com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f109244z;
            if (finderFloatBallDetailLoader != null) {
                finderFloatBallDetailLoader.f107455f = new com.tencent.mm.plugin.finder.feed.ui.mg(this);
            } else {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
        }
    }
}
