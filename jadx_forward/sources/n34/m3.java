package n34;

/* loaded from: classes4.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f416214a = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f416215b;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, int i17, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f416215b;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsGalleryStarHelper", "the last job is no finish，ignore");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            boolean z17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_STAR_SETTING_TEACH_SHOW_INT, 0) == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarConfig", "getSnsFirstSettingShow >> " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            if (z17) {
                n34.o4.f416230a.a(context, new n34.i3(this, snsInfo, i17, context));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            }
        }
        b(snsInfo, i17, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStar", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doChangeStarInternal", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
        java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
        long n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGalleryStarHelper", "feedId: " + m70367x7525eefd + ",, action: " + i17);
        this.f416215b = p3325xe03a0797.p3326xc267989b.l.d(this.f416214a, null, null, new n34.l3(i17, n17, m70367x7525eefd, c17933xe8d1b226, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574776jf1), false, 0, null), context, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doChangeStarInternal", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
    }
}
