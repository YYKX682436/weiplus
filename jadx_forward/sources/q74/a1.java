package q74;

/* loaded from: classes4.dex */
public class a1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f441935a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f441936b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f441937c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f441938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q74.b1 f441939e;

    public a1(q74.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, int i17) {
        this.f441939e = b1Var;
        this.f441938d = -1;
        this.f441935a = c17983xb14a9c8d;
        this.f441936b = c17808x428917d3;
        this.f441938d = java.lang.Math.max(i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f441936b;
            if (c17808x428917d3 != null) {
                int p17 = c17808x428917d3.p();
                this.f441938d = p17;
                q74.b0 b0Var = this.f441939e.f441955e;
                if (b0Var != null && (c17983xb14a9c8d = this.f441935a) != null) {
                    b0Var.l(p17, c17983xb14a9c8d.m70621x51e8b0a());
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f441936b;
            if (c17808x428917d3 != null) {
                int p17 = c17808x428917d3.p();
                if (p17 != this.f441938d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
                    return;
                }
                if (this.f441939e.f441955e != null && (c17983xb14a9c8d = this.f441935a) != null) {
                    java.lang.Object tag = c17983xb14a9c8d.getTag(com.p314xaae8f345.mm.R.id.f568517n33);
                    if ((tag instanceof java.lang.Integer) && ((java.lang.Integer) tag).intValue() == 1) {
                        this.f441935a.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 0);
                        this.f441937c = false;
                        q74.b0 b0Var = this.f441939e.f441955e;
                        b0Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        q74.a0 d17 = b0Var.d(p17);
                        if (d17 != null) {
                            d17.f441929i += d17.f441932l;
                            d17.f441932l = 0;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                    }
                    this.f441939e.f441955e.k(p17, i17);
                    int i18 = i17 / 1000;
                    if (!this.f441937c && i18 >= 1) {
                        this.f441937c = true;
                        q74.b0 b0Var2 = this.f441939e.f441955e;
                        b0Var2.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        q74.a0 d18 = b0Var2.d(p17);
                        if (d18 != null) {
                            d18.f441927g++;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    public void mo70662xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        try {
            this.f441937c = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f441936b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f441935a;
            q74.b1 b1Var = this.f441939e;
            if (c17808x428917d3 != null) {
                int p17 = c17808x428917d3.p();
                q74.b0 b0Var = b1Var.f441955e;
                if (b0Var != null && c17983xb14a9c8d != null) {
                    b0Var.i(p17);
                    b1Var.f441955e.l(p17, c17983xb14a9c8d.m70621x51e8b0a());
                }
            }
            b1Var.g(c17808x428917d3, c17983xb14a9c8d);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
    }
}
