package com.tencent.mm.modelstat;

/* loaded from: classes9.dex */
public abstract class b {
    public static void a(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MsgHistoryWatchReportStruct msgHistoryWatchReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgHistoryWatchReportStruct();
        msgHistoryWatchReportStruct.f59274e = msgHistoryWatchReportStruct.b("ChatNameStr", f9Var.Q0(), true);
        msgHistoryWatchReportStruct.f59273d = c01.h2.b(r3);
        msgHistoryWatchReportStruct.k();
    }

    public static void b(com.tencent.mm.storage.f9 f9Var, int i17) {
        java.lang.String s17;
        if (f9Var == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MsgHistoryResendActionReportStruct msgHistoryResendActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgHistoryResendActionReportStruct();
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean R4 = com.tencent.mm.storage.z3.R4(Q0);
        if (R4 && R4 && (s17 = c01.w9.s(f9Var.j())) != null) {
            s17.length();
        }
        c01.z1.r();
        msgHistoryResendActionReportStruct.f59270d = c01.h2.b(Q0);
        msgHistoryResendActionReportStruct.f59272f = msgHistoryResendActionReportStruct.b("ChatNameStr", Q0, true);
        msgHistoryResendActionReportStruct.f59271e = i17;
        msgHistoryResendActionReportStruct.k();
    }

    public static void c(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.modelstat.a aVar) {
        java.lang.String l17;
        int t17;
        ot0.q v17;
        n15.a k17;
        bm5.v a17 = bm5.w.a(f9Var);
        bm5.v vVar = bm5.v.f22743f;
        java.lang.String str = "";
        if (a17 == vVar) {
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).getClass();
            java.lang.String j17 = f9Var.j();
            if (j17 != null) {
                j15.d dVar = new j15.d();
                dVar.fromXml(j17);
                l15.d r17 = dVar.r();
                if (r17 == null || (k17 = r17.k()) == null || (l17 = k17.j()) == null) {
                    l17 = f9Var.Q;
                }
            }
            l17 = "";
        } else if (bm5.w.a(f9Var) == bm5.v.f22744g) {
            l17 = t21.j3.f414800h.c(f9Var);
        } else {
            if (bm5.w.a(f9Var) == bm5.v.f22746i) {
                l17 = com.tencent.mm.pluginsdk.model.app.k0.l(f9Var);
            }
            l17 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20ExpIdStr", l17 + ",");
        xVar.a("21OpType", aVar.f71486d + ",");
        xVar.a("22msgId", f9Var.I0() + ",");
        xVar.a("23MessageType", f9Var.getType() + ",");
        int i17 = 0;
        int i18 = (!f9Var.k2() || (v17 = ot0.q.v(f9Var.U1())) == null) ? 0 : v17.f348666i;
        java.lang.String Q0 = f9Var.Q0();
        xVar.a("24AppMsgInnerType", i18 + ",");
        xVar.a("25curUsername", Q0 + ",");
        if (f9Var.A0() == 1) {
            str = c01.z1.r();
        } else if (Q0 == null || !com.tencent.mm.storage.z3.R4(Q0)) {
            str = Q0;
        } else if (f9Var.j() != null && (t17 = c01.w9.t(f9Var.j())) != -1) {
            str = f9Var.j().substring(0, t17).trim();
        }
        xVar.a("26msgPostUserName", str + ",");
        if (bm5.w.a(f9Var) == vVar) {
            i17 = ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).fj(f9Var);
        } else if (bm5.w.a(f9Var) == bm5.v.f22744g) {
            i17 = t21.j3.f414800h.b(f9Var);
        }
        xVar.a("27MediaState", i17 + ",");
        xVar.c();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13564, xVar);
    }

    public static void d(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.modelstat.a aVar, java.lang.String str, int i17) {
        c(f9Var, aVar);
        if (aVar == com.tencent.mm.modelstat.a.Click && com.tencent.mm.storage.z3.L3(f9Var.Q0())) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            int i18 = v17 == null ? 0 : v17.f348666i;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("msgid", java.lang.Long.valueOf(f9Var.I0()));
            hashMap.put("msgtype", java.lang.Integer.valueOf(f9Var.getType()));
            hashMap.put("submsgtype", java.lang.Integer.valueOf(i18));
            hashMap.put("chat_name", f9Var.Q0());
            hashMap.put("enter_sessionid", str);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(i17)));
            hashMap.put("fromtype", java.lang.Integer.valueOf(f9Var.A0() != 1 ? 11 : 1));
            hashMap.put("view_id", "yuanbao_msg_details");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }
}
