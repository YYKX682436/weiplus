package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes9.dex */
public abstract class b {
    public static void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6753xa6c886e5 c6753xa6c886e5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6753xa6c886e5();
        c6753xa6c886e5.f140807e = c6753xa6c886e5.b("ChatNameStr", f9Var.Q0(), true);
        c6753xa6c886e5.f140806d = c01.h2.b(r3);
        c6753xa6c886e5.k();
    }

    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        java.lang.String s17;
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6752xbb29c02d c6752xbb29c02d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6752xbb29c02d();
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0);
        if (R4 && R4 && (s17 = c01.w9.s(f9Var.j())) != null) {
            s17.length();
        }
        c01.z1.r();
        c6752xbb29c02d.f140803d = c01.h2.b(Q0);
        c6752xbb29c02d.f140805f = c6752xbb29c02d.b("ChatNameStr", Q0, true);
        c6752xbb29c02d.f140804e = i17;
        c6752xbb29c02d.k();
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p959x883644fd.a aVar) {
        java.lang.String l17;
        int t17;
        ot0.q v17;
        n15.a k17;
        bm5.v a17 = bm5.w.a(f9Var);
        bm5.v vVar = bm5.v.f104276f;
        java.lang.String str = "";
        if (a17 == vVar) {
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).getClass();
            java.lang.String j17 = f9Var.j();
            if (j17 != null) {
                j15.d dVar = new j15.d();
                dVar.m126728xdc93280d(j17);
                l15.d r17 = dVar.r();
                if (r17 == null || (k17 = r17.k()) == null || (l17 = k17.j()) == null) {
                    l17 = f9Var.Q;
                }
            }
            l17 = "";
        } else if (bm5.w.a(f9Var) == bm5.v.f104277g) {
            l17 = t21.j3.f496333h.c(f9Var);
        } else {
            if (bm5.w.a(f9Var) == bm5.v.f104279i) {
                l17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.l(f9Var);
            }
            l17 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20ExpIdStr", l17 + ",");
        xVar.a("21OpType", aVar.f153019d + ",");
        xVar.a("22msgId", f9Var.I0() + ",");
        xVar.a("23MessageType", f9Var.mo78013xfb85f7b0() + ",");
        int i17 = 0;
        int i18 = (!f9Var.k2() || (v17 = ot0.q.v(f9Var.U1())) == null) ? 0 : v17.f430199i;
        java.lang.String Q0 = f9Var.Q0();
        xVar.a("24AppMsgInnerType", i18 + ",");
        xVar.a("25curUsername", Q0 + ",");
        if (f9Var.A0() == 1) {
            str = c01.z1.r();
        } else if (Q0 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
            str = Q0;
        } else if (f9Var.j() != null && (t17 = c01.w9.t(f9Var.j())) != -1) {
            str = f9Var.j().substring(0, t17).trim();
        }
        xVar.a("26msgPostUserName", str + ",");
        if (bm5.w.a(f9Var) == vVar) {
            i17 = ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).fj(f9Var);
        } else if (bm5.w.a(f9Var) == bm5.v.f104277g) {
            i17 = t21.j3.f496333h.b(f9Var);
        }
        xVar.a("27MediaState", i17 + ",");
        xVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13564, xVar);
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p959x883644fd.a aVar, java.lang.String str, int i17) {
        c(f9Var, aVar);
        if (aVar == com.p314xaae8f345.mm.p959x883644fd.a.Click && com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(f9Var.Q0())) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            int i18 = v17 == null ? 0 : v17.f430199i;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("msgid", java.lang.Long.valueOf(f9Var.I0()));
            hashMap.put("msgtype", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
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
