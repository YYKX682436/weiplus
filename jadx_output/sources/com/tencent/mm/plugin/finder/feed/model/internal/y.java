package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public abstract class y extends com.tencent.mm.plugin.finder.feed.model.internal.p0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f108068d = new java.util.LinkedHashMap();

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            gm0.j1.d().a(((java.lang.Number) it.next()).intValue(), this);
        }
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var);

    public abstract com.tencent.mm.modelbase.m1 c();

    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        return new com.tencent.mm.plugin.finder.feed.model.internal.b0();
    }

    public abstract com.tencent.mm.modelbase.m1 d();

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            gm0.j1.d().q(((java.lang.Number) it.next()).intValue(), this);
        }
    }

    public abstract java.util.List e();

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj == null || !(obj instanceof com.tencent.mm.modelbase.m1)) {
            return;
        }
        this.f108068d.put(obj, callback);
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) obj);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit = callInit();
        callInit.setPullType(1000);
        callback.onFetchDone(callInit);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, c(), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchPreload(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, d(), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, d(), callback, false, 4, null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        java.util.Map map = this.f108068d;
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var = (com.tencent.mm.plugin.finder.feed.model.internal.n0) ((java.util.LinkedHashMap) map).get(scene);
        if (n0Var != null) {
            map.remove(scene);
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse b17 = b(i17, i18, str, scene);
            if (b17 != null) {
                n0Var.onFetchDone(b17);
            }
        }
    }
}
