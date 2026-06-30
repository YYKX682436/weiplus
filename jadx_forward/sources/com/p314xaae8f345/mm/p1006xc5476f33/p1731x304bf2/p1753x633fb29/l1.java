package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221890d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1 i1Var, java.lang.String str) {
        this.f221890d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.o4 o4Var = new m53.o4();
        o4Var.f405474d = "zh_CN";
        o4Var.f405475e = "";
        m53.g gVar = new m53.g();
        gVar.f405220d = android.os.Build.VERSION.SDK_INT;
        gVar.f405221e = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
        o4Var.f405476f = gVar;
        o4Var.f405477g = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().z1()).size();
        java.lang.String str = this.f221890d;
        o4Var.f405478h = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = o4Var;
        lVar.f152198b = new m53.p4();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamemsgpushappsvr/pullusermessage";
        lVar.f152200d = 9175;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_LAST_PULL_MSG_TIME_SEC_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "gamelog.srv_msg, service,PullUserMessageRequest,transData:%s", str);
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k1(this));
    }
}
