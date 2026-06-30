package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes9.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.q0 f267348a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.q0();

    public final void a(ot0.m1 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5 c19429x834b7ec5 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.C19429x834b7ec5();
        c19429x834b7ec5.f267266h = msgInfo;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c19429x834b7ec5, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.o0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.p0.f267343d);
    }

    public final void b(r45.ee eeVar) {
        if (eeVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MpShareVideoMsgFav", "doFav msgInfo is null");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        java.lang.String str = eeVar.f454883r;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        c01.l2 c17 = c01.n2.d().c(c01.n2.a(str), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        c17.i("sendAppMsgScene", 2);
        c17.i("preChatName", eeVar.f454884s);
        c17.i("prePublishId", eeVar.f454883r);
        c17.i("preUsername", eeVar.f454885t);
        c17.i("referUrl", eeVar.f454880o);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87860m = 36;
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(4);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.f(eeVar.f454880o);
        bq0Var.o(jq0Var);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.A0("");
        gp0Var.o0(eeVar.f454876h);
        gp0Var.g0(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(eeVar.f454874f + eeVar.f454872d));
        gp0Var.n0(eeVar.f454877i);
        gp0Var.O0(eeVar.f454875g);
        gp0Var.K0(eeVar.f454880o);
        gp0Var.x0(true);
        gp0Var.z0(true);
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f465701m = eeVar.f454874f;
        qp0Var.f465708t = eeVar.f454873e;
        qp0Var.f465707s = eeVar.f454872d;
        qp0Var.f465702n = eeVar.f454881p;
        qp0Var.f465703o = eeVar.f454882q;
        qp0Var.f465706r = eeVar.f454876h;
        qp0Var.f465697f = eeVar.f454878m;
        qp0Var.f465698g = eeVar.f454879n;
        qp0Var.f465700i = eeVar.f454877i;
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f457903x = qp0Var;
        gp0Var.J1 = hp0Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(gp0Var);
        bq0Var.d(linkedList);
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 4;
        gp0Var.h0(4);
        c5303xc75d2f73.e();
    }
}
