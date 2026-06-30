package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class v2 {

    /* renamed from: b, reason: collision with root package name */
    public static long f184149b;

    /* renamed from: d, reason: collision with root package name */
    public static int f184151d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f184152e;

    /* renamed from: f, reason: collision with root package name */
    public static long f184153f;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2 f184148a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f184150c = new java.lang.Object();

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        L.putString("finder_vfs_storage_config", (java.lang.String) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209248ga).mo141623x754a37bb()).r());
        L.putLong("finder_vfs_storage_first_page_config", (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Q1).mo141623x754a37bb()).r()).intValue() + 86400) * 1000);
        L.putString("finder_live_vfs_storage_config", (java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.P).mo141623x754a37bb()).r());
        L.putString("finder_live_replay_vfs_storage_config", (java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.Q).mo141623x754a37bb()).r());
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.finder.assist.FinderFolderClearManager$1

            /* renamed from: d, reason: collision with root package name */
            public int f183513d = -1;

            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.nh nhVar = event.f135971g;
                if (nhVar.f88958a != 2 && this.f183513d == 2 && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184152e && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184151d <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184148a;
                    pm0.v.K(null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t2.f184080d);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184152e = false;
                }
                this.f183513d = nhVar.f88958a;
                return false;
            }
        }.mo48813x58998cd();
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "clearMarkFolder");
        synchronized (f184150c) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            java.util.Set<java.lang.String> stringSet = L.getStringSet("FINDER_MARK_DEL_FOLDERS", new java.util.HashSet());
            if (stringSet != null) {
                for (java.lang.String str : stringSet) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "clearMarkFolders " + str);
                    com.p314xaae8f345.mm.vfs.w6.g(str, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183673i)) {
                        cu2.x.b(cu2.x.f303982a, 0L, 1, null);
                    }
                }
            }
            L.putStringSet("FINDER_MARK_DEL_FOLDERS", new java.util.HashSet());
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (stringSet != null && stringSet.size() > 0) {
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.C(1267L, 1L, 1L);
                g0Var.C(1267L, 2L, elapsedRealtime2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "clearMarkFolder cost:" + elapsedRealtime2);
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "dumpAndMark");
        long a17 = c01.id.a();
        if (a17 - f184149b < com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F()) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        f184149b = a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r2 r2Var : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183684t) {
            jz5.l a18 = r2Var.a(false);
            ((java.lang.Number) a18.f384366d).intValue();
            long longValue = ((java.lang.Number) a18.f384367e).longValue();
            if (r2Var.f184032d && longValue > r2Var.f184031c) {
                synchronized (f184150c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "mark: size " + longValue + ", name " + r2Var.f184030b + ", path " + r2Var.f184029a);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
                    java.util.Set stringSet = L.getStringSet("FINDER_MARK_DEL_FOLDERS", new java.util.HashSet());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringSet);
                    stringSet.add(r2Var.f184029a);
                    L.putStringSet("FINDER_MARK_DEL_FOLDERS", stringSet);
                }
            }
            if (r2Var.f184033e > 0) {
                arrayList.add(new jz5.l(java.lang.Long.valueOf(longValue), r2Var));
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u2());
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1267L, 3L, 1L);
        g0Var.C(1267L, 4L, elapsedRealtime2);
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it.next()).f384366d).longValue()));
        }
        ((qs2.q) eVar).getClass();
        java.lang.String W = r26.n0.W(r26.n0.Z(arrayList2.toString(), "]"), "[");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStat", "report 18896: ".concat(W));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(18896, W);
    }

    public final long c(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        long j17 = 0;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r2 r2Var : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183684t) {
            if (c26987xeef691ab != null) {
                c26987xeef691ab.m108011xf4ed245c();
            }
            j17 += ((java.lang.Number) r2Var.a(false).f384367e).longValue();
        }
        return j17;
    }

    public final void d() {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209248ga;
        if (((java.lang.CharSequence) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).length() > 0) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject((java.lang.String) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = jSONObject;
            }
            try {
                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(((org.json.JSONObject) m143895xf1229813).getLong("interval")));
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298132)) {
                m143895xf12298132 = 0L;
            }
            long longValue = ((java.lang.Number) m143895xf12298132).longValue();
            if (longValue < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderFolderClearManager", "intervalMs[" + longValue + "] < 0");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f184153f;
            if (currentTimeMillis < longValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderFolderClearManager", "intervalMs[" + longValue + "] > diff[" + currentTimeMillis + ']');
                return;
            }
        }
        synchronized (f184150c) {
            com.p314xaae8f345.mm.vfs.m5 a17 = com.p314xaae8f345.mm.vfs.a3.f294314a.a();
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            for (java.lang.String str : kz5.c0.i("live", "finder")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "[touchClearVFS] value=" + str);
                com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) a17).b(str);
                if (b17 != null) {
                    b17.q(cancellationSignal);
                }
            }
            cu2.x.b(cu2.x.f303982a, 0L, 1, null);
            f184153f = java.lang.System.currentTimeMillis();
        }
    }
}
