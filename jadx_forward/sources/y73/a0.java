package y73;

@j95.b
/* loaded from: classes11.dex */
public class a0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f541232d = true;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.hp.p1779x633fb29.C16112xb63066a9 f541233e = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1779x633fb29.C16112xb63066a9();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        this.f541233e.mo48813x58998cd();
        b83.s.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - longValue >= 3600000) {
                int i17 = java.util.Calendar.getInstance().get(11);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update hour %d ", java.lang.Integer.valueOf(i17));
                if (i17 == 0) {
                    int nextInt = new java.util.Random().nextInt(60);
                    currentTimeMillis = (currentTimeMillis - (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12) * 3600000)) + (nextInt * 60000);
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update after %d minute currentTime %s lastUpdate %s", java.lang.Integer.valueOf(nextInt), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longValue));
                } else {
                    fy5.a.d().a(true);
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update true when onAccountPostReset. current:%d lastUpdate:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(longValue));
                }
            } else {
                fy5.a.d().a(this.f541232d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SubCoreHotpatch", "try to fetch patch update false when onAccountPostReset.");
            }
            this.f541233e.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1779x633fb29.C16112xb63066a9.f223935d = currentTimeMillis;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.SubCoreHotpatch", e17, "", new java.lang.Object[0]);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) {
            return;
        }
        com.p314xaae8f345.mm.app.n2 n2Var = com.p314xaae8f345.mm.app.m2.f135048a;
        synchronized (n2Var) {
            if (!n2Var.f135058a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[!] Uninitialized or install failed, reportStats will be ignored.");
                return;
            }
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_ensurance_info", 4);
            if (!n2Var.c() && n2Var.d()) {
                jx3.f.INSTANCE.mo68477x336bdfd8(338L, 231L, 1L, false);
                sharedPreferences.edit().putInt(lp0.a.f401782c + "_clean_patch_reported", 1).apply();
            }
            if (!n2Var.b() && !n2Var.a()) {
                jx3.f.INSTANCE.mo68477x336bdfd8(338L, 232L, 1L, false);
                sharedPreferences.edit().putInt(lp0.a.f401782c + "_block_apply_patch_reported", 1).apply();
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        this.f541233e.mo48814x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        q25.b.b(new y73.p0(), "//tinker");
    }
}
