package l94;

/* loaded from: classes4.dex */
public final class c0 extends g54.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.e0 f398868d;

    public c0(l94.e0 e0Var) {
        this.f398868d = e0Var;
    }

    @Override // g54.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoEnded", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
        super.E(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoEnded", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
        super.N(str, str2, str3, i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f398868d.h(), "player callback error, %s, %s, %s, %d, %d", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
    }

    @Override // g54.d
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayProgress", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
        super.a(i17);
        k94.f.f387479a.d(l94.e0.n(this.f398868d), i17 * 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayProgress", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.d1
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
        super.c();
        k94.f.f387479a.b(l94.e0.n(this.f398868d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
        super.i(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
    }

    @Override // g54.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlay", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
        super.l(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlay", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldVideoAdComponent$AdFoldVideoCallback");
    }
}
