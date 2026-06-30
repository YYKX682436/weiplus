package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.wb f110893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(com.tencent.mm.plugin.finder.feed.wb wbVar) {
        super(0);
        this.f110893d = wbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.wb wbVar = this.f110893d;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = wbVar.f106570t;
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader");
        ((com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader).f107433d = wbVar.f110966z;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = wbVar.f106570t;
        if (baseFeedLoader2 != null) {
            baseFeedLoader2.requestRefresh();
        }
        return jz5.f0.f302826a;
    }
}
