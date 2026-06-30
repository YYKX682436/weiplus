package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class hh extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public hh(java.lang.Object obj) {
        super(2, obj, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.class, "openCommentInputFooter", "openCommentInputFooter(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ui/SnsFeedComment;)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        android.view.View view = (android.view.View) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei p17 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116) this.f72685xcfcbe9ef;
        activityC18049x9dc71116.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (view != null) {
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            xc4.p Y6 = ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).Y6(p17.b().f68891x29d1292e);
            if (Y6 != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18049x9dc71116.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t.class);
                r45.e86 comment = p17.a();
                tVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.CommentInputUIC", "replayComment");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                java.lang.Object mo141623x754a37bb = ((jz5.n) tVar.f250527g).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                java.lang.String str = tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574766je0) + ca4.z0.y(comment, (com.p314xaae8f345.mm.p2621x8fb0427b.e8) mo141623x754a37bb);
                java.lang.String str2 = Y6.a1() + str;
                tVar.f250529i = str2;
                tVar.P6().setTag(Y6.c1());
                tVar.P6().setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 P6 = tVar.P6();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                java.util.Iterator it = tVar.f250528h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = 0;
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1) it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(t1Var.f252026a, str2)) {
                        i17 = t1Var.f252028c;
                        break;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                P6.H(i17);
                tVar.P6().m70721xed97b3c4(str + tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8z));
                tVar.P6().m70731x36d7a384(Y6.c1());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                if ((Y6.h1().f39014x86965dde.f451374i & 128) != 0) {
                    tVar.P6().m70724xa2d6175c(false);
                } else {
                    tVar.P6().m70724xa2d6175c(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                tVar.P6().m70722xed9839eb(comment);
                tVar.P6().N(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.A, str2);
                tVar.P6().post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.q(tVar));
                tVar.P6().O(false);
                tVar.P6().m70730x7c4d0255(view);
                tVar.P6().m70727xebdff806(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.r(tVar));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$1");
        return f0Var;
    }
}
