package j65;

/* loaded from: classes12.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j65.f f379487a;

    public g(j65.f fVar) {
        this.f379487a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (intent.getAction().equalsIgnoreCase("android.intent.action.SCREEN_OFF")) {
            j65.f fVar = this.f379487a;
            fVar.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc c6227x9fa4a4fc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6227x9fa4a4fc();
            c6227x9fa4a4fc.e();
            if (c6227x9fa4a4fc.f136474g.f89582a) {
                return;
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Boolean bool2 = j65.f.f379481l;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDensityManager", "isOpenHuaWeiSpecial360 change killSelfAndCallUp now:%s, original:%s", bool, java.lang.Boolean.valueOf(bool2.booleanValue()));
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            java.lang.Boolean bool4 = j65.f.f379480k;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDensityManager", "nowisOpenHuaWeiSpecialAll change killSelfAndCallUp now:%s, original:%s", bool3, java.lang.Boolean.valueOf(bool4.booleanValue()));
            boolean booleanValue = bool2.booleanValue();
            boolean z18 = false;
            if (true != booleanValue || bool4.booleanValue()) {
                j65.f.a(fVar, "densityChange");
                return;
            }
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getInt("screenResolution_density_dpi_new", 0);
            com.p314xaae8f345.mm.ui.bk.t();
            int i18 = com.p314xaae8f345.mm.ui.bk.t().densityDpi;
            if (i17 == 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("screenResolution_density_dpi_new", i18);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDensityManager", "dancy densityChangeNew, mDensityDpi:%s,  mCurrentDensityDpi:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 0 || i17 == i18) {
                z17 = false;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("screenResolution_density_dpi_new", i18);
                z17 = true;
            }
            if (z17) {
                try {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_android_density_check_kill_enable", "1", false, true), 1) > 0) {
                        z18 = true;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDensityManager", e17, "isOpenKillSelf", new java.lang.Object[0]);
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDensityManager", "killSelfAndCallUp ");
                    j65.f.a(fVar, "densityChange");
                }
            }
        }
    }
}
