package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class px extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f108751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.pz pzVar, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f108749d = baseFinderFeed;
        this.f108750e = pzVar;
        this.f108751f = menuItem;
        this.f108752g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108749d;
        boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
        android.view.MenuItem menuItem = this.f108751f;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f108750e;
        if (isLiveFeed) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar).Nj(mMActivity, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), new com.tencent.mm.plugin.finder.feed.nx(baseFinderFeed));
        } else {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.ui.MMActivity mMActivity2 = pzVar.f108755g;
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar2).Mj(mMActivity2, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), new com.tencent.mm.plugin.finder.feed.ox(pzVar));
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.e(pzVar.f108755g, userName, baseFinderFeed.getItemId(), this.f108752g);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.t1 t1Var = ml2.t1.f327973p;
        com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b92.d1) zbVar).rj(t1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        return jz5.f0.f302826a;
    }
}
