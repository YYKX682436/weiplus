package d84;

/* loaded from: classes4.dex */
public final class x implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f308662a;

    public x(d84.j0 j0Var) {
        this.f308662a = j0Var;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mSnsAdRockPaperScissorsPAGFlushListener$1");
        d84.j0 j0Var = this.f308662a;
        if (d84.j0.B(j0Var) != null) {
            android.widget.ImageView B = d84.j0.B(j0Var);
            boolean z17 = false;
            if (B != null && B.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.j(), "rockPaperScissorsPAGThumb need to be gone");
                j0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = j0Var.F;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (c22789xd23e9a9b != null) {
                    c22789xd23e9a9b.j(this);
                }
                android.widget.ImageView B2 = d84.j0.B(j0Var);
                if (B2 != null) {
                    B2.clearAnimation();
                }
                android.widget.ImageView B3 = d84.j0.B(j0Var);
                if (B3 != null) {
                    B3.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mSnsAdRockPaperScissorsPAGFlushListener$1");
    }
}
