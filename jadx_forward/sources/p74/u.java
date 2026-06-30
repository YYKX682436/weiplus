package p74;

/* loaded from: classes4.dex */
public final class u implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallbackEx {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f434129a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f434130b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f434131c;

    /* renamed from: d, reason: collision with root package name */
    public int f434132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p74.w f434133e;

    public u(p74.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 mCardLayoutManager, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d mBindingVideoView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mCardLayoutManager, "mCardLayoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mBindingVideoView, "mBindingVideoView");
        this.f434133e = wVar;
        this.f434129a = mCardLayoutManager;
        this.f434130b = mBindingVideoView;
        this.f434132d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f434129a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f434133e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int p17 = c17808x428917d3.p();
            this.f434132d = p17;
            if (p74.w.e(wVar) != null && (c17983xb14a9c8d = this.f434130b) != null) {
                p74.w.e(wVar).l(p17, c17983xb14a9c8d.m70621x51e8b0a());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.m(c17808x428917d3, p17, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        java.lang.Object m143895xf1229813;
        int p17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f434133e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p17 = this.f434129a.p();
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p17 != this.f434132d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
            return;
        }
        if (p74.w.e(wVar) != null && (c17983xb14a9c8d = this.f434130b) != null) {
            java.lang.Object tag = c17983xb14a9c8d.getTag(com.p314xaae8f345.mm.R.id.f568517n33);
            if ((tag instanceof java.lang.Integer) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, 1)) {
                c17983xb14a9c8d.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 0);
                this.f434131c = false;
                q74.b0 e17 = p74.w.e(wVar);
                e17.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = e17.d(p17);
                if (d17 != null) {
                    d17.f441929i += d17.f441932l;
                    d17.f441932l = 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            p74.w.e(wVar).k(p17, i17);
            int i18 = i17 / 1000;
            if (!this.f434131c && i18 >= 1) {
                this.f434131c = true;
                q74.b0 e18 = p74.w.e(wVar);
                e18.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d18 = e18.d(p17);
                if (d18 != null) {
                    d18.f441927g++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    public void mo70662xa6db431b() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f434129a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f434133e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHasUserInteraction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            boolean z17 = wVar.f434149j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHasUserInteraction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            this.f434131c = false;
            int p17 = c17808x428917d3.p();
            q74.b0 e17 = p74.w.e(wVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f434130b;
            if (e17 != null && c17983xb14a9c8d != null) {
                p74.w.e(wVar).i(p17);
                p74.w.e(wVar).l(p17, c17983xb14a9c8d.m70621x51e8b0a());
            }
            p74.w.f(wVar, c17808x428917d3, c17983xb14a9c8d, p17);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallbackEx
    /* renamed from: onPause */
    public void mo70663xb01dfb57() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f434129a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
        p74.w wVar = this.f434133e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int p17 = c17808x428917d3.p();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.m(c17808x428917d3, p17, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updatePlayButtonState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.AdSlideCardVideoPlayHelper", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$CardVideoViewCallback");
    }
}
