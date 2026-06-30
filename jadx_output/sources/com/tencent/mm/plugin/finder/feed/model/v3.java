package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class v3 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final ey2.u f108412d;

    public v3(com.tencent.mm.plugin.finder.feed.model.FinderLiveRelatedFeedColumnLoader finderLiveRelatedFeedColumnLoader, ey2.u uVar) {
        this.f108412d = uVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean z18 = false;
        ey2.u uVar = this.f108412d;
        if (uVar != null && uVar.Q6()) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.model.u3(callback));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }
}
