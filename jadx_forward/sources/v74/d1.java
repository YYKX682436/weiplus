package v74;

/* loaded from: classes4.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f515307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(v74.h1 h1Var) {
        super(2);
        this.f515307d = h1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.String str = "invoke";
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSplashCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f515307d;
        v74.l lVar = h1Var.f515348o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSplashCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            v74.v0 v0Var = h1Var.f515336c;
            v0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSplashCardVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            v74.u0 u0Var = v0Var.f515471h;
            if (u0Var != null) {
                if (intValue > 0) {
                    u0Var.i(1);
                }
                if (intValue2 > 0) {
                    int i18 = intValue > intValue2 ? intValue2 : intValue;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                    u0Var.f515455a = intValue2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                    i17 = i18;
                } else {
                    i17 = intValue;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f515457c = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f515458d = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.h(i17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic.splashCard", "onSplashCardVideoPlaying, data==null");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSplashCardVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            long j17 = intValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            long j18 = lVar.f515395b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimDelay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
            if (j17 >= j18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                boolean z17 = h1Var.f515346m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPlayedAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                if (!z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    boolean z18 = h1Var.f515345l;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    if (!z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        v0Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSplashCardVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                        v74.u0 u0Var2 = v0Var.f515471h;
                        if (u0Var2 != null) {
                            u0Var2.i(1);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                            u0Var2.f515456b = 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                            int abs = java.lang.Math.abs(u0Var2.g() - u0Var2.b());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.splashCard", "onSplashCardVideoPlayEnd, durationMs=" + u0Var2.b() + ", playTime=" + u0Var2.g() + ", delta=" + abs);
                            if (u0Var2.b() > 0 && abs < 1000) {
                                int b17 = u0Var2.b();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                u0Var2.f515457c = b17;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                int b18 = u0Var2.b();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                u0Var2.f515458d = b18;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                                u0Var2.h(u0Var2.b());
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic.splashCard", "onSplashCardVideoPlayEnd, data==null");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSplashCardVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        h1Var.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "startAnim");
                        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = h1Var.f515337d;
                        if (c22646x1e9ca55 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        } else {
                            h0Var.f391656d = c22646x1e9ca55;
                            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 b19 = h1Var.f515334a.b();
                            if (b19 == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                            } else {
                                h0Var2.f391656d = b19;
                                v74.l lVar2 = h1Var.f515348o;
                                if (lVar2 == null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                } else {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                                    v74.s sVar = h1Var.f515349p;
                                    if (sVar == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                    } else {
                                        h0Var3.f391656d = sVar;
                                        if (h1Var.f515346m || h1Var.f515345l) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "startAnim, isPlayed=" + h1Var.f515346m + ", isPlaying=" + h1Var.f515345l);
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                        } else {
                                            h1Var.f515345l = true;
                                            h1Var.f515346m = true;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "doAnim");
                                            h1Var.e(true);
                                            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                                            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
                                            long j19 = lVar2.f515396c;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$SplashCardInfo");
                                            ofFloat.setDuration(j19);
                                            ofFloat.addUpdateListener(new v74.f1(h0Var3, h0Var, h0Var2, h1Var));
                                            ofFloat.addListener(new v74.g1(h1Var, h0Var2, h0Var));
                                            h1Var.f515353t = ofFloat;
                                            ofFloat.start();
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                                        }
                                    }
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    }
                }
            }
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$mVideoPlayUpdateCallback$1";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        return f0Var;
    }
}
