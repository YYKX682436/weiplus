package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class w implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.x f251392b;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.x xVar, android.view.View view) {
        this.f251392b = xVar;
        this.f251391a = view;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        boolean z18;
        boolean z19;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        r45.a90 a90Var2;
        r45.kv2 kv2Var2;
        r45.a90 a90Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
        android.view.View view = this.f251391a;
        if (!(view.getTag() instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        java.lang.String str2 = (java.lang.String) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "onItemDelClick:" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str2);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        boolean m70387x403f7b29 = k17.m70387x403f7b29();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.x xVar = this.f251392b;
        if (m70387x403f7b29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "dead item");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().L0(k17.f38324x142bbdc6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = xVar.f251394d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            iVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(xVar.f251394d) == 0) {
                m21.w.d(739);
            } else {
                m21.w.c(739);
            }
            ca4.z0.T(k17);
            k17.m70387x403f7b29();
            if (k17.m70373x5384133c() == 21) {
                ha4.h.a().d();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p6 p6Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p6.f246114a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = k17.m70371x485d7();
        java.util.LinkedList linkedList = (m70371x485d7 == null || (a90Var3 = m70371x485d7.f39014x86965dde) == null) ? null : a90Var3.f451373h;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            z18 = false;
        } else {
            z18 = ((r45.jj4) linkedList.get(0)).f459389e == 8;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "delete video is fake video");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().L0(k17.f38324x142bbdc6);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(k17.m70357x3fdd41df()) < com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj().c(k17);
            }
            xVar.f251394d.B();
            p6Var.a(k17.f38324x142bbdc6, k17.m70357x3fdd41df());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        if (k17.m70398x507e494d()) {
            dx1.g.f326022a.j("SnsPublishProcess", "opresult_", 5, bx1.u.f117842d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.d(k17.f38324x142bbdc6 + "");
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ni(16, k17.f38324x142bbdc6 + "", null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel item ");
            sb6.append(k17.m70363x51f8f990());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().c(k17);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = k17.m70371x485d7();
            z19 = (m70371x485d72 == null || (a90Var2 = m70371x485d72.f39014x86965dde) == null || (kv2Var2 = a90Var2.f451377o) == null || kv2Var2.m75942xfb822ef2(9) == 0) ? false : true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(k17.m70357x3fdd41df()) < com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k && !z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj().c(k17);
            }
            xVar.f251394d.B();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "delete by server");
        java.lang.String m70367x7525eefd = k17.m70367x7525eefd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd), 1));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d73 = k17.m70371x485d7();
        z19 = (m70371x485d73 == null || (a90Var = m70371x485d73.f39014x86965dde) == null || (kv2Var = a90Var.f451377o) == null || kv2Var.m75942xfb822ef2(9) == 0) ? false : true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(k17.m70357x3fdd41df()) < com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k && !z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj().c(k17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().mo70496xb06685ab(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u1.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(m70367x7525eefd));
        xVar.f251394d.B();
        if (m70371x485d73 != null) {
            r45.y8 y8Var = m70371x485d73.f39012x33e0f24f;
            java.lang.String str3 = y8Var != null ? y8Var.f472379d : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Di(str3)) {
                ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(str3, false);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5914x22904562 c5914x22904562 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5914x22904562();
                c5914x22904562.f136217g.getClass();
                c5914x22904562.e();
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(xVar.f251394d) == 0) {
            m21.w.d(739);
        } else {
            m21.w.c(739);
        }
        ca4.z0.T(k17);
        k17.m70387x403f7b29();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
    }
}
