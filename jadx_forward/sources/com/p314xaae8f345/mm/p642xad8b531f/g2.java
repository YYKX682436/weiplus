package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes7.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f144896a = -1;

    public static void a() {
        if (f144896a < 0) {
            f144896a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("fix_wrong_mig_report", 0).getLong("last_report", -1L);
        }
        if (f144896a < 0 || java.lang.System.currentTimeMillis() - f144896a > 86400000) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (r17 > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1912, 100, 1));
            }
            if (r17 == 1) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1912, 101, 1));
            } else if (r17 == 2) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1912, 102, 1));
            } else if (r17 == 3) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1912, 103, 1));
            }
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1912, 105, 1));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.b(arrayList, true);
            if (r17 != 0 && r17 != 2) {
                fVar.d(21388, "@WrongMigration-scanAndRescue", 0, java.lang.Integer.valueOf(r17), "", 0, 0, 0, 0, 0, 0, 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            }
            f144896a = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("fix_wrong_mig_report", 0).edit().putLong("last_report", f144896a).commit();
        }
    }
}
