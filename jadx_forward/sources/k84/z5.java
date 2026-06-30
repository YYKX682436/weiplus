package k84;

/* loaded from: classes4.dex */
public final class z5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f386900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(long j17, k84.c6 c6Var) {
        super(0);
        this.f386900d = j17;
        this.f386901e = c6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f386900d);
        k84.c6 c6Var = this.f386901e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.j(), "onBackPressListener click! timeInterval is " + abs);
        float f18 = (float) abs;
        mb4.a z17 = k84.c6.z(c6Var);
        if (z17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
            f17 = z17.f406894f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
        } else {
            f17 = 0.0f;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!(f18 > f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        return valueOf;
    }
}
