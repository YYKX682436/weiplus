package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001R6\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderProfileFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lso2/j5;", "Ljz5/f0;", "refreshEndCallback", "Lyz5/l;", "getRefreshEndCallback", "()Lyz5/l;", "setRefreshEndCallback", "(Lyz5/l;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseFinderProfileFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {
    private yz5.l refreshEndCallback;

    public final yz5.l getRefreshEndCallback() {
        return this.refreshEndCallback;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (this.refreshEndCallback == null || !isRefreshOperation(response)) {
            return;
        }
        yz5.l lVar = this.refreshEndCallback;
        if (lVar != null) {
            lVar.invoke(response);
        }
        this.refreshEndCallback = null;
    }

    public final void setRefreshEndCallback(yz5.l lVar) {
        this.refreshEndCallback = lVar;
    }
}
