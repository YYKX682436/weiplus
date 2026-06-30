package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class d1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 f249683a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var) {
        this.f249683a = l1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dg
    public void a(zb4.a aVar) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) this.f249683a.f251243k.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLine", "onCommentSend click type: %d", java.lang.Integer.valueOf(aVar.a()));
        java.lang.String d17 = aVar.d();
        if (!aVar.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseTimeLine", "onCommentSend tosendText is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
            return;
        }
        r45.e86 m70715x5732c677 = this.f249683a.f251243k.m70715x5732c677();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
        if (m21.w.d((m70715x5732c677.f454665m == 0 && m70715x5732c677.f454670r == 0) ? 708 : 709).f404538c == 708) {
            ca4.z0.T(c17933xe8d1b226);
            int i17 = c17933xe8d1b226.f68895x2262335f;
            c17933xe8d1b226.m70377x3172ed();
            c17933xe8d1b226.m70375x338a8cc7();
            int i18 = e17.f38982x6c24f798;
        } else {
            ca4.z0.T(c17933xe8d1b226);
            int i19 = c17933xe8d1b226.f68895x2262335f;
            c17933xe8d1b226.m70377x3172ed();
            c17933xe8d1b226.m70375x338a8cc7();
            int i27 = e17.f38982x6c24f798;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7 l7Var = this.f249683a.f251236d;
        if (l7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.l a18 = l7Var.a();
            a18.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            } else {
                a18.f246404c.add(c17933xe8d1b226.m70363x51f8f990());
                a18.f246403b.size();
                a18.f(c17933xe8d1b226);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            }
        }
        int m70714x57316135 = this.f249683a.f251243k.m70714x57316135();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLine", "onCommentSend click %s", java.lang.Integer.valueOf(m70714x57316135));
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(m70714x57316135, 8)) {
            aVar.i(d17.substring(this.f249683a.f251243k.m70713x3417cdee().length()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLine", "send atFriend ad timeline comment");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.q(c17933xe8d1b226, 16, aVar, this.f249683a.f251243k.m70715x5732c677(), m70714x57316135, 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLine", "send timeline comment");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.q(c17933xe8d1b226, c17933xe8d1b226.m70377x3172ed() ? 8 : 2, aVar, this.f249683a.f251243k.m70715x5732c677(), m70714x57316135, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f249683a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = l1Var.f251242j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar = l1Var.f251245m;
        java.lang.Runnable runnable = zxVar != null ? zxVar.f253262j : null;
        bsVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doWhileSendComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        bsVar.f249568a.w3("");
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wx) runnable).run();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doWhileSendComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.f249683a.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = this.f249683a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        java.lang.String str = l1Var2.f251248p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var3 = this.f249683a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                java.lang.String str2 = l1Var3.f251248p;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                if (str2.equals(t1Var.f252026a)) {
                    ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.A).remove(t1Var);
                    break;
                }
            }
        }
        if (c17933xe8d1b226.m70377x3172ed()) {
            l44.b3.f397574a.d(c17933xe8d1b226);
            if (c17933xe8d1b226.m70379x7e206751() && !ca4.m0.o()) {
                ca4.m0.w0();
            }
            if (c17933xe8d1b226.m70379x7e206751()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                gd4.c2.f352183w.c(c17933xe8d1b226, 3, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.k(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        c17933xe8d1b226.f68897x16e1d0b8 = java.lang.System.currentTimeMillis() + "";
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).f7(c17933xe8d1b226, o75.b.f425116d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
    }
}
