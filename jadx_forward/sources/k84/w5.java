package k84;

/* loaded from: classes4.dex */
public final class w5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f386848e;

    public w5(k84.c6 c6Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f386847d = c6Var;
        this.f386848e = c22789xd23e9a9b;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$1");
        java.lang.String str = this.f386847d.j() + "dialog_dismissCallback";
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f386848e;
        k84.c6 c6Var = this.f386847d;
        try {
            c22789xd23e9a9b.n();
            c22789xd23e9a9b.setVisibility(8);
            ((ku5.t0) ku5.t0.f394148d).g(new k84.v5(c6Var, c22789xd23e9a9b));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMVibrateJob$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = c6Var.N;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMVibrateJob$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(str, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$1");
    }
}
