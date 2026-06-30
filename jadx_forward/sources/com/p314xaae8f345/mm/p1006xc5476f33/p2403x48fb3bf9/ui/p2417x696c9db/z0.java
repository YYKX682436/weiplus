package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public abstract class z0 {
    public static void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("qar_cycle_rec", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("qab_tick_");
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            long j17 = sharedPreferences.getLong(sb7, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j17 > java.util.concurrent.TimeUnit.HOURS.toMillis(24L)) {
                sharedPreferences.edit().putLong(sb7, currentTimeMillis).commit();
                jx3.f.INSTANCE.mo68477x336bdfd8(943L, 1L, 1L, false);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewReporter", th6, "", new java.lang.Object[0]);
        }
    }

    public static void b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewReporter", "p1 is null, skip rest logit.");
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("qar_cycle_rec", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("qaj_tick_");
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            long j17 = sharedPreferences.getLong(sb7, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j17 > java.util.concurrent.TimeUnit.HOURS.toMillis(24L)) {
                sharedPreferences.edit().putLong(sb7, currentTimeMillis).commit();
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.f(16195, str.replace(",", "%2C"), false, true);
                fVar.mo68477x336bdfd8(943L, 0L, 1L, false);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewReporter", th6, "", new java.lang.Object[0]);
        }
    }
}
