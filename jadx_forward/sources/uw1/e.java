package uw1;

/* loaded from: classes15.dex */
public class e implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (tw1.f.Di().Ni() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PayMsgListener", "func[onRecieveMsg] payerMsgMgr null");
            return;
        }
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        ww1.v Ni = tw1.f.Di().Ni();
        long j17 = p0Var.f152259a.f459098o;
        Ni.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), 0);
        if (P != 9 && P != 26 && P != 50) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectPayerMsgMgr", "Not ftf collect msg type, ignore; type=" + P);
            return;
        }
        ww1.g2 g2Var = new ww1.g2();
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.paymsg.username");
        if (str == null) {
            str = "";
        }
        g2Var.f531728d = str;
        g2Var.f531730f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) d17.get(".sysmsg.paymsg.fee"), 0.0d) / 100.0d;
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.paymsg.feetype");
        if (str2 == null) {
            str2 = "";
        }
        g2Var.f531731g = str2;
        g2Var.f531732h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsgtimestamp"), (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.transid");
        if (str3 == null) {
            str3 = "";
        }
        g2Var.f531729e = str3;
        java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.paymsg.displayname");
        if (str4 == null) {
            str4 = "";
        }
        g2Var.f531735n = str4;
        g2Var.f531733i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.scene"), 1);
        g2Var.f531734m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.status"), 0);
        g2Var.f531737p = P;
        java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.paymsg.outtradeno");
        if (str5 == null) {
            str5 = "";
        }
        g2Var.f531736o = str5;
        java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.paymsg.type");
        if (str6 == null) {
            str6 = "";
        }
        g2Var.f531738q = str6;
        java.lang.String str7 = (java.lang.String) d17.get(".sysmsg.paymsg.headimgurl");
        if (str7 == null) {
            str7 = "";
        }
        g2Var.f531739r = str7;
        java.lang.String str8 = (java.lang.String) d17.get(".sysmsg.paymsg.voice_content");
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = (java.lang.String) d17.get(".sysmsg.paymsg.expire_voice_timestamp");
        java.lang.String str10 = str9 != null ? str9 : "";
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.need_failover"), 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] final content:%s", g17);
        for (ww1.u uVar : Ni.f531844d) {
            if (uVar != null) {
                uVar.E4(g2Var);
            }
        }
        if (g2Var.f531734m == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3 c5279xf48561e3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5279xf48561e3();
            int round = (int) java.lang.Math.round(g2Var.f531730f * 100.0d);
            am.h3 h3Var = c5279xf48561e3.f135602g;
            h3Var.f88341a = round;
            h3Var.f88342b = g2Var.f531731g;
            h3Var.f88344d = g2Var.f531738q;
            h3Var.f88343c = g2Var.f531736o;
            h3Var.f88345e = c01.id.c() - (j17 * 1000);
            h3Var.f88346f = 1;
            h3Var.f88347g = str8;
            h3Var.f88348h = str10;
            if (P2 == 0) {
                h3Var.f88349i = false;
            } else {
                h3Var.f88349i = true;
            }
            c5279xf48561e3.e();
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
