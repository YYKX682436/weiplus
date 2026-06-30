package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f108607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f108608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.c0 c0Var, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f108606d = baseFinderFeed;
        this.f108607e = c0Var;
        this.f108608f = menuItem;
        this.f108609g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108606d;
        boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
        android.view.MenuItem menuItem = this.f108608f;
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f108607e;
        if (isLiveFeed) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Nj(c0Var.f106421d, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), new com.tencent.mm.plugin.finder.feed.n(baseFinderFeed));
        } else {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Mj(c0Var.f106421d, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), null);
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.e(c0Var.f106421d, userName, baseFinderFeed.getItemId(), this.f108609g);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.t1 t1Var = ml2.t1.f327973p;
        com.tencent.mm.ui.MMActivity activity = c0Var.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b92.d1) zbVar).rj(t1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        return jz5.f0.f302826a;
    }
}
