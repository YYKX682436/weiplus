package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class v2 {

    /* renamed from: b, reason: collision with root package name */
    public static long f102616b;

    /* renamed from: d, reason: collision with root package name */
    public static int f102618d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f102619e;

    /* renamed from: f, reason: collision with root package name */
    public static long f102620f;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.v2 f102615a = new com.tencent.mm.plugin.finder.assist.v2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f102617c = new java.lang.Object();

    static {
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        L.putString("finder_vfs_storage_config", (java.lang.String) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127715ga).getValue()).r());
        L.putLong("finder_vfs_storage_first_page_config", (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Q1).getValue()).r()).intValue() + 86400) * 1000);
        L.putString("finder_live_vfs_storage_config", (java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.P).getValue()).r());
        L.putString("finder_live_replay_vfs_storage_config", (java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.Q).getValue()).r());
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.assist.FinderFolderClearManager$1

            /* renamed from: d, reason: collision with root package name */
            public int f101980d = -1;

            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.nh nhVar = event.f54438g;
                if (nhVar.f7425a != 2 && this.f101980d == 2 && com.tencent.mm.plugin.finder.assist.v2.f102619e && com.tencent.mm.plugin.finder.assist.v2.f102618d <= 0) {
                    com.tencent.mm.plugin.finder.assist.v2 v2Var = com.tencent.mm.plugin.finder.assist.v2.f102615a;
                    pm0.v.K(null, com.tencent.mm.plugin.finder.assist.t2.f102547d);
                    com.tencent.mm.plugin.finder.assist.v2.f102619e = false;
                }
                this.f101980d = nhVar.f7425a;
                return false;
            }
        }.alive();
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "clearMarkFolder");
        synchronized (f102617c) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            java.util.Set<java.lang.String> stringSet = L.getStringSet("FINDER_MARK_DEL_FOLDERS", new java.util.HashSet());
            if (stringSet != null) {
                for (java.lang.String str : stringSet) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "clearMarkFolders " + str);
                    com.tencent.mm.vfs.w6.g(str, true);
                    com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
                    if (kotlin.jvm.internal.o.b(str, com.tencent.mm.plugin.finder.assist.e9.f102140i)) {
                        cu2.x.b(cu2.x.f222449a, 0L, 1, null);
                    }
                }
            }
            L.putStringSet("FINDER_MARK_DEL_FOLDERS", new java.util.HashSet());
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (stringSet != null && stringSet.size() > 0) {
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(1267L, 1L, 1L);
                g0Var.C(1267L, 2L, elapsedRealtime2);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "clearMarkFolder cost:" + elapsedRealtime2);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "dumpAndMark");
        long a17 = c01.id.a();
        if (a17 - f102616b < com.tencent.mm.plugin.finder.storage.t70.f127590a.F()) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        f102616b = a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        for (com.tencent.mm.plugin.finder.assist.r2 r2Var : com.tencent.mm.plugin.finder.assist.e9.f102151t) {
            jz5.l a18 = r2Var.a(false);
            ((java.lang.Number) a18.f302833d).intValue();
            long longValue = ((java.lang.Number) a18.f302834e).longValue();
            if (r2Var.f102499d && longValue > r2Var.f102498c) {
                synchronized (f102617c) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "mark: size " + longValue + ", name " + r2Var.f102497b + ", path " + r2Var.f102496a);
                    com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
                    java.util.Set stringSet = L.getStringSet("FINDER_MARK_DEL_FOLDERS", new java.util.HashSet());
                    kotlin.jvm.internal.o.d(stringSet);
                    stringSet.add(r2Var.f102496a);
                    L.putStringSet("FINDER_MARK_DEL_FOLDERS", stringSet);
                }
            }
            if (r2Var.f102500e > 0) {
                arrayList.add(new jz5.l(java.lang.Long.valueOf(longValue), r2Var));
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new com.tencent.mm.plugin.finder.assist.u2());
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1267L, 3L, 1L);
        g0Var.C(1267L, 4L, elapsedRealtime2);
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it.next()).f302833d).longValue()));
        }
        ((qs2.q) eVar).getClass();
        java.lang.String W = r26.n0.W(r26.n0.Z(arrayList2.toString(), "]"), "[");
        com.tencent.mars.xlog.Log.i("Finder.FinderStat", "report 18896: ".concat(W));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(18896, W);
    }

    public final long c(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        long j17 = 0;
        for (com.tencent.mm.plugin.finder.assist.r2 r2Var : com.tencent.mm.plugin.finder.assist.e9.f102151t) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            j17 += ((java.lang.Number) r2Var.a(false).f302834e).longValue();
        }
        return j17;
    }

    public final void d() {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127715ga;
        if (((java.lang.CharSequence) ((lb2.j) ((jz5.n) gVar).getValue()).r()).length() > 0) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(new org.json.JSONObject((java.lang.String) ((lb2.j) ((jz5.n) gVar).getValue()).r()));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = jSONObject;
            }
            try {
                m521constructorimpl2 = kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(((org.json.JSONObject) m521constructorimpl).getLong("interval")));
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
                m521constructorimpl2 = 0L;
            }
            long longValue = ((java.lang.Number) m521constructorimpl2).longValue();
            if (longValue < 0) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFolderClearManager", "intervalMs[" + longValue + "] < 0");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f102620f;
            if (currentTimeMillis < longValue) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFolderClearManager", "intervalMs[" + longValue + "] > diff[" + currentTimeMillis + ']');
                return;
            }
        }
        synchronized (f102617c) {
            com.tencent.mm.vfs.m5 a17 = com.tencent.mm.vfs.a3.f212781a.a();
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            for (java.lang.String str : kz5.c0.i("live", "finder")) {
                com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "[touchClearVFS] value=" + str);
                com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) a17).b(str);
                if (b17 != null) {
                    b17.q(cancellationSignal);
                }
            }
            cu2.x.b(cu2.x.f222449a, 0L, 1, null);
            f102620f = java.lang.System.currentTimeMillis();
        }
    }
}
