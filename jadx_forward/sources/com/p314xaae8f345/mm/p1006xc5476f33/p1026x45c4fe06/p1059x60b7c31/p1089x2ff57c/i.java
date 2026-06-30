package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i f162603a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i();

    public static final long a(java.lang.String appId, java.lang.String key, com.p314xaae8f345.mm.vfs.r6 dir) {
        long c17;
        com.p314xaae8f345.mm.vfs.t6 t6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        boolean m17 = dir.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i iVar = f162603a;
        if (!m17 || !dir.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "dir not exist[" + appId + ',' + key + ',' + dir.u() + ']');
            iVar.c(appId, key, 0L, true);
            return 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "temp") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "saved_temp")) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "temp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.f157850a;
                t6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.f157852c;
            } else {
                t6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd.f157660e;
            }
            com.p314xaae8f345.mm.vfs.r6[] H = dir.H(t6Var);
            if (H != null) {
                c17 = 0;
                for (com.p314xaae8f345.mm.vfs.r6 r6Var : H) {
                    c17 += r6Var.C();
                }
            } else {
                c17 = 0;
            }
        } else {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(dir);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "calculateDirSize [" + appId + ',' + key + ',' + dir.u() + "]->" + c17 + " cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
        if (c17 >= 0) {
            iVar.c(appId, key, c17, true);
        }
        if (c17 < 0) {
            return 0L;
        }
        return c17;
    }

    public final long b(java.lang.String appId, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.b("AppBrandStorageQuota");
        long j17 = 0;
        if (b17 != null) {
            j17 = b17.getLong("storage_size_" + appId + '_' + key, 0L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "get saved storage size:" + j17 + " for " + appId + ',' + key);
        return j17;
    }

    public final void c(java.lang.String appId, java.lang.String key, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandStorageUtils[mountTest]", "before size: " + b(appId, key) + ", save storage size:" + j17 + " for " + appId + ',' + key);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.b("AppBrandStorageQuota");
        if (b17 != null) {
            android.content.SharedPreferences.Editor putLong = b17.putLong("storage_size_" + appId + '_' + key, j17);
            if (putLong != null) {
                putLong.apply();
            }
        }
    }
}
