package i64;

/* loaded from: classes4.dex */
public abstract class s1 {
    public static void a(i64.o1 o1Var, i64.n1 n1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        java.util.LinkedList linkedList = m70371x485d7.f39014x86965dde.f451373h;
        if (linkedList != null && !linkedList.isEmpty() && ((m70371x485d7.f39014x86965dde.f451370e == 15 && c17933xe8d1b226.m70377x3172ed()) || m70371x485d7.f39014x86965dde.f451370e == 18)) {
            if (c17933xe8d1b226.m70377x3172ed() && m70371x485d7.f39014x86965dde.f451370e == 15) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = i17 == 2 ? c17933xe8d1b226.m70356x450e1efa() : c17933xe8d1b226.m70346x10413e67();
                if (m70356x450e1efa != null) {
                    m70371x485d7.f39042x624074fb.f467918m = m70356x450e1efa.f38104xce64ddf1;
                }
                m70371x485d7.f39042x624074fb.f467919n = m70371x485d7.Id;
            }
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", m70371x485d7.f39042x624074fb.f467919n + ",");
            xVar.a("21uxinfo", m70371x485d7.f39042x624074fb.f467918m + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            xVar.a("23video_statu", ",");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(m70371x485d7.f39014x86965dde.f451370e == 15 ? 1 : 2);
            sb7.append(",");
            xVar.a("24source_type", sb7.toString());
            xVar.a("25scene", o1Var.f370802d + ",");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            i64.n1 n1Var2 = i64.n1.PlayIcon;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
            int i18 = n1Var.f370789d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
            sb8.append(i18);
            sb8.append(",");
            xVar.a("26action_type", sb8.toString());
            xVar.a("27scene_chatname", ",");
            xVar.a("28scene_username", m70371x485d7.f39018xf3f56116 + ",");
            xVar.a("29curr_publishid", m70371x485d7.Id + ",");
            xVar.a("30curr_msgid", "0,");
            xVar.a("31curr_favid", "0,");
            xVar.a("32elapsed_time", "0,");
            xVar.a("33load_time", "0,");
            xVar.a("34is_load_complete", "0,");
            xVar.a("35destination", "0,");
            xVar.a("36chatroom_membercount", "0,");
            com.p314xaae8f345.mm.p959x883644fd.k0.a(m70371x485d7.f39040xbd345fc4, xVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + xVar.c());
            ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Ai(12990, xVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("actionReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void b(i64.n1 n1Var, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("actionReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", str + ",");
        xVar.a("21uxinfo", str2 + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", ",");
        xVar.a("24source_type", i17 + ",");
        xVar.a("25scene", i18 + ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        i64.n1 n1Var2 = i64.n1.PlayIcon;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        int i28 = n1Var.f370789d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        sb7.append(i28);
        sb7.append(",");
        xVar.a("26action_type", sb7.toString());
        xVar.a("27scene_chatname", str4 + ",");
        xVar.a("28scene_username", str3 + ",");
        xVar.a("29curr_publishid", str5 + ",");
        xVar.a("30curr_msgid", j17 + ",");
        xVar.a("31curr_favid", i19 + ",");
        xVar.a("32elapsed_time", "0,");
        xVar.a("33load_time", "0,");
        xVar.a("34is_load_complete", "0,");
        xVar.a("35destination", "0,");
        xVar.a("36chatroom_membercount", i27 + ",");
        i64.q0.c(str5, xVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + xVar.c());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12990, xVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("actionReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        java.util.LinkedList linkedList = m70371x485d7.f39014x86965dde.f451373h;
        if (linkedList != null && !linkedList.isEmpty() && ((m70371x485d7.f39014x86965dde.f451370e == 15 && c17933xe8d1b226.m70377x3172ed()) || m70371x485d7.f39014x86965dde.f451370e == 18)) {
            int i18 = 2;
            if (c17933xe8d1b226.m70377x3172ed() && m70371x485d7.f39014x86965dde.f451370e == 15) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = i17 == 2 ? c17933xe8d1b226.m70356x450e1efa() : c17933xe8d1b226.m70346x10413e67();
                r45.tf6 tf6Var = m70371x485d7.f39042x624074fb;
                tf6Var.f467918m = m70356x450e1efa.f38104xce64ddf1;
                tf6Var.f467919n = m70371x485d7.Id;
            }
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", m70371x485d7.f39042x624074fb.f467919n + ",");
            xVar.a("21uxinfo", m70371x485d7.f39042x624074fb.f467918m + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(m70371x485d7.f39014x86965dde.f451370e == 15 ? 1 : 2);
            sb7.append(",");
            xVar.a("23souce_type", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            if (z17) {
                i18 = 6;
            } else if (m70371x485d7.f39014x86965dde.f451370e == 15) {
                i18 = 1;
            }
            sb8.append(i18);
            sb8.append(",");
            xVar.a("24scene", sb8.toString());
            xVar.a("25scene_chatname", ",");
            xVar.a("26scene_username", m70371x485d7.f39018xf3f56116 + ",");
            xVar.a("27curr_publishid", m70371x485d7.Id + ",");
            xVar.a("28curr_msgid", ",");
            xVar.a("29curr_favid", "0,");
            xVar.a("30isdownload", (z18 ? 1 : 0) + ",");
            xVar.a("31chatroom_membercount", "0,");
            com.p314xaae8f345.mm.p959x883644fd.k0.a(m70371x485d7.f39040xbd345fc4, xVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_exposure: " + xVar.c());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12989, xVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exposureReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void d(i64.q1 q1Var, i64.p1 p1Var, i64.r1 r1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        java.util.LinkedList linkedList = m70371x485d7.f39014x86965dde.f451373h;
        if (linkedList != null && !linkedList.isEmpty() && ((m70371x485d7.f39014x86965dde.f451370e == 15 && c17933xe8d1b226.m70377x3172ed()) || m70371x485d7.f39014x86965dde.f451370e == 18)) {
            if (c17933xe8d1b226.m70377x3172ed() && m70371x485d7.f39014x86965dde.f451370e == 15) {
                if ((i18 == 2 ? c17933xe8d1b226.m70356x450e1efa() : c17933xe8d1b226.m70346x10413e67()) != null) {
                    m70371x485d7.f39042x624074fb.f467918m = c17933xe8d1b226.m70346x10413e67().f38104xce64ddf1;
                }
                m70371x485d7.f39042x624074fb.f467919n = m70371x485d7.Id;
            }
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", m70371x485d7.f39042x624074fb.f467919n + ",");
            xVar.a("21uxinfo", m70371x485d7.f39042x624074fb.f467918m + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            i64.r1 r1Var2 = i64.r1.Samll;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
            int i19 = r1Var.f370838d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
            sb7.append(i19);
            sb7.append(",");
            xVar.a("23video_statu", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(m70371x485d7.f39014x86965dde.f451370e == 15 ? 1 : 2);
            sb8.append(",");
            xVar.a("24source_type", sb8.toString());
            xVar.a("25scene", q1Var.f370829d + ",");
            xVar.a("26action_type", p1Var.f370819d + ",");
            xVar.a("27scene_chatname", ",");
            xVar.a("28scene_username", m70371x485d7.f39018xf3f56116 + ",");
            xVar.a("29curr_publishid", m70371x485d7.Id + ",");
            xVar.a("30curr_msgid", "0,");
            xVar.a("31curr_favid", "0,");
            xVar.a("32chatroom_membercount", "0,");
            xVar.a("33chatroom_toMemberCount", i17 + ",");
            com.p314xaae8f345.mm.p959x883644fd.k0.a(m70371x485d7.f39040xbd345fc4, xVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + xVar.c());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12991, xVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spreadReport", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }

    public static void e(i64.p1 p1Var, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, int i19, int i27, int i28) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("spreadReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", str + ",");
        xVar.a("21uxinfo", str2 + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", "3,");
        xVar.a("24source_type", i17 + ",");
        xVar.a("25scene", i18 + ",");
        xVar.a("26action_type", p1Var.f370819d + ",");
        xVar.a("27scene_chatname", str4 + ",");
        xVar.a("28scene_username", str3 + ",");
        xVar.a("29curr_publishid", str5 + ",");
        xVar.a("30curr_msgid", j17 + ",");
        xVar.a("31curr_favid", i19 + ",");
        xVar.a("32chatroom_membercount", i27 + ",");
        xVar.a("33chatroom_toMemberCount", i28 + ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report snsad_video_spread: ");
        sb7.append(xVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoStatistic", sb7.toString());
        i64.q0.c(str5, xVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12991, xVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spreadReportInVideoUI", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic");
    }
}
