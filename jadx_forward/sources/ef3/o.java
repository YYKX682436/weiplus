package ef3;

/* loaded from: classes9.dex */
public class o implements gm5.a {
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QueryWeChatWalletManager", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.wh5 wh5Var = (r45.wh5) fVar.f152151d;
            r45.yj6 yj6Var = wh5Var.f470698d;
            if (yj6Var != null) {
                java.util.Iterator it = yj6Var.f472693e.iterator();
                while (it.hasNext()) {
                    java.util.Iterator it6 = ((r45.e14) it.next()).f454437e.iterator();
                    while (it6.hasNext()) {
                        r45.xj6 xj6Var = (r45.xj6) it6.next();
                        boolean equals = xj6Var.f471704i.equals("balance_cell");
                        java.util.LinkedList linkedList = xj6Var.f471701f;
                        if (equals) {
                            if (linkedList != null && linkedList.size() > 0) {
                                java.lang.String charSequence = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (r45.rl6) linkedList.get(0), null).toString();
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence) && charSequence.length() > 1) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(charSequence.substring(1), "100")));
                                }
                            }
                        } else if (xj6Var.f471704i.equals("lqt_cell") && linkedList != null && linkedList.size() > 0) {
                            java.lang.String charSequence2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (r45.rl6) linkedList.get(0), null).toString();
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence2) && charSequence2.length() > 1) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_LQT_LONG_SYNC, java.lang.Long.valueOf(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(charSequence2.substring(1), "100")));
                            }
                        }
                    }
                }
            }
            try {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RESP_CACHE_STRING_SYNC, new java.lang.String(wh5Var.mo14344x5f01b1f6(), s46.a.f484534a));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QueryWeChatWalletManager", e17, "", new java.lang.Object[0]);
            }
            r45.s77 s77Var = wh5Var.f470700f;
            if (s77Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QueryWeChatWalletManager", "wallet balance: %s", java.lang.Long.valueOf(s77Var.f467072d));
                at4.v1 r17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().r();
                r17.f67069x257bda7b = wh5Var.f470700f.f467072d;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(r17.f67069x257bda7b));
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().H(r17);
            }
        }
        return (r45.wh5) fVar.f152151d;
    }
}
