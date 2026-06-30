package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes8.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f145088a;

    public static void a(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str, 0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(sharedPreferences, R);
        java.lang.String[] split = R.getString("startup_info", "").split("=");
        if (split == null || split.length <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessReport", "nothing to reprot");
            return;
        }
        for (int i17 = 0; i17 < split.length - 1; i17++) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessReport", "reprot %s: %s", str, split[i17]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10667, split[i17]);
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
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str, 0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(sharedPreferences, R);
        java.lang.String[] split = R.getString("startup_info", "").split("=");
        if (split == null || split.length == 0) {
            return;
        }
        com.p314xaae8f345.mm.p642xad8b531f.p2 p2Var = new com.p314xaae8f345.mm.p642xad8b531f.p2();
        if (p2Var.a(split[split.length - 1])) {
            p2Var.f145081b = 2;
            split[split.length - 1] = p2Var.m43428x9616526c();
        }
        R.putString("startup_info", b(split)).commit();
    }
}
