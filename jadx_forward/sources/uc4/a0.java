package uc4;

/* loaded from: classes4.dex */
public final class a0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc4.p f507907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc4.c0 f507908b;

    public a0(xc4.p pVar, uc4.c0 c0Var) {
        this.f507907a = pVar;
        this.f507908b = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        boolean z18;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        r45.a90 a90Var2;
        r45.kv2 kv2Var2;
        r45.a90 a90Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
        xc4.p pVar = this.f507907a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DeleteClick", "onItemDelClick:" + pVar.W0() + ", snsId:" + pVar.y0());
        if (pVar.m175344x403f7b29()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DeleteClick", "dead item");
            m21.w.d(739);
            pVar.a1();
            pVar.m175344x403f7b29();
            if (pVar.m125482xfb85f7b0() == 21) {
                ha4.h.a().d();
            }
            this.f507908b.n(pVar.U0(), pVar.y0(), pVar.m125473x3fdd41df());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = pVar.h1();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        java.util.LinkedList linkedList = (h17 == null || (a90Var3 = h17.f39014x86965dde) == null) ? null : a90Var3.f451373h;
        boolean z19 = false;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            z18 = false;
        } else {
            z18 = ((r45.jj4) linkedList.get(0)).f459389e == 8;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DeleteClick", "delete video is fake video");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().L0((int) pVar.U0());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(pVar.m125473x3fdd41df()) < com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj().c(pVar.c1());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p6.f246114a.a((int) pVar.U0(), pVar.m125473x3fdd41df());
            this.f507908b.n(pVar.U0(), pVar.y0(), pVar.m125473x3fdd41df());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
            return;
        }
        if (pVar.m175345x507e494d()) {
            dx1.g.f326022a.j("SnsPublishProcess", "opresult_", 5, bx1.u.f117842d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.d(pVar.U0() + "");
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ni(16, java.lang.String.valueOf(pVar.U0()), null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().c(pVar.c1());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h18 = pVar.h1();
            if (h18 != null && (a90Var2 = h18.f39014x86965dde) != null && (kv2Var2 = a90Var2.f451377o) != null && kv2Var2.m75942xfb822ef2(9) != 0) {
                z19 = true;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(pVar.m125473x3fdd41df()) < com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k && !z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj().c(pVar.c1());
            }
            this.f507908b.n(pVar.U0(), pVar.y0(), pVar.m125473x3fdd41df());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
            return;
        }
        ad4.g gVar = ad4.g.f84716a;
        uc4.c0 c0Var = this.f507908b;
        c0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        in5.s0 s0Var = c0Var.f507940d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        android.view.View view = s0Var != null ? s0Var.f3639x46306858 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        gVar.a(view, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DeleteClick", "delete by server");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().c(pVar.y0());
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(pVar.y0(), 1));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h19 = pVar.h1();
        boolean z27 = (h19 == null || (a90Var = h19.f39014x86965dde) == null || (kv2Var = a90Var.f451377o) == null || kv2Var.m75942xfb822ef2(9) == 0) ? false : true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(pVar.m125473x3fdd41df()) < com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k && !z27) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj().c(pVar.c1());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().y0(pVar.y0());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u1.a(pVar.y0());
        if (h19 != null) {
            r45.y8 y8Var = h19.f39012x33e0f24f;
            java.lang.String str2 = y8Var != null ? y8Var.f472379d : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Di(str2)) {
                ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(str2, false);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5914x22904562 c5914x22904562 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5914x22904562();
                c5914x22904562.f136217g.getClass();
                c5914x22904562.e();
            }
        }
        this.f507908b.n(pVar.U0(), pVar.y0(), pVar.m125473x3fdd41df());
        m21.w.d(739);
        pVar.a1();
        pVar.m175344x403f7b29();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
    }
}
