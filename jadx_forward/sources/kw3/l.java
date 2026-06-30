package kw3;

/* loaded from: classes9.dex */
public class l implements java.lang.Runnable {
    public l(kw3.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.qq4 qq4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h.f238380b.f238381a;
        try {
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_MSGCHECKTASKINFO_STRING_SYNC, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                qq4Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
            }
            java.util.Iterator it = qq4Var.f465737d.iterator();
            while (it.hasNext()) {
                r45.nq4 nq4Var = (r45.nq4) it.next();
                int p17 = (int) ((nq4Var.f463130d - c01.w9.p()) / 1000);
                if (p17 < 0) {
                    p17 = 0;
                }
                new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g(p17, nq4Var).a();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgCheckTaskMgr", e17, "", new java.lang.Object[0]);
            qq4Var.f465737d.clear();
        }
    }
}
