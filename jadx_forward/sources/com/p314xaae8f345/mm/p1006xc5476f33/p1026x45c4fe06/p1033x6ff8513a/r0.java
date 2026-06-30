package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class r0 {
    public r0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        if (com.p314xaae8f345.mm.vfs.w6.j(str + "/dir.lock")) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str + "/dir.lock");
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                j17 = m17.f294768e;
            }
            if (currentTimeMillis - j17 < com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.f157851b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, locked", str);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, lock expired", str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkAppDirHasLocked path %s, lock free", str);
        return false;
    }

    public final void b(long j17, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8 c7071x1f0975d8) {
        long j18;
        int i17;
        java.util.LinkedList linkedList;
        long a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e()).G();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i.f162603a;
        if (G != null) {
            j18 = 0;
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : G) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157778a;
                java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                if (k0Var.b(m82467xfb82e301, "temp")) {
                    java.lang.String m82467xfb82e3012 = r6Var.m82467xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3012, "getName(...)");
                    a17 = iVar.b(m82467xfb82e3012, "temp");
                } else {
                    java.lang.String m82467xfb82e3013 = r6Var.m82467xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3013, "getName(...)");
                    a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i.a(m82467xfb82e3013, "temp", r6Var);
                }
                j18 += a17;
            }
        } else {
            j18 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimit current: " + j18 + " max: " + j17 + " cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        if (c7071x1f0975d8 != null) {
            c7071x1f0975d8.f143797k = a06.d.c(j18 / 1024.0d);
        }
        if (j18 <= j17) {
            return;
        }
        if (c7071x1f0975d8 != null) {
            c7071x1f0975d8.f143799m = 1L;
        }
        long j19 = j17 / 2;
        long j27 = j18 - j19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g6 g6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g6.class);
        if (g6Var != null) {
            linkedList = new java.util.LinkedList();
            android.database.Cursor D = g6Var.f157086d.D("PkgUsageLRURecord", new java.lang.String[]{"appId"}, null, null, null, null, java.lang.String.format(java.util.Locale.US, " %s, %s ASC", "hit", "hitTimeMS"), 2);
            if (D != null) {
                if (D.moveToFirst()) {
                    i17 = 0;
                    do {
                        try {
                            try {
                                linkedList.add(D.getString(0));
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PkgUsageLRUStorage", "getLRUAppIdList error:%s", e17);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        com.p314xaae8f345.mm.vfs.r6[] G2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e()).G();
        if (G2 != null) {
            int length = G2.length;
            for (int i18 = i17; i18 < length; i18++) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = G2[i18];
                if (!linkedList.contains(r6Var2.m82467xfb82e301())) {
                    linkedList.addFirst(r6Var2.m82467xfb82e301());
                }
            }
        }
        java.util.Iterator it = linkedList.iterator();
        long j28 = j27;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            long b17 = iVar.b(str, "temp");
            if (b17 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.f157850a;
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e() + str + '/');
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pruneAppDirTempFiles ");
                sb6.append(r6Var3.o());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", sb6.toString());
                if (r6Var3.m() && r6Var3.y()) {
                    java.lang.String o17 = r6Var3.o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    if (!r0Var.a(o17)) {
                        com.p314xaae8f345.mm.vfs.r6[] H = r6Var3.H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.f157852c);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("pruneAppDirTempFiles listFile done:");
                        sb7.append(H != null ? java.lang.Integer.valueOf(H.length) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", sb7.toString());
                        if (H != null) {
                            int length2 = H.length;
                            for (int i19 = i17; i19 < length2; i19++) {
                                com.p314xaae8f345.mm.vfs.w6.h(H[i19].o());
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "allAppDir lru clean done, nowSize:" + (j19 + j28));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimit cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
