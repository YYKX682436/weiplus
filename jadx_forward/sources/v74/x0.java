package v74;

/* loaded from: classes4.dex */
public final class x0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v74.z0 f515474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(v74.z0 z0Var, android.os.Looper looper) {
        super(looper);
        this.f515474a = z0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$mVideoPlayNotifyHandler$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        v74.z0 z0Var = this.f515474a;
        if (i17 == 1) {
            int i18 = msg.arg1;
            int i19 = msg.arg2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.v0 v0Var = z0Var.f515480a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            v74.u0 d17 = v0Var.d(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            d17.f515455a = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.videoPlay", "onGetVideoDuration, pos=" + i18 + ", duration=" + v0Var.d(i18).b());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        } else if (i17 == 2) {
            int i27 = msg.arg1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.v0 v0Var2 = z0Var.f515480a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v0Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlayComplete", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            v74.u0 d18 = v0Var2.d(i27);
            int d19 = d18.d() + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            d18.f515456b = d19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            if (d18.e() > 0 && d18.e() < d18.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.videoPlay", "adjust currentPlayTimeMs=" + d18.e() + ", duration=" + d18.b());
                d18.h(d18.b());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic.videoPlay", "onVideoPlayComplete, pos=" + i27 + ", finishCount=" + d18.d() + ", totalPlayTime=" + d18.g());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlayComplete", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        } else if (i17 == 3) {
            int i28 = msg.arg1;
            int i29 = msg.arg2;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i29);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPlayingTimeMap$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            java.util.HashMap hashMap = z0Var.f515482c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPlayingTimeMap$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            hashMap.put(java.lang.Integer.valueOf(msg.arg1), valueOf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.v0 v0Var3 = z0Var.f515480a;
            v0Var3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            v74.u0 d27 = v0Var3.d(i28);
            if (d27.f() == 0) {
                d27.e();
                d27.i(1);
            }
            if (i29 + 1000 < d27.e()) {
                int g17 = d27.g() + d27.e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                d27.f515457c = g17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                d27.i(d27.f() + 1);
                d27.g();
            }
            d27.e();
            d27.b();
            d27.f();
            d27.g();
            d27.h(i29);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            int i37 = d27.f515458d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            if (i37 < i29) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                d27.f515458d = i29;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$mVideoPlayNotifyHandler$1");
    }
}
