package rg0;

/* loaded from: classes9.dex */
public class e0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (at4.p1.f95458a == null) {
            at4.p1.f95458a = new at4.p1();
        }
        at4.p1 p1Var = at4.p1.f95458a;
        p1Var.getClass();
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        boolean z17 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (P < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletPushNotifyManager", "hy: paymsgtype error. maybe not found in xml");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPushNotifyManager", "handle paymsg type: %s", java.lang.Integer.valueOf(P));
            if (P == 12) {
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.avail_balance"), -1);
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.paymsg.balance_version"), -1L);
                at4.o1 o1Var = new at4.o1(p1Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.paymsg.time_out"), 7200L), V, P2, P, d17);
                java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new c01.ra(new com.p314xaae8f345.mm.p2802xd031a825.ui.i1(new java.lang.String[]{"wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance"}, o1Var), null));
            } else {
                z17 = false;
                if (P == 43) {
                    at4.a1 b17 = at4.a1.b(d17);
                    if (b17 != null) {
                        objArr[0] = b17;
                    }
                    at4.a1.c(g17);
                }
            }
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new at4.n1(P, d17, objArr));
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
