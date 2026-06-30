package n34;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac f416233a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f416234b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f416235c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f416236d;

    /* renamed from: e, reason: collision with root package name */
    public n34.o2 f416237e;

    /* renamed from: f, reason: collision with root package name */
    public n34.p2 f416238f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f416239g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac detailUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detailUI, "detailUI");
        this.f416233a = detailUI;
        this.f416234b = jz5.h.b(new n34.o(this));
        this.f416235c = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f416236d;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommentDetailStarHelper", "the last job is no finish，ignore");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            boolean z17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_STAR_SETTING_TEACH_SHOW_INT, 0) == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarConfig", "getSnsFirstSettingShow >> " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            if (z17) {
                n34.o4.f416230a.a(this.f416233a, new n34.i(this, snsInfo, i17, i18));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            }
        }
        b(snsInfo, i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doChangeStarInternal", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
        long n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommentDetailStarHelper", "feedId: " + ca4.z0.t0(n17) + ", action: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac activityC18022x27bfedac = this.f416233a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC18022x27bfedac, activityC18022x27bfedac.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574776jf1), false, 0, null);
        n34.p2 p2Var = this.f416238f;
        if (p2Var != null) {
            p2Var.e(i17);
        }
        this.f416236d = p3325xe03a0797.p3326xc267989b.l.d(this.f416235c, null, null, new n34.l(i17, n17, m70367x7525eefd, c17933xe8d1b226, this, f17, i18, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStarInternal", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDetailUI", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDetailUI", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        return this.f416233a;
    }

    public final android.view.View d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarIcon", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        java.lang.Object mo141623x754a37bb = this.f416234b.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarIcon", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        return view;
    }
}
