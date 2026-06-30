package com.tencent.mm.booter;

/* loaded from: classes7.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f63330a = -1;

    public static void a() {
        if (f63330a < 0) {
            f63330a = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("c2c_migration_report", 0).getLong("last_report", -1L);
        }
        if (f63330a < 0 || java.lang.System.currentTimeMillis() - f63330a > 86400000) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new com.tencent.mars.smc.IDKey(1944, 0, 1));
            arrayList.add(new com.tencent.mars.smc.IDKey(1944, 1, 1));
            jx3.f.INSTANCE.b(arrayList, true);
            f63330a = java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("c2c_migration_report", 0).edit().putLong("last_report", f63330a).commit();
        }
    }
}
