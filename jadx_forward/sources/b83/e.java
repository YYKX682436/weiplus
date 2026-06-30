package b83;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99851a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99852b;

    public e(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("baseClientVersion is empty.");
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("patchClientVersion is empty.");
        }
        this.f99851a = str;
        this.f99852b = str2;
    }

    public final java.lang.String a(int i17) {
        return "mmkv_key_" + e(this.f99851a) + "_" + e(this.f99852b) + "_" + i17;
    }

    public final android.content.SharedPreferences b() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Q("tinker_deploy_stats_ts");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HotPatchDeployStatistic", th6, "[-] Fail to init mmkv storage, fallback to system sp.", new java.lang.Object[0]);
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("tinker_deploy_stats_ts", 4);
        }
    }

    public final void c(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(17676, java.lang.String.valueOf(i17) + ',' + e(this.f99851a) + ',' + e(this.f99852b) + ',' + j17, true, true);
    }

    public void d(long j17) {
        android.content.SharedPreferences b17 = b();
        java.lang.String a17 = a(4);
        if (b17.contains(a17)) {
            return;
        }
        c(4, j17);
        b17.edit().putLong(a17, j17).commit();
    }

    public final int e(java.lang.String str) {
        try {
            if (str.startsWith("0x")) {
                str = str.substring(2);
            } else if (str.endsWith("h") || str.endsWith("H")) {
                str = str.substring(0, str.length() - 1);
            }
            return java.lang.Integer.parseInt(str, 16);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HotPatchDeployStatistic", "[-] Fail to parse hex string: %s", str);
            return 0;
        }
    }

    public final void f(java.lang.String str) {
        android.content.SharedPreferences b17 = b();
        if (b17.contains(str)) {
            return;
        }
        b17.edit().putLong(str, java.lang.System.currentTimeMillis()).commit();
    }
}
