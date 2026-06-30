package su4;

/* loaded from: classes8.dex */
public abstract class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final su4.j3 f494512a = new su4.j3();

    public static void a(int i17, java.lang.String str) {
        jx3.f.INSTANCE.d(12070, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0)), str, 4, 0, "", 1, 0);
    }

    public static void b(int i17, int i18, java.lang.String str, int i19, int i27, java.lang.String str2, int i28) {
        jx3.f.INSTANCE.d(12098, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0)), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str2, java.lang.Integer.valueOf(i28));
    }

    public static void c(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6636x67c19da4 c6636x67c19da4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6636x67c19da4();
        c6636x67c19da4.f139900d = c6636x67c19da4.b("Query", str.replace(',', ' '), true);
        c6636x67c19da4.f139901e = i17;
        c6636x67c19da4.f139902f = i18;
        c6636x67c19da4.f139904h = i19;
        c6636x67c19da4.f139903g = 0L;
        c6636x67c19da4.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchReportLogic", "report12639 %s", c6636x67c19da4.n().replace(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " "));
    }

    public static void d(int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i27, java.lang.String str6, long j17, long j18, int i28, java.lang.String str7, java.lang.String str8, int i29, int i37) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6609xded66dde c6609xded66dde = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6609xded66dde();
        c6609xded66dde.f139622e = i17;
        c6609xded66dde.f139621d = c6609xded66dde.b("RequestId", str, true);
        c6609xded66dde.f139623f = i18;
        c6609xded66dde.f139624g = i19;
        c6609xded66dde.f139625h = c6609xded66dde.b("HitWordList", str2, true);
        c6609xded66dde.f139626i = c6609xded66dde.b("HitWordVersion", str3, true);
        c6609xded66dde.f139627j = c6609xded66dde.b("MsgId", str4, true);
        c6609xded66dde.f139628k = c6609xded66dde.b("MsgFromUsername", "", true);
        c6609xded66dde.f139629l = i27;
        c6609xded66dde.f139630m = c6609xded66dde.b("ChatRoomID", str6, true);
        c6609xded66dde.f139631n = j17;
        c6609xded66dde.f139632o = j18;
        c6609xded66dde.f139633p = i28;
        c6609xded66dde.f139634q = c6609xded66dde.b("ShowHitWord", str7, true);
        c6609xded66dde.f139635r = c6609xded66dde.b("MatchTypeList", str8, true);
        c6609xded66dde.f139636s = i29;
        c6609xded66dde.f139637t = i37;
        c6609xded66dde.k();
        m(c6609xded66dde);
    }

    public static final void e(int i17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(649L, i17, 1L, true);
    }

    public static final void f(int i17, int i18) {
        if (i17 == 21) {
            jx3.f.INSTANCE.mo68477x336bdfd8(649L, i18, 1L, true);
        }
    }

    public static void g(int i17, int i18, int i19, int i27, java.lang.String str) {
        jx3.f.INSTANCE.d(14457, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17 == 21 ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1) : com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0)), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str);
    }

    public static void h() {
        su4.j3 j3Var = f494512a;
        if (j3Var.f494503g) {
            return;
        }
        jx3.f.INSTANCE.d(12044, java.lang.Integer.valueOf(j3Var.f494497a), java.lang.Integer.valueOf(j3Var.f494498b), java.lang.Long.valueOf(j3Var.f494500d / 1000), java.lang.Long.valueOf(j3Var.f494502f / 1000));
        j3Var.f494503g = true;
    }

    public static void i(r45.qn6 qn6Var, int i17, int i18, int i19, long j17, java.lang.String str) {
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            return;
        }
        if (qn6Var == null) {
            qn6Var = new r45.qn6();
            qn6Var.f465646d = "";
            qn6Var.f465654o = 0L;
            qn6Var.f465651i = 0;
        }
        if (qn6Var.f465651i == 0) {
            qn6Var.f465651i = i18;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("reddotreport=1&reddotid=");
        java.lang.String str2 = qn6Var.f465646d;
        stringBuffer.append(str2 != null ? str2 : "");
        stringBuffer.append("&reddotts=");
        stringBuffer.append(qn6Var.f465654o);
        stringBuffer.append("&nettype=");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
        stringBuffer.append("&optype=");
        stringBuffer.append(i17);
        stringBuffer.append("&reddottype=");
        stringBuffer.append(qn6Var.f465651i);
        stringBuffer.append("&reddotcnt=");
        stringBuffer.append(i19);
        stringBuffer.append("&reddotconsumets=");
        stringBuffer.append(j17);
        stringBuffer.append("&notshowreason=");
        stringBuffer.append(str);
        stringBuffer.append("&reddotseq=");
        stringBuffer.append(qn6Var.f465659t);
        if (i17 == 100 || i17 == 101 || i17 == 102 || i17 == 108) {
            int i27 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().l(68377, null)) ? 1 : 0;
            int f17 = ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi()).f() : 0;
            if (f17 > 0) {
                stringBuffer.append("&snsreddottype=2&snsreddotcnt=");
                stringBuffer.append(f17);
            } else if (i27 > 0) {
                stringBuffer.append("&snsreddottype=1&snsreddotcnt=0");
            } else {
                stringBuffer.append("&snsreddottype=0&snsreddotcnt=0");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory", "reportTopStoryRedDot 16399 %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = stringBuffer.toString();
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void j(java.lang.String str, long j17, int i17, int i18, int i19, long j18, java.lang.String str2, int i27) {
        ((ku5.t0) ku5.t0.f394148d).h(new su4.h3(str, j17, i17, i18, i19, j18, str2, i27), "ReportTopStoryRedDotKv");
    }

    public static void k(int i17, int i18, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("recnondocreport=1&type=51&content=");
        stringBuffer.append(i17);
        stringBuffer.append("|");
        stringBuffer.append(i18);
        stringBuffer.append("|");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append("|");
        stringBuffer.append(z17 ? 1 : 0);
        stringBuffer.append("&searchid=");
        if (str2 == null) {
            str2 = "";
        }
        stringBuffer.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory", "reportTopStoryRedDot 14791 %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = stringBuffer.toString();
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void l() {
        su4.j3 j3Var = f494512a;
        j3Var.f494500d += java.lang.System.currentTimeMillis() - j3Var.f494499c;
    }

    public static void m(jx3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchReportLogic", "report%s %s", java.lang.Integer.valueOf(aVar.g()), aVar.n().replace(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " "));
    }
}
