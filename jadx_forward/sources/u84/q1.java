package u84;

/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f507190a;

    /* renamed from: b, reason: collision with root package name */
    public u84.m1 f507191b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f507192c;

    public q1(int i17) {
        this.f507190a = i17;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdStateSettingBarLogic", "adStateSettingBarLogic, from not ad to resetUI");
        u84.m1 m1Var = this.f507191b;
        if (m1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            m1Var.M.removeCallbacksAndMessages(null);
            android.widget.FrameLayout frameLayout = m1Var.f507134v;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            m1Var.C();
            m1Var.L = false;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = m1Var.K;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            m1Var.K = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarLogic");
    }
}
