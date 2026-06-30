package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class b5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102029b;

    public b5(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.l lVar) {
        this.f102028a = baseFinderFeed;
        this.f102029b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String obj2 = r26.n0.u0(this.f102028a.getFeedObject().getNotShareMsg()).toString();
        com.tencent.mm.plugin.finder.assist.c5 c5Var = com.tencent.mm.plugin.finder.assist.c5.f102058a;
        com.tencent.mars.xlog.Log.i("Finder.ObjectStatusRefresher", "[refreshObjectStatus] tips=" + obj2);
        this.f102029b.invoke(c5Var.a(obj2));
        return jz5.f0.f302826a;
    }
}
