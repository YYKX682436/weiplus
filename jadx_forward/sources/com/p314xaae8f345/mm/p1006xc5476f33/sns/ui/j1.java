package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1 f251009d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1 k1Var) {
        this.f251009d = k1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1 k1Var = this.f251009d;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            java.lang.CharSequence charSequence = k1Var.f251137f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            boolean f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.f(charSequence);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = k1Var.f251139h;
            if (f17) {
                db5.e1.T(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var) != null) {
                    java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.b(k1Var).f250797d));
                    w04.a aVar = w04.a.INSTANCE;
                    java.lang.String str2 = r07 + ":" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var).f454665m;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
                    aVar.A9(4, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(k1Var.f251137f.toString()));
                }
            } else {
                db5.e1.T(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571893ss));
            }
        } else if (itemId == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseTimeLine", "del snsId:" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.b(k1Var).f250797d + " commentId:" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.b(k1Var).f250797d), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.b(k1Var).f250797d) ? 6 : 4, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var));
            gm0.j1.i();
            gm0.j1.n().f354821b.g(q2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = k1Var.f251139h;
            l1Var2.f251256x = db5.e1.Q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var2), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var2).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var2).getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i1(this, q2Var));
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var) != null) {
                i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var).f454665m;
                str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.a(k1Var).f454659d;
            } else {
                i18 = 0;
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1.b(k1Var).f38401xca815c7f;
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (c19806x4c372b7 != null) {
                int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c19806x4c372b7.f38999xf403ecf6, c01.z1.r()) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, c01.z1.r()) ? 2 : 3 : 1;
                int i27 = c19806x4c372b7.f38962x37aaea10;
                int i28 = c19806x4c372b7.f38982x6c24f798;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6894x514697c0 c6894x514697c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6894x514697c0();
                c6894x514697c0.f142099d = c6894x514697c0.b("PublishId", ca4.z0.s0(c19806x4c372b7.Id), true);
                c6894x514697c0.f142101f = c6894x514697c0.b("CommentId", java.lang.String.valueOf(i18), true);
                c6894x514697c0.f142102g = i19;
                c6894x514697c0.f142100e = c6894x514697c0.b("FriendUsername", str, true);
                c6894x514697c0.f142105j = 1;
                c6894x514697c0.f142103h = i28;
                c6894x514697c0.f142104i = i27;
                c6894x514697c0.k();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$2");
    }
}
