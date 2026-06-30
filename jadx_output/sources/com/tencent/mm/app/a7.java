package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class a7 extends com.tencent.mm.app.s2 {
    public static boolean A = false;
    public static java.lang.Integer B = null;

    /* renamed from: z, reason: collision with root package name */
    public static int f53303z = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53304d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53305e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.ActivityManager f53306f = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f53307g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f53308h = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$1
        @Override // com.tencent.mm.sdk.platformtools.a4
        public boolean onTimerExpired() {
            int i17;
            int i18;
            android.os.Debug.MemoryInfo memoryInfo;
            java.lang.String str;
            com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "killWAGameTimer onTimerExpired");
            ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
            if (eVar == null) {
                return false;
            }
            com.tencent.mm.app.a7 a7Var = com.tencent.mm.app.a7.this;
            a7Var.getClass();
            try {
                r4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kill_wagame_background_500, 0) == 1 ? 500000 : Integer.MAX_VALUE;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kill_wagame_background_800, 0) == 1) {
                    r4 = 800000;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TempAppForegroundNotifyDeprecated", th6, "", new java.lang.Object[0]);
            }
            int i19 = r4;
            com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "getWAGameKillSize killSize =  %d", java.lang.Integer.valueOf(i19));
            java.util.List<ft.b> R6 = eVar.R6();
            com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "appbrand process count = %s", java.lang.Integer.valueOf(R6.size()));
            for (ft.b bVar : R6) {
                if (!u46.l.c(bVar.getF65038d(), com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: processName = " + bVar.getF65038d() + ", process.isProcessAlive = " + bVar.a() + ", process.getAllAppId() = " + bVar.c());
                    if (bVar.a()) {
                        java.lang.String f65038d = bVar.getF65038d();
                        a7Var.getClass();
                        int i27 = -1;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(f65038d)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "getPicByProcessName() processName == null");
                        } else {
                            try {
                                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
                                if (runningAppProcesses != null) {
                                    for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                        if (runningAppProcessInfo.processName.equals(f65038d)) {
                                            i18 = runningAppProcessInfo.pid;
                                            break;
                                        }
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "getPicByProcessName() processes == null");
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "getPidByProcessName() %s %s %s", f65038d, e17.getClass().getSimpleName(), e17.getMessage());
                            }
                        }
                        i18 = -1;
                        com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "getGraphicsPss: pid = " + i18);
                        android.os.Debug.MemoryInfo[] processMemoryInfo = a7Var.f53306f.getProcessMemoryInfo(new int[]{i18});
                        if (processMemoryInfo != null && processMemoryInfo.length == 1 && (memoryInfo = processMemoryInfo[0]) != null && (str = memoryInfo.getMemoryStats().get("summary.graphics")) != null && !str.isEmpty()) {
                            i27 = java.lang.Integer.parseInt(str);
                        }
                        java.lang.String obj = bVar.c().toString();
                        com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: useAs = " + bVar.getF65040f() + ", graphics pss = " + i27 + ", killGraphicsPssSize = " + i19);
                        if (bVar.getF65040f() == ft.d.WAGAME && i27 >= i19) {
                            bVar.b();
                            i17 = i19;
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19854, "kill WAGame|", 0, "", 0, 0, obj, java.lang.Integer.valueOf(i27), 1);
                            com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: kill success !");
                            i19 = i17;
                        }
                    }
                    i17 = i19;
                    i19 = i17;
                }
            }
            return false;
        }
    }, true);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f53309i = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$2
        @Override // com.tencent.mm.sdk.platformtools.a4
        public boolean onTimerExpired() {
            int i17;
            java.util.List arrayList;
            final boolean z17;
            int i18;
            final int i19;
            com.tencent.mm.app.a7 a7Var = com.tencent.mm.app.a7.this;
            if (!a7Var.f53322y) {
                a7Var.f53311n = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "timer no working required");
                return false;
            }
            if (!gm0.j1.i().f273208a.f273299d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Startup doesn't finish, killToolsTimer return.");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "killToolsTimer onTimerExpired");
            try {
                i17 = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_tools_and_mp_release_use_delegate", "1", false, true), 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "get clicfg_tools_and_mp_release_use_delegate error!");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TempAppForegroundNotifyDeprecated", e17, "", new java.lang.Object[0]);
                i17 = 1;
            }
            if (i17 != 1) {
                java.lang.String m07 = com.tencent.mm.sdk.platformtools.t8.m0(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (m07 != null && m07.toLowerCase().startsWith("com.tencent.mm")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "onTimerExpired, top activity belongs to mm, skip kill tools");
                    com.tencent.mm.app.a7.this.f53311n = false;
                    return false;
                }
            } else if (com.tencent.mm.app.w.INSTANCE.f53889n) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "onTimerExpired, AppForeground");
                com.tencent.mm.app.a7.this.f53311n = false;
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.multitask.j0 j0Var = (com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
            java.lang.Object[] objArr = {2, 26};
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            for (int i27 = 0; i27 < 2; i27++) {
                java.lang.Object obj = objArr[i27];
                java.util.Objects.requireNonNull(obj);
                arrayList2.add(obj);
            }
            java.util.List types = java.util.Collections.unmodifiableList(arrayList2);
            com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) j0Var;
            i1Var.getClass();
            kotlin.jvm.internal.o.g(types, "types");
            lk3.b aj6 = i1Var.aj();
            if (aj6 == null) {
                arrayList = new java.util.ArrayList();
            } else if (gm0.j1.a()) {
                p75.n0 n0Var = dm.h8.f237405m;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                p75.m0 k17 = dm.h8.f237407o.k(types);
                linkedList2.add(dm.h8.f237408p.u());
                p75.i0 g17 = dm.h8.f237405m.g(linkedList);
                g17.f352657d = k17;
                g17.f352659f = linkedList2;
                g17.f352660g = linkedList3;
                arrayList = g17.a().k(aj6.f193147g.Q4(), com.tencent.mm.plugin.multitask.model.MultiTaskInfo.class);
            } else {
                arrayList = kz5.p0.f313996d;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                long j17 = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next()).field_createTime;
                if (j17 <= currentTimeMillis && currentTimeMillis - j17 <= 1800000) {
                    z17 = true;
                    break;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ToolsProfile.ToolsProcessLocker.isLockedUsedByOtherProcess():");
            sb6.append(com.tencent.mm.app.d7.f53395a.get() > 0 || com.tencent.mm.app.d7.a("com.tencent.mm:tools"));
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", sb6.toString());
            if (com.tencent.mm.pluginsdk.model.g4.b()) {
                final com.tencent.mm.app.a7 a7Var2 = com.tencent.mm.app.a7.this;
                a7Var2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "doRecycleMainProcessWebView");
                com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
                synchronized (com.tencent.xweb.j1.class) {
                    i19 = com.tencent.xweb.j1.f220317a;
                }
                if (i19 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "doRecycleMainProcessWebView, no webview, force kill child process");
                    com.tencent.xweb.a3.d();
                    a7Var2.f53311n = false;
                } else {
                    a7Var2.f53307g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.a7$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            final com.tencent.mm.app.a7 a7Var3 = com.tencent.mm.app.a7.this;
                            a7Var3.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "doRecycleMainProcessWebView, webView count = %s, post destroy event", java.lang.Integer.valueOf(i19));
                            final com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = new com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent();
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            am.b4 b4Var = destroyPreloadedWebViewEvent.f54089g;
                            b4Var.f6217a = currentTimeMillis2;
                            b4Var.f6218b = z17;
                            destroyPreloadedWebViewEvent.e();
                            a7Var3.f53307g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.a7$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i28;
                                    final com.tencent.mm.app.a7 a7Var4 = com.tencent.mm.app.a7.this;
                                    com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent2 = destroyPreloadedWebViewEvent;
                                    a7Var4.getClass();
                                    long j18 = destroyPreloadedWebViewEvent2.f54089g.f6217a;
                                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                    g0Var.A(1009, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
                                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.ui.widget.MMWebView.F;
                                    java.util.ArrayList arrayList3 = copyOnWriteArrayList.isEmpty() ? null : new java.util.ArrayList(copyOnWriteArrayList);
                                    if (arrayList3 == null || arrayList3.isEmpty()) {
                                        g0Var.A(1009, 223);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "no webView created");
                                    } else {
                                        g0Var.A(1009, 224);
                                        java.util.Iterator it6 = arrayList3.iterator();
                                        int i29 = 0;
                                        int i37 = 0;
                                        int i38 = 0;
                                        while (it6.hasNext()) {
                                            com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) ((java.lang.ref.WeakReference) it6.next()).get();
                                            if (mMWebView != null) {
                                                i38++;
                                                try {
                                                    int webViewContextType = mMWebView.getWebViewContextType();
                                                    if (webViewContextType == 2) {
                                                        i29++;
                                                    } else if (webViewContextType == 1) {
                                                        i37++;
                                                    }
                                                    try {
                                                        java.lang.String url = mMWebView.getUrl();
                                                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                                        if (url == null) {
                                                            url = "";
                                                        }
                                                        java.net.URLEncoder.encode(url, com.tencent.mapsdk.internal.rv.f51270c);
                                                        if (a7Var4.f53316s <= 2) {
                                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26165, 999, 1, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(webViewContextType), url);
                                                        }
                                                    } catch (java.io.UnsupportedEncodingException unused) {
                                                    }
                                                } catch (java.io.UnsupportedEncodingException unused2) {
                                                }
                                            }
                                        }
                                        if (i29 > 0) {
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1009, 225);
                                        }
                                        if (i37 > 0 && (i28 = a7Var4.f53316s) < 5) {
                                            a7Var4.f53316s = i28 + 1;
                                        }
                                        if (i29 > 0 || i37 > 0) {
                                            a7Var4.e();
                                        }
                                        com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "not destroyed webview count:%s, visibleWebViewCount:%s", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37));
                                    }
                                    ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: com.tencent.mm.app.a7$$c
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z19 = false;
                                            com.tencent.mm.app.a7.this.f53311n = false;
                                            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
                                            if (runningAppProcesses != null) {
                                                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it7 = runningAppProcesses.iterator();
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        break;
                                                    }
                                                    android.app.ActivityManager.RunningAppProcessInfo next = it7.next();
                                                    if (next != null && next.processName.contains("xweb_privileged_process")) {
                                                        z19 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (z19 && com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.isBackground()) {
                                                com.tencent.mars.xlog.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "ERROR: xweb proc still exist in deep bg");
                                            }
                                        }
                                    }, 16000L);
                                }
                            });
                        }
                    });
                }
                return false;
            }
            if (!(!ob0.r3.a() ? !((!z17 || com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground()) && com.tencent.mm.sdk.platformtools.t8.R0(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.w9.f193055c)) : z17)) {
                if (z17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1686L, 12L, 1L, false);
                }
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "onTimerExpired, kill tools process");
            com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
            switch (com.tencent.mm.app.a7.this.f53316s) {
                case 0:
                    i18 = 1;
                    break;
                case 1:
                    i18 = 2;
                    break;
                case 2:
                    i18 = 3;
                    break;
                case 3:
                    i18 = 4;
                    break;
                case 4:
                    i18 = 5;
                    break;
                case 5:
                    i18 = 6;
                    break;
                case 6:
                    i18 = 7;
                    break;
                default:
                    i18 = 8;
                    break;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(1686L, 11L, 1L, false);
            g0Var.idkeyStat(1686L, i18, 1L, false);
            com.tencent.mm.app.a7 a7Var3 = com.tencent.mm.app.a7.this;
            int i28 = a7Var3.f53318u + 1;
            a7Var3.f53318u = i28;
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "sameLevelReleaseCnt:%d    lastReleaseTime:%d    level:%d", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(com.tencent.mm.app.a7.this.f53317t), java.lang.Integer.valueOf(com.tencent.mm.app.a7.this.f53316s));
            com.tencent.mm.app.a7 a7Var4 = com.tencent.mm.app.a7.this;
            if (currentTimeMillis - a7Var4.f53317t <= a7Var4.b() * 2) {
                com.tencent.mm.app.a7 a7Var5 = com.tencent.mm.app.a7.this;
                if (a7Var5.f53318u >= 2) {
                    int i29 = a7Var5.f53316s + 1;
                    a7Var5.f53316s = i29;
                    a7Var5.f53318u = 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "level up, now:%d", java.lang.Integer.valueOf(i29));
                }
            }
            com.tencent.mm.app.a7 a7Var6 = com.tencent.mm.app.a7.this;
            a7Var6.f53317t = currentTimeMillis;
            a7Var6.f53311n = false;
            return false;
        }
    }, true);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f53310m = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$3
        /* JADX WARN: Removed duplicated region for block: B:50:0x0221 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[SYNTHETIC] */
        @Override // com.tencent.mm.sdk.platformtools.a4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTimerExpired() {
            /*
                Method dump skipped, instructions count: 723
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$3.onTimerExpired():boolean");
        }
    }, true);

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f53311n = false;

    /* renamed from: o, reason: collision with root package name */
    public final mm.b0 f53312o = new mm.b0() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$4
        @Override // mm.b0
        public java.lang.String a() {
            return "xweb-recycle";
        }

        @Override // mm.b0
        public boolean b() {
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "shouldAbortForXweb: %s", java.lang.Boolean.valueOf(com.tencent.mm.app.a7.this.f53311n));
            return com.tencent.mm.app.a7.this.f53311n;
        }
    };

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f53313p = false;

    /* renamed from: q, reason: collision with root package name */
    public final mm.b0 f53314q = new mm.b0() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$5
        @Override // mm.b0
        public java.lang.String a() {
            return "appbrand-recycle";
        }

        @Override // mm.b0
        public boolean b() {
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "shouldAbortForAppbrand: %s", java.lang.Boolean.valueOf(com.tencent.mm.app.a7.this.f53313p));
            return com.tencent.mm.app.a7.this.f53313p;
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public long f53315r = 30000;

    /* renamed from: s, reason: collision with root package name */
    public int f53316s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f53317t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f53318u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f53319v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f53320w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f53321x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f53322y = false;

    public final long a() {
        switch (this.f53319v) {
            case 0:
                return this.f53315r;
            case 1:
                return 30000L;
            case 2:
                return 60000L;
            case 3:
                return 180000L;
            case 4:
                return 300000L;
            case 5:
                return 600000L;
            case 6:
                return 1200000L;
            default:
                return 1800000L;
        }
    }

    public final long b() {
        if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tools_on_background_release_v2, 1) && !o45.wf.f343033k) {
            return 1800000L;
        }
        switch (this.f53316s) {
            case 0:
                return this.f53315r;
            case 1:
                return 30000L;
            case 2:
                return 60000L;
            case 3:
                return 180000L;
            case 4:
                return 300000L;
            case 5:
                return 600000L;
            case 6:
                return 1200000L;
            default:
                return 1800000L;
        }
    }

    public void c() {
        alive();
        this.f53315r = j62.e.g().i("clicfg_tools_mp_background_time_s_v2", 15, true, true) * 1000;
        if (ob0.r3.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable deep backgroud process reclaim");
        mm.d0 d0Var = mm.d0.f328475a;
        d0Var.b(this.f53312o);
        d0Var.b(this.f53314q);
        com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.matrix.lifecycle.g() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$6
            @Override // com.tencent.matrix.lifecycle.g
            public void a() {
                com.tencent.mm.app.a7.this.f53311n = true;
                com.tencent.mm.app.a7.this.f53313p = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "set shouldAbort = true");
                com.tencent.mm.app.a7.this.f53307g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "On deep background.");
                            com.tencent.mm.app.TempAppForegroundNotifyDeprecated$6 tempAppForegroundNotifyDeprecated$6 = com.tencent.mm.app.TempAppForegroundNotifyDeprecated$6.this;
                            boolean e17 = com.tencent.mm.app.a7.this.f53309i.e();
                            com.tencent.mm.app.a7 a7Var = com.tencent.mm.app.a7.this;
                            if (e17 || a7Var.f53316s != 0) {
                                if (!a7Var.f53309i.e()) {
                                    a7Var.f53309i.d();
                                }
                                a7Var.f53318u = 0;
                                a7Var.f53316s = 0;
                                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level");
                                a7Var.e();
                            }
                            if (a7Var.f53310m.e() || a7Var.f53319v != 0) {
                                a7Var.f53321x = 0;
                                a7Var.f53319v = 0;
                                com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level for APPBRAND process.");
                                a7Var.d();
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.matrix.lifecycle.g
            public void b() {
                com.tencent.mm.app.a7.this.f53311n = false;
                com.tencent.mm.app.a7.this.f53313p = false;
            }
        });
    }

    public final void d() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f53310m;
        if (!b4Var.e()) {
            b4Var.d();
        }
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.z.f193115k) {
            try {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_process_background_reclaim, 0) == 1) {
                    z17 = true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TempAppForegroundNotifyDeprecated", th6, "", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable appbrand process background reclaim: %s", java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            long a17 = a();
            b4Var.c(a17, a17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.P(r0, 1) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.P(r1, 1) > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r9 = this;
            com.tencent.mm.sdk.platformtools.b4 r0 = r9.f53309i
            boolean r0 = r0.e()
            if (r0 != 0) goto Ld
            com.tencent.mm.sdk.platformtools.b4 r0 = r9.f53309i
            r0.d()
        Ld:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.x2.f193072b
            r1.append(r2)
            java.lang.String r2 = ":tools"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.R0(r0, r1)
            boolean r1 = com.tencent.mm.pluginsdk.model.g4.b()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "MicroMsg.TempAppForegroundNotifyDeprecated"
            java.lang.String r4 = "before kill tools, tools is running: %b, isWebViewRunInMainProc: %s"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            r2 = 0
            if (r0 != 0) goto L47
            if (r1 == 0) goto L43
            goto L47
        L43:
            r9.f53311n = r2
            goto Le3
        L47:
            java.lang.String r0 = "get clicfg_tools_and_mp_hw_honor_29 "
            java.lang.String r1 = "get clicfg_tools_and_mp_bg_proc_release "
            java.lang.String r4 = android.os.Build.BRAND
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = "huawei"
            boolean r5 = r4.contains(r5)
            java.lang.String r6 = "1"
            java.lang.String r7 = ""
            r8 = 1
            if (r5 != 0) goto L66
            java.lang.String r5 = "honor"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L98
        L66:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 != r5) goto L98
            j62.e r1 = j62.e.g()     // Catch: java.lang.Exception -> L8c
            java.lang.String r4 = "clicfg_tools_and_mp_hw_honor_29_v2"
            java.lang.String r1 = r1.j(r4, r6, r2, r8)     // Catch: java.lang.Exception -> L8c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8c
            r4.<init>(r0)     // Catch: java.lang.Exception -> L8c
            r4.append(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L8c
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Exception -> L8c
            int r0 = com.tencent.mm.sdk.platformtools.t8.P(r1, r8)     // Catch: java.lang.Exception -> L8c
            if (r0 <= 0) goto Lc4
            goto Lb7
        L8c:
            r0 = move-exception
            java.lang.String r1 = "get clicfg_tools_and_mp_hw_honor_29 error!"
            com.tencent.mars.xlog.Log.i(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r7, r1)
            goto Lc4
        L98:
            j62.e r0 = j62.e.g()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r4 = "clicfg_tools_and_mp_bg_proc_release"
            java.lang.String r0 = r0.j(r4, r6, r2, r8)     // Catch: java.lang.Exception -> Lb9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb9
            r4.<init>(r1)     // Catch: java.lang.Exception -> Lb9
            r4.append(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> Lb9
            com.tencent.mars.xlog.Log.i(r3, r1)     // Catch: java.lang.Exception -> Lb9
            int r0 = com.tencent.mm.sdk.platformtools.t8.P(r0, r8)     // Catch: java.lang.Exception -> Lb9
            if (r0 <= 0) goto Lc4
        Lb7:
            r0 = r8
            goto Lc5
        Lb9:
            r0 = move-exception
            java.lang.String r1 = "get clicfg_tools_and_mp_bg_proc_release error!"
            com.tencent.mars.xlog.Log.i(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r7, r1)
        Lc4:
            r0 = r2
        Lc5:
            if (r0 == 0) goto Ld9
            java.lang.String r0 = "startToolsProcKillTimer work"
            com.tencent.mars.xlog.Log.i(r3, r0)
            com.tencent.mm.sdk.platformtools.b4 r0 = r9.f53309i
            long r1 = r9.b()
            r0.c(r1, r1)
            r9.f53322y = r8
            goto Le3
        Ld9:
            java.lang.String r0 = "startToolsProcKillTimer skip"
            com.tencent.mars.xlog.Log.i(r3, r0)
            r9.f53322y = r2
            r9.f53311n = r2
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.a7.e():void");
    }

    @Override // com.tencent.mm.app.s2
    public android.os.Handler getHandler() {
        return this.f53307g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.app.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAppBackground(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.a7.onAppBackground(java.lang.String):void");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (!this.f53308h.e()) {
            this.f53308h.d();
        }
        if (!this.f53309i.e()) {
            this.f53309i.d();
        }
        if (!this.f53310m.e()) {
            this.f53310m.d();
        }
        if (java.lang.System.currentTimeMillis() - this.f53317t > 3600000) {
            this.f53318u = 0;
            this.f53316s = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level");
        }
        if (java.lang.System.currentTimeMillis() - this.f53320w > 3600000) {
            this.f53321x = 0;
            this.f53319v = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level for APPBRAND process.");
        }
        if (gm0.j1.a() && gm0.j1.b().f273254q && !gm0.m.r()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.app.TempAppForegroundNotifyDeprecated$7(this, str, uptimeMillis), "onAppForegroundThread");
        }
    }
}
