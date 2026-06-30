package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderRelatedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/k7", "com/tencent/mm/plugin/finder/feed/model/m7", "com/tencent/mm/plugin/finder/feed/model/l7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRelatedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final int f107633d;

    /* renamed from: e, reason: collision with root package name */
    public final float f107634e;

    /* renamed from: f, reason: collision with root package name */
    public final float f107635f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.xu2 f107636g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f107637h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f107638i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRelatedLoader(int i17, int i18, float f17, float f18, r45.xu2 sectionInfo, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(sectionInfo, "sectionInfo");
        this.f107633d = i17;
        this.f107634e = f17;
        this.f107635f = f18;
        this.f107636g = sectionInfo;
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f107637h = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Hf).getValue()).r()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107637h ? new com.tencent.mm.plugin.finder.feed.model.l7(this) : new com.tencent.mm.plugin.finder.feed.model.m7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || response.getHasMore() || (lVar = this.f107638i) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
