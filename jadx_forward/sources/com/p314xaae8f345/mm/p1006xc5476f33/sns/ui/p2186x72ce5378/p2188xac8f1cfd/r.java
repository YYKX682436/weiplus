package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class r implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t f250516a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t tVar) {
        this.f250516a = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dg
    public final void a(zb4.a aVar) {
        r45.e86 r17;
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC$replayComment$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t tVar = this.f250516a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        java.lang.Object tag = tVar.P6().getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.storage.SnsInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) tag;
        if (aVar.f()) {
            java.lang.String d17 = aVar.d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.k(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
            ((zy1.f) sVar).Di(12076, "CommentOrLikeFeedCount", t07);
            dy1.s sVar2 = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t08 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t08, "longToString(...)");
            ((zy1.f) sVar2).Di(12076, "comment_feed_count", t08);
            int m70714x57316135 = tVar.P6().m70714x57316135();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.CommentInputUIC", "onCommentSend click %s", java.lang.Integer.valueOf(m70714x57316135));
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(m70714x57316135, 8)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
                java.lang.String substring = d17.substring(tVar.P6().m70713x3417cdee().length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                aVar.i(substring);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.CommentInputUIC", "send atFriend ad timeline comment");
                r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.r(c17933xe8d1b226, 16, aVar, tVar.P6().m70715x5732c677(), true, m70714x57316135, 0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.CommentInputUIC", "send timeline comment");
                r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.r(c17933xe8d1b226, c17933xe8d1b226.m70377x3172ed() ? 8 : 2, aVar, tVar.P6().m70715x5732c677(), true, m70714x57316135, 0);
            }
            r45.e86 e86Var = r17;
            tVar.R6();
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).k7(c17933xe8d1b226.f68891x29d1292e, e86Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.k kVar = tVar.f250524d;
            if (kVar != null) {
                java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70367x7525eefd, "getSnsId(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e86Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116) kVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSendCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC18049x9dc71116);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                e4Var.f293309c = activityC18049x9dc71116.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575386pd1);
                e4Var.c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                ta4.t tVar2 = new ta4.t();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nh nhVar = activityC18049x9dc71116.X;
                if (nhVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = nhVar.f251527e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                tVar2.c(c17933xe8d1b2262);
                tVar2.b(e86Var);
                tVar2.d(activityC18049x9dc71116.F1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
                java.util.Map e17 = tVar2.e();
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                if (rVar != null) {
                    tVar2.a();
                    ((cy1.a) rVar).Ej("cmt_big_pic_reply", e17, 36244);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportCmtBigPicReplyEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nh nhVar2 = activityC18049x9dc71116.X;
                if (nhVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m70367x7525eefd, nhVar2.P6())) {
                    if (e86Var.f454678z > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                        android.content.Context context = nhVar2.f251530h;
                        if (context == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = nhVar2.f251527e;
                        if (c17933xe8d1b2263 == null) {
                            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("Required value was null.".toString());
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                            throw illegalArgumentException;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 n4Var = nhVar2.f251532m;
                        if (n4Var == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryTitleM");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei eiVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ei(context, c17933xe8d1b2263, m70367x7525eefd, e86Var, n4Var, nhVar2.f251533n);
                        nhVar2.f251534o.add(eiVar);
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) nhVar2.f251535p).e(new jz5.l(eiVar, java.lang.Integer.valueOf(r2.size() - 1)));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSnsFeedComment", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSendCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f250529i)) {
                java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1) it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar.f250529i, t1Var.f252026a)) {
                        ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.A).remove(t1Var);
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.CommentInputUIC", "onCommentSend contentData is Invalid");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onCommentSendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC$replayComment$2");
    }
}
