package com.tencent.mm.plugin.finder.live;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/FinderLiveRelatedLoader;", "Lcom/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader;", "<init>", "()V", "vd2/y2", "vd2/z2", "vd2/a3", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveRelatedLoader extends com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader {

    /* renamed from: o, reason: collision with root package name */
    public final vd2.a3 f111479o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f111480p;

    public FinderLiveRelatedLoader() {
        super(null);
        this.f111479o = new vd2.a3(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f111479o;
    }

    @Override // com.tencent.mm.plugin.finder.live.model.FinderLiveRelatedBaseLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        yz5.l lVar = this.f111726d;
        if (lVar != null) {
            lVar.invoke(response);
        }
        if (4 != response.getPullType()) {
            setInnerLoadingMore(false);
        }
    }
}
