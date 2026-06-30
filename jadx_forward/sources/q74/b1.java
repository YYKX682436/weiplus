package q74;

/* loaded from: classes4.dex */
public class b1 implements z84.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f441951a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f441952b;

    /* renamed from: c, reason: collision with root package name */
    public final z74.i f441953c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f441954d;

    /* renamed from: e, reason: collision with root package name */
    public final q74.b0 f441955e;

    /* renamed from: g, reason: collision with root package name */
    public q74.d0 f441957g;

    /* renamed from: i, reason: collision with root package name */
    public final int f441959i;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441956f = true;

    /* renamed from: h, reason: collision with root package name */
    public int f441958h = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f441960j = false;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.Handler f441961k = new android.os.Handler(android.os.Looper.getMainLooper());

    public b1(z74.i iVar, q74.b0 b0Var, int i17) {
        this.f441953c = iVar;
        this.f441955e = b0Var;
        this.f441959i = i17;
    }

    @Override // z84.c
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            q74.b0 b0Var = this.f441955e;
            if (b0Var != null) {
                b0Var.h(i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            h(c17808x428917d3, i17, false, i19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    @Override // z84.c
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.f441951a = true;
                if (c17808x428917d3 != null) {
                    c17808x428917d3.o();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.f441951a = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    @Override // z84.c
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            q74.b0 b0Var = this.f441955e;
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    @Override // z84.c
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (this.f441957g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onNotifyActionUp, do notifyBindCurrentProductViewData, targetPosition is " + i17);
            this.f441957g.b(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    public final s34.x0 e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (c17808x428917d3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return null;
        }
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 u17 = c17808x428917d3.u();
            if (u17 instanceof q74.x0) {
                s34.x0 B = ((q74.x0) u17).B(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                return B;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSlideFullCardItemInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        return null;
    }

    public final q74.y0 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (c17808x428917d3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return null;
        }
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 v17 = c17808x428917d3.v(i17);
            if (v17 instanceof q74.y0) {
                q74.y0 y0Var = (q74.y0) v17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                return y0Var;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        return null;
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (this.f441951a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onVideoCompleted, mIsContentPressed=true, replay");
            if (c17983xb14a9c8d != null) {
                c17983xb14a9c8d.M(0, true);
            }
        } else if (!this.f441956f) {
            boolean w17 = c17808x428917d3.w();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onVideoCompleted, autoLoop=false, isLastItem=" + w17);
            if (!w17) {
                c17808x428917d3.A();
            } else if (c17983xb14a9c8d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "onVideoCompleted, autoLoop=false, replay");
                c17983xb14a9c8d.M(0, true);
            }
        } else if (c17808x428917d3 != null) {
            c17808x428917d3.A();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, int i17, boolean z17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (c17808x428917d3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f441954d;
        s34.x0 e17 = e(c17808x428917d3, i17);
        q74.y0 f17 = f(c17808x428917d3, i17);
        if (c17933xe8d1b226 == null || e17 == null || f17 == null || f17.f442108h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardVideoPlayHelper", "playInner::the resInfo or view holder is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return;
        }
        if (this.f441957g != null && (i18 == 1 || i18 == 2 || i17 == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "playInner, do notifyBindCurrentProductViewData, cardItemPosition is " + i17 + ", itemVisibleChangedCallScene is " + i18);
            this.f441957g.b(i17);
        }
        c17808x428917d3.o();
        if (this.f441952b) {
            if (e17.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "playInner:: currentPosition is " + i17 + ", the res info is sight");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                android.os.Handler handler = this.f441961k;
                handler.removeCallbacksAndMessages(null);
                if (this.f441959i != 0 && i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                    int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_slide_full_card_play_video_in_sns_comment_delay, 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "support sns comment play video delay, value is " + Ni);
                    boolean z18 = Ni > 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportSnsCommentPlayVideoDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                    if (z18) {
                        if (this.f441960j) {
                            i(c17808x428917d3, f17.f442108h, c17933xe8d1b226, e17.f484361e, z17);
                        } else {
                            handler.postDelayed(new q74.z0(this, f17, c17808x428917d3, c17933xe8d1b226, e17, z17), 600L);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                    }
                }
                this.f441960j = true;
                i(c17808x428917d3, f17.f442108h, c17933xe8d1b226, e17.f484361e, z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPlayVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } else {
                if (this.f441956f || !c17808x428917d3.w()) {
                    c17808x428917d3.B(j(i17, e17) ? 5000L : 3000L);
                }
                z74.i iVar = this.f441953c;
                if (iVar != null) {
                    iVar.d();
                }
            }
            q74.d0 d0Var = this.f441957g;
            if (d0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                if (s34.z0.f484369c.a(d0Var.f441973a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = d0Var.f441973a;
                    s34.a1 a1Var2 = (c17933xe8d1b2262 == null || (m70354x74235b3e2 = c17933xe8d1b2262.m70354x74235b3e()) == null) ? null : m70354x74235b3e2.f38210x95847c91;
                    if (a1Var2 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = d0Var.f441973a;
                        s34.z0 z0Var = (c17933xe8d1b2263 == null || (m70354x74235b3e = c17933xe8d1b2263.m70354x74235b3e()) == null || (a1Var = m70354x74235b3e.f38210x95847c91) == null) ? null : a1Var.f484102f;
                        if (z0Var == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            int i19 = i17 % a1Var2.f484097a;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            q74.s0 s0Var = d0Var.f441976d;
                            if (i19 == 0 && z0Var.a()) {
                                s0Var.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagHasPlayFlag", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                boolean z19 = s0Var.f442046v;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagHasPlayFlag", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                if (!z19) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "onVideoPlaying, doPAGPlaying");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPAGPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                    p3325xe03a0797.p3326xc267989b.y0 y0Var = s0Var.f442044t;
                                    if (y0Var != null) {
                                        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                                        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new q74.i0(s0Var, null), 2, null);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            int i27 = i17 % a1Var2.f484097a;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardPosition", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
                            if (i27 == 0 && !z0Var.a()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "onVideoPlaying, doStatusTwoAnimNoPAG");
                                s0Var.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                                p3325xe03a0797.p3326xc267989b.y0 y0Var2 = s0Var.f442044t;
                                if (y0Var2 != null) {
                                    p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                                    p3325xe03a0797.p3326xc267989b.l.d(y0Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new q74.k0(s0Var, 0, null), 2, null);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameLogic", "onVideoPlaying, is not slideItemProduct type");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameLogic");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "playInner::the adSlide item is not able to play video");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playInner", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 r8, android.view.ViewGroup r9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r10, r45.jj4 r11, boolean r12) {
        /*
            r7 = this;
            java.lang.String r0 = "playVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            z74.i r2 = r7.f441953c
            if (r2 == 0) goto L78
            if (r8 == 0) goto L78
            if (r9 == 0) goto L78
            if (r10 == 0) goto L78
            if (r11 != 0) goto L15
            goto L78
        L15:
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
            if (r5 == 0) goto L54
            r5 = 0
            android.view.View r5 = r9.getChildAt(r5)
            boolean r6 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
            if (r6 == 0) goto L54
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) r5
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            goto L58
        L54:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            r5 = 0
        L58:
            if (r5 != 0) goto L5e
            r7.k(r10, r8, r9, r3)
            goto L74
        L5e:
            if (r5 != r10) goto L6e
            if (r12 == 0) goto L68
            java.lang.String r8 = r11.f459388d
            r2.f(r5, r8)
            goto L74
        L68:
            java.lang.String r8 = r11.f459388d
            r2.g(r5, r8)
            goto L74
        L6e:
            a84.y0.c(r9)
            r7.k(r10, r8, r9, r3)
        L74:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L78:
            java.lang.String r8 = "SnsAd.SlideFullCardVideoPlayHelper"
            java.lang.String r9 = "the input params are invalid!!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.b1.i(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, android.view.ViewGroup, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean):void");
    }

    public final boolean j(int i17, s34.x0 x0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        boolean z17 = false;
        if (i17 < 0 || x0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardVideoPlayHelper", "shouldUseLongTimeExposure, position < 0 or resInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return false;
        }
        if (!s34.z0.d(this.f441954d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "shouldUseLongTimeExposure, is not slideItemProduct type");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return false;
        }
        s34.z0 z0Var = this.f441954d.m70354x74235b3e().f38210x95847c91.f484102f;
        if (z0Var == null || !z0Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "shouldUseLongTimeExposure, adSlideItemProductInfo is null or not support PAG");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            return false;
        }
        if (i17 == 0 && !x0Var.a()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldUseLongTimeExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        return z17;
    }

    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, android.view.ViewGroup viewGroup, xd4.j0 j0Var) {
        z74.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (c17983xb14a9c8d != null && (iVar = this.f441953c) != null) {
            j0Var.f535193b = ca4.m0.e(j0Var.f535193b, j0Var.f535192a.f459388d + "_");
            a84.y0.i(c17983xb14a9c8d);
            a84.y0.o(c17983xb14a9c8d, -1, -1);
            a84.y0.b(viewGroup, c17983xb14a9c8d, 0);
            a84.y0.p(c17983xb14a9c8d, true);
            c17983xb14a9c8d.m70653xee64f44b(android.widget.ImageView.ScaleType.CENTER_CROP);
            c17983xb14a9c8d.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            c17983xb14a9c8d.m70655x360a109e(new q74.a1(this, c17808x428917d3, c17983xb14a9c8d, c17808x428917d3.p()));
            iVar.h(c17983xb14a9c8d, j0Var, j0Var.f535195d, j0Var.f535192a.f459388d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    public void l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.SlideFullCardVideoPlayHelper", "resumePlayByTimeline is called!");
        this.f441952b = true;
        if (c17808x428917d3 != null) {
            try {
                int p17 = c17808x428917d3.p();
                if (p17 >= 0) {
                    h(c17808x428917d3, p17, true, 2);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }
}
