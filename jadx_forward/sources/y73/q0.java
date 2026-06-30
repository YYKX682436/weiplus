package y73;

/* loaded from: classes11.dex */
public class q0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (gm0.j1.a()) {
            r45.j4 j4Var = p0Var.f152259a;
            if (j4Var.f459093g == 10002) {
                java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "msg content is null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "onReciveMsg :%s", g17);
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
                if (d17 == null || d17.size() <= 0) {
                    return;
                }
                java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equalsIgnoreCase("prconfignotify")) {
                    return;
                }
                int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".sysmsg.boots.ignorenetwork"), 0);
                java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.boots.xmlkey");
                if (str2 == null) {
                    str2 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "ignore:%s md5 %s start checkout tinker update. try to do update.", java.lang.Integer.valueOf(D1), str2);
                fy5.a.d().c("uin", java.lang.String.valueOf(gm0.m.i() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2)).c("network", java.lang.String.valueOf((com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || D1 == 1) ? 3 : 2));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    fy5.a.d().c("xmlkey", str2);
                }
                fy5.a.d().a(true);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
