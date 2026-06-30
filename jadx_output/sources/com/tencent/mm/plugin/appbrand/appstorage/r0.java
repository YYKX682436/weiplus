package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class r0 {
    public r0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        com.tencent.mm.vfs.x1 m17;
        if (com.tencent.mm.vfs.w6.j(str + "/dir.lock")) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str + "/dir.lock");
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                j17 = m17.f213235e;
            }
            if (currentTimeMillis - j17 < com.tencent.mm.plugin.appbrand.appstorage.s0.f76318b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, locked", str);
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, lock expired", str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, lock free", str);
        return false;
    }

    public final void b(long j17, com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct) {
        long j18;
        int i17;
        java.util.LinkedList linkedList;
        long a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsapi.file.l2.e()).G();
        com.tencent.mm.plugin.appbrand.jsapi.file.i iVar = com.tencent.mm.plugin.appbrand.jsapi.file.i.f81070a;
        if (G != null) {
            j18 = 0;
            for (com.tencent.mm.vfs.r6 r6Var : G) {
                com.tencent.mm.plugin.appbrand.appstorage.k0 k0Var = com.tencent.mm.plugin.appbrand.appstorage.k0.f76245a;
                java.lang.String name = r6Var.getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                if (k0Var.b(name, "temp")) {
                    java.lang.String name2 = r6Var.getName();
                    kotlin.jvm.internal.o.f(name2, "getName(...)");
                    a17 = iVar.b(name2, "temp");
                } else {
                    java.lang.String name3 = r6Var.getName();
                    kotlin.jvm.internal.o.f(name3, "getName(...)");
                    a17 = com.tencent.mm.plugin.appbrand.jsapi.file.i.a(name3, "temp", r6Var);
                }
                j18 += a17;
            }
        } else {
            j18 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimit current: " + j18 + " max: " + j17 + " cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        if (weAppFileSystemTempFileLastOccupationStatStruct != null) {
            weAppFileSystemTempFileLastOccupationStatStruct.f62264k = a06.d.c(j18 / 1024.0d);
        }
        if (j18 <= j17) {
            return;
        }
        if (weAppFileSystemTempFileLastOccupationStatStruct != null) {
            weAppFileSystemTempFileLastOccupationStatStruct.f62266m = 1L;
        }
        long j19 = j17 / 2;
        long j27 = j18 - j19;
        com.tencent.mm.plugin.appbrand.appcache.g6 g6Var = (com.tencent.mm.plugin.appbrand.appcache.g6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.g6.class);
        if (g6Var != null) {
            linkedList = new java.util.LinkedList();
            android.database.Cursor D = g6Var.f75553d.D("PkgUsageLRURecord", new java.lang.String[]{"appId"}, null, null, null, null, java.lang.String.format(java.util.Locale.US, " %s, %s ASC", "hit", "hitTimeMS"), 2);
            if (D != null) {
                if (D.moveToFirst()) {
                    i17 = 0;
                    do {
                        try {
                            try {
                                linkedList.add(D.getString(0));
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.PkgUsageLRUStorage", "getLRUAppIdList error:%s", e17);
                            }
                        } finally {
                            D.close();
                        }
                    } while (D.moveToNext());
                } else {
                    D.close();
                }
            }
            i17 = 0;
        } else {
            i17 = 0;
            linkedList = null;
        }
        kotlin.jvm.internal.o.d(linkedList);
        com.tencent.mm.vfs.r6[] G2 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsapi.file.l2.e()).G();
        if (G2 != null) {
            int length = G2.length;
            for (int i18 = i17; i18 < length; i18++) {
                com.tencent.mm.vfs.r6 r6Var2 = G2[i18];
                if (!linkedList.contains(r6Var2.getName())) {
                    linkedList.addFirst(r6Var2.getName());
                }
            }
        }
        java.util.Iterator it = linkedList.iterator();
        long j28 = j27;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            kotlin.jvm.internal.o.d(str);
            long b17 = iVar.b(str, "temp");
            if (b17 > 0) {
                com.tencent.mm.plugin.appbrand.appstorage.r0 r0Var = com.tencent.mm.plugin.appbrand.appstorage.s0.f76317a;
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsapi.file.l2.e() + str + '/');
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pruneAppDirTempFiles ");
                sb6.append(r6Var3.o());
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", sb6.toString());
                if (r6Var3.m() && r6Var3.y()) {
                    java.lang.String o17 = r6Var3.o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    if (!r0Var.a(o17)) {
                        com.tencent.mm.vfs.r6[] H = r6Var3.H(com.tencent.mm.plugin.appbrand.appstorage.s0.f76319c);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("pruneAppDirTempFiles listFile done:");
                        sb7.append(H != null ? java.lang.Integer.valueOf(H.length) : null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", sb7.toString());
                        if (H != null) {
                            int length2 = H.length;
                            for (int i19 = i17; i19 < length2; i19++) {
                                com.tencent.mm.vfs.w6.h(H[i19].o());
                            }
                        }
                        iVar.c(str, "temp", 0L, true);
                    }
                }
                j28 -= b17;
            }
            if (j28 <= 0) {
                break;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "allAppDir lru clean done, nowSize:" + (j19 + j28));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimit cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
