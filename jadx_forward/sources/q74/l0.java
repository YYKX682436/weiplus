package q74;

/* loaded from: classes4.dex */
public final class l0 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q74.s0 f442008a;

    public l0(q74.s0 s0Var) {
        this.f442008a = s0Var;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$mPagFlushListener$1");
        q74.s0 s0Var = this.f442008a;
        if (q74.s0.d(s0Var) != null) {
            android.widget.ImageView d17 = q74.s0.d(s0Var);
            boolean z17 = false;
            if (d17 != null && d17.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "mThumbIv need to be gone");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPagView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = s0Var.f442039o;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPagView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                if (c22789xd23e9a9b != null) {
                    c22789xd23e9a9b.j(this);
                }
                android.widget.ImageView d18 = q74.s0.d(s0Var);
                if (d18 != null) {
                    d18.clearAnimation();
                }
                android.widget.ImageView d19 = q74.s0.d(s0Var);
                if (d19 != null) {
                    d19.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$mPagFlushListener$1");
    }
}
