package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public abstract class k6 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f75627a = new byte[0];

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        for (com.tencent.mm.vfs.x1 x1Var : com.tencent.mm.vfs.w6.s(str, false)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x1Var.f213232b) && x1Var.f213236f) {
                java.lang.String str4 = x1Var.f213232b;
                if (str4.startsWith("plugin.js") && str4.endsWith(str3)) {
                    for (com.tencent.mm.vfs.x1 x1Var2 : com.tencent.mm.vfs.w6.s(x1Var.f213231a, false)) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(x1Var2.f213232b) && x1Var2.f213232b.equals(str2)) {
                            x1Var2.b(true);
                        }
                    }
                }
            }
        }
    }

    public static void b(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.appcache.h6 h6Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (h6Var = (com.tencent.mm.plugin.appbrand.appcache.h6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.h6.class)) == null) {
            return;
        }
        synchronized (f75627a) {
            com.tencent.mm.plugin.appbrand.appcache.l6 l6Var = new com.tencent.mm.plugin.appbrand.appcache.l6();
            l6Var.field_appId = str;
            l6Var.field_version = i17;
            java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.appcache.l6.f75643t;
            if (h6Var.get(l6Var, strArr)) {
                l6Var.field_hit++;
                l6Var.field_hitTimeMS = java.lang.System.currentTimeMillis();
                h6Var.update(l6Var, strArr);
            } else {
                l6Var.field_hit = 1;
                l6Var.field_hitTimeMS = java.lang.System.currentTimeMillis();
                h6Var.insert(l6Var);
            }
        }
    }

    public static com.tencent.mm.plugin.appbrand.appcache.j6 c(long j17, com.tencent.mm.plugin.appbrand.appcache.i6 i6Var) {
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.n9> list;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginCode sizeOfBytes:%d", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.appbrand.appcache.h6 h6Var = (com.tencent.mm.plugin.appbrand.appcache.h6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.h6.class);
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy %d, lruStorage NULL", java.lang.Long.valueOf(j17));
            return com.tencent.mm.plugin.appbrand.appcache.j6.TRIM_FAIL;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.US, " %s, %s ASC", "hit", "hitTimeMS");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (f75627a) {
            android.database.Cursor D = h6Var.f75569d.D("PluginCodeUsageLRURecord", new java.lang.String[]{"appId", "version"}, null, null, null, null, format, 2);
            if (D == null) {
                return com.tencent.mm.plugin.appbrand.appcache.j6.TRIM_FAIL;
            }
            if (!D.moveToFirst()) {
                D.close();
                return com.tencent.mm.plugin.appbrand.appcache.j6.TRIM_FAIL;
            }
            do {
                try {
                    try {
                        linkedList.add(android.util.Pair.create(D.getString(0), java.lang.Integer.valueOf(D.getInt(1))));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy, read from cursor e = %s", e17);
                    }
                } finally {
                    D.close();
                }
            } while (D.moveToNext());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "plugincode size:%d", java.lang.Integer.valueOf(linkedList.size()));
            com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
            if (Di == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy %d, pkgStorage NULL", java.lang.Long.valueOf(j17));
                return com.tencent.mm.plugin.appbrand.appcache.j6.TRIM_FAIL;
            }
            if (i6Var != null && i6Var.a()) {
                throw new java.lang.InterruptedException();
            }
            java.util.Iterator it = linkedList.iterator();
            long j18 = 0;
            int i17 = 0;
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                java.lang.String str = (java.lang.String) pair.first;
                int intValue = ((java.lang.Integer) pair.second).intValue();
                java.lang.String[] strArr = {"pkgPath", "versionMd5"};
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    list = java.util.Collections.emptyList();
                } else {
                    android.database.Cursor D2 = Di.f75921d.D("AppBrandWxaPkgManifestRecord", strArr, java.lang.String.format(java.util.Locale.US, "%s=? and %s=? ", "appId", "version"), new java.lang.String[]{str, java.lang.String.valueOf(intValue)}, null, null, "version ASC", 2);
                    if (D2 == null) {
                        list = java.util.Collections.emptyList();
                    } else if (D2.moveToFirst()) {
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        do {
                            com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = new com.tencent.mm.plugin.appbrand.appcache.n9();
                            n9Var.convertFrom(D2);
                            n9Var.field_appId = str;
                            n9Var.field_version = intValue;
                            linkedList2.add(n9Var);
                        } while (D2.moveToNext());
                        D2.close();
                        list = linkedList2;
                    } else {
                        D2.close();
                        list = java.util.Collections.emptyList();
                    }
                }
                for (com.tencent.mm.plugin.appbrand.appcache.n9 n9Var2 : list) {
                    j18 += com.tencent.mm.vfs.w6.k(n9Var2.field_pkgPath);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "wxapkg appid:%s,delete path:%s,trimSize:%d", n9Var2.field_appId, n9Var2.field_pkgPath, java.lang.Long.valueOf(j18));
                    com.tencent.mm.vfs.w6.h(n9Var2.field_pkgPath);
                    java.lang.String str2 = n9Var2.field_appId;
                    java.lang.String str3 = n9Var2.field_versionMd5;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeCodeCache appId or md5 null or nil!");
                    } else {
                        java.lang.String substring = str2.substring(0, str2.indexOf("$"));
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeCodeCache appId:%s,versionMd5:%s", str2, str3);
                        a(com.tencent.mm.plugin.appbrand.jsruntime.u1.a(), str3, substring);
                        a(com.tencent.mm.plugin.appbrand.jsruntime.u1.c(), str3, substring);
                    }
                    java.lang.String str4 = n9Var2.field_appId;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission appId null!");
                    } else {
                        java.lang.String substring2 = str4.substring(0, str4.indexOf("$"));
                        if (com.tencent.mm.sdk.platformtools.t8.K0(substring2)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission provider null!");
                        } else {
                            com.tencent.mm.plugin.appbrand.launching.i9 Zi = com.tencent.mm.plugin.appbrand.app.r9.Zi();
                            com.tencent.mm.plugin.appbrand.launching.q9 aj6 = com.tencent.mm.plugin.appbrand.app.r9.aj();
                            if (Zi == null || aj6 == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission storage null!");
                            } else if (aj6.z0(substring2) != null) {
                                com.tencent.mm.plugin.appbrand.launching.p9 p9Var = new com.tencent.mm.plugin.appbrand.launching.p9();
                                p9Var.field_appId = substring2;
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission provider:%s, ret:%b", substring2, java.lang.Boolean.valueOf(aj6.delete(p9Var, new java.lang.String[0])));
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission appId:%s permission null!", substring2);
                            }
                        }
                    }
                    java.lang.String str5 = n9Var2.field_appId;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission appId null!");
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(str5.substring(0, str5.indexOf("$")))) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission provider null!");
                    } else {
                        com.tencent.mm.plugin.appbrand.launching.i9 Zi2 = com.tencent.mm.plugin.appbrand.app.r9.Zi();
                        com.tencent.mm.plugin.appbrand.launching.o9 o9Var = (com.tencent.mm.plugin.appbrand.launching.o9) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.o9.class);
                        if (Zi2 == null || o9Var == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission storage null!");
                        }
                    }
                    i17++;
                    h6Var.y0((java.lang.String) pair.first, ((java.lang.Integer) pair.second).intValue());
                    if (i6Var != null && i6Var.a()) {
                        throw new java.lang.InterruptedException();
                    }
                    if (j18 >= j17) {
                        if (i17 > 0) {
                            com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct weAppPackageDeleteActionStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct();
                            weAppPackageDeleteActionStruct.f62330d = 4L;
                            weAppPackageDeleteActionStruct.f62333g = i17;
                            weAppPackageDeleteActionStruct.f62334h = 1L;
                            weAppPackageDeleteActionStruct.k();
                        }
                        return com.tencent.mm.plugin.appbrand.appcache.j6.TRIMMED;
                    }
                }
            }
            return com.tencent.mm.plugin.appbrand.appcache.j6.TRIM_FAIL;
        }
    }
}
