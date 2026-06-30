package f84;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f341753a;

    /* renamed from: b, reason: collision with root package name */
    public f84.u f341754b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f341755c;

    public x(int i17) {
        this.f341753a = i17;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBrandTopicLogic", "mAdBrandTopicComponent, resetUI");
        f84.u uVar = this.f341754b;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            android.widget.FrameLayout frameLayout = uVar.f341743t;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            uVar.G = false;
            uVar.H = false;
            uVar.I = false;
            uVar.f341737J.removeCallbacksAndMessages(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicLogic");
    }
}
