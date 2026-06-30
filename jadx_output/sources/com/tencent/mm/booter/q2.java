package com.tencent.mm.booter;

/* loaded from: classes8.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f63555a;

    public static void a(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str, 0);
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R(str);
        com.tencent.mm.sdk.platformtools.o4.Z(sharedPreferences, R);
        java.lang.String[] split = R.getString("startup_info", "").split("=");
        if (split == null || split.length <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessReport", "nothing to reprot");
            return;
        }
        for (int i17 = 0; i17 < split.length - 1; i17++) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessReport", "reprot %s: %s", str, split[i17]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10667, split[i17]);
        }
        R.putString("startup_info", split[split.length - 1]);
    }

    public static java.lang.String b(java.lang.String[] strArr) {
        java.lang.String str = "";
        boolean z17 = true;
        for (java.lang.String str2 : strArr) {
            if (z17) {
                z17 = false;
            } else {
                str = str + "=";
            }
            str = str + str2;
        }
        return str;
    }

    public static void c() {
        d("mm_proc_startup");
        d("push_proc_startup");
    }

    public static void d(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str, 0);
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R(str);
        com.tencent.mm.sdk.platformtools.o4.Z(sharedPreferences, R);
        java.lang.String[] split = R.getString("startup_info", "").split("=");
        if (split == null || split.length == 0) {
            return;
        }
        com.tencent.mm.booter.p2 p2Var = new com.tencent.mm.booter.p2();
        if (p2Var.a(split[split.length - 1])) {
            p2Var.f63548b = 2;
            split[split.length - 1] = p2Var.toString();
        }
        R.putString("startup_info", b(split)).commit();
    }
}
