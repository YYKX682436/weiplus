package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f111091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f111092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f111093g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.kr krVar, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f111090d = baseFinderFeed;
        this.f111091e = krVar;
        this.f111092f = menuItem;
        this.f111093g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f111090d;
        boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
        android.view.MenuItem menuItem = this.f111092f;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f111091e;
        if (isLiveFeed) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.ui.MMActivity mMActivity = krVar.f107230d;
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar).Nj(mMActivity, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), new com.tencent.mm.plugin.finder.feed.wp(baseFinderFeed));
        } else {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.ui.MMActivity mMActivity2 = krVar.f107230d;
            kotlin.jvm.internal.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar2).Mj(mMActivity2, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), null);
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.e(krVar.f107230d, userName, baseFinderFeed.getItemId(), this.f111093g);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.t1 t1Var = ml2.t1.f327973p;
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b92.d1) zbVar).rj(t1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        return jz5.f0.f302826a;
    }
}
