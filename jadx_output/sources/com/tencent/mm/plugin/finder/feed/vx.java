package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vx implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f110934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f110935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110936f;

    public vx(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f110934d = pzVar;
        this.f110935e = baseFinderFeed;
        this.f110936f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 99) {
            com.tencent.mm.plugin.finder.feed.pz pzVar = this.f110934d;
            java.util.List<E> listOfType = pzVar.C.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f110935e;
            int indexOf = listOfType.indexOf(baseFinderFeed);
            if (indexOf >= 0) {
                bd2.r.f19284a.e(pzVar.f108755g, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), baseFinderFeed.getFeedObject().getObjectNonceId(), baseFinderFeed.getFeedObject().isLiveFeed(), this.f110936f);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", this.f110936f.itemView, null, 24617);
                return;
            }
            com.tencent.mars.xlog.Log.i(pzVar.U, "[not interested] pos error=" + indexOf + ", feed=" + baseFinderFeed + ", dataList=" + listOfType);
        }
    }
}
