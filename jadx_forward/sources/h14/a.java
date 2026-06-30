package h14;

/* loaded from: classes9.dex */
public class a implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        long j17;
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (g17 == null || g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CrowdTestListener", "onReceiveMsg, crowdtest msgContent is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.crowdtest.$clientversion"), 0);
        if (P <= o45.wf.f424562g) {
            return;
        }
        try {
            j17 = new java.text.SimpleDateFormat("yyyy-MM-dd").parse((java.lang.String) d17.get(".sysmsg.crowdtest.apply.$expire")).getTime();
        } catch (java.lang.Exception unused) {
            j17 = 0;
        }
        if (j17 < java.lang.System.currentTimeMillis()) {
            f14.j.wi();
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.crowdtest.apply.link");
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.crowdtest.feedback.link");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_CLIENT_VERSION_INT, java.lang.Integer.valueOf(P));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, java.lang.Long.valueOf(j17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_APPLY_LINK_STRING, str);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CROWDTEST_FEEDBACK_LINK_STRING, str2);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.crowdtest.apply.reddotlevel"), 0);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262157, P2 >= 1);
        if (P2 < 3) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262157, 266261);
        }
        if (P2 < 2) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262157, 266262);
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
