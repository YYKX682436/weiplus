package com.tencent.mm.plugin.finder.drama.timeline;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "ac2/z", "ac2/a0", "ac2/b0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderNativeDramaTimelineFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final long f105289d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f105290e;

    /* renamed from: f, reason: collision with root package name */
    public final int f105291f;

    /* renamed from: g, reason: collision with root package name */
    public final int f105292g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f105293h;

    /* renamed from: i, reason: collision with root package name */
    public ac2.z f105294i;

    /* renamed from: m, reason: collision with root package name */
    public ac2.z f105295m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.tj2 f105296n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f105297o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f105298p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f105299q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNativeDramaTimelineFeedLoader(r45.qt2 qt2Var, long j17, java.lang.String str, int i17, int i18, java.util.List loaderInfoList, ac2.z upLoaderInfo, ac2.z downLoaderInfo, r45.tj2 tj2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(loaderInfoList, "loaderInfoList");
        kotlin.jvm.internal.o.g(upLoaderInfo, "upLoaderInfo");
        kotlin.jvm.internal.o.g(downLoaderInfo, "downLoaderInfo");
        this.f105289d = j17;
        this.f105290e = str;
        this.f105291f = i17;
        this.f105292g = i18;
        this.f105293h = loaderInfoList;
        this.f105294i = upLoaderInfo;
        this.f105295m = downLoaderInfo;
        this.f105296n = tj2Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new ac2.b0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new ac2.c0(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || !(response instanceof ac2.a0) || (lVar = this.f105298p) == null) {
            return;
        }
        lVar.invoke(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void requestJumper(java.util.List itemList, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        xc2.k0 k0Var = (xc2.k0) a17;
        r45.qt2 contextObj = getContextObj();
        xc2.k0.f7(k0Var, itemList, contextObj != null ? contextObj.getInteger(5) : 0, getContextObj(), 0, gVar, this.f105296n, 8, null);
    }
}
