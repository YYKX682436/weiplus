package com.tencent.mm.plugin.finder.gallery;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/gallery/r", "com/tencent/mm/plugin/finder/gallery/s", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderGalleryLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final r45.c41 f111336d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f111337e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f111338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderGalleryLoader(r45.c41 cgiParams, r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(cgiParams, "cgiParams");
        this.f111336d = cgiParams;
        this.f111337e = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.gallery.r(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.gallery.u(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return this.f111336d.getInteger(0) == 5;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) this.f111336d.getCustom(3);
        if (isRefreshOperation(response) && finderObject != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 256));
            p17.d1(true);
            java.util.List incrementList = response.getIncrementList();
            java.util.ArrayList arrayList = incrementList instanceof java.util.ArrayList ? (java.util.ArrayList) incrementList : null;
            if (arrayList != null) {
                arrayList.add(0, p17);
            }
        }
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        response.getHasMore();
        yz5.l lVar = this.f111338f;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }
}
