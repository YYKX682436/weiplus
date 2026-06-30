package je4;

/* loaded from: classes9.dex */
public abstract class g {
    public static final java.util.HashMap a(bw5.v70 v70Var) {
        bw5.j40 b17;
        bw5.e70 g17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildTingListenMenuReportParams", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_listen_later");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        hashMap.put("currscene", java.lang.Integer.valueOf(v31.j.f77249x366c91de));
        hashMap.put("which_button", 51);
        java.lang.String str = null;
        java.lang.String m11811xb5887159 = (v70Var == null || (g17 = v70Var.g()) == null) ? null : g17.m11811xb5887159();
        if (m11811xb5887159 == null) {
            m11811xb5887159 = "";
        }
        hashMap.put("actionfinderfeedid", m11811xb5887159);
        if (v70Var != null && (b17 = v70Var.b()) != null) {
            str = b17.m12208xb5887639();
        }
        hashMap.put("actionbizinfo", rk4.j5.f(str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildTingListenMenuReportParams", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.content.Context r8, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r9, android.view.ContextMenu r10) {
        /*
            java.lang.String r0 = "checkAddLaterListenMenu"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.util.TingSnsUtils"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r2)
            java.lang.String r2 = "menu"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r2)
            if (r9 != 0) goto L18
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        L18:
            java.lang.String r2 = "canAddLaterListenMenu"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            java.lang.Class<qk.o8> r3 = qk.o8.class
            i95.m r3 = i95.n0.c(r3)
            qk.o8 r3 = (qk.o8) r3
            ef0.y2 r3 = (ef0.y2) r3
            boolean r3 = r3.Ai()
            r4 = 0
            if (r3 != 0) goto L32
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L54
        L32:
            r45.a90 r3 = r9.f39014x86965dde
            if (r3 == 0) goto L39
            r45.xs4 r3 = r3.f451385w
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 != 0) goto L40
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L54
        L40:
            r5 = 18
            int r3 = r3.m75939xb282bd08(r5)
            boolean r3 = il4.l.g(r3)
            if (r3 == 0) goto L51
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            r2 = 1
            goto L55
        L51:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L54:
            r2 = r4
        L55:
            if (r2 == 0) goto L97
            java.lang.Class<qk.a8> r2 = qk.a8.class
            i95.m r2 = i95.n0.c(r2)
            qk.a8 r2 = (qk.a8) r2
            ef0.q1 r2 = (ef0.q1) r2
            boolean r2 = r2.Bi()
            if (r2 == 0) goto L6b
            r2 = 2131778245(0x7f105ac5, float:1.9188013E38)
            goto L6e
        L6b:
            r2 = 2131778221(0x7f105aad, float:1.9187965E38)
        L6e:
            r3 = 33
            java.lang.String r8 = r8.getString(r2)
            r10.add(r4, r3, r4, r8)
            bw5.lp0 r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wm.d(r9)
            bw5.v70 r8 = r8.d()
            java.util.HashMap r5 = a(r8)
            java.lang.Class<dy1.r> r8 = dy1.r.class
            i95.m r8 = i95.n0.c(r8)
            dy1.r r8 = (dy1.r) r8
            java.lang.String r3 = "view_exp"
            r4 = 0
            r6 = 5
            r7 = 0
            r2 = r8
            cy1.a r2 = (cy1.a) r2
            r2.yj(r3, r4, r5, r6, r7)
        L97:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je4.g.b(android.content.Context, com.tencent.mm.protocal.protobuf.TimeLineObject, android.view.ContextMenu):void");
    }

    public static final boolean c(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        r45.xs4 xs4Var = a90Var.f451385w;
        if (xs4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        int i17 = a90Var.f451370e;
        if (i17 == 47) {
            qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
            int m75939xb282bd08 = xs4Var.m75939xb282bd08(18);
            ((ef0.l4) i9Var).getClass();
            boolean b17 = km4.v.b(context, m75939xb282bd08, z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return b17;
        }
        if (i17 != 48) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        r45.km6 km6Var = a90Var.A;
        if (km6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        bw5.o50 v17 = il4.d.v(km6Var.f460372e);
        if (v17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        qk.i9 i9Var2 = (qk.i9) i95.n0.c(qk.i9.class);
        int i18 = v17.f112497n;
        ((ef0.l4) i9Var2).getClass();
        boolean a17 = km4.v.a(context, i18, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        return a17;
    }

    public static final boolean d(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        boolean c17 = c(context, c19807x593d1720, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        return c17;
    }
}
