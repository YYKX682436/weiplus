package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3 f252707a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f252708b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f252709c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static int f252710d;

    public final void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 g1Var, java.util.HashMap hashMap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIdInMap", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        if (hashMap.containsKey(str)) {
            java.lang.Object obj = hashMap.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            ((java.util.Map) obj).put(str2, g1Var);
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(str2, g1Var);
            hashMap.put(str, hashMap2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIdInMap", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 b(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 g1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        if (f252710d == 1) {
            java.util.HashMap hashMap = f252709c;
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
            g1Var = hashMap2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1) hashMap2.get(str2) : null;
            if (g1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
                return g1Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 g1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1(str2, str3 != null ? str3.length() : 0, 0, 0, i17, 0, 0, 108, null);
            a(str, str2, g1Var2, hashMap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
            return g1Var2;
        }
        java.util.HashMap hashMap3 = f252708b;
        java.util.HashMap hashMap4 = (java.util.HashMap) hashMap3.get(str);
        g1Var = hashMap4 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1) hashMap4.get(str2) : null;
        if (g1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
            return g1Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 g1Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1(str2, str3 != null ? str3.length() : 0, 0, 0, i17, 0, 0, 108, null);
        a(str, str2, g1Var3, hashMap3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportItemWrapper", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        return g1Var3;
    }

    public final void c(java.lang.String feedId, r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markCommentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        if (e86Var != null) {
            ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "markCommentClk: " + feedId + ", " + e86Var.f454665m);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g1 b17 = f252707a.b(feedId, java.lang.String.valueOf(e86Var.f454665m), e86Var.f454677y, e86Var.f454663h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            int i17 = b17.f252670d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
            b17.f252670d = i17 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClkCnt", "com.tencent.mm.plugin.sns.ui.widget.SnsCmtReportItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markCommentClk", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r17, java.lang.String r18, java.util.HashMap r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3.d(int, java.lang.String, java.util.HashMap):void");
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSessionCustomEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_session_cmt_exp", kz5.c1.k(new jz5.l("sns_scene", java.lang.Integer.valueOf(i17)), new jz5.l("sessionid_sns", str), new jz5.l("cmtlist", str2)), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSessionCustomEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }

    public final void f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCurrentScene", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        ot5.g.c("MicroMsg.SnsSessionCmtReportManager", "currentScene: " + i17);
        f252710d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurrentScene", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
    }
}
