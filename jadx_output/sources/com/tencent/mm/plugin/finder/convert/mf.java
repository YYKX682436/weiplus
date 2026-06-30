package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class mf extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103997c;

    public mf(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.convert.zf zfVar, android.content.Context context) {
        this.f103995a = finderItem;
        this.f103996b = zfVar;
        this.f103997c = context;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedLiveExpose isExposed ");
        sb6.append(z17);
        sb6.append(" feedId: ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f103995a;
        sb6.append(finderItem.getId());
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f103996b;
        if (!z17) {
            zfVar.f105114z1.dead();
            return;
        }
        zfVar.f105114z1.alive();
        zfVar.Z1(finderItem, 68, this.f103997c);
        com.tencent.mars.xlog.Log.i(zfVar.f105110p1, "feedLiveExpose true curScrollFeedId:" + zfVar.f105113y1 + " exposeFeedId: " + finderItem.getId());
        if (zfVar.f105113y1 == finderItem.getId()) {
            com.tencent.mm.plugin.finder.convert.zf zfVar2 = this.f103996b;
            long j19 = zfVar2.f105113y1;
            r45.nw1 liveInfo = finderItem.getFeedObject().getLiveInfo();
            com.tencent.mm.plugin.finder.convert.zf.Q1(zfVar2, j19, true, liveInfo != null ? java.lang.Integer.valueOf(liveInfo.getInteger(2)) : null, null, 8, null);
        }
    }
}
