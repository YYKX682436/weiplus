package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class a7 extends com.p314xaae8f345.mm.app.s2 {
    public static boolean A = false;
    public static java.lang.Integer B = null;

    /* renamed from: z, reason: collision with root package name */
    public static int f134836z = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f134837d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134838e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.ActivityManager f134839f = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f134840g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f134841h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$1
        @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
        /* renamed from: onTimerExpired */
        public boolean mo322xdd48fb9f() {
            int i17;
            int i18;
            android.os.Debug.MemoryInfo memoryInfo;
            java.lang.String str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "killWAGameTimer onTimerExpired");
            ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
            if (eVar == null) {
                return false;
            }
            com.p314xaae8f345.mm.app.a7 a7Var = com.p314xaae8f345.mm.app.a7.this;
            a7Var.getClass();
            try {
                r4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kill_wagame_background_500, 0) == 1 ? 500000 : Integer.MAX_VALUE;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kill_wagame_background_800, 0) == 1) {
                    r4 = 800000;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TempAppForegroundNotifyDeprecated", th6, "", new java.lang.Object[0]);
            }
            int i19 = r4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "getWAGameKillSize killSize =  %d", java.lang.Integer.valueOf(i19));
            java.util.List<ft.b> R6 = eVar.R6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "appbrand process count = %s", java.lang.Integer.valueOf(R6.size()));
            for (ft.b bVar : R6) {
                if (!u46.l.c(bVar.getF146571d(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: processName = " + bVar.getF146571d() + ", process.isProcessAlive = " + bVar.a() + ", process.getAllAppId() = " + bVar.c());
                    if (bVar.a()) {
                        java.lang.String f146571d = bVar.getF146571d();
                        a7Var.getClass();
                        int i27 = -1;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f146571d)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "getPicByProcessName() processName == null");
                        } else {
                            try {
                                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
                                if (runningAppProcesses != null) {
                                    for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                        if (runningAppProcessInfo.processName.equals(f146571d)) {
                                            i18 = runningAppProcessInfo.pid;
                                            break;
                                        }
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "getPicByProcessName() processes == null");
                                }
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "getPidByProcessName() %s %s %s", f146571d, e17.getClass().getSimpleName(), e17.getMessage());
                            }
                        }
                        i18 = -1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "getGraphicsPss: pid = " + i18);
                        android.os.Debug.MemoryInfo[] processMemoryInfo = a7Var.f134839f.getProcessMemoryInfo(new int[]{i18});
                        if (processMemoryInfo != null && processMemoryInfo.length == 1 && (memoryInfo = processMemoryInfo[0]) != null && (str = memoryInfo.getMemoryStats().get("summary.graphics")) != null && !str.isEmpty()) {
                            i27 = java.lang.Integer.parseInt(str);
                        }
                        java.lang.String obj = bVar.c().toString();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: useAs = " + bVar.getF146573f() + ", graphics pss = " + i27 + ", killGraphicsPssSize = " + i19);
                        if (bVar.getF146573f() == ft.d.WAGAME && i27 >= i19) {
                            bVar.b();
                            i17 = i19;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19854, "kill WAGame|", 0, "", 0, 0, obj, java.lang.Integer.valueOf(i27), 1);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: kill success !");
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
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f134842i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$2
        @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
        /* renamed from: onTimerExpired */
        public boolean mo322xdd48fb9f() {
            int i17;
            java.util.List arrayList;
            final boolean z17;
            int i18;
            final int i19;
            com.p314xaae8f345.mm.app.a7 a7Var = com.p314xaae8f345.mm.app.a7.this;
            if (!a7Var.f134855y) {
                a7Var.f134844n = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "timer no working required");
                return false;
            }
            if (!gm0.j1.i().f354741a.f354832d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Startup doesn't finish, killToolsTimer return.");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "killToolsTimer onTimerExpired");
            try {
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_tools_and_mp_release_use_delegate", "1", false, true), 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "get clicfg_tools_and_mp_release_use_delegate error!");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TempAppForegroundNotifyDeprecated", e17, "", new java.lang.Object[0]);
                i17 = 1;
            }
            if (i17 != 1) {
                java.lang.String m07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m07 != null && m07.toLowerCase().startsWith("com.tencent.mm")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "onTimerExpired, top activity belongs to mm, skip kill tools");
                    com.p314xaae8f345.mm.app.a7.this.f134844n = false;
                    return false;
                }
            } else if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "onTimerExpired, AppForeground");
                com.p314xaae8f345.mm.app.a7.this.f134844n = false;
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class);
            java.lang.Object[] objArr = {2, 26};
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            for (int i27 = 0; i27 < 2; i27++) {
                java.lang.Object obj = objArr[i27];
                java.util.Objects.requireNonNull(obj);
                arrayList2.add(obj);
            }
            java.util.List types = java.util.Collections.unmodifiableList(arrayList2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) j0Var;
            i1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
            lk3.b aj6 = i1Var.aj();
            if (aj6 == null) {
                arrayList = new java.util.ArrayList();
            } else if (gm0.j1.a()) {
                p75.n0 n0Var = dm.h8.f318938m;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                p75.m0 k17 = dm.h8.f318940o.k(types);
                linkedList2.add(dm.h8.f318941p.u());
                p75.i0 g17 = dm.h8.f318938m.g(linkedList);
                g17.f434190d = k17;
                g17.f434192f = linkedList2;
                g17.f434193g = linkedList3;
                arrayList = g17.a().k(aj6.f274680g.Q4(), com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.class);
            } else {
                arrayList = kz5.p0.f395529d;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next()).f66789xac3be4e;
                if (j17 <= currentTimeMillis && currentTimeMillis - j17 <= 1800000) {
                    z17 = true;
                    break;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ToolsProfile.ToolsProcessLocker.isLockedUsedByOtherProcess():");
            sb6.append(com.p314xaae8f345.mm.app.d7.f134928a.get() > 0 || com.p314xaae8f345.mm.app.d7.a("com.tencent.mm:tools"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", sb6.toString());
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
                final com.p314xaae8f345.mm.app.a7 a7Var2 = com.p314xaae8f345.mm.app.a7.this;
                a7Var2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "doRecycleMainProcessWebView");
                com.p314xaae8f345.mm.p2829xfa87f9de.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
                synchronized (com.p314xaae8f345.p3210x3857dc.j1.class) {
                    i19 = com.p314xaae8f345.p3210x3857dc.j1.f301850a;
                }
                if (i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "doRecycleMainProcessWebView, no webview, force kill child process");
                    com.p314xaae8f345.p3210x3857dc.a3.d();
                    a7Var2.f134844n = false;
                } else {
                    a7Var2.f134840g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.a7$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            final com.p314xaae8f345.mm.app.a7 a7Var3 = com.p314xaae8f345.mm.app.a7.this;
                            a7Var3.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "doRecycleMainProcessWebView, webView count = %s, post destroy event", java.lang.Integer.valueOf(i19));
                            final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf c5300x3b5972cf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf();
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            am.b4 b4Var = c5300x3b5972cf.f135622g;
                            b4Var.f87750a = currentTimeMillis2;
                            b4Var.f87751b = z17;
                            c5300x3b5972cf.e();
                            a7Var3.f134840g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.a7$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i28;
                                    final com.p314xaae8f345.mm.app.a7 a7Var4 = com.p314xaae8f345.mm.app.a7.this;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf c5300x3b5972cf2 = c5300x3b5972cf;
                                    a7Var4.getClass();
                                    long j18 = c5300x3b5972cf2.f135622g.f87750a;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                    g0Var.A(1009, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508);
                                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59.F;
                                    java.util.ArrayList arrayList3 = copyOnWriteArrayList.isEmpty() ? null : new java.util.ArrayList(copyOnWriteArrayList);
                                    if (arrayList3 == null || arrayList3.isEmpty()) {
                                        g0Var.A(1009, 223);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "no webView created");
                                    } else {
                                        g0Var.A(1009, 224);
                                        java.util.Iterator it6 = arrayList3.iterator();
                                        int i29 = 0;
                                        int i37 = 0;
                                        int i38 = 0;
                                        while (it6.hasNext()) {
                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) ((java.lang.ref.WeakReference) it6.next()).get();
                                            if (c22633x83752a59 != null) {
                                                i38++;
                                                try {
                                                    int m81404x7e4349a6 = c22633x83752a59.m81404x7e4349a6();
                                                    if (m81404x7e4349a6 == 2) {
                                                        i29++;
                                                    } else if (m81404x7e4349a6 == 1) {
                                                        i37++;
                                                    }
                                                    try {
                                                        java.lang.String mo120156xb5887639 = c22633x83752a59.mo120156xb5887639();
                                                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                                        if (mo120156xb5887639 == null) {
                                                            mo120156xb5887639 = "";
                                                        }
                                                        java.net.URLEncoder.encode(mo120156xb5887639, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                                                        if (a7Var4.f134849s <= 2) {
                                                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26165, 999, 1, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(m81404x7e4349a6), mo120156xb5887639);
                                                        }
                                                    } catch (java.io.UnsupportedEncodingException unused) {
                                                    }
                                                } catch (java.io.UnsupportedEncodingException unused2) {
                                                }
                                            }
                                        }
                                        if (i29 > 0) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1009, 225);
                                        }
                                        if (i37 > 0 && (i28 = a7Var4.f134849s) < 5) {
                                            a7Var4.f134849s = i28 + 1;
                                        }
                                        if (i29 > 0 || i37 > 0) {
                                            a7Var4.e();
                                        }
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "not destroyed webview count:%s, visibleWebViewCount:%s", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37));
                                    }
                                    ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: com.tencent.mm.app.a7$$c
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z19 = false;
                                            com.p314xaae8f345.mm.app.a7.this.f134844n = false;
                                            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
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
                                            if (z19 && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40965x320351f8()) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TempAppForegroundNotifyDeprecated", "ERROR: xweb proc still exist in deep bg");
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
            if (!(!ob0.r3.a() ? !((!z17 || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c)) : z17)) {
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1686L, 12L, 1L, false);
                }
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "onTimerExpired, kill tools process");
            com.p314xaae8f345.mm.p2829xfa87f9de.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
            switch (com.p314xaae8f345.mm.app.a7.this.f134849s) {
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
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(1686L, 11L, 1L, false);
            g0Var.mo68477x336bdfd8(1686L, i18, 1L, false);
            com.p314xaae8f345.mm.app.a7 a7Var3 = com.p314xaae8f345.mm.app.a7.this;
            int i28 = a7Var3.f134851u + 1;
            a7Var3.f134851u = i28;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "sameLevelReleaseCnt:%d    lastReleaseTime:%d    level:%d", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(com.p314xaae8f345.mm.app.a7.this.f134850t), java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.a7.this.f134849s));
            com.p314xaae8f345.mm.app.a7 a7Var4 = com.p314xaae8f345.mm.app.a7.this;
            if (currentTimeMillis - a7Var4.f134850t <= a7Var4.b() * 2) {
                com.p314xaae8f345.mm.app.a7 a7Var5 = com.p314xaae8f345.mm.app.a7.this;
                if (a7Var5.f134851u >= 2) {
                    int i29 = a7Var5.f134849s + 1;
                    a7Var5.f134849s = i29;
                    a7Var5.f134851u = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "level up, now:%d", java.lang.Integer.valueOf(i29));
                }
            }
            com.p314xaae8f345.mm.app.a7 a7Var6 = com.p314xaae8f345.mm.app.a7.this;
            a7Var6.f134850t = currentTimeMillis;
            a7Var6.f134844n = false;
            return false;
        }
    }, true);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f134843m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.sdk.p2603x2137b148.a4() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$3
        /* JADX WARN: Removed duplicated region for block: B:50:0x0221 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[SYNTHETIC] */
        @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
        /* renamed from: onTimerExpired */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo322xdd48fb9f() {
            /*
                Method dump skipped, instructions count: 723
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.C5023x3a89ce3b.mo322xdd48fb9f():boolean");
        }
    }, true);

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f134844n = false;

    /* renamed from: o, reason: collision with root package name */
    public final mm.b0 f134845o = new mm.b0() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$4
        @Override // mm.b0
        public java.lang.String a() {
            return "xweb-recycle";
        }

        @Override // mm.b0
        public boolean b() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "shouldAbortForXweb: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.app.a7.this.f134844n));
            return com.p314xaae8f345.mm.app.a7.this.f134844n;
        }
    };

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f134846p = false;

    /* renamed from: q, reason: collision with root package name */
    public final mm.b0 f134847q = new mm.b0() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$5
        @Override // mm.b0
        public java.lang.String a() {
            return "appbrand-recycle";
        }

        @Override // mm.b0
        public boolean b() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "shouldAbortForAppbrand: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.app.a7.this.f134846p));
            return com.p314xaae8f345.mm.app.a7.this.f134846p;
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public long f134848r = 30000;

    /* renamed from: s, reason: collision with root package name */
    public int f134849s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f134850t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f134851u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f134852v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f134853w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f134854x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f134855y = false;

    public final long a() {
        switch (this.f134852v) {
            case 0:
                return this.f134848r;
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
        if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tools_on_background_release_v2, 1) && !o45.wf.f424566k) {
            return 1800000L;
        }
        switch (this.f134849s) {
            case 0:
                return this.f134848r;
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
        m43071x58998cd();
        this.f134848r = j62.e.g().i("clicfg_tools_mp_background_time_s_v2", 15, true, true) * 1000;
        if (ob0.r3.a()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable deep backgroud process reclaim");
        mm.d0 d0Var = mm.d0.f410008a;
        d0Var.b(this.f134845o);
        d0Var.b(this.f134847q);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40963x40b15f2e(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$6
            @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
            public void a() {
                com.p314xaae8f345.mm.app.a7.this.f134844n = true;
                com.p314xaae8f345.mm.app.a7.this.f134846p = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "set shouldAbort = true");
                com.p314xaae8f345.mm.app.a7.this.f134840g.post(new java.lang.Runnable() { // from class: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "On deep background.");
                            com.p314xaae8f345.mm.app.C5026x3a89ce3e c5026x3a89ce3e = com.p314xaae8f345.mm.app.C5026x3a89ce3e.this;
                            boolean e17 = com.p314xaae8f345.mm.app.a7.this.f134842i.e();
                            com.p314xaae8f345.mm.app.a7 a7Var = com.p314xaae8f345.mm.app.a7.this;
                            if (e17 || a7Var.f134849s != 0) {
                                if (!a7Var.f134842i.e()) {
                                    a7Var.f134842i.d();
                                }
                                a7Var.f134851u = 0;
                                a7Var.f134849s = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level");
                                a7Var.e();
                            }
                            if (a7Var.f134843m.e() || a7Var.f134852v != 0) {
                                a7Var.f134854x = 0;
                                a7Var.f134852v = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level for APPBRAND process.");
                                a7Var.d();
                            }
                        }
                    }
                });
            }

            @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
            public void b() {
                com.p314xaae8f345.mm.app.a7.this.f134844n = false;
                com.p314xaae8f345.mm.app.a7.this.f134846p = false;
            }
        });
    }

    public final void d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f134843m;
        if (!b4Var.e()) {
            b4Var.d();
        }
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            try {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_process_background_reclaim, 0) == 1) {
                    z17 = true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TempAppForegroundNotifyDeprecated", th6, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable appbrand process background reclaim: %s", java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            long a17 = a();
            b4Var.c(a17, a17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r0, 1) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r1, 1) > 0) goto L23;
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
            com.tencent.mm.sdk.platformtools.b4 r0 = r9.f134842i
            boolean r0 = r0.e()
            if (r0 != 0) goto Ld
            com.tencent.mm.sdk.platformtools.b4 r0 = r9.f134842i
            r0.d()
        Ld:
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b
            r1.append(r2)
            java.lang.String r2 = ":tools"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R0(r0, r1)
            boolean r1 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "MicroMsg.TempAppForegroundNotifyDeprecated"
            java.lang.String r4 = "before kill tools, tools is running: %b, isWebViewRunInMainProc: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
            r2 = 0
            if (r0 != 0) goto L47
            if (r1 == 0) goto L43
            goto L47
        L43:
            r9.f134844n = r2
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)     // Catch: java.lang.Exception -> L8c
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r1, r8)     // Catch: java.lang.Exception -> L8c
            if (r0 <= 0) goto Lc4
            goto Lb7
        L8c:
            r0 = move-exception
            java.lang.String r1 = "get clicfg_tools_and_mp_hw_honor_29 error!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r7, r1)
            goto Lc4
        L98:
            j62.e r0 = j62.e.g()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r4 = "clicfg_tools_and_mp_bg_proc_release"
            java.lang.String r0 = r0.j(r4, r6, r2, r8)     // Catch: java.lang.Exception -> Lb9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb9
            r4.<init>(r1)     // Catch: java.lang.Exception -> Lb9
            r4.append(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> Lb9
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)     // Catch: java.lang.Exception -> Lb9
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r0, r8)     // Catch: java.lang.Exception -> Lb9
            if (r0 <= 0) goto Lc4
        Lb7:
            r0 = r8
            goto Lc5
        Lb9:
            r0 = move-exception
            java.lang.String r1 = "get clicfg_tools_and_mp_bg_proc_release error!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r7, r1)
        Lc4:
            r0 = r2
        Lc5:
            if (r0 == 0) goto Ld9
            java.lang.String r0 = "startToolsProcKillTimer work"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            com.tencent.mm.sdk.platformtools.b4 r0 = r9.f134842i
            long r1 = r9.b()
            r0.c(r1, r1)
            r9.f134855y = r8
            goto Le3
        Ld9:
            java.lang.String r0 = "startToolsProcKillTimer skip"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            r9.f134855y = r2
            r9.f134844n = r2
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.a7.e():void");
    }

    @Override // com.p314xaae8f345.mm.app.s2
    /* renamed from: getHandler */
    public android.os.Handler mo42988x67189314() {
        return this.f134840g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8889x3be51a90(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.a7.mo8889x3be51a90(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (!this.f134841h.e()) {
            this.f134841h.d();
        }
        if (!this.f134842i.e()) {
            this.f134842i.d();
        }
        if (!this.f134843m.e()) {
            this.f134843m.d();
        }
        if (java.lang.System.currentTimeMillis() - this.f134850t > 3600000) {
            this.f134851u = 0;
            this.f134849s = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level");
        }
        if (java.lang.System.currentTimeMillis() - this.f134853w > 3600000) {
            this.f134854x = 0;
            this.f134852v = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level for APPBRAND process.");
        }
        if (gm0.j1.a() && gm0.j1.b().f354787q && !gm0.m.r()) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.app.RunnableC5027x3a89ce3f(this, str, uptimeMillis), "onAppForegroundThread");
        }
    }
}
