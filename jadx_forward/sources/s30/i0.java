package s30;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6260x34462d0 c6260x34462d0 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6260x34462d0) abstractC20979x809547d1;
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        if (c6260x34462d0 != null && c6260x34462d0.f136511g.f88163a == 7) {
            vj6.wi(1);
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
                int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT, 86400)).intValue();
                if (intValue2 <= 3600) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "interval is less than 1 hour, something warn here!!!");
                    intValue2 = 3600;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(intValue) >= intValue2) {
                    vj6.Hj(1);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            }
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                int intValue3 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORT_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
                int Ni = vj6.Ni(e42.d0.clicfg_new_expt_report, 3600);
                if (Ni > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(intValue3) >= Ni) {
                    d42.a.a().getClass();
                    gm0.j1.d().g(new d42.d());
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            }
        }
        if (c6260x34462d0 != null && c6260x34462d0.f136511g.f88163a == 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService", "test y and expt result. clicfg_test_tapd_ios = [%s]", vj6.bj("clicfg_test_tapd_ios", "-1", false));
        }
        return false;
    }
}
