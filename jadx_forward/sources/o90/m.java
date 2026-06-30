package o90;

/* loaded from: classes4.dex */
public final class m implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (gm0.j1.a()) {
            lh3.n nVar = (lh3.n) i95.n0.c(lh3.n.class);
            nVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = lh3.n.f400219o;
            if (b4Var != null) {
                b4Var.d();
                lh3.n.f400219o.c(86400000L, 86400000L);
            }
            try {
                if (i17 != 0 || i18 != 0) {
                    nVar.f400227i = 60L;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimcardService", "CheckMobileSimType error:(" + i17 + "," + i18 + ")");
                    nVar.Di(nVar.f400223e, 2);
                    return;
                }
                c01.oa oaVar = (c01.oa) m1Var;
                nVar.f400222d = true;
                nVar.f400224f = oaVar.f118903g;
                int i19 = oaVar.f118904h;
                nVar.f400225g = i19;
                nVar.f400223e = oaVar.f118902f;
                long j17 = oaVar.f118905i;
                if (j17 >= 60 && j17 <= 86400) {
                    nVar.f400227i = j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(nVar.f400224f), java.lang.Integer.valueOf(nVar.f400223e), java.lang.Integer.valueOf(oaVar.f118905i));
                    nVar.Di(nVar.f400223e, 3);
                }
                nVar.f400227i = 28800L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(nVar.f400224f), java.lang.Integer.valueOf(nVar.f400223e), java.lang.Integer.valueOf(oaVar.f118905i));
                nVar.Di(nVar.f400223e, 3);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SimcardService", th6, "[-] CheckMobileSimType error.", new java.lang.Object[0]);
            }
        }
    }
}
