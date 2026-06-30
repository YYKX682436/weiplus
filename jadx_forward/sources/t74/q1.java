package t74;

/* loaded from: classes4.dex */
public final class q1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f497761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f497763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 f497764d;

    public q1(t74.w1 w1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807) {
        this.f497762b = w1Var;
        this.f497763c = i17;
        this.f497764d = c18390xafce807;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
        t74.i2 R = t74.w1.R(this.f497762b);
        if (R != null) {
            int m70621x51e8b0a = this.f497764d.m70621x51e8b0a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            if (this.f497763c == 0) {
                t74.h2 h2Var = R.f497699i;
                h2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var.f497686f = m70621x51e8b0a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            } else {
                t74.h2 h2Var2 = R.f497700j;
                h2Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var2.f497686f = m70621x51e8b0a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
        int i18 = i17 / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.f497764d;
        java.lang.Object tag = c18390xafce807.getTag(com.p314xaae8f345.mm.R.id.f568517n33);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        t74.w1 w1Var = this.f497762b;
        if (num != null && num.intValue() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "the video view has bean seek to 0");
            c18390xafce807.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 0);
            this.f497761a = false;
        }
        t74.i2 R = t74.w1.R(w1Var);
        int i19 = this.f497763c;
        if (R != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            if (i19 == 0) {
                t74.h2 h2Var = R.f497699i;
                if (i17 >= h2Var.a()) {
                    h2Var.c(i17);
                }
            } else {
                t74.h2 h2Var2 = R.f497700j;
                if (i17 >= h2Var2.a()) {
                    h2Var2.c(i17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        if (!this.f497761a && i18 >= 1) {
            this.f497761a = true;
            t74.i2 R2 = t74.w1.R(w1Var);
            if (R2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                if (i19 == 0) {
                    t74.h2 h2Var3 = R2.f497699i;
                    h2Var3.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    int i27 = h2Var3.f497683c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    h2Var3.f497683c = i27 + 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                } else {
                    t74.h2 h2Var4 = R2.f497700j;
                    h2Var4.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    int i28 = h2Var4.f497683c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    h2Var4.f497683c = i28 + 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    public void mo70662xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
        this.f497761a = false;
        t74.w1 w1Var = this.f497762b;
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            if (this.f497763c == 0) {
                t74.h2 h2Var = R.f497699i;
                h2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i17 = h2Var.f497684d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var.f497684d = i17 + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int b17 = h2Var.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i18 = h2Var.f497686f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var.d(b17 + i18);
                h2Var.c(0);
            } else {
                t74.h2 h2Var2 = R.f497700j;
                h2Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i19 = h2Var2.f497684d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var2.f497684d = i19 + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int b18 = h2Var2.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                int i27 = h2Var2.f497686f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                h2Var2.d(b18 + i27);
                h2Var2.c(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        p3325xe03a0797.p3326xc267989b.y0 h17 = w1Var.h();
        if (h17 != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(h17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h.mo7096x348d9a(w1Var.A0), null, new t74.m1(w1Var, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setVideoCallbackAndLayout$1");
    }
}
