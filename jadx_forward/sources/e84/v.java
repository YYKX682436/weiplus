package e84;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f331827a;

    /* renamed from: b, reason: collision with root package name */
    public e84.t f331828b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f331829c;

    public v(int i17) {
        this.f331827a = i17;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSingleProductLogic", "adSingleProductLogic, from not ad to resetUI");
        e84.t tVar = this.f331828b;
        if (tVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 K = tVar.K();
            if (K != null) {
                K.setVisibility(8);
            }
            android.animation.AnimatorSet animatorSet = tVar.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.widget.FrameLayout frameLayout = tVar.f331826z;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductLogic");
    }
}
