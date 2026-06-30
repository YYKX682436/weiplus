package q74;

/* loaded from: classes4.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f442019d;

    public p0(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f442019d = c22789xd23e9a9b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$pagPlaying$1$1");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f442019d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "post pagPlaying");
            c22789xd23e9a9b.g();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrl_pagViewPlay", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$pagPlaying$1$1");
    }
}
