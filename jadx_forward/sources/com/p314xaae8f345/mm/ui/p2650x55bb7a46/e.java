package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes4.dex */
public abstract class e {
    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.a aVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        java.lang.String Q0 = f9Var.Q0();
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0);
        java.lang.String r17 = f9Var.A0() == 1 ? c01.z1.r() : R4 ? c01.w9.s(f9Var.j()) : Q0;
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", str + ",");
        xVar.a("21uxinfo", str2 + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(f9Var.mo78013xfb85f7b0() != 62 ? 2 : 1);
        sb7.append(",");
        xVar.a("24source_type", sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(R4 ? 4 : 3);
        sb8.append(",");
        xVar.a("25scene", sb8.toString());
        xVar.a("26action_type", aVar.f279888d + ",");
        xVar.a("27scene_chatname", Q0 + ",");
        xVar.a("28scene_username", r17 + ",");
        xVar.a("29curr_publishid", ",");
        xVar.a("30curr_msgid", f9Var.I0() + ",");
        xVar.a("31curr_favid", "0,");
        xVar.a("32elapsed_time", "0,");
        xVar.a("33load_time", "0,");
        xVar.a("34is_load_complete", "0,");
        xVar.a("35destination", "0,");
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(Q0) : 0);
        sb9.append(",");
        xVar.a("36chatroom_membercount", sb9.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdVideoStatistic", "report snsad_video_action: " + xVar.c());
        ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Ai(12990, xVar);
    }

    public static boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812) {
        r45.uf6 uf6Var;
        if (f9Var.mo78013xfb85f7b0() == 62) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (h17 == null || (uf6Var = h17.E) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468872m)) {
                return false;
            }
            c19772x1c2cd081.f38869x6ac9171 = uf6Var.f468873n;
            c19772x1c2cd0812.f38869x6ac9171 = uf6Var.f468872m;
            return true;
        }
        if (f9Var.mo78013xfb85f7b0() == 49) {
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
            java.lang.String j17 = f9Var.j();
            if (R4 && f9Var.j() != null && f9Var.A0() == 0) {
                j17 = c01.w9.u(f9Var.j());
            }
            ot0.q v17 = ot0.q.v(j17);
            if (v17 != null && v17.f430199i == 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430170a2)) {
                c19772x1c2cd081.f38869x6ac9171 = v17.f430198h2;
                c19772x1c2cd0812.f38869x6ac9171 = v17.f430194g2;
                return true;
            }
        }
        return false;
    }

    public static void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c cVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        if (b(f9Var, c19772x1c2cd081, c19772x1c2cd0812)) {
            java.lang.String str = c19772x1c2cd081.f38869x6ac9171;
            java.lang.String str2 = c19772x1c2cd0812.f38869x6ac9171;
            java.lang.String Q0 = f9Var.Q0();
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0);
            java.lang.String r17 = f9Var.A0() == 1 ? c01.z1.r() : R4 ? c01.w9.s(f9Var.j()) : Q0;
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", str + ",");
            xVar.a("21uxinfo", str2 + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            xVar.a("23video_statu", dVar.f281941d + ",");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(f9Var.mo78013xfb85f7b0() != 62 ? 2 : 1);
            sb7.append(",");
            xVar.a("24source_type", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(R4 ? 4 : 3);
            sb8.append(",");
            xVar.a("25scene", sb8.toString());
            xVar.a("26action_type", cVar.f280042d + ",");
            xVar.a("27scene_chatname", Q0 + ",");
            xVar.a("28scene_username", r17 + ",");
            xVar.a("29curr_publishid", ",");
            xVar.a("30curr_msgid", f9Var.I0() + ",");
            xVar.a("31curr_favid", "0,");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(Q0) : 0);
            sb9.append(",");
            xVar.a("32chatroom_membercount", sb9.toString());
            xVar.a("33chatroom_toMemberCount", i17 + ",");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("report snsad_video_spread: ");
            sb10.append(xVar.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdVideoStatistic", sb10.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12991, xVar);
        }
    }
}
