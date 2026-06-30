package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderPostPreviewFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {
    public FinderPostPreviewFeedLoader() {
        super(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.ui.ei(this);
    }
}
