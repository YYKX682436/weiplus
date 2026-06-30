package x81;

/* loaded from: classes8.dex */
public abstract class f extends com.p314xaae8f345.mm.p944x882e457a.i {
    public f(int i17, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd c12558x591103cd) {
        p(s(i17, j17, j18, c12558x591103cd).a());
    }

    public static com.p314xaae8f345.mm.p944x882e457a.l s(int i17, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd c12558x591103cd) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "clickType:%d, page_stay_time:%d, app_stay_time:%d, recommendStatObj:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), c12558x591103cd.m52358x9616526c());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ki5 ki5Var = new r45.ki5();
        r45.vk5 vk5Var = new r45.vk5();
        r45.sk5 sk5Var = new r45.sk5();
        vk5Var.f469857d = c12558x591103cd.f169320r;
        r45.k40 k40Var = new r45.k40();
        k40Var.f459886d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        k40Var.f459887e = c12558x591103cd.f169318p;
        k40Var.f459888f = c12558x591103cd.f169319q;
        ki5Var.f460256d = vk5Var;
        ki5Var.f460257e = sk5Var;
        sk5Var.f467348d = i17;
        int i18 = c12558x591103cd.f169317o;
        java.lang.String str = c12558x591103cd.f169316n;
        java.lang.String str2 = c12558x591103cd.f169312g;
        java.lang.String str3 = c12558x591103cd.f169311f;
        java.lang.String str4 = c12558x591103cd.f169309d;
        if (i17 == 1) {
            r45.y35 y35Var = new r45.y35();
            y35Var.f472283d = str4;
            y35Var.f472284e = c12558x591103cd.f169310e;
            y35Var.f472285f = "" + java.lang.System.currentTimeMillis();
            y35Var.f472286g = str3;
            y35Var.f472287h = str2;
            y35Var.f472288i = str;
            y35Var.f472289m = i18;
            y35Var.f472290n = (int) j17;
            y35Var.f472291o = (int) j18;
            sk5Var.f467349e = y35Var;
        } else {
            r45.r8 r8Var = new r45.r8();
            r8Var.f466134d = str4;
            r8Var.f466135e = "" + java.lang.System.currentTimeMillis();
            r8Var.f466136f = str3;
            r8Var.f466137g = str2;
            r8Var.f466138h = str;
            r8Var.f466139i = i18;
            r8Var.f466140m = (int) j18;
            sk5Var.f467350f = r8Var;
        }
        lVar.f152197a = ki5Var;
        lVar.f152198b = new r45.li5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/rtreportrecommdclick";
        lVar.f152200d = 2799;
        return lVar;
    }
}
