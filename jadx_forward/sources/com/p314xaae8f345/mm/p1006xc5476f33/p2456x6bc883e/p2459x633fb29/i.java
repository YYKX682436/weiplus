package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i f269959a;

    public static boolean a(java.lang.String str, java.util.List list, int i17) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            h(str, i17);
            return true;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (G = r6Var.G()) == null) {
            return false;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2 != null && !list.contains(r6Var2.m82467xfb82e301())) {
                h(r6Var2.o(), i17);
            }
        }
        return true;
    }

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i iVar;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.class) {
            if (f269959a == null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.class) {
                    if (f269959a == null) {
                        f269959a = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i();
                    }
                }
            }
            iVar = f269959a;
        }
        return iVar;
    }

    public static java.util.List d(java.lang.String str) {
        android.os.Bundle bundle;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return arrayList;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.a() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        if ((str2.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c)) && (bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str2, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.g.class)) != null && (string = bundle.getString("used_wepkg_version")) != null) {
            arrayList.add(string);
        }
        return arrayList;
    }

    public static void f(java.lang.String str, int i17, int i18) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync fail. only run on mm process");
            return;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync fail. can not process on Main thread");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync, pkgid:[%s], type:%d", str, java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            wz4.f L0 = wz4.f.L0();
            if (L0.f532336d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord clearWepkg ret:%s", java.lang.Boolean.valueOf(L0.m145253xb158737d("WepkgVersion", java.lang.String.format("delete from %s", "WepkgVersion"))));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord clearWepkg ret:%s", java.lang.Boolean.valueOf(L0.m145253xb158737d("WepkgPreloadFiles", java.lang.String.format("delete from %s", "WepkgPreloadFiles"))));
            }
            h(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.c(), i18);
            return;
        }
        if (i17 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            h(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.a(str), i18);
            wz4.f.L0().z0(str);
            wz4.d.J0().y0(str);
            return;
        }
        if (i17 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.a(str), d(str), i18);
            wz4.f.L0().z0(str);
            wz4.d.J0().y0(str);
            return;
        }
        if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.l.a(str);
            java.util.List d17 = d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda d18 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.d(str);
            if (d18 != null) {
                ((java.util.ArrayList) d17).add(d18.f269909f);
            }
            a(a17, d17, i18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[Catch: Exception -> 0x00f8, TryCatch #1 {Exception -> 0x00f8, blocks: (B:3:0x0005, B:10:0x005a, B:14:0x008a, B:15:0x00c9, B:17:0x00d9, B:20:0x00e0, B:22:0x00f0, B:30:0x0099, B:32:0x00a1, B:33:0x00b9, B:34:0x0084), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d9 A[Catch: Exception -> 0x00f8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f8, blocks: (B:3:0x0005, B:10:0x005a, B:14:0x008a, B:15:0x00c9, B:17:0x00d9, B:20:0x00e0, B:22:0x00f0, B:30:0x0099, B:32:0x00a1, B:33:0x00b9, B:34:0x0084), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0 A[Catch: Exception -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f8, blocks: (B:3:0x0005, B:10:0x005a, B:14:0x008a, B:15:0x00c9, B:17:0x00d9, B:20:0x00e0, B:22:0x00f0, B:30:0x0099, B:32:0x00a1, B:33:0x00b9, B:34:0x0084), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: Exception -> 0x00f8, TryCatch #1 {Exception -> 0x00f8, blocks: (B:3:0x0005, B:10:0x005a, B:14:0x008a, B:15:0x00c9, B:17:0x00d9, B:20:0x00e0, B:22:0x00f0, B:30:0x0099, B:32:0x00a1, B:33:0x00b9, B:34:0x0084), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: Exception -> 0x00f8, TryCatch #1 {Exception -> 0x00f8, blocks: (B:3:0x0005, B:10:0x005a, B:14:0x008a, B:15:0x00c9, B:17:0x00d9, B:20:0x00e0, B:22:0x00f0, B:30:0x0099, B:32:0x00a1, B:33:0x00b9, B:34:0x0084), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(java.lang.String r16, int r17) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.h(java.lang.String, int):boolean");
    }

    public final long b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        long j17 = 0;
        if (r6Var == null) {
            return 0L;
        }
        try {
            if (!r6Var.y()) {
                if (r6Var.A()) {
                    return 0 + r6Var.C();
                }
                return 0L;
            }
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : r6Var.G()) {
                j17 += r6Var2.A() ? r6Var2.C() : b(r6Var2);
            }
            return j17;
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    public void e(java.lang.String str, int i17, int i18) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.f(this, str, i17, i18));
        } else {
            g(str, i17, i18);
        }
    }

    public void g(java.lang.String str, int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f(str, i17, i18);
            return;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgSync fail. can not process on Main thread");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("ipc_param_pkgid", str);
        bundle.putInt("ipc_param_type", i17);
        bundle.putInt("ipc_param_reason", i18);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.h.class);
    }
}
