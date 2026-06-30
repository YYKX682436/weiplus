package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.t8 f108978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.tencent.mm.plugin.finder.feed.t8 t8Var) {
        super(0);
        this.f108978d = t8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        com.tencent.mm.view.RefreshLoadMoreLayout o17;
        com.tencent.mm.plugin.finder.feed.t8 t8Var = this.f108978d;
        if (t8Var.N && t8Var.H && (i0Var = t8Var.f106424g) != null && (o17 = i0Var.o()) != null) {
            o17.P(0);
        }
        com.tencent.mm.plugin.finder.report.j0.f125083a.e(t8Var.f106421d.hashCode());
        if (t8Var.H) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = t8Var.f106570t;
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader : null;
            if (finderFeedShareRelativeListLoader != null) {
                finderFeedShareRelativeListLoader.f107433d = t8Var.C;
                finderFeedShareRelativeListLoader.f107449w = t8Var.T;
                finderFeedShareRelativeListLoader.f107450x = t8Var.U;
            }
            if (baseFeedLoader != null) {
                baseFeedLoader.requestRefresh();
            }
        } else {
            com.tencent.mm.plugin.finder.report.v1.o(com.tencent.mm.plugin.finder.report.v1.f125393a, t8Var.f106427m, false, null, false, 0L, false, 60, null);
            com.tencent.mm.plugin.finder.feed.i0 i0Var2 = t8Var.f106424g;
            com.tencent.mm.view.RefreshLoadMoreLayout o18 = i0Var2 != null ? i0Var2.o() : null;
            if (o18 != null) {
                o18.setEnableLoadMore(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
