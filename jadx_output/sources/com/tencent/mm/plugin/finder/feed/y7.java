package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f111150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f111151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f111152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(boolean z17, com.tencent.mm.plugin.finder.feed.f8 f8Var, yz5.l lVar) {
        super(1);
        this.f111150d = z17;
        this.f111151e = f8Var;
        this.f111152f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "refreshData " + this.f111150d);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String userName = this.f111151e.a().getUserName();
        this.f111151e.getClass();
        com.tencent.mm.plugin.finder.view.p9 p9Var = com.tencent.mm.plugin.finder.view.FinderFavDrawer.B;
        new db2.h4(userName, 0, this.f111151e.f106712f, this.f111151e.a().getId(), 2).l().q(new com.tencent.mm.plugin.finder.feed.v7(this.f111151e)).h(new com.tencent.mm.plugin.finder.feed.x7(this.f111152f, this.f111151e, this.f111150d, currentTimeMillis, task)).f(this.f111151e);
        return jz5.f0.f302826a;
    }
}
