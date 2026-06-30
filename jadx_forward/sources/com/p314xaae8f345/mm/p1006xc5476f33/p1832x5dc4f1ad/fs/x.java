package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.x f229534a = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.x();

    public final long a(java.lang.String bizName, java.lang.String key, com.p314xaae8f345.mm.vfs.r6 dir) {
        long b17;
        com.p314xaae8f345.mm.vfs.t6 t6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        if (!dir.m() || !dir.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "dir not exist[" + bizName + ',' + key + ',' + dir.u() + ']');
            d(bizName, key, 0L, true);
            return 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "temp") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "saved_temp")) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "temp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e0.f229495a;
                t6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e0.f229497c;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.d0 d0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e0.f229495a;
                t6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e0.f229498d;
            }
            com.p314xaae8f345.mm.vfs.r6[] H = dir.H(t6Var);
            if (H != null) {
                b17 = 0;
                for (com.p314xaae8f345.mm.vfs.r6 r6Var : H) {
                    b17 += r6Var.C();
                }
            } else {
                b17 = 0;
            }
        } else {
            b17 = b(dir);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "calculateStorageSize [" + bizName + ',' + key + ',' + dir.u() + "]->" + b17 + " cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
        if (b17 >= 0) {
            d(bizName, key, b17, true);
        }
        if (b17 < 0) {
            return 0L;
        }
        return b17;
    }

    public final long b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return -1L;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G == null) {
            return 0L;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            j17 += r6Var2.A() ? r6Var2.C() : b(r6Var2);
        }
        return j17;
    }

    public final long c(java.lang.String bizName, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String str = null;
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicStorageQuota", null);
        if (wi6 != null) {
            java.lang.Object[] b17 = ((ue3.f) wi6).b("storage_size_".concat(key));
            java.lang.Object obj = b17[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
            lc3.z zVar = (lc3.z) obj;
            lc3.z zVar2 = lc3.x.f399467a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2)) {
                java.lang.Object obj2 = b17[1];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (java.lang.String) obj2;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, zVar2) && str != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "get saved storage size:" + str + " for " + bizName + ',' + key);
                return java.lang.Long.parseLong(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "get saved storage size errno:" + zVar.f399477a + ", errMsg " + zVar.f399478b);
        }
        return 0L;
    }

    public final void d(java.lang.String bizName, java.lang.String key, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "save storage size:" + j17 + " for " + bizName + ',' + key);
        }
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicStorageQuota", null);
        if (wi6 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ue3.f) wi6).g("storage_size_".concat(key), java.lang.String.valueOf(j17), "String"), lc3.x.f399467a)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageQuotaManager", "save storage fail: " + bizName + ',' + key);
        }
    }
}
