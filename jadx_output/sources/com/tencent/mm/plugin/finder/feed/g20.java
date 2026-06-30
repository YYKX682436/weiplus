package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class g20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ActivityFeedRemoveEvent f106816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.j20 f106817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g20(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent, com.tencent.mm.plugin.finder.feed.j20 j20Var) {
        super(0);
        this.f106816d = activityFeedRemoveEvent;
        this.f106817e = j20Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader;
        am.f fVar = this.f106816d.f53966g;
        long j17 = fVar.f6619a;
        com.tencent.mm.plugin.finder.feed.j20 j20Var = this.f106817e;
        if (j17 != 0) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = j20Var.f106570t;
            baseFinderFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader : null;
            if (baseFinderFeedLoader != null) {
                baseFinderFeedLoader.remove(j17, true);
            }
        } else {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = j20Var.f106570t;
            baseFinderFeedLoader = baseFeedLoader2 instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader2 : null;
            if (baseFinderFeedLoader != null) {
                baseFinderFeedLoader.removeByLocalId(fVar.f6620b, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
