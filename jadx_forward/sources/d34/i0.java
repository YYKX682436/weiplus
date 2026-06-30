package d34;

/* loaded from: classes11.dex */
public class i0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        ((c34.h0) i95.n0.c(c34.h0.class)).getClass();
        gm0.j1.b().c();
        ((c34.h0) i95.n0.c(c34.h0.class)).getClass();
        gm0.j1.b().c();
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.shake.$type"), 0) != 1) {
            return;
        }
        c34.t tVar = new c34.t();
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.shake.shaketv.msgtype"), 0);
        if (P != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMsgMgr", "Unknown subType:" + P);
            return;
        }
        tVar.f4170x2262335f = 1;
        tVar.f4165x541db35 = P;
        tVar.f4166x29d4cc45 = p0Var.f152259a.f459101r;
        tVar.f4158xad24a2e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        tVar.f4167x4b6e82d5 = (java.lang.String) d17.get(".sysmsg.shake.shaketv.jumpurl");
        tVar.f4164x10a0fed7 = 0;
        tVar.f4169x29dd02d3 = (java.lang.String) d17.get(".sysmsg.shake.shaketv.title");
        tVar.f4168x7b28c57e = (java.lang.String) d17.get(".sysmsg.shake.shaketv.iconurl");
        tVar.f4159x225aa2b6 = (java.lang.String) d17.get(".sysmsg.shake.shaketv.desc");
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.shake.shaketv.pid");
        if (str == null) {
            str = "";
        }
        tVar.f4160x13320504 = str;
        c34.h0.Ri().mo880xb970c2b9(tVar);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
