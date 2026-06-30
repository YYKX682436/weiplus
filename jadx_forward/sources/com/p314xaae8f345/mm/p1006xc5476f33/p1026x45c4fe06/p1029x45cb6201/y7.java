package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 f157598a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f157599b;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7();
        f157598a = y7Var;
        f157599b = new java.lang.Object();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.a()) {
            y7Var.b(false);
            y7Var.b(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w1.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaCommonLib.Repository", "CLEAN_COMM_LIB_ON_WECHAT_COLD_LAUNCH, LocalMaxPkgVersion:" + y7Var.f(true));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Repository", "ENABLE_LOCAL_COMM_LIB=" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157561c);
    }

    public final void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        throw new java.lang.RuntimeException("the call must be in the main process.stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    public final int b(boolean z17) {
        a();
        synchronized (f157599b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = f157598a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = y7Var.g();
            if (g17 == null) {
                return 0;
            }
            java.util.List m17 = y7Var.m(g17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m17) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj).f156911e != f157598a.j(z17)) {
                    arrayList.add(obj);
                }
            }
            int size = m17.size() - arrayList.size();
            if (size > 0) {
                f157598a.p(g17, arrayList);
            }
            return size;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r10, int r11) {
        /*
            r9 = this;
            r9.a()
            java.lang.Object r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157599b
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.appcache.y7 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a     // Catch: java.lang.Throwable -> L4f
            com.tencent.mm.sdk.platformtools.o4 r2 = r1.g()     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            if (r2 != 0) goto L11
            monitor-exit(r0)
            return r3
        L11:
            java.util.List r1 = r1.m(r2)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Throwable -> L4f
        L1e:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L4f
            r7 = r6
            com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) r7     // Catch: java.lang.Throwable -> L4f
            int r8 = r7.f156911e     // Catch: java.lang.Throwable -> L4f
            if (r8 != r10) goto L36
            int r7 = r7.f156910d     // Catch: java.lang.Throwable -> L4f
            if (r7 == r11) goto L34
            goto L36
        L34:
            r7 = r3
            goto L37
        L36:
            r7 = 1
        L37:
            if (r7 == 0) goto L1e
            r4.add(r6)     // Catch: java.lang.Throwable -> L4f
            goto L1e
        L3d:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> L4f
            int r11 = r4.size()     // Catch: java.lang.Throwable -> L4f
            int r10 = r10 - r11
            if (r10 <= 0) goto L4d
            com.tencent.mm.plugin.appbrand.appcache.y7 r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a     // Catch: java.lang.Throwable -> L4f
            r11.p(r2, r4)     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r0)
            return r10
        L4f:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.c(int, int):int");
    }

    public final boolean d() {
        return !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157561c;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb e(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g();
        java.lang.Object obj = null;
        if (g17 == null) {
            return null;
        }
        java.util.Iterator it = n(g17, z17).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj).f156910d;
                do {
                    java.lang.Object next = it.next();
                    int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) next).f156910d;
                    if (i17 < i18) {
                        obj = next;
                        i17 = i18;
                    }
                } while (it.hasNext());
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
    }

    public final int f(boolean z17) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g();
        if (g17 == null) {
            return 0;
        }
        java.util.Iterator it = n(g17, z17).iterator();
        if (it.hasNext()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) it.next()).f156910d);
            while (it.hasNext()) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) it.next()).f156910d);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        java.lang.Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandCommonLib");
        if (M == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Repository", "fail: mmkv not available.stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        return M;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb h(int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g();
        java.lang.Object obj = null;
        if (g17 == null) {
            return null;
        }
        java.util.Iterator it = m(g17).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) next;
            if (c11661x55afe3eb.f156911e == i17 && c11661x55afe3eb.f156910d == i18) {
                obj = next;
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb i(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g();
        java.lang.Object obj = null;
        if (g17 == null) {
            return null;
        }
        java.util.Iterator it = m(g17).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) next).f156912f, filePath)) {
                obj = next;
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
    }

    public final int j(boolean z17) {
        return z17 ? 0 : 999;
    }

    public final boolean k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb info) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        a();
        synchronized (f157599b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = f157598a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = y7Var.g();
            if (g17 == null) {
                return false;
            }
            java.util.List m17 = y7Var.m(g17);
            java.util.Iterator it = m17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
                if (c11661x55afe3eb.f156911e == info.f156911e && c11661x55afe3eb.f156910d == info.f156910d) {
                    break;
                }
            }
            if (!(obj != null)) {
                f157598a.p(g17, kz5.n0.u0(m17, info));
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommonLib.Repository", "fail: [insert]existSameItem. version: " + info.f156910d + ", versionType: " + info.f156911e);
            return false;
        }
    }

    public final java.util.List l() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g();
        if (g17 == null) {
            return null;
        }
        java.util.List m17 = m(g17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) it.next()).f156912f);
        }
        return arrayList;
    }

    public final java.util.List m(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11662x721a1b29 c11662x721a1b29 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11662x721a1b29) o4Var.r("all_list", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11662x721a1b29.class);
        java.util.List list = c11662x721a1b29 != null ? c11662x721a1b29.f156920d : null;
        return list == null ? kz5.p0.f395529d : list;
    }

    public final java.util.List n(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, boolean z17) {
        int j17 = j(z17);
        java.util.List m17 = m(o4Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m17) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj).f156911e == j17) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int[] o(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = g();
        if (g17 == null) {
            return null;
        }
        java.util.List n17 = n(g17, z17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(n17, 10));
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) it.next()).f156910d));
        }
        return kz5.n0.R0(kz5.n0.E0(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if ((r5 == null || r5.length() == 0) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.p(com.tencent.mm.sdk.platformtools.o4, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7 A[Catch: all -> 0x011d, TryCatch #0 {, blocks: (B:4:0x0011, B:10:0x001c, B:11:0x0024, B:13:0x002a, B:15:0x0035, B:22:0x0040, B:27:0x0048, B:29:0x004e, B:30:0x0055, B:32:0x005c, B:35:0x0067, B:37:0x006e, B:38:0x0075, B:40:0x007e, B:42:0x0084, B:43:0x008e, B:45:0x0094, B:47:0x009a, B:48:0x00a9, B:50:0x00af, B:52:0x00b5, B:54:0x00c1, B:56:0x00c7, B:58:0x00cd, B:60:0x00d9, B:61:0x00f1, B:63:0x00f7, B:65:0x0102, B:68:0x0109, B:71:0x010d, B:77:0x0111, B:82:0x00d5, B:84:0x00bd, B:86:0x00a4, B:88:0x008c, B:89:0x0073, B:90:0x0065, B:91:0x0053), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7 A[Catch: all -> 0x011d, TryCatch #0 {, blocks: (B:4:0x0011, B:10:0x001c, B:11:0x0024, B:13:0x002a, B:15:0x0035, B:22:0x0040, B:27:0x0048, B:29:0x004e, B:30:0x0055, B:32:0x005c, B:35:0x0067, B:37:0x006e, B:38:0x0075, B:40:0x007e, B:42:0x0084, B:43:0x008e, B:45:0x0094, B:47:0x009a, B:48:0x00a9, B:50:0x00af, B:52:0x00b5, B:54:0x00c1, B:56:0x00c7, B:58:0x00cd, B:60:0x00d9, B:61:0x00f1, B:63:0x00f7, B:65:0x0102, B:68:0x0109, B:71:0x010d, B:77:0x0111, B:82:0x00d5, B:84:0x00bd, B:86:0x00a4, B:88:0x008c, B:89:0x0073, B:90:0x0065, B:91:0x0053), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5 A[Catch: all -> 0x011d, TryCatch #0 {, blocks: (B:4:0x0011, B:10:0x001c, B:11:0x0024, B:13:0x002a, B:15:0x0035, B:22:0x0040, B:27:0x0048, B:29:0x004e, B:30:0x0055, B:32:0x005c, B:35:0x0067, B:37:0x006e, B:38:0x0075, B:40:0x007e, B:42:0x0084, B:43:0x008e, B:45:0x0094, B:47:0x009a, B:48:0x00a9, B:50:0x00af, B:52:0x00b5, B:54:0x00c1, B:56:0x00c7, B:58:0x00cd, B:60:0x00d9, B:61:0x00f1, B:63:0x00f7, B:65:0x0102, B:68:0x0109, B:71:0x010d, B:77:0x0111, B:82:0x00d5, B:84:0x00bd, B:86:0x00a4, B:88:0x008c, B:89:0x0073, B:90:0x0065, B:91:0x0053), top: B:3:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r28, int r29, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8 r30) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.q(int, int, com.tencent.mm.plugin.appbrand.appcache.k8):boolean");
    }
}
