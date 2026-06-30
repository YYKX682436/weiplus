package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class o10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ActivityFeedRemoveEvent f108614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f108615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent, com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(0);
        this.f108614d = activityFeedRemoveEvent;
        this.f108615e = r10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader;
        am.f fVar = this.f108614d.f53966g;
        long j17 = fVar.f6619a;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f108615e;
        if (j17 != 0) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = r10Var.f107156e;
            baseFinderFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader : null;
            if (baseFinderFeedLoader != null) {
                baseFinderFeedLoader.remove(j17, true);
            }
        } else {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = r10Var.f107156e;
            baseFinderFeedLoader = baseFeedLoader2 instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader2 : null;
            if (baseFinderFeedLoader != null) {
                baseFinderFeedLoader.removeByLocalId(fVar.f6620b, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
