package d84;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f308581d;

    public b(d84.j0 j0Var) {
        this.f308581d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2$1$1");
        d84.j0 j0Var = this.f308581d;
        java.lang.String j17 = j0Var.j();
        try {
            android.content.Context z18 = d84.j0.z(j0Var);
            activity = z18 instanceof android.app.Activity ? (android.app.Activity) z18 : null;
            z17 = true;
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (!(activity != null && activity.isFinishing())) {
            android.content.Context z19 = d84.j0.z(j0Var);
            android.app.Activity activity2 = z19 instanceof android.app.Activity ? (android.app.Activity) z19 : null;
            if (activity2 == null || !activity2.isDestroyed()) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 210);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (j0Var.f308620p == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = j0Var.f308623s;
                    if (iVar != null) {
                        iVar.z(d84.j0.E(j0Var));
                    }
                } else {
                    android.content.Context z27 = d84.j0.z(j0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac activityC18022x27bfedac = z27 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) z27 : null;
                    if (activityC18022x27bfedac != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentForClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        android.widget.LinearLayout linearLayout = activityC18022x27bfedac.f248432y;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentForClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (linearLayout != null) {
                            linearLayout.performClick();
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2$1$1");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(j0Var.j(), "handleAtCommentClick, activity is finishing or destroyed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2$1$1");
    }
}
