package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cs extends com.tencent.mm.plugin.finder.feed.dj {

    /* renamed from: y, reason: collision with root package name */
    public fc2.d f106503y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(com.tencent.mm.ui.MMActivity context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "activity");
        this.f106503y = new com.tencent.mm.plugin.finder.report.w3(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f125421b;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
            return;
        }
        fc2.d dVar = this.f106503y;
        if (dVar != null) {
            n17.a(dVar);
        } else {
            kotlin.jvm.internal.o.o("observerForExposeReport");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            fc2.d dVar = this.f106503y;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n17.d(dVar);
        }
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }
}
