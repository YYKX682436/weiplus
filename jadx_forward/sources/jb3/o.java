package jb3;

/* loaded from: classes5.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_hongbao_android_time_limit_promo_percentage, -1);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_hongbao_android_time_limit_promo_unix_timestamp, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HB_GETTIMELIMITPROMOT_TIMESTAMP_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, -1)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTimeLimitPromotBlindBox", "new: [%s, %s], old: %s", java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(intValue));
        if (Ni2 > intValue) {
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(Ni2));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HB_GETTIMELIMITPROMOT_PERCENT_INT_SYNC, java.lang.Integer.valueOf(Ni));
        }
        return false;
    }
}
