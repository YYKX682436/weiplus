package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public abstract class x extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {
    private im5.c lifeCycleKeeper = new im5.c();
    private final kotlinx.coroutines.y0 workerScope = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
    private final kotlinx.coroutines.y0 mainScope = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.lifeCycleKeeper = new im5.c();
    }

    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        return new com.tencent.mm.plugin.finder.feed.model.internal.b0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        this.lifeCycleKeeper.dead();
        kotlinx.coroutines.z0.e(this.workerScope, null, 1, null);
        kotlinx.coroutines.z0.e(this.mainScope, null, 1, null);
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar);

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj == null || !(obj instanceof com.tencent.mm.modelbase.i)) {
            return;
        }
        pq5.g f17 = ((com.tencent.mm.modelbase.i) obj).l().f(this.lifeCycleKeeper);
        final com.tencent.mm.plugin.finder.feed.model.internal.v vVar = new com.tencent.mm.plugin.finder.feed.model.internal.v(this, obj, callback);
        f17.K(new gm5.a(vVar) { // from class: com.tencent.mm.plugin.finder.feed.model.internal.w

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.l f108062a;

            {
                kotlin.jvm.internal.o.g(vVar, "function");
                this.f108062a = vVar;
            }

            @Override // gm5.a
            public final /* synthetic */ java.lang.Object call(java.lang.Object obj2) {
                return this.f108062a.invoke(obj2);
            }
        });
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (genInitCgi() != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, genInitCgi(), callback, false, 4, null);
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit = callInit();
        callInit.setPullType(1000);
        callback.onFetchDone(callInit);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, genLoadMoreCgi(), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchPreload(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, genRefreshCgi(), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, genRefreshCgi(), callback, false, 4, null);
    }

    public com.tencent.mm.modelbase.i genInitCgi() {
        return null;
    }

    public abstract com.tencent.mm.modelbase.i genLoadMoreCgi();

    public abstract com.tencent.mm.modelbase.i genRefreshCgi();

    public final im5.c getLifeCycleKeeper() {
        return this.lifeCycleKeeper;
    }

    public final kotlinx.coroutines.y0 getMainScope() {
        return this.mainScope;
    }

    public final kotlinx.coroutines.y0 getWorkerScope() {
        return this.workerScope;
    }

    public final void setLifeCycleKeeper(im5.c cVar) {
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        this.lifeCycleKeeper = cVar;
    }
}
