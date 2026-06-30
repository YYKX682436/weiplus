package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f135058a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f135059b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f135060c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Thread.UncaughtExceptionHandler f135061d = new com.p314xaae8f345.mm.app.l2(this);

    public synchronized boolean a() {
        boolean z17 = true;
        if (!this.f135058a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[!] Uninitialized or install failed, canApplyPatch will return true.");
            return true;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_ensurance_info", 4);
        boolean g17 = ak0.o.g();
        if (sharedPreferences.getInt(lp0.a.f401782c + "_clean_patch_count", 0) > 3) {
            z17 = false;
        }
        if (g17 && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: we can apply patch.");
        } else {
            if (!g17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: patch was disabled by compile options or fuse logic, we CANNOT apply patch !!");
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: mm ensurance logic blocked patch function, we CANNOT apply patch !!");
            }
        }
        return z17;
    }

    public final synchronized boolean b() {
        if (!this.f135058a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[!] Uninitialized or install failed, isBlockApplyPatchReported will return false.");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_ensurance_info", 4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.a.f401782c);
        sb6.append("_block_apply_patch_reported");
        return sharedPreferences.getInt(sb6.toString(), 0) != 0;
    }

    public final synchronized boolean c() {
        if (!this.f135058a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[!] Uninitialized or install failed, isCleanPatchReported will return false.");
            return false;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_ensurance_info", 4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.a.f401782c);
        sb6.append("_clean_patch_reported");
        return sharedPreferences.getInt(sb6.toString(), 0) != 0;
    }

    public final synchronized boolean d() {
        if (!this.f135058a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[!] Uninitialized or install failed, isCleanPatchTriggered will return false.");
            return false;
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_ensurance_info", 4).getInt(lp0.a.f401782c + "_clean_patch_count", 0);
        boolean z17 = i17 > 0;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: we have cleaned patch by %s times !!", java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TinkerEnsuranceOnFault", "[tomys] ensurance logic says: clean patch logic is not being triggered.");
        }
        return z17;
    }

    public synchronized void e() {
        this.f135059b = false;
    }
}
