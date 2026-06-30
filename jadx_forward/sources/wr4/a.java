package wr4;

/* loaded from: classes9.dex */
public class a implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if ("paymsg".equals(str) && java.lang.String.valueOf(30).equals(map.get(".sysmsg.paymsg.PayMsgType"))) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.WalletRedDot"), 0);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.BankCardRedDot"), 0);
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.paymsg.NewTagBankSerial");
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.paymsg.WalletRedDotWording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BankCardRedDotReceiver", "moreTabWallet: %s, walletBankCard: %s, bankSerial: %s", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), str2);
            if (P == 1) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC, true);
            } else {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC, false);
            }
            if (P2 == 1) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_WALLET_BANKCARD_STRING_SYNC, true);
            } else {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_WALLET_BANKCARD_STRING_SYNC, false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_MORE_TAB_REDDOT_WORDING_STRING_SYNC, str3);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC;
            java.lang.String str4 = (java.lang.String) c17.m(u3Var, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                str2 = str4 + "," + str2;
            }
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, str2);
        }
    }
}
