package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public abstract class k6 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f157160a = new byte[0];

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        for (com.p314xaae8f345.mm.vfs.x1 x1Var : com.p314xaae8f345.mm.vfs.w6.s(str, false)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x1Var.f294765b) && x1Var.f294769f) {
                java.lang.String str4 = x1Var.f294765b;
                if (str4.startsWith("plugin.js") && str4.endsWith(str3)) {
                    for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : com.p314xaae8f345.mm.vfs.w6.s(x1Var.f294764a, false)) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x1Var2.f294765b) && x1Var2.f294765b.equals(str2)) {
                            x1Var2.b(true);
                        }
                    }
                }
            }
        }
    }

    public static void b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h6 h6Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h6.class)) == null) {
            return;
        }
        synchronized (f157160a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l6();
            l6Var.f67014x28d45f97 = str;
            l6Var.f67017x8987ca93 = i17;
            java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l6.f157176t;
            if (h6Var.get(l6Var, strArr)) {
                l6Var.f67015x4b6e56ce++;
                l6Var.f67016xff6b4da1 = java.lang.System.currentTimeMillis();
                h6Var.mo9952xce0038c9(l6Var, strArr);
            } else {
                l6Var.f67015x4b6e56ce = 1;
                l6Var.f67016xff6b4da1 = java.lang.System.currentTimeMillis();
                h6Var.mo880xb970c2b9(l6Var);
            }
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6 c(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i6 i6Var) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9> list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginCode sizeOfBytes:%d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h6.class);
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy %d, lruStorage NULL", java.lang.Long.valueOf(j17));
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6.TRIM_FAIL;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.US, " %s, %s ASC", "hit", "hitTimeMS");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (f157160a) {
            android.database.Cursor D = h6Var.f157102d.D("PluginCodeUsageLRURecord", new java.lang.String[]{"appId", "version"}, null, null, null, null, format, 2);
            if (D == null) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6.TRIM_FAIL;
            }
            if (!D.moveToFirst()) {
                D.close();
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6.TRIM_FAIL;
            }
            do {
                try {
                    try {
                        linkedList.add(android.util.Pair.create(D.getString(0), java.lang.Integer.valueOf(D.getInt(1))));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy, read from cursor e = %s", e17);
                    }
                } finally {
                    D.close();
                }
            } while (D.moveToNext());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "plugincode size:%d", java.lang.Integer.valueOf(linkedList.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
            if (Di == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "trimBy %d, pkgStorage NULL", java.lang.Long.valueOf(j17));
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6.TRIM_FAIL;
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
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    list = java.util.Collections.emptyList();
                } else {
                    android.database.Cursor D2 = Di.f157454d.D("AppBrandWxaPkgManifestRecord", strArr, java.lang.String.format(java.util.Locale.US, "%s=? and %s=? ", "appId", "version"), new java.lang.String[]{str, java.lang.String.valueOf(intValue)}, null, null, "version ASC", 2);
                    if (D2 == null) {
                        list = java.util.Collections.emptyList();
                    } else if (D2.moveToFirst()) {
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        do {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
                            n9Var.mo9015xbf5d97fd(D2);
                            n9Var.f67177x28d45f97 = str;
                            n9Var.f67185x8987ca93 = intValue;
                            linkedList2.add(n9Var);
                        } while (D2.moveToNext());
                        D2.close();
                        list = linkedList2;
                    } else {
                        D2.close();
                        list = java.util.Collections.emptyList();
                    }
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var2 : list) {
                    j18 += com.p314xaae8f345.mm.vfs.w6.k(n9Var2.f67183x55b471cc);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "wxapkg appid:%s,delete path:%s,trimSize:%d", n9Var2.f67177x28d45f97, n9Var2.f67183x55b471cc, java.lang.Long.valueOf(j18));
                    com.p314xaae8f345.mm.vfs.w6.h(n9Var2.f67183x55b471cc);
                    java.lang.String str2 = n9Var2.f67177x28d45f97;
                    java.lang.String str3 = n9Var2.f67186x912ff5eb;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeCodeCache appId or md5 null or nil!");
                    } else {
                        java.lang.String substring = str2.substring(0, str2.indexOf("$"));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeCodeCache appId:%s,versionMd5:%s", str2, str3);
                        a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a(), str3, substring);
                        a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.c(), str3, substring);
                    }
                    java.lang.String str4 = n9Var2.f67177x28d45f97;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission appId null!");
                    } else {
                        java.lang.String substring2 = str4.substring(0, str4.indexOf("$"));
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission provider null!");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q9 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.aj();
                            if (Zi == null || aj6 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission storage null!");
                            } else if (aj6.z0(substring2) != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9 p9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9();
                                p9Var.f69162x28d45f97 = substring2;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission provider:%s, ret:%b", substring2, java.lang.Boolean.valueOf(aj6.mo9951xb06685ab(p9Var, new java.lang.String[0])));
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removePluginPermission appId:%s permission null!", substring2);
                            }
                        }
                    }
                    java.lang.String str5 = n9Var2.f67177x28d45f97;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission appId null!");
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5.substring(0, str5.indexOf("$")))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission provider null!");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9 o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9.class);
                        if (Zi2 == null || o9Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PluginCodePruneLRULogic", "removeAppidABTestPermission storage null!");
                        }
                    }
                    i17++;
                    h6Var.y0((java.lang.String) pair.first, ((java.lang.Integer) pair.second).intValue());
                    if (i6Var != null && i6Var.a()) {
                        throw new java.lang.InterruptedException();
                    }
                    if (j18 >= j17) {
                        if (i17 > 0) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7078xde9ebcc9 c7078xde9ebcc9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7078xde9ebcc9();
                            c7078xde9ebcc9.f143863d = 4L;
                            c7078xde9ebcc9.f143866g = i17;
                            c7078xde9ebcc9.f143867h = 1L;
                            c7078xde9ebcc9.k();
                        }
                        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6.TRIMMED;
                    }
                }
            }
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j6.TRIM_FAIL;
        }
    }
}
