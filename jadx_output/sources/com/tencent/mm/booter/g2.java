package com.tencent.mm.booter;

/* loaded from: classes7.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f63363a = -1;

    public static void a() {
        if (f63363a < 0) {
            f63363a = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("fix_wrong_mig_report", 0).getLong("last_report", -1L);
        }
        if (f63363a < 0 || java.lang.System.currentTimeMillis() - f63363a > 86400000) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (r17 > 0) {
                arrayList.add(new com.tencent.mars.smc.IDKey(1912, 100, 1));
            }
            if (r17 == 1) {
                arrayList.add(new com.tencent.mars.smc.IDKey(1912, 101, 1));
            } else if (r17 == 2) {
                arrayList.add(new com.tencent.mars.smc.IDKey(1912, 102, 1));
            } else if (r17 == 3) {
                arrayList.add(new com.tencent.mars.smc.IDKey(1912, 103, 1));
            }
            arrayList.add(new com.tencent.mars.smc.IDKey(1912, 105, 1));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.b(arrayList, true);
            if (r17 != 0 && r17 != 2) {
                fVar.d(21388, "@WrongMigration-scanAndRescue", 0, java.lang.Integer.valueOf(r17), "", 0, 0, 0, 0, 0, 0, 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
            }
            f63363a = java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("fix_wrong_mig_report", 0).edit().putLong("last_report", f63363a).commit();
        }
    }
}
