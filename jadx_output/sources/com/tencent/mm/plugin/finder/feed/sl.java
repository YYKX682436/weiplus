package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108997d;

    public sl(com.tencent.mm.plugin.finder.feed.tl tlVar) {
        this.f108997d = tlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108997d;
        if (tlVar.g().e().getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "check2Play: video is ended");
            return;
        }
        java.lang.Object obj = tlVar.f().f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) tlVar.f().p(com.tencent.mm.R.id.e_k)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "check2Play: play trigger, id=".concat(pm0.v.u(u1Var.getItemId())));
        cw2.v9.n(finderVideoLayout, 0, null, null, 7, null);
    }
}
