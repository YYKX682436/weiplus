package n84;

/* loaded from: classes4.dex */
public class j implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.c f417213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 f417214e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261, kk4.c cVar) {
        this.f417214e = c17785x8a47a261;
        this.f417213d = cVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChange", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2");
        n84.w.e("AdAlphaPlayerView", "onStateChange() called with: preState = [" + i17 + "], curState = [" + i18 + "]");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = this.f417214e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.a(c17785x8a47a261) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.a(c17785x8a47a261)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayerStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayerStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        }
        if (i18 == 4) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                boolean z17 = c17785x8a47a261.f245019o;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                if (z17) {
                    ((kk4.f0) this.f417213d).mo100975x68ac462();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAlphaPlayerView", "try start error", th6);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChange", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2");
    }
}
