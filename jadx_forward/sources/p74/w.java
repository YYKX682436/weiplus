package p74;

/* loaded from: classes4.dex */
public final class w implements z84.c {

    /* renamed from: a, reason: collision with root package name */
    public final z74.i f434140a;

    /* renamed from: b, reason: collision with root package name */
    public final q74.b0 f434141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f434142c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f434143d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f434144e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f434145f;

    /* renamed from: g, reason: collision with root package name */
    public int f434146g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f434147h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f434149j;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f434148i = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public boolean f434150k = true;

    public w(z74.i iVar, q74.b0 b0Var, int i17) {
        this.f434140a = iVar;
        this.f434141b = b0Var;
        this.f434142c = i17;
    }

    public static final /* synthetic */ q74.b0 e(p74.w wVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdChannelData$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        q74.b0 b0Var = wVar.f434141b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdChannelData$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        return b0Var;
    }

    public static final void f(p74.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        wVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 u17 = c17808x428917d3.u();
        boolean z17 = u17 != null && i17 >= 0 && i17 == u17.mo1894x7e414b06() - 1;
        if (wVar.f434143d || wVar.f434149j || i17 >= 2 || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onVideoCompleted, replay video, isPressed=" + wVar.f434143d + ", hasUserInteraction=" + wVar.f434149j + ", position=" + i17 + ", isLast=" + z17);
            if (c17983xb14a9c8d != null) {
                c17983xb14a9c8d.M(0, true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onVideoCompleted, scroll to next item");
            c17808x428917d3.A();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        q74.b0 b0Var = this.f434141b;
        if (b0Var != null) {
            try {
                b0Var.h(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "onVisibleItemChanged error: " + th6.getMessage());
            }
        }
        if (this.f434149j && b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            b0Var.f441949i++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        if (i18 >= 0 && i18 != i17) {
            m(c17808x428917d3, i18, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        i(c17808x428917d3, i17, false, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onScrollStateChanged: state=" + (i17 != 0 ? i17 != 1 ? i17 != 2 ? "UNKNOWN" : "SETTLING" : "DRAGGING" : "IDLE") + " (" + i17 + "), mHasUserInteraction=" + this.f434149j);
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                this.f434143d = true;
                this.f434149j = true;
                if (c17808x428917d3 != null) {
                    c17808x428917d3.o();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                this.f434143d = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        try {
            q74.b0 b0Var = this.f434141b;
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataAutoSlideInCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = b0Var.d(i17);
                if (d17 != null) {
                    d17.f441924d++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataAutoSlideInCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    @Override // z84.c
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "onNotifyActionUp: targetPosition=" + i17 + ", setting mHasUserInteraction=true");
        this.f434149j = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    public final s34.x0 g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        s34.x0 x0Var = null;
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 u17 = c17808x428917d3.u();
            if (u17 instanceof p74.c) {
                p74.c cVar = (p74.c) u17;
                cVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                if (!cVar.f434056g.isEmpty() && i17 >= 0 && i17 < cVar.f434056g.size()) {
                    s34.x0 x0Var2 = (s34.x0) cVar.f434056g.get(i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                    x0Var = x0Var2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "getAdSlideFullCardItemInfo error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        return x0Var;
    }

    public final p74.g h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        p74.g gVar = null;
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 v17 = c17808x428917d3.v(i17);
            if (v17 instanceof p74.g) {
                gVar = (p74.g) v17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "getCardViewHolder error: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        return gVar;
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17, boolean z17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        if (c17808x428917d3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f434147h;
        s34.x0 g17 = g(c17808x428917d3, i17);
        p74.g h17 = h(c17808x428917d3, i17);
        if (c17933xe8d1b226 == null || g17 == null || h17 == null || h17.k() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdSlideCardVideoPlayHelper", "playInner, resInfo or view holder is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        c17808x428917d3.o();
        if (!this.f434144e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "playInner, not ready to play");
        } else if (g17.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "playInner, play video at position=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            android.os.Handler handler = this.f434148i;
            handler.removeCallbacksAndMessages(null);
            android.widget.FrameLayout k17 = h17.k();
            if (k17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            } else {
                if (this.f434142c != 0 && i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_slide_full_card_play_video_in_sns_comment_delay, 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "support sns comment play video delay, value is " + Ni);
                    boolean z18 = Ni > 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                    if (z18) {
                        if (this.f434145f) {
                            j(c17808x428917d3, k17, c17933xe8d1b226, g17.f484361e, z17);
                        } else {
                            handler.postDelayed(new p74.v(this, k17, c17808x428917d3, c17933xe8d1b226, g17, z17), 600L);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                    }
                }
                this.f434145f = true;
                j(c17808x428917d3, k17, c17933xe8d1b226, g17.f484361e, z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "playInner, play image at position=" + i17);
            if (this.f434149j || c17808x428917d3.w()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "skip image auto scroll, hasUserInteraction=" + this.f434149j + ", position=" + i17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f434147h;
                long j17 = (c17933xe8d1b2262 == null || (m70354x74235b3e = c17933xe8d1b2262.m70354x74235b3e()) == null || (a1Var = m70354x74235b3e.f38210x95847c91) == null) ? 0L : a1Var.f484101e;
                if (j17 == 0) {
                    j17 = 3000;
                }
                c17808x428917d3.B(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "schedule image auto scroll in " + j17 + "ms");
            }
            z74.i iVar = this.f434140a;
            if (iVar != null) {
                iVar.d();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 r8, android.view.ViewGroup r9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r10, r45.jj4 r11, boolean r12) {
        /*
            r7 = this;
            java.lang.String r0 = "playVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            z74.i r2 = r7.f434140a
            if (r2 == 0) goto L7f
            if (r9 == 0) goto L7f
            if (r10 == 0) goto L7f
            if (r11 != 0) goto L13
            goto L7f
        L13:
            xd4.j0 r3 = new xd4.j0
            r3.<init>()
            r3.f535192a = r11
            java.lang.String r4 = r10.m70363x51f8f990()
            r3.f535193b = r4
            long r4 = r10.f68891x29d1292e
            java.lang.String r4 = ca4.z0.t0(r4)
            r3.f535195d = r4
            int r10 = r10.m70357x3fdd41df()
            r3.f535194c = r10
            android.content.Context r10 = r9.getContext()
            java.lang.String r4 = r11.f459388d
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r10 = r2.a(r10, r4)
            java.lang.String r4 = "getVideoViewInContainer"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            boolean r5 = a84.y0.e(r9)
            if (r5 == 0) goto L4f
            r5 = 0
            android.view.View r5 = r9.getChildAt(r5)
            boolean r6 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
            if (r6 == 0) goto L4f
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r5
            goto L50
        L4f:
            r5 = 0
        L50:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            if (r5 != 0) goto L59
            r7.k(r10, r8, r9, r3)
            goto L7b
        L59:
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r10)
            if (r4 == 0) goto L75
            int r9 = r8.p()
            r10 = 1
            r7.m(r8, r9, r10)
            if (r12 == 0) goto L6f
            java.lang.String r8 = r11.f459388d
            r2.f(r5, r8)
            goto L7b
        L6f:
            java.lang.String r8 = r11.f459388d
            r2.g(r5, r8)
            goto L7b
        L75:
            a84.y0.c(r9)
            r7.k(r10, r8, r9, r3)
        L7b:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L7f:
            java.lang.String r8 = "SnsAd.AdSlideCardVideoPlayHelper"
            java.lang.String r9 = "playVideo, invalid params"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p74.w.j(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, android.view.ViewGroup, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }

    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        z74.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        if (c17983xb14a9c8d != null && (iVar = this.f434140a) != null) {
            j0Var.f535193b += '_' + j0Var.f535192a.f459388d + '_';
            a84.y0.i(c17983xb14a9c8d);
            a84.y0.o(c17983xb14a9c8d, -1, -1);
            a84.y0.b(viewGroup, c17983xb14a9c8d, 0);
            a84.y0.p(c17983xb14a9c8d, true);
            c17983xb14a9c8d.m70653xee64f44b(android.widget.ImageView.ScaleType.CENTER_CROP);
            c17983xb14a9c8d.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            c17983xb14a9c8d.m70655x360a109e(new p74.u(this, c17808x428917d3, c17983xb14a9c8d, c17808x428917d3.p()));
            iVar.h(c17983xb14a9c8d, j0Var, j0Var.f535195d, j0Var.f535192a.f459388d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    public final void l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideCardVideoPlayHelper", "triggerPlayByTimeline is called!");
        this.f434144e = true;
        if (c17808x428917d3 != null) {
            try {
                int p17 = c17808x428917d3.p();
                if (p17 >= 0) {
                    i(c17808x428917d3, p17, true, 2);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideCardVideoPlayHelper", "triggerPlayByTimeline error: " + th6.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17, boolean z17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (c17808x428917d3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        s34.x0 g17 = g(c17808x428917d3, i17);
        boolean z18 = false;
        if (g17 != null && g17.a()) {
            z18 = true;
        }
        if (!z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 u17 = c17808x428917d3.u();
        if (u17 instanceof p74.c) {
            ((p74.c) u17).x(i17, z17);
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
    }
}
