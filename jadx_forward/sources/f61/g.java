package f61;

/* loaded from: classes9.dex */
public class g implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        boolean z17;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), 0);
        int i17 = o45.wf.f424556a;
        if (P == 32) {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.receiveorpayreddot"), -1);
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.grouppayreddot"), -1);
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.facingreceivereddot"), -1);
            int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.f2fhongbaoreddot"), -1);
            int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.rewardcodereddot"), -1);
            int P7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.android_minclientversion"), -1);
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.paymsg.facingreceivereddotwording");
            if (str2 == null) {
                str2 = "";
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AARedDotReceiver", "recvOrPay: %s, aa: %s, collect： %s, f2fhb: %s, qrreward: %s, version： %s", java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(P3), java.lang.Integer.valueOf(P4), java.lang.Integer.valueOf(P5), java.lang.Integer.valueOf(P6), java.lang.Integer.valueOf(P7));
            if (o45.wf.f424562g >= P7) {
                if (P2 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AARedDotReceiver", "mark recv or pay red dot");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262159, true);
                } else if (P2 == 0) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262159, false);
                }
                if (P3 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AARedDotReceiver", "mark group pay red dot");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, true);
                    z17 = true;
                } else {
                    if (P3 == 0) {
                        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                        bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, false);
                    }
                    z17 = false;
                }
                if (P4 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AARedDotReceiver", "mark f2f recv red dot");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC, true);
                    z17 = true;
                } else if (P4 == 0) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC, false);
                }
                if (P5 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AARedDotReceiver", "mark f2f hb red dot");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, true);
                    z17 = true;
                } else if (P5 == 0) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, false);
                }
                if (P6 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AARedDotReceiver", "mark qr reward red dot");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, true);
                    z17 = true;
                } else if (P6 == 0) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, false);
                }
                if (z17) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14396, 1);
        }
    }
}
