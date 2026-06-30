package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes7.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f144863a = -1;

    public static void a() {
        if (f144863a < 0) {
            f144863a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("c2c_migration_report", 0).getLong("last_report", -1L);
        }
        if (f144863a < 0 || java.lang.System.currentTimeMillis() - f144863a > 86400000) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1944, 0, 1));
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1944, 1, 1));
            jx3.f.INSTANCE.b(arrayList, true);
            f144863a = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("c2c_migration_report", 0).edit().putLong("last_report", f144863a).commit();
        }
    }
}
