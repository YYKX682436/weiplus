package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderColumnFeedListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/r", "com/tencent/mm/plugin/finder/feed/model/s", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderColumnFeedListLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107395d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f107396e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f107397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderColumnFeedListLoader(androidx.appcompat.app.AppCompatActivity context, r45.qt2 qt2Var, java.lang.String feedVMKey) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedVMKey, "feedVMKey");
        this.f107395d = feedVMKey;
        this.f107396e = new java.lang.Object();
        com.tencent.mars.xlog.Log.i(getF123427d(), "FinderGlobalVMStore getViewModel init:".concat(feedVMKey));
        ey2.u uVar = (ey2.u) ey2.l0.f257422a.a(feedVMKey, ey2.u.class, null);
        if (uVar != null) {
            uVar.f257542x.observe(context, new com.tencent.mm.plugin.finder.feed.model.q(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        java.lang.String f123427d = getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderGlobalVMStore getViewModel createDataFetch:");
        java.lang.String str = this.f107395d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        return new com.tencent.mm.plugin.finder.feed.model.r(this, (ey2.u) ey2.l0.f257422a.a(str, ey2.u.class, null));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || (lVar = this.f107397f) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
