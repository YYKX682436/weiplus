package u84;

/* loaded from: classes4.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f507204d;

    public t1(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f507204d = c22789xd23e9a9b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$doPAGPlaying$1");
        try {
            this.f507204d.g();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdInteractionTagView_pagViewPlay", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$doPAGPlaying$1");
    }
}
