package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class h1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x081f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x088b A[EDGE_INSN: B:235:0x088b->B:236:0x088b BREAK  A[LOOP:3: B:224:0x0874->B:233:0x08dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0897  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [com.tencent.mm.plugin.game.model.e1] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 a(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 2381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h1.a(java.lang.String):com.tencent.mm.plugin.game.model.e1");
    }

    public static void b(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        int R;
        if (e1Var == null || map == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".sysmsg.report_rule.$report_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c1 c1Var = e1Var.J2;
        c1Var.f221778a = str;
        c1Var.f221779b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.report_rule.report_mode"), 0);
        c1Var.f221780c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.report_rule.report_sample"), 0);
        if (c1Var.f221781d == null) {
            int i17 = c1Var.f221779b;
            if (i17 == 0) {
                c1Var.f221781d = java.lang.Boolean.TRUE;
            } else if (i17 == 1) {
                c1Var.f221781d = java.lang.Boolean.FALSE;
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(e1Var.f68468x297eb4f7);
                if (L0 != null) {
                    c1Var.f221781d = java.lang.Boolean.valueOf(L0.f68470x672cb5cf);
                } else {
                    try {
                        gm0.j1.i();
                        R = new java.util.Random(gm0.j1.b().h() ^ java.lang.System.nanoTime()).nextInt(10001);
                    } catch (java.lang.Exception unused) {
                        R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(10000, 0);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageParser", "randomValue:%d, reportSample:%d", java.lang.Integer.valueOf(R), java.lang.Integer.valueOf(c1Var.f221780c));
                    if (R < c1Var.f221780c) {
                        c1Var.f221781d = java.lang.Boolean.TRUE;
                    } else {
                        c1Var.f221781d = java.lang.Boolean.FALSE;
                    }
                }
            }
            if (c1Var.f221781d == null) {
                c1Var.f221781d = java.lang.Boolean.FALSE;
            }
        }
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(c1Var.f221781d, false);
        e1Var.f68470x672cb5cf = m17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageParser", "gameMessageId:%s, needReport:%b", e1Var.f68458xd54c6aa5, java.lang.Boolean.valueOf(m17));
    }

    public static void c(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = e1Var.f221824p2;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.gamecenter.floatlayer.open_url");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        h0Var.f221856a = str;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.floatlayer.full_screen"), 0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var2 = e1Var.f221824p2;
        h0Var2.f221857b = z18;
        h0Var2.f221858c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.floatlayer.orientation"), 0);
        h0Var2.f221859d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.gamecenter.floatlayer.is_transparent"), 0) == 1;
    }
}
