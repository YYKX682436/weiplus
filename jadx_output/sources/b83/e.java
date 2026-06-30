package b83;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f18318a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f18319b;

    public e(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("baseClientVersion is empty.");
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("patchClientVersion is empty.");
        }
        this.f18318a = str;
        this.f18319b = str2;
    }

    public final java.lang.String a(int i17) {
        return "mmkv_key_" + e(this.f18318a) + "_" + e(this.f18319b) + "_" + i17;
    }

    public final android.content.SharedPreferences b() {
        try {
            return com.tencent.mm.sdk.platformtools.o4.Q("tinker_deploy_stats_ts");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HotPatchDeployStatistic", th6, "[-] Fail to init mmkv storage, fallback to system sp.", new java.lang.Object[0]);
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_deploy_stats_ts", 4);
        }
    }

    public final void c(int i17, long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.f(17676, java.lang.String.valueOf(i17) + ',' + e(this.f18318a) + ',' + e(this.f18319b) + ',' + j17, true, true);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.HotPatchDeployStatistic", "[-] Fail to parse hex string: %s", str);
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
