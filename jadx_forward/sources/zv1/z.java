package zv1;

/* loaded from: classes15.dex */
public final class z {
    public z(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static zv1.a0 a(zv1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13102xd224c9f trigger, boolean z17, int i17, java.lang.Object obj) {
        java.util.Set D0;
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        zVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        boolean z19 = zv1.s.f557900f;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        long c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20260xe6450c56());
        if (c17 < 100) {
            c17 = 100;
        }
        long j17 = 1000000;
        long j18 = c17 * j17;
        long c18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20261xe6450c57());
        if (c18 < 200) {
            c18 = 200;
        }
        long j19 = c18 * j17;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        h62.d dVar = (h62.d) e0Var;
        long c19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(dVar.aj("clicfg_auto_clean_cache_report_interval", java.lang.String.valueOf(zv1.s.f557903i)));
        if (c19 < 1) {
            c19 = 1;
        }
        long millis = timeUnit.toMillis(c19);
        long c27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(dVar.aj("clicfg_auto_clean_cache_report_interval_prod", "0"));
        if (c27 < 0) {
            c27 = 0;
        }
        long millis2 = timeUnit.toMillis(c27);
        int a17 = com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(dVar.aj("clicfg_auto_clean_cache_report_sampling", "1"));
        if (a17 < 0) {
            a17 = 0;
        }
        int a18 = com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(dVar.aj("clicfg_auto_clean_cache_log_expire_days", "3"));
        int i18 = a18 < 1 ? 1 : a18;
        int a19 = com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(dVar.aj("clicfg_auto_clean_cache_other_type_enable", "0"));
        int i19 = a19 < 0 ? 0 : a19;
        int a27 = com.p314xaae8f345.mm.p2621x8fb0427b.m2.a(dVar.aj("clicfg_auto_clean_cache_apply_vfs_expire", "0"));
        if (a27 < 0) {
            a27 = 0;
        }
        zv1.s sVar = new zv1.s(j18, j19, millis, millis2, a17, i18, i19, a27);
        int i27 = zv1.x.f557925a[trigger.ordinal()];
        if (i27 == 1) {
            D0 = kz5.z.D0(new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60[]{com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35412xe5e01d51, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35413xdc6a4a74});
        } else {
            if (i27 != 2) {
                throw new java.lang.IllegalArgumentException("Unknown trigger: " + trigger);
            }
            D0 = kz5.z.D0(new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60[]{com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35415x48086f0, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35404x746aee06, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35411xd7defeda, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35408x7b9c6c26, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35407x6d47b99c, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.MAP, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35406x3f08826, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35416x274aee, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35410x23a8ec, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.SNS, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.BIZ, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.WEB, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35409x20f8542});
        }
        return new zv1.a0(trigger, D0, new zv1.e0(j18, j19), false, z18, sVar);
    }
}
