package k84;

/* loaded from: classes4.dex */
public final class i5 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386603a;

    public i5(k84.c6 c6Var) {
        this.f386603a = c6Var;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGFlushListener$1");
        k84.c6 c6Var = this.f386603a;
        if (k84.c6.C(c6Var) != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C = k84.c6.C(c6Var);
            boolean z17 = false;
            if (C != null && C.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c6Var.j(), "mCheerNormalIcon need to be gone");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D = k84.c6.D(c6Var);
                if (D != null) {
                    D.j(this);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C2 = k84.c6.C(c6Var);
                if (C2 != null) {
                    C2.clearAnimation();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C3 = k84.c6.C(c6Var);
                if (C3 != null) {
                    C3.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mPAGFlushListener$1");
    }
}
