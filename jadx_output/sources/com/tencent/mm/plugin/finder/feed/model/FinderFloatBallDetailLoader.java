package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFloatBallDetailLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/b2", "com/tencent/mm/plugin/finder/feed/model/c2", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFloatBallDetailLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public long f107453d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107454e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f107455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFloatBallDetailLoader(r45.qt2 contextObj) {
        super(contextObj);
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f107454e = "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.b2(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.e2(this);
    }
}
