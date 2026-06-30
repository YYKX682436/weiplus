package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public h(java.lang.String str, int i17) {
        r45.bo3 bo3Var = new r45.bo3();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = bo3Var;
        lVar.f152198b = new r45.co3();
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_hongbao_envelope_transfer_new_cgi, 1) == 1;
        if (z17) {
            lVar.f152200d = 3857;
            lVar.f152199c = "/cgi-bin/micromsg-bin/getshowsourcenew";
            lVar.f152211o = 1;
        } else {
            lVar.f152200d = 2620;
            lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/getshowsource";
            lVar.f152211o = 2;
        }
        bo3Var.f452449d = str;
        bo3Var.f452450e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetShowSource", "request，isNew: %s，type：%s, lastPageData：%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str);
        p(lVar.a());
    }
}
