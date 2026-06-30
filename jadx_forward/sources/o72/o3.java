package o72;

/* loaded from: classes4.dex */
public abstract class o3 {
    public static void a(o72.r2 r2Var) {
        r45.gp0 gp0Var;
        r45.jp0 jp0Var;
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList == null || linkedList.isEmpty() || (jp0Var = (gp0Var = (r45.gp0) r2Var.f67640x5ab01132.f452497f.getFirst()).O1) == null) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", jp0Var.f459538n + ",");
        xVar.a("21uxinfo", jp0Var.f459537m + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(r2Var.f67657x2262335f == 16 ? 1 : 2);
        sb7.append(",");
        xVar.a("23source_type", sb7.toString());
        xVar.a("24scene", "5,");
        xVar.a("25scene_chatname", ",");
        xVar.a("26scene_username", r2Var.f67642xd3939c3a + ",");
        xVar.a("27curr_publishid", ",");
        xVar.a("28curr_msgid", "0,");
        xVar.a("29curr_favid", r2Var.f67643xc8a07680 + ",");
        xVar.a("30isdownload", "0,");
        xVar.a("31chatroom_membercount", "0,");
        p94.o0 o0Var = (p94.o0) i95.n0.c(p94.o0.class);
        java.lang.String str = gp0Var.R1;
        ((n34.p4) o0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendSourceAndSnsStatWithExt", "com.tencent.mm.plugin.sns.SnsStatService");
        com.p314xaae8f345.mm.p959x883644fd.k0.b(str, xVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendSourceAndSnsStatWithExt", "com.tencent.mm.plugin.sns.SnsStatService");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVideoStatistic", "report snsad_video_exposure: " + xVar.c());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12989, xVar);
    }

    public static void b(o72.k3 k3Var, o72.r2 r2Var) {
        r45.jp0 jp0Var;
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList == null || linkedList.isEmpty() || (jp0Var = ((r45.gp0) r2Var.f67640x5ab01132.f452497f.getFirst()).O1) == null) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", jp0Var.f459538n + ",");
        xVar.a("21uxinfo", jp0Var.f459537m + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(r2Var.f67657x2262335f == 16 ? 1 : 2);
        sb7.append(",");
        xVar.a("24source_type", sb7.toString());
        xVar.a("25scene", "5,");
        xVar.a("26action_type", k3Var.f424923d + ",");
        xVar.a("27scene_chatname", ",");
        xVar.a("28scene_username", r2Var.f67642xd3939c3a + ",");
        xVar.a("29curr_publishid", ",");
        xVar.a("30curr_msgid", "0,");
        xVar.a("31curr_favid", r2Var.f67643xc8a07680 + ",");
        xVar.a("32elapsed_time", "0,");
        xVar.a("33load_time", "0,");
        xVar.a("34is_load_complete", "0,");
        xVar.a("35destination", "0,");
        xVar.a("36chatroom_membercount", "0,");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVideoStatistic", "report snsad_video_action: " + xVar.c());
        ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Ai(12990, xVar);
    }

    public static void c(o72.m3 m3Var, o72.r2 r2Var, o72.n3 n3Var, int i17) {
        r45.jp0 jp0Var;
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList == null || linkedList.isEmpty() || (jp0Var = ((r45.gp0) r2Var.f67640x5ab01132.f452497f.getFirst()).O1) == null) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", jp0Var.f459538n + ",");
        xVar.a("21uxinfo", jp0Var.f459537m + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", n3Var.f424956d + ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(r2Var.f67657x2262335f == 16 ? 1 : 2);
        sb7.append(",");
        xVar.a("24source_type", sb7.toString());
        xVar.a("25scene", "5,");
        xVar.a("26action_type", m3Var.f424950d + ",");
        xVar.a("27scene_chatname", ",");
        xVar.a("28scene_username", r2Var.f67642xd3939c3a + ",");
        xVar.a("29curr_publishid", ",");
        xVar.a("30curr_msgid", "0,");
        xVar.a("31curr_favid", r2Var.f67643xc8a07680 + ",");
        xVar.a("32chatroom_membercount", "0,");
        xVar.a("33chatroom_toMemberCount", i17 + ",");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("report snsad_video_spread: ");
        sb8.append(xVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVideoStatistic", sb8.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12991, xVar);
    }
}
