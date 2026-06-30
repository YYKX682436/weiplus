package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class g1 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f225478q = {"wxalite7b438b4916cd2a37426d5538ac2d3807", "wxalite4868fef42257e6693a564693bd119376", "wxalited4df4810a40b1d9ddc0cbea44d263fd9"};

    /* renamed from: r, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225479r;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f225482c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f225480a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f225481b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f225483d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f225484e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f225485f = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f225486g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f225487h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f225488i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f225489j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f225490k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f225491l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f225492m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f225493n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f225494o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f225495p = new java.util.HashMap();

    public static r45.kk0 D(java.util.LinkedList linkedList, oq1.q qVar, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        java.util.Iterator it = linkedList.iterator();
        r45.hs5 hs5Var = null;
        while (it.hasNext()) {
            r45.hs5 hs5Var2 = (r45.hs5) it.next();
            if (hs5Var2.f457962d != 0 && (hs5Var == null || hs5Var2.f457963e < hs5Var.f457963e)) {
                hs5Var = hs5Var2;
            }
        }
        if (hs5Var == null) {
            return null;
        }
        qVar.f428882d = hs5Var.f457966h;
        qVar.f428883e = hs5Var.f457965g;
        qVar.f428886h = hs5Var.f457964f;
        int i17 = hs5Var.f457962d;
        qVar.f428896r = i17;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28861xbcd14bec(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.LITE_APP_PACKAGE_USE_COMPRESS_ALGORITHM, i17);
        }
        return hs5Var.f457968m;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h2 h2Var;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4412 = c3712x3ed8a441;
        g1Var.getClass();
        if (i17 != 0 || c3712x3ed8a4412 == null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe();
            am.ti tiVar = c5677x6d1cb2fe.f136003g;
            tiVar.f89546a = false;
            tiVar.f89547b = str;
            c5677x6d1cb2fe.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onUpdateFinishCallback, notifyLiteAppPkgUpdate appId: %s, pkgPath: %s", str, c3712x3ed8a4412.f14369x346425);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65390xe3b961cb(str, c3712x3ed8a4412.f14369x346425);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe c5677x6d1cb2fe2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe();
            am.ti tiVar2 = c5677x6d1cb2fe2.f136003g;
            tiVar2.f89546a = true;
            tiVar2.f89547b = str;
            tiVar2.f89548c = c3712x3ed8a4412.f14369x346425;
            tiVar2.f89549d = c3712x3ed8a4412.f14375x14f51cd8;
            c5677x6d1cb2fe2.e();
        }
        if (i17 == 0 || i17 == 1) {
            c3712x3ed8a4412.f14374xee5c7336 = java.lang.System.currentTimeMillis() / 1000;
            s().V(c3712x3ed8a4412);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) g1Var.f225494o;
        for (java.util.ArrayList arrayList2 : concurrentHashMap.keySet()) {
            if (arrayList2.contains(str) && (h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h2) concurrentHashMap.get(arrayList2)) != null) {
                h2Var.f225508a.remove(str);
                if (h2Var.f225508a.isEmpty()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k0) h2Var.f225509b).a(arrayList2);
                    arrayList.add(arrayList2);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((java.util.ArrayList) it.next());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) g1Var.f225484e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) concurrentHashMap2.get(str);
        concurrentHashMap2.remove(str);
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f225486g).remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onUpdateFinishCallback, appId: %s, checkItem: %s", str, k2Var2);
        if (k2Var2 == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - k2Var2.f225530b;
        if (j17 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d || j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception fail errCode=%d start=%d now=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k2Var2.f225530b), java.lang.Long.valueOf(currentTimeMillis));
        }
        long j18 = k2Var2.f225530b;
        long j19 = currentTimeMillis - j18;
        long j27 = k2Var2.f225533e;
        long j28 = j27 - j18;
        long j29 = k2Var2.f225534f;
        g1Var.O(i17, str, j19, j28, j29 - j27, currentTimeMillis - j29, k2Var2.f225532d);
        if (k2Var2.f225531c == null || currentTimeMillis - k2Var2.f225529a > k2Var2.f225536h) {
            return;
        }
        if (k2Var2.f225535g && c3712x3ed8a4412 == null) {
            c3712x3ed8a4412 = g1Var.y(str, null);
        }
        if (c3712x3ed8a4412 == null) {
            k2Var = k2Var2;
            k2Var2.f225531c.mo25333x2fd71e(str, i17);
        } else {
            k2Var = k2Var2;
            k2Var.f225531c.mo25334x90b54003(c3712x3ed8a4412, i17);
        }
        k2Var.f225531c = null;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        g1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onBatchCheckReport start, appIds: %s, updateAppIds: %s, noUpdateAppIds: %s, errorAppIds: %s", list.toString(), list2.toString(), list3.toString(), list4.toString());
        if (abstractC3700xe41a2874 == null) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                } else {
                    sb6.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("appIds", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it6 = list2.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb7.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                } else {
                    sb7.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("updateAppIds", sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it7 = list3.iterator();
        if (it7.hasNext()) {
            while (true) {
                sb8.append((java.lang.CharSequence) it7.next());
                if (!it7.hasNext()) {
                    break;
                } else {
                    sb8.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("noUpdateAppIds", sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        java.util.Iterator it8 = list4.iterator();
        if (it8.hasNext()) {
            while (true) {
                sb9.append((java.lang.CharSequence) it8.next());
                if (!it8.hasNext()) {
                    break;
                } else {
                    sb9.append((java.lang.CharSequence) "+");
                }
            }
        }
        hashMap.put("errorAppIds", sb9.toString());
        if (list4.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp batch checkUpdate success but not all appids got updates, errorAppIds: %s", list4.toString());
            abstractC3700xe41a2874.mo28874x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.BATCH_CHECK_PACKAGE_UPDATE_FAILED, str, hashMap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp batch checkUpdate success and got updates, updateAppIds: %s, noUpdateAppIds: %s", list2.toString(), list3.toString());
            abstractC3700xe41a2874.mo28874x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.BATCH_CHECK_PACKAGE_UPDATE_SUCCESS, str, hashMap);
        }
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, r45.xr5 xr5Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        java.util.LinkedList linkedList;
        g1Var.getClass();
        if (xr5Var == null || (linkedList = xr5Var.f471894d) == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success but got no update, appId: %s", str);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_NO_NEED, "PayDevops");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = g1Var.f225482c;
            if (hVar == null || c3712x3ed8a441 == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25334x90b54003(c3712x3ed8a441, 1);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success and got update, appId: %s, resourceList size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_SUCCESS, "PayDevops");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).get(str);
        if (k2Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vy4 vy4Var = (r45.vy4) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "pay liteapp checkUpdate success, got update, appId: %s, resourceName: %s, version: %d, size: %d, md5: %s, url: %s, createTime: %d", str, vy4Var.f470197e, java.lang.Integer.valueOf(vy4Var.f470198f), java.lang.Integer.valueOf(vy4Var.f470199g), vy4Var.f470200h, vy4Var.f470201i, java.lang.Integer.valueOf(vy4Var.f470202m));
            oq1.q qVar = new oq1.q();
            qVar.f428879a = str;
            qVar.f428892n = vy4Var.f470197e;
            qVar.f428893o = vy4Var.f470198f;
            qVar.f428886h = vy4Var.f470199g;
            qVar.f428883e = vy4Var.f470200h;
            qVar.f428882d = vy4Var.f470201i;
            qVar.f428884f = "";
            qVar.f428885g = "";
            qVar.f428898t = 2;
            qVar.f428899u = false;
            qVar.f428900v = false;
            if (k2Var != null) {
                qVar.f428894p = k2Var.f225532d;
            }
            if (j62.e.g().l("clicfg_enable_pay_lite_app_backup_download_android", false, true, true)) {
                java.util.LinkedList linkedList2 = vy4Var.f470206q;
                if (!nf.c.a(linkedList2)) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    r45.hs5 hs5Var = null;
                    while (it6.hasNext()) {
                        r45.hs5 hs5Var2 = (r45.hs5) it6.next();
                        if (hs5Var2.f457962d != 0 && (hs5Var == null || hs5Var2.f457963e < hs5Var.f457963e)) {
                            hs5Var = hs5Var2;
                        }
                    }
                    if (hs5Var != null) {
                        r45.kk0 kk0Var = hs5Var.f457968m;
                        oq1.o oVar = new oq1.o(hs5Var.f457962d, hs5Var.f457963e, hs5Var.f457965g, hs5Var.f457966h, hs5Var.f457964f, new oq1.c(kk0Var.f460306d, android.util.Base64.decode(kk0Var.f460309g, 0), android.util.Base64.decode(kk0Var.f460308f, 0), android.util.Base64.decode(kk0Var.f460307e, 0), q(vy4Var).getBytes(java.nio.charset.StandardCharsets.UTF_8)));
                        if (abstractC3700xe41a2874 != null) {
                            abstractC3700xe41a2874.mo28860xbcd14bec(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.LITE_APP_PACKAGE_HAS_BACKUP_ROUTE_INFO);
                        }
                        qVar.f428897s = oVar;
                        qVar.f428900v = true;
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) g1Var.f225491l).put(str, qVar);
            }
            qVar.f428896r = 0;
            r45.kk0 kk0Var2 = vy4Var.f470203n;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_pay_lite_app_open_pkg_compress_android, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp pkg abtest is enable compress, appId: %s", str);
                java.util.LinkedList linkedList3 = vy4Var.f470205p;
                if (!nf.c.a(linkedList3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "onPayCheckSuccess has version meta data");
                    r45.kk0 D = D(linkedList3, qVar, abstractC3700xe41a2874);
                    if (D != null) {
                        if (abstractC3700xe41a2874 != null) {
                            abstractC3700xe41a2874.mo28861xbcd14bec(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.LITE_APP_PACKAGE_COMPRESS_INFO, vy4Var.f470199g - qVar.f428886h);
                        }
                        kk0Var2 = D;
                    }
                }
            }
            if (kk0Var2 != null) {
                qVar.f428895q = new oq1.c(kk0Var2.f460306d, android.util.Base64.decode(kk0Var2.f460309g, 0), android.util.Base64.decode(kk0Var2.f460308f, 0), android.util.Base64.decode(kk0Var2.f460307e, 0), q(vy4Var).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", k2Var, abstractC3700xe41a2874, g1Var.f225482c);
        }
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.lang.String str, int i17, int i18, java.lang.String str2, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        if (abstractC3700xe41a2874 != null) {
            g1Var.getClass();
            abstractC3700xe41a2874.mo28893x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_FAILED, "PayDevops", i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = g1Var.f225482c;
        if (hVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25333x2fd71e(str, 2);
        }
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.e eVar, java.lang.String str) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = g1Var.y(str, null);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(str, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
        java.util.Map map = g1Var.f225494o;
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "batchCheck udr resource is null, appId: %s", str);
            if (eVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k0) eVar).a(arrayList);
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(arrayList);
            return;
        }
        if (y17 != null && y17.f14362x26947355 == Ui.f299123e) {
            if (eVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k0) eVar).a(arrayList);
            }
            ((java.util.concurrent.ConcurrentHashMap) map).remove(arrayList);
        } else {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Long.valueOf(Ui.f299123e);
            objArr[2] = java.lang.Integer.valueOf(y17 != null ? y17.f14362x26947355 : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "liteapp: %s udr resource exists, but liteapp resource not exists, need update. resource version: %d, item version: %d", objArr);
            g1Var.J(Ui);
        }
    }

    public static java.lang.String q(r45.vy4 vy4Var) {
        return "project_id=" + vy4Var.f470196d + "&resource_name=" + vy4Var.f470197e + "&encrypt_algorithm=" + vy4Var.f470203n.f460306d;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 s() {
        if (f225479r == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.class) {
                if (f225479r == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1();
                    g1Var.E();
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40973x40b15f2e(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.u1(g1Var));
                    f225479r = g1Var;
                }
            }
        }
        return f225479r;
    }

    public java.util.List A() {
        android.os.Bundle bundle;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppList", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppList bundle is null.");
            return null;
        }
        bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.class.getClassLoader());
        if (bundle.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14348xab75028d)) {
            return bundle.getParcelableArrayList(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14348xab75028d);
        }
        return null;
    }

    public void B(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        android.os.Bundle bundle = null;
        boolean z17 = false;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLatestLiteAppBaselibInfo", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            z17 = true;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == local baselib bundle");
            if (abstractC3700xe41a2874 != null && !z17) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.NO_LOCAL_BASE_LIBRARY_INFO);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local baselib bundle");
            bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.class.getClassLoader());
            K((com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef) bundle.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14319x56424e66));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.f(abstractC3700xe41a2874);
    }

    public void C(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        android.os.Bundle bundle = null;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "handleCheckSumFail null == bundle, appId:" + str);
        } else {
            bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.class.getClassLoader());
            L((com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) bundle.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0));
        }
        java.lang.String r17 = r(str);
        if (r17 != null && !r17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "bundle liteapp recopy appId: %s, version: %s", str, r17);
            n(str, abstractC3700xe41a2874);
        }
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_CHECK_PACKAGE_UPDATE);
        }
        l(str, false, 2, 0L, abstractC3700xe41a2874, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.q1(this, abstractC3700xe41a2874));
    }

    public final void E() {
        java.util.HashMap<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094> m65652xc54e9d9c;
        java.util.Set set = this.f225485f;
        ((java.util.concurrent.CopyOnWriteArraySet) set).add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        ((java.util.concurrent.CopyOnWriteArraySet) set).add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.f37331xb922ec4f);
        ((java.util.concurrent.CopyOnWriteArraySet) set).add("wxalite");
        java.lang.String[] strArr = {"wxalite2ceddca8b296458a527661862c5664b2", "wxalite7b438b4916cd2a37426d5538ac2d3807", "wxalitecd3434f9a28b4db218f4730961d39d55", "wxalite1af500fa066e5b60505c414cd42cacbc", "wxalitee3496ed66c0cfe06db0edfa2dbd8f4a2", "wxaliteb6acd493f7e02b17d6b805ccf970be5b", "wxalite70a1e8c60370e23abcc1bde4e2c32f6f", "wxalite0c45e912005759856ea55eb382e8c509", "wxalite2fd372f050eecd471a4392786dfae78c", "wxalite7f2b757eb3c356d7b3d4291ded2f7743"};
        for (int i17 = 0; i17 < 10; i17++) {
            java.lang.String str = strArr[i17];
            if (!I(str)) {
                ((java.util.concurrent.CopyOnWriteArraySet) set).add(str);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (m65652xc54e9d9c = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65652xc54e9d9c()) != null) {
            for (java.lang.String str2 : m65652xc54e9d9c.keySet()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16193x8e74f094 c16193x8e74f094 = m65652xc54e9d9c.get(str2);
                if (c16193x8e74f094 != null && c16193x8e74f094.f37338xdbd7a24c) {
                    ((java.util.concurrent.CopyOnWriteArraySet) set).add(str2);
                }
            }
        }
        java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441> A = A();
        if (A == null || A.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 : A) {
            java.lang.String str3 = c3712x3ed8a441.f14359x58b7f1c;
            if (str3 != null && !"null".equals(str3) && !c3712x3ed8a441.f14359x58b7f1c.isEmpty() && !"game".equals(c3712x3ed8a441.f14361x117d5bfa)) {
                if (!((java.util.HashMap) q80.g0.f442215d1).containsKey(c3712x3ed8a441.f14359x58b7f1c) && !I(c3712x3ed8a441.f14359x58b7f1c)) {
                    ((java.util.concurrent.CopyOnWriteArraySet) set).add(c3712x3ed8a441.f14359x58b7f1c);
                }
            }
        }
    }

    public boolean F(java.lang.String str, boolean z17) {
        java.lang.String format = java.lang.String.format("clicfg_liteapp_%s_enable", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "can no get 'isLiteAppOpen' value when is no mm process.");
            return false;
        }
        boolean equalsIgnoreCase = j62.e.g().j(format, yo.a.b(f225478q, str) ? "0" : "1", false, true).equalsIgnoreCase("1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "isLiteAppOpen appId%s enable:%b", str, java.lang.Boolean.valueOf(equalsIgnoreCase));
        return equalsIgnoreCase;
    }

    public final boolean G(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef) {
        if (c3710x879b31ef == null) {
            return true;
        }
        int n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_expire_time").n(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        if (n17 == 0) {
            n17 = 259200;
        }
        return !c3710x879b31ef.m28992x7a994349() || (java.lang.System.currentTimeMillis() / 1000) - c3710x879b31ef.f14333xee5c7336 >= ((long) n17);
    }

    public final boolean H(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        if (c3712x3ed8a441 == null) {
            return true;
        }
        int n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_expire_time").n(c3712x3ed8a441.f14359x58b7f1c);
        if (n17 == 0) {
            n17 = 86400;
        }
        return !c3712x3ed8a441.m28997x7a994349() || (java.lang.System.currentTimeMillis() / 1000) - c3712x3ed8a441.f14374xee5c7336 >= ((long) n17);
    }

    public boolean I(java.lang.String str) {
        return str != null && str.endsWith("@pay");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x049b A[Catch: all -> 0x0596, TRY_LEAVE, TryCatch #0 {, blocks: (B:98:0x02c6, B:100:0x02fd, B:101:0x0300, B:103:0x0305, B:104:0x030a, B:106:0x031c, B:108:0x0347, B:109:0x034c, B:111:0x0350, B:112:0x035a, B:115:0x035e, B:116:0x0363, B:118:0x038c, B:119:0x0395, B:121:0x039b, B:122:0x03a7, B:124:0x03cf, B:125:0x03de, B:127:0x03fa, B:129:0x0403, B:130:0x041d, B:132:0x0455, B:135:0x046a, B:136:0x047f, B:138:0x049b, B:140:0x04a8, B:142:0x04bb, B:144:0x04d5, B:145:0x04da, B:147:0x04ea, B:148:0x04ef, B:150:0x0506, B:151:0x052f, B:154:0x053d, B:155:0x0546, B:158:0x0476, B:160:0x047a, B:163:0x054a, B:165:0x056a, B:166:0x0573, B:168:0x058a, B:169:0x0594, B:171:0x03d4, B:173:0x03da), top: B:97:0x02c6, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x r25) {
        /*
            Method dump skipped, instructions count: 2545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.J(com.tencent.wechat.aff.udr.x):void");
    }

    public void K(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef) {
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.b(c3710x879b31ef.f14328xdbd3ccdf, c3710x879b31ef.f14329xd0d13783, c3710x879b31ef.f127550md5);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b17);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            md.k.a(com.p314xaae8f345.mm.vfs.w6.i(b17, false));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteApp.LiteAppLogic", "baselib file don't exist.");
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("removeLiteAppBaselibInfo", c3710x879b31ef.f14328xdbd3ccdf, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public void L(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.e(c3712x3ed8a441.f14359x58b7f1c, c3712x3ed8a441.f14368xd0d13783, c3712x3ed8a441.f127552md5);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(e17);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            md.k.a(com.p314xaae8f345.mm.vfs.w6.i(e17, false));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteApp.LiteAppLogic", "app file don't exist.");
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("removeLiteAppInfo", c3712x3ed8a441.f14359x58b7f1c, null);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e18, "", new java.lang.Object[0]);
        }
    }

    public final void M(java.util.List list, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "reportCheckLiteApp: " + list + ", type: " + str + ", isBatch: " + z17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appIds", list);
            jSONObject.put("type", str);
            jSONObject.put("isBatch", z17);
            jSONObject.toString().replaceAll(",", ";");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public void N(java.lang.String str, boolean z17, boolean z18, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "reportOpenLiteApp %s switchClose=%b withPkg=%b type=%d", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17));
    }

    public void O(int i17, java.lang.String str, long j17, long j18, long j19, long j27, int i18) {
        if (i17 == 1 || i17 == 8 || i17 == 2) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("errCode", i17);
            jSONObject.put("time", j17);
            jSONObject.put("checkTime", j18);
            jSONObject.put("downloadTime", j19);
            jSONObject.put("postDownloadTime", j27);
            jSONObject.put("from", i18);
            java.lang.String str2 = str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466) ? "downloadBaseLib" : "downloadLiteApp";
            java.lang.String replaceAll = jSONObject.toString().replaceAll(",", ";");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, str2 + "," + replaceAll + "," + str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "reportUpdateTime %s errCode=%d costTime=%d checkTime=%d downloadTime=%d postDownloadTime=%d from=%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(i18));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public final void P(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 c16221xf9b96754) {
        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40975xf7b3660d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "runSchedule is not in foreground.");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_schedule_data");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((java.util.concurrent.ConcurrentHashMap) this.f225492m).get(str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("interval", c16221xf9b96754.f225414d);
            jSONObject.put("repeat", c16221xf9b96754.f225415e);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c16221xf9b96754.f225416f);
            jSONObject2.put("payload", c16221xf9b96754.f225417g);
            jSONObject.put("action", jSONObject2);
            jSONObject.put("forceDispatch", c16221xf9b96754.f225418h);
            jSONObject.put("aliveDurationSeconds", c16221xf9b96754.f225419i);
            jSONObject.put("lastTriggerTime", c16221xf9b96754.f225420m);
            java.lang.String replaceAll = jSONObject.toString().replaceAll(",", ";");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, "liteAppRunSchedule," + replaceAll + "," + str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "runSchedule appId: %s, lastTriggerTime: %d， repeat: %d", str, java.lang.Long.valueOf(c16221xf9b96754.f225420m), java.lang.Integer.valueOf(c16221xf9b96754.f225415e));
        c16221xf9b96754.f225420m = java.lang.System.currentTimeMillis() / 1000;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65324x2c27d8cb().contains(str) || c16221xf9b96754.f225418h) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(str, c16221xf9b96754.f225419i, true, 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.x1(this, str, c16221xf9b96754));
        }
        int i17 = c16221xf9b96754.f225415e;
        if (i17 != 0) {
            if (i17 > 0) {
                c16221xf9b96754.f225415e = i17 - 1;
            }
            M.C(str, c16221xf9b96754);
        } else {
            synchronized (this.f225493n) {
                if (b4Var != null) {
                    b4Var.d();
                }
                M.remove(str);
                ((java.util.concurrent.ConcurrentHashMap) this.f225492m).remove(str);
            }
        }
    }

    public void Q(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        synchronized (this.f225493n) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.m65649x9cf0d20b().m65653xd9e187d1(str).f37342x68af8e1.f37356xd7cb4d6.booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "setScheduleWakeUp has no permission! appId: %s", str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "setScheduleWakeUp appId: %s, interval: %d, repeat: %d, actionName: %s, actionPayload: %s, forceDispatch: %b, aliveDuration: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str3, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_schedule_data");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 c16221xf9b96754 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754();
            c16221xf9b96754.f225414d = i17;
            c16221xf9b96754.f225415e = i18;
            c16221xf9b96754.f225416f = str2;
            c16221xf9b96754.f225417g = str3;
            c16221xf9b96754.f225418h = z17;
            c16221xf9b96754.f225419i = i19;
            c16221xf9b96754.f225421n = java.lang.System.currentTimeMillis() / 1000;
            M.C(str, c16221xf9b96754);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.w1(this, str, c16221xf9b96754), true);
            long j17 = i17 * 60 * 60 * 1000;
            b4Var.c(j17, j17);
            if (((java.util.concurrent.ConcurrentHashMap) this.f225492m).containsKey(str)) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((java.util.concurrent.ConcurrentHashMap) this.f225492m).get(str)).d();
            }
            ((java.util.concurrent.ConcurrentHashMap) this.f225492m).put(str, b4Var);
        }
    }

    public void R() {
        java.lang.String[] strArr;
        int i17;
        boolean z17;
        long j17;
        long j18;
        synchronized (this.f225493n) {
            long j19 = 1000;
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("liteapp_schedule_data");
            java.lang.String[] b17 = M.b();
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "startSchedule appIds is null!");
                return;
            }
            boolean z18 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "startSchedule timenow: %d, appIds:%s", java.lang.Long.valueOf(currentTimeMillis), java.util.Arrays.toString(b17));
            int length = b17.length;
            int i18 = 0;
            while (i18 < length) {
                java.lang.String str = b17[i18];
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 c16221xf9b96754 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754) M.r(str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754.class);
                if (c16221xf9b96754 != null && !((java.util.concurrent.ConcurrentHashMap) this.f225492m).containsKey(str)) {
                    long j27 = c16221xf9b96754.f225420m;
                    if ((j27 == 0 || (currentTimeMillis - j27) / 3600 < c16221xf9b96754.f225414d) && (j27 != 0 || (currentTimeMillis - c16221xf9b96754.f225421n) / 3600 < c16221xf9b96754.f225414d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "not exceed interval, wait for run schedule");
                        long j28 = c16221xf9b96754.f225420m;
                        if (j28 != 0) {
                            strArr = b17;
                            i17 = length;
                            j18 = (((c16221xf9b96754.f225414d * 60) * 60) - (currentTimeMillis - j28)) * 1000;
                            j17 = 1000;
                        } else {
                            strArr = b17;
                            i17 = length;
                            j17 = 1000;
                            j18 = (((c16221xf9b96754.f225414d * 60) * 60) - (currentTimeMillis - c16221xf9b96754.f225421n)) * 1000;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t1 t1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t1(this, str, c16221xf9b96754);
                        z17 = false;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(t1Var, false);
                        b4Var.c(j18, j18);
                        ((java.util.concurrent.ConcurrentHashMap) this.f225492m).put(str, b4Var);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "exceed interval, run schedule");
                        P(str, c16221xf9b96754);
                        if (c16221xf9b96754.f225415e >= 0) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.r1(this, str, c16221xf9b96754), true);
                            long j29 = c16221xf9b96754.f225414d * 60 * 60 * 1000;
                            b4Var2.c(j29, j29);
                            ((java.util.concurrent.ConcurrentHashMap) this.f225492m).put(str, b4Var2);
                        }
                        strArr = b17;
                        i17 = length;
                        j17 = 1000;
                        z17 = false;
                    }
                    i18++;
                    j19 = j17;
                    z18 = z17;
                    b17 = strArr;
                    length = i17;
                }
                strArr = b17;
                i17 = length;
                z17 = z18;
                j17 = j19;
                i18++;
                j19 = j17;
                z18 = z17;
                b17 = strArr;
                length = i17;
            }
        }
    }

    public final com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 S(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String r17 = r(str);
        if (r17 == null || r17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "null == bundle, appId:" + str);
            c3712x3ed8a441 = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "recopy, null == bundle, appId:" + str);
            c3712x3ed8a441 = n(str, abstractC3700xe41a2874);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "tryCopyAndGetWxaLiteAppInfo Execution time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return c3712x3ed8a441;
    }

    public void T(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f fVar) {
        if (fVar == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("host", fVar.f37407x225c99cd);
        bundle.putString("param", fVar.f37408x29a0f908);
        bundle.putString("paramMap", fVar.f37409x63953734);
        bundle.putString("headerMap", fVar.f37406x8de74e8a);
        bundle.putLong(dm.i4.f66874x4c6b1f55, fVar.f37410xa783a79b);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("insertLiteAppAuthInfo", fVar.f37407x225c99cd, bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
        }
    }

    public void U(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef) {
        if (c3710x879b31ef == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "baselib is empty.");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3710x879b31ef.f14330x346425)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "baselib path is empty.");
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c3710x879b31ef.f14330x346425);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "baselib file isn't exist.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.class.getClassLoader());
        bundle.putParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14319x56424e66, c3710x879b31ef);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("insertLiteAppBaselibInfo", c3710x879b31ef.f14328xdbd3ccdf, bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            throw e17;
        }
    }

    public void V(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        if (c3712x3ed8a441 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "app is empty.");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3712x3ed8a441.f14369x346425)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "app path is empty.");
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c3712x3ed8a441.f14369x346425);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "app file isn't exist.");
            return;
        }
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.e(c3712x3ed8a441.f14359x58b7f1c, c3712x3ed8a441.f14368xd0d13783, c3712x3ed8a441.f127552md5);
        if (!e17.equalsIgnoreCase(c3712x3ed8a441.f14369x346425)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "rename app folder from %s to %s", c3712x3ed8a441.f14369x346425, e17);
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(e17);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (!m18.a() ? false : m18.f294799a.F(m18.f294800b)) {
                com.p314xaae8f345.mm.vfs.w6.f(e17);
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, m18);
            if (m19.a()) {
                m19.f294799a.r(m19.f294800b);
            }
            com.p314xaae8f345.mm.vfs.w6.v(c3712x3ed8a441.f14369x346425, e17);
            c3712x3ed8a441.f14369x346425 = e17;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.class.getClassLoader());
        bundle.putParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, c3712x3ed8a441);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("insertLiteAppInfo", c3712x3ed8a441.f14359x58b7f1c, bundle);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e18, "", new java.lang.Object[0]);
            throw e18;
        }
    }

    public void W(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        if (c3712x3ed8a441 == null || !c3712x3ed8a441.f14359x58b7f1c.equalsIgnoreCase("wxalitecce81f5fba338df4dd5f74df8229c600")) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("wxa_lite_app_game_center_version", c3712x3ed8a441.f14368xd0d13783);
    }

    public void f(java.util.List list, long j17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        p();
        long j18 = j17 <= 0 ? 20000L : j17;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = y(str, null);
            if (H(y17)) {
                hashMap.put(str, y17);
                long j19 = j18;
                m(str, y17, false, 3, j18, abstractC3700xe41a2874, null);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (y17 != null) {
                    r45.vc4 vc4Var = new r45.vc4();
                    vc4Var.f469630d = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
                    vc4Var.f469631e = y17.f14362x26947355;
                    linkedList.add(vc4Var);
                    arrayList.add(new t80.g(str, "", linkedList));
                }
                j18 = j19;
            }
        }
        M(list, "paydevops", true);
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.BATCH_CHECK_PACKAGE_UPDATE, "PayDevops");
        }
        ((s80.e) ((t80.h) i95.n0.c(t80.h.class))).wi(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.n1(this, hashMap, list, "PayDevops", abstractC3700xe41a2874));
    }

    public void g(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.e eVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList) || arrayList.isEmpty()) {
            if (eVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k0) eVar).a(arrayList);
                return;
            }
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v> m65743xfeb0e170 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.m65743xfeb0e170();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            java.lang.String str = (java.lang.String) arrayList.get(i17);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.f225485f;
            if (!copyOnWriteArraySet.contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "udr register appId: %s", str);
                ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).aj(str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.class.getName());
                copyOnWriteArraySet.add(str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "batchCheckLiteApp appIds:" + arrayList);
        if (eVar != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.h2(this);
            h2Var.f225508a = arrayList2;
            h2Var.f225509b = eVar;
            ((java.util.concurrent.ConcurrentHashMap) this.f225494o).put(arrayList, h2Var);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p pVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c(str2);
            qVar.f299082f.addAll(m65743xfeb0e170);
            qVar.f299083g[3] = true;
            pVar.f299078d.add(qVar);
            pVar.f299079e[1] = true;
        }
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ai(pVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.p1(this, arrayList, eVar));
        M(arrayList, "ilink", true);
    }

    public void h(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y1 y1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y1(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib");
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = u(abstractC3700xe41a2874);
        if (!G(u17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "no need download, local pkg is debug");
            y1Var.b(u17, 1);
            return;
        }
        java.lang.String str3 = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkBaseLibNeedUpdate, patchId:%s ilinkVersion:%d", (u17 == null || (str2 = u17.f14329xd0d13783) == null || str2.isEmpty()) ? "" : u17.f14329xd0d13783, java.lang.Integer.valueOf(u17 != null ? u17.f14326x26947355 : 0));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f225484e;
        if (concurrentHashMap.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2(this);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225529a = currentTimeMillis;
            k2Var.f225530b = currentTimeMillis;
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
            concurrentHashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, k2Var);
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "baselib is checking. ignore.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) concurrentHashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "begin to check wxalitebaselibrary");
        boolean l17 = j62.e.g().l("clicfg_liteapp_update_use_ilink", true, true, true);
        java.util.List asList = java.util.Arrays.asList(j62.e.g().a("clicfg_liteapp_use_raven_list", "", true, true).split(","));
        if (l17) {
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.f225485f;
            if (!copyOnWriteArraySet.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "udr register appId: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
                ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).aj(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.class.getName());
                copyOnWriteArraySet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
            qVar.f299082f = new java.util.LinkedList(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16220xce57e8fd.m65743xfeb0e170());
            qVar.f299083g[3] = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
            M(arrayList, "ilink", false);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE, "Ilink");
            }
            if (abstractC3700xe41a2874 != null) {
                ((java.util.concurrent.ConcurrentHashMap) this.f225486g).put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, abstractC3700xe41a2874);
            }
            ((java.util.concurrent.ConcurrentHashMap) this.f225488i).put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, y1Var);
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Bi(qVar);
            return;
        }
        if (asList.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466) || l17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (u17 != null) {
                arrayList2.add(new e70.v(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, u17.f14326x26947355));
            }
            e70.w wVar = new e70.w(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, null, arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
            M(arrayList3, "ilink", false);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE, "Ilink");
            }
            ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Bi(wVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.z1(this, k2Var2, abstractC3700xe41a2874, y1Var, u17));
            return;
        }
        if (u17 != null && (str = u17.f14329xd0d13783) != null && !str.isEmpty()) {
            str3 = u17.f14329xd0d13783;
        }
        oq1.r rVar = new oq1.r();
        rVar.f428901a = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466;
        rVar.f428902b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466;
        rVar.f428903c = str3;
        if (u17 == null) {
            rVar.f428904d = 1;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        M(arrayList4, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55702xce94d634, false);
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE, "Tinker");
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).wi(rVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.a2(this, k2Var2, abstractC3700xe41a2874, y1Var, u17));
    }

    public final void i(java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, long j17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        if (hVar == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.e2(this, k2Var, hVar, z17, str, abstractC3700xe41a2874, j17), j17);
    }

    public final java.lang.String j(java.lang.String str, java.util.LinkedList linkedList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u) it.next();
            if (uVar != null) {
                java.lang.String m117632xb5884f29 = uVar.m117632xb5884f29();
                java.lang.String m117633x754a37bb = uVar.m117633x754a37bb();
                if ("dependencies".equals(m117632xb5884f29)) {
                    if (m117633x754a37bb != null) {
                        java.lang.String trim = m117633x754a37bb.trim();
                        if (trim.length() > 1) {
                            try {
                                if (trim.charAt(0) == '[') {
                                    org.json.JSONArray jSONArray = new org.json.JSONArray(trim);
                                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                                        if (optJSONObject != null && optJSONObject.has("appId")) {
                                            arrayList.add(optJSONObject.optString("appId"));
                                        }
                                    }
                                } else {
                                    org.json.JSONObject jSONObject = new org.json.JSONObject(trim);
                                    if (jSONObject.has("appId")) {
                                        arrayList.add(jSONObject.getString("appId"));
                                    }
                                }
                            } catch (org.json.JSONException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
                            }
                        }
                    }
                } else if ("liteappVersion".equals(m117632xb5884f29)) {
                    if (m117633x754a37bb == null) {
                        m117633x754a37bb = "";
                    }
                    str2 = m117633x754a37bb;
                }
            }
        }
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) this.f225490k).put(str, arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "batchCheckGlobalPkgs, appId: %s", arrayList.toString());
            g(arrayList, null);
        }
        return str2;
    }

    public final void k(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkIsGlobalPkg, appId: %s", str);
        java.util.Map map = this.f225490k;
        for (java.lang.String str2 : ((java.util.concurrent.ConcurrentHashMap) map).keySet()) {
            java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) map).get(str2);
            if (!list.isEmpty() && list.contains(str)) {
                list.remove(str);
                if (list.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225482c;
                    java.util.Map map2 = this.f225489j;
                    if (hVar != null && ((java.util.concurrent.ConcurrentHashMap) map2).containsKey(str2)) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) this.f225482c).mo25334x90b54003((com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) ((java.util.concurrent.ConcurrentHashMap) map2).get(str2), 0);
                    }
                    ((java.util.concurrent.ConcurrentHashMap) map2).remove(str2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.String r28, boolean r29, int r30, long r31, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 r33, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h r34) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.l(java.lang.String, boolean, int, long, com.tencent.liteapp.gen.LiteAppReporter, com.tencent.mm.plugin.lite.api.h):void");
    }

    public final boolean m(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, boolean z17, int i17, long j17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkNeedUpdate, begin to checkLiteApp:%s patchId:%s ilinkVersion:%d", str, (c3712x3ed8a441 == null || (str2 = c3712x3ed8a441.f14368xd0d13783) == null || str2.isEmpty()) ? "" : c3712x3ed8a441.f14368xd0d13783, java.lang.Integer.valueOf(c3712x3ed8a441 != null ? c3712x3ed8a441.f14362x26947355 : 0));
        java.util.Map map = this.f225484e;
        if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2(this);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k2Var.f225529a = currentTimeMillis;
            k2Var.f225530b = currentTimeMillis;
            k2Var.f225533e = currentTimeMillis;
            k2Var.f225534f = currentTimeMillis;
            k2Var.f225531c = hVar;
            k2Var.f225532d = i17;
            k2Var.f225535g = z17;
            k2Var.f225536h = j17;
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, k2Var);
            i(str, z17, k2Var, j17, abstractC3700xe41a2874, hVar);
            return true;
        }
        if (hVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis2 - k2Var2.f225529a > j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar2 = k2Var2.f225531c;
            if (hVar2 != null) {
                hVar2.mo25333x2fd71e(str, 9);
            }
            k2Var2.f225531c = null;
            if (c3712x3ed8a441 == null) {
                hVar.mo25333x2fd71e(str, 8);
            } else {
                hVar.mo25334x90b54003(c3712x3ed8a441, 8);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar3 = k2Var2.f225531c;
            if (hVar3 != null) {
                hVar3.mo25333x2fd71e(str, 9);
            }
            k2Var2.f225531c = hVar;
            k2Var2.f225529a = currentTimeMillis2;
            k2Var2.f225535g = z17;
            k2Var2.f225536h = j17;
            i(str, z17, k2Var2, j17, abstractC3700xe41a2874, hVar);
        }
        return false;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 n(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        java.lang.String str2;
        int m47708xb232dc81;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_PACKAGE);
        }
        try {
            java.lang.String[] list = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().list("LiteappPackage");
            int i17 = 0;
            while (true) {
                if (i17 >= list.length) {
                    str2 = null;
                    break;
                }
                java.lang.String str3 = list[i17];
                if (str3.substring(0, str3.indexOf(95)).equals(str)) {
                    str2 = list[i17];
                    break;
                }
                i17++;
            }
            if (str2 == null) {
                return null;
            }
            java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.e(str, "bundle", null);
            if (com.p314xaae8f345.mm.vfs.w6.j(e17)) {
                com.p314xaae8f345.mm.vfs.w6.g(e17, true);
            }
            com.p314xaae8f345.mm.vfs.w6.u(e17);
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N("assets:///LiteappPackage/" + str2, 0, -1);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), "liteapp");
            com.p314xaae8f345.mm.vfs.w6.u(r6Var.o());
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str2);
            if (r6Var2.m()) {
                r6Var2.l();
            }
            com.p314xaae8f345.mm.vfs.w6.R(r6Var2.o(), N);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "copyBundlePackage path: %s", r6Var2.o());
            java.lang.String substring = str2.substring(str2.lastIndexOf(".") + 1);
            if ("zip".equals(substring)) {
                m47708xb232dc81 = com.p314xaae8f345.mm.vfs.w6.Q(r6Var2.o(), e17);
            } else {
                if (!"7z".equals(substring)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "unzip bundle liteapp, file extension is wrong.");
                    if (abstractC3700xe41a2874 != null) {
                        abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_PACKAGE_FAILED);
                    }
                    return null;
                }
                m47708xb232dc81 = com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.m47708xb232dc81(com.p314xaae8f345.mm.vfs.w6.i(r6Var2.o(), false), com.p314xaae8f345.mm.vfs.w6.i(e17, true));
            }
            if (m47708xb232dc81 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "unzip bundle liteApp %s error", str);
                if (abstractC3700xe41a2874 != null) {
                    abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_PACKAGE_FAILED);
                }
                return null;
            }
            r6Var2.l();
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
            c3712x3ed8a441.f14359x58b7f1c = str;
            c3712x3ed8a441.f14368xd0d13783 = "bundle";
            c3712x3ed8a441.f127552md5 = "";
            c3712x3ed8a441.f14375x14f51cd8 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65338x15e79bbb(e17, str, "");
            c3712x3ed8a441.f14372xa8503287 = "";
            c3712x3ed8a441.f14369x346425 = e17;
            c3712x3ed8a441.f14373x368f3a = "bundle";
            c3712x3ed8a441.f14374xee5c7336 = java.lang.System.currentTimeMillis() / 1000;
            s().V(c3712x3ed8a441);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_PACKAGE_SUCCESS);
            }
            return c3712x3ed8a441;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", e18.toString());
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.COPY_BUILTIN_PACKAGE_FAILED);
            }
            return null;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f o() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y1(this);
    }

    public final void p() {
        if (this.f225482c == null) {
            this.f225482c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2(this);
        }
    }

    public final java.lang.String r(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        return (java.lang.String) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225687f).get(str);
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef t(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_BASE_LIBRARY_INFO);
        }
        boolean z17 = false;
        android.os.Bundle bundle = null;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLatestLiteAppBaselibInfo", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_BASE_LIBRARY_INFO_FAILED);
            }
            z17 = true;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == local baselib bundle");
            if (abstractC3700xe41a2874 != null && !z17) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.NO_LOCAL_BASE_LIBRARY_INFO);
            }
            c3710x879b31ef = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.f(abstractC3700xe41a2874);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local baselib bundle");
            bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.class.getClassLoader());
            c3710x879b31ef = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef) bundle.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14319x56424e66);
            ra3.o a17 = ra3.p.f475058a.a(c3710x879b31ef.f14330x346425);
            if (a17.f475056a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLatestLiteAppBaselibInfo all file exists.");
            } else {
                if (abstractC3700xe41a2874 != null) {
                    abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.BASE_LIB_FILE_MISSING, a17.f475057b);
                }
                K(c3710x879b31ef);
                c3710x879b31ef = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.f(abstractC3700xe41a2874);
            }
        }
        if (c3710x879b31ef == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "final baselib result == null");
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_BASE_LIBRARY_INFO_FINAL_FAILED);
            }
        } else if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_BASE_LIBRARY_INFO_SUCCESS, c3710x879b31ef.f14326x26947355);
        }
        return c3710x879b31ef;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        android.os.Bundle bundle;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_BASE_LIBRARY_INFO);
        }
        boolean z17 = false;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLatestLiteAppBaselibInfo", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_BASE_LIBRARY_INFO_FAILED);
            }
            z17 = true;
            bundle = null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == local baselib bundle");
            if (abstractC3700xe41a2874 != null && !z17) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.NO_LOCAL_BASE_LIBRARY_INFO);
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local baselib bundle");
        bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.class.getClassLoader());
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef) bundle.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14319x56424e66);
        ra3.o a17 = ra3.p.f475058a.a(c3710x879b31ef.f14330x346425);
        if (a17.f475056a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLatestLiteAppBaselibInfoWithoutCopyBundle all file exists.");
            return c3710x879b31ef;
        }
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.BASE_LIB_FILE_MISSING, a17.f475057b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "getLatestLiteAppBaselibInfoWithoutCopyBundle not all file exists.");
        K(c3710x879b31ef);
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f v(java.lang.String str) {
        android.os.Bundle bundle;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppAuthInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f();
        fVar.f37407x225c99cd = bundle.getString("host");
        fVar.f37408x29a0f908 = bundle.getString("param");
        fVar.f37409x63953734 = bundle.getString("paramMap");
        fVar.f37406x8de74e8a = bundle.getString("headerMap");
        fVar.f37410xa783a79b = bundle.getLong(dm.i4.f66874x4c6b1f55);
        return fVar;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef w(java.lang.String str) {
        android.os.Bundle bundle;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppBaselibInfo", str, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle != null) {
            bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.class.getClassLoader());
            return (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef) bundle.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14319x56424e66);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle, majorVersion:" + str);
        return null;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 x(java.lang.String str) {
        return y(str, null);
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y(java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441;
        int indexOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppInfo");
        int indexOf2 = str.indexOf(64);
        boolean z17 = false;
        java.lang.String substring = (indexOf2 < 0 || (indexOf = str.indexOf(63, indexOf2)) < 0 || !str.substring(indexOf2 + 1, indexOf).equals("game")) ? str : str.substring(0, indexOf2);
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_PACKAGE_INFO);
        }
        android.os.Bundle bundle = null;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppInfo", substring, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_PACKAGE_INFO_FAILED);
            }
            z17 = true;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle");
            if (abstractC3700xe41a2874 != null && !z17) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.NO_LOCAL_PACKAGE_INFO);
            }
            c3712x3ed8a441 = S(substring, abstractC3700xe41a2874);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "have local bundle");
            bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.class.getClassLoader());
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a4412 = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) bundle.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0);
            java.lang.String r17 = r(substring);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "appId: %s, bundle version: %s, info version: %s", substring, r17, c3712x3ed8a4412.f14375x14f51cd8);
            if (r17 == null || r17.isEmpty() || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(r17, c3712x3ed8a4412.f14375x14f51cd8)) {
                ra3.o b17 = ra3.p.f475058a.b(c3712x3ed8a4412.f14369x346425);
                if (b17.f475056a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppInfo appId: " + str + ", all file exists.");
                    c3712x3ed8a441 = c3712x3ed8a4412;
                } else {
                    if (abstractC3700xe41a2874 != null) {
                        abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.PACKAGE_FILE_MISSING, b17.f475057b);
                    }
                    L(c3712x3ed8a4412);
                    c3712x3ed8a441 = S(substring, abstractC3700xe41a2874);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "need to use bundle.");
                L(c3712x3ed8a4412);
                c3712x3ed8a441 = S(substring, abstractC3700xe41a2874);
            }
        }
        if (c3712x3ed8a441 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "final result == null");
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_PACKAGE_INFO_FINAL_FAILED);
            }
        } else if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28890x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.GET_LOCAL_PACKAGE_INFO_SUCCESS, c3712x3ed8a441.f14362x26947355);
        }
        return c3712x3ed8a441;
    }

    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 z(java.lang.String str) {
        try {
            android.os.Bundle a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppInfo", str, null);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "null == bundle");
                return null;
            }
            a17.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.class.getClassLoader());
            return (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) a17.getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
