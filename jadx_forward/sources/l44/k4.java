package l44;

/* loaded from: classes4.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.k4 f397753a = new l44.k4();

    public static w64.x c(l44.k4 k4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, android.view.View view, java.util.List list, java.util.List list2, w64.w wVar, w64.u uVar, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAdLandingPageJumpAnimInfo$default", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        android.view.View view2 = (i18 & 8) != 0 ? null : view;
        java.util.List list3 = (i18 & 16) != 0 ? null : list;
        java.util.List list4 = (i18 & 32) != 0 ? null : list2;
        w64.w wVar2 = (i18 & 64) != 0 ? null : wVar;
        w64.u uVar2 = (i18 & 128) != 0 ? null : uVar;
        k4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        l44.g4 g4Var = new l44.g4(c17933xe8d1b226, i17, view2, list3, list4, wVar2, iVar, uVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAdLandingPageJumpAnimInfo$default", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        return g4Var;
    }

    public final void a(android.view.View v17, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var, int i17, i64.b1 b1Var, w64.n nVar, boolean z17) {
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.l a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "onsight click but info is null localid %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        if (k4Var != null && (a17 = k4Var.a()) != null) {
            a17.e(k17);
        }
        if (k17.f68895x2262335f == 18) {
            dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t07 = ca4.z0.t0(k17.f68891x29d1292e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
            ((zy1.f) sVar).Di(12076, "ClickStreamVideoCount", t07);
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "BrowseForwardAdLongVideoTime");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        java.lang.String m70374x6bf53a6c = k17.m70374x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70374x6bf53a6c, "getUserName(...)");
        java.lang.String m70367x7525eefd = k17.m70367x7525eefd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70367x7525eefd, "getSnsId(...)");
        int m70373x5384133c = k17.m70373x5384133c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publicClickEvent", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        el0.i.d(m70374x6bf53a6c, m70367x7525eefd, m70373x5384133c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publicClickEvent", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        boolean m70377x3172ed = k17.m70377x3172ed();
        if (((c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null) ? null : a90Var.f451373h) == null || c19807x593d1720.f39014x86965dde.f451373h.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ClickActionHelper", "the obj.ContentObj.MediaObjList is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
            return;
        }
        boolean z18 = false;
        r45.jj4 jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        if (z17) {
            if (m70377x3172ed && !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().D(jj4Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1910, 3);
            }
            if (k17.m70377x3172ed() && k17.m70354x74235b3e().m70146xae00c4ba() && za4.z0.u(k17.m70351xaa22b9ed().f67593x28cf0d8f)) {
                z18 = true;
            }
            if (!z18 && m70377x3172ed && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().E(jj4Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().p0(jj4Var);
                if (m70377x3172ed) {
                    i64.s1.a(i64.o1.Sight, i64.n1.PlayIcon, k17, i17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1910, 6);
            }
            if (i17 == 0) {
                m21.w.d(717);
            } else {
                m21.w.c(717);
            }
            ca4.z0.T(k17);
            k17.m70377x3172ed();
            k17.m70375x338a8cc7();
            java.lang.String str2 = jj4Var.f459388d;
            if (i17 == 0) {
                m21.w.d(745);
            } else {
                m21.w.c(745);
            }
            ca4.z0.T(k17);
            k17.m70377x3172ed();
            if (m70377x3172ed && (!k17.m70354x74235b3e().m70146xae00c4ba() || !za4.z0.u(k17.m70351xaa22b9ed().f67593x28cf0d8f))) {
                i64.s1.a(i64.o1.Sight, i64.n1.EnterFullScreen, k17, i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11444, 3);
        }
        if (i17 == 2) {
            k17.m70356x450e1efa();
        } else {
            k17.m70346x10413e67();
        }
        if (nVar != null) {
            nVar.k(v17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ClickActionHelper", "click cannot jump！！！");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.View r24, android.app.Activity r25, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r26, int r27, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 r28, i64.b1 r29, v64.d r30) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.k4.b(android.view.View, android.app.Activity, com.tencent.mm.plugin.sns.storage.SnsInfo, int, com.tencent.mm.plugin.sns.storage.ADXml, i64.b1, v64.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r1.getId() == com.p314xaae8f345.mm.R.id.f567842kv3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149 A[EDGE_INSN: B:63:0x0149->B:26:0x0149 BREAK  A[LOOP:1: B:44:0x00db->B:60:0x0144], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 r19, int r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.k4.d(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, int):void");
    }
}
