package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fk extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f106749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f106750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f106751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.tl tlVar, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f106748d = baseFinderFeed;
        this.f106749e = tlVar;
        this.f106750f = menuItem;
        this.f106751g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106748d;
        boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
        android.view.MenuItem menuItem = this.f106750f;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f106749e;
        if (isLiveFeed) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Nj(tlVar.f109069d, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), new com.tencent.mm.plugin.finder.feed.ek(baseFinderFeed));
        } else {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Mj(tlVar.f109069d, userName, (db5.h4) menuItem, baseFinderFeed.getFeedObject(), null);
        }
        com.tencent.mm.plugin.finder.report.x3.f125432a.e(tlVar.f109069d, userName, baseFinderFeed.getItemId(), this.f106751g);
        return jz5.f0.f302826a;
    }
}
