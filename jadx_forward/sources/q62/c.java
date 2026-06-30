package q62;

/* loaded from: classes12.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5401xe4b21f18 c5401xe4b21f18 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5401xe4b21f18) abstractC20979x809547d1;
        if (c5401xe4b21f18.f135744g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtStepCount", "StepCount revent.data is null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" action = ");
        am.t8 t8Var = c5401xe4b21f18.f135744g;
        sb6.append(t8Var.f89522a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtStepCount", sb6.toString());
        if (t8Var.f89522a != 1) {
            return false;
        }
        java.lang.String str = (java.lang.String) n62.k.Ai().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_SPORT_PKGNAME_STRING, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "sendSportBroadcast pkgNames = " + str);
        if (str != null) {
            for (java.lang.String str2 : str.split(";")) {
                android.content.Intent intent = new android.content.Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP");
                intent.setPackage(str2);
                if (fp.h.c(12)) {
                    intent.setFlags(32);
                }
                intent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "SPORT_MESSAGE");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
            }
        }
        return true;
    }
}
