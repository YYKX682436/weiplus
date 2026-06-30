package d84;

/* loaded from: classes4.dex */
public final class n implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f308649a;

    public n(d84.j0 j0Var) {
        this.f308649a = j0Var;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mRightDecorPAGFlushListener$1");
        d84.j0 j0Var = this.f308649a;
        if (d84.j0.D(j0Var) != null) {
            android.widget.ImageView D = d84.j0.D(j0Var);
            boolean z17 = false;
            if (D != null && D.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.j(), "rightDecorPAGThumb need to be gone");
                j0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = j0Var.H;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (c22789xd23e9a9b != null) {
                    c22789xd23e9a9b.j(this);
                }
                android.widget.ImageView D2 = d84.j0.D(j0Var);
                if (D2 != null) {
                    D2.clearAnimation();
                }
                android.widget.ImageView D3 = d84.j0.D(j0Var);
                if (D3 != null) {
                    D3.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mRightDecorPAGFlushListener$1");
    }
}
