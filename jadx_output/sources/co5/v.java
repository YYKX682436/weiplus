package co5;

/* loaded from: classes14.dex */
public final class v implements com.tencent.mm.plugin.vqm.g {

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f43887j;

    /* renamed from: a, reason: collision with root package name */
    public final long f43888a = com.tencent.mm.plugin.vqm.a.f177293b.d();

    /* renamed from: b, reason: collision with root package name */
    public boolean f43889b;

    /* renamed from: c, reason: collision with root package name */
    public long f43890c;

    /* renamed from: d, reason: collision with root package name */
    public long f43891d;

    /* renamed from: e, reason: collision with root package name */
    public long f43892e;

    /* renamed from: f, reason: collision with root package name */
    public long f43893f;

    /* renamed from: g, reason: collision with root package name */
    public long f43894g;

    /* renamed from: h, reason: collision with root package name */
    public long f43895h;

    /* renamed from: i, reason: collision with root package name */
    public long f43896i;

    static {
        new co5.t(null);
        f43887j = jz5.h.b(co5.s.f43885d);
    }

    public v() {
        co5.u uVar = new co5.u(this);
        com.tencent.mars.xlog.Log.i("vqm", "init account ...");
        i95.n0.c(e70.q.class);
        if (!com.tencent.mm.plugin.vqm.b.f177316b.a()) {
            com.tencent.mars.xlog.Log.i("vqm", "it is not enable!");
            return;
        }
        com.tencent.mm.plugin.voipmp.platform.k.f177277b.launch();
        uVar.alive();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_vqm_am_enable, false)) {
            com.tencent.mars.xlog.Log.i("vqm", "clicfg_vqm_am_enable is enable.");
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                com.tencent.mars.xlog.Log.i("vqm", "query last process exit reasons ... ");
                java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(com.tencent.mm.sdk.platformtools.x2.f193072b, 0, 0);
                kotlin.jvm.internal.o.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
                if (historicalProcessExitReasons.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("vqm", "none reasons!");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : historicalProcessExitReasons) {
                        if (kotlin.jvm.internal.o.b(((android.app.ApplicationExitInfo) obj).getProcessName(), com.tencent.mm.sdk.platformtools.w9.f193053a)) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.List S0 = kz5.n0.S0(arrayList);
                    if (S0.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("vqm", "none wechat reasons!");
                    } else {
                        android.app.ApplicationExitInfo applicationExitInfo = (android.app.ApplicationExitInfo) kz5.n0.X(S0);
                        com.tencent.mars.xlog.Log.i("vqm", "infolist = " + S0 + ", lastProcExitReasons = " + S0);
                        com.tencent.mm.plugin.vqm.r rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootUnknown;
                        switch (applicationExitInfo.getReason()) {
                            case 1:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootExitSelfForAndroid;
                                break;
                            case 2:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootSignaledForAndroid;
                                break;
                            case 3:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootLowMemoryForAndroid;
                                break;
                            case 4:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootCrashForAndroid;
                                break;
                            case 5:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootNativeCrashForAndroid;
                                break;
                            case 6:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootANRForAndroid;
                                break;
                            case 7:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootInitializationFailureForAndroid;
                                break;
                            case 8:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootPermissionChangeForAndroid;
                                break;
                            case 9:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootExcessiveResourceUsageForAndroid;
                                break;
                            case 10:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootUserRequestedForAndroid;
                                break;
                            case 11:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootUserStoppedForAndroid;
                                break;
                            case 12:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootDependencyDiedForAndroid;
                                break;
                            case 13:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootOtherForAndroid;
                                break;
                            case 14:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootFreezerForAndroid;
                                break;
                            case 15:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootPackageStateChangeForAndroid;
                                break;
                            case 16:
                                rVar = com.tencent.mm.plugin.vqm.r.VQMProfileInfoMatrixRebootPackageUpdatedForAndroid;
                                break;
                        }
                        com.tencent.mm.plugin.vqm.a aVar = com.tencent.mm.plugin.vqm.a.f177293b;
                        com.tencent.mm.plugin.vqm.b0 b0Var = com.tencent.mm.plugin.vqm.b0.Matrix;
                        com.tencent.mm.plugin.vqm.p pVar = new com.tencent.mm.plugin.vqm.p();
                        pVar.C = rVar;
                        pVar.W[23] = true;
                        aVar.f(b0Var, pVar.toByteArrayOrNull());
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("vqm", "it is not supporting to query last process exit reasons!");
            }
        }
        com.tencent.mm.plugin.vqm.a aVar2 = com.tencent.mm.plugin.vqm.a.f177293b;
        aVar2.a(new com.tencent.mm.plugin.vqm.f(this));
        aVar2.launch();
    }

    public final void a(com.tencent.mm.plugin.vqm.p pVar) {
        new java.util.ArrayList();
        ob0.s3.b();
        java.lang.Thread.currentThread().getId();
        new java.util.ArrayList();
        new java.util.ArrayList();
        new java.util.ArrayList();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((android.app.ActivityManager) systemService).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        long j17 = java.lang.Runtime.getRuntime().totalMemory();
        long freeMemory = java.lang.Runtime.getRuntime().freeMemory();
        java.lang.Runtime.getRuntime().maxMemory();
        android.os.Debug.getNativeHeapSize();
        long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
        android.os.Debug.getNativeHeapFreeSize();
        this.f43890c++;
        long j18 = j17 - freeMemory;
        this.f43895h += j18;
        this.f43892e = java.lang.Math.max(this.f43892e, j18);
        long j19 = this.f43895h / this.f43890c;
        this.f43896i += nativeHeapAllocatedSize;
        this.f43893f = java.lang.Math.max(this.f43893f, nativeHeapAllocatedSize);
        long j27 = this.f43896i / this.f43890c;
        long j28 = j18 + nativeHeapAllocatedSize;
        this.f43894g += j28;
        long max = java.lang.Math.max(this.f43891d, j28);
        this.f43891d = max;
        long j29 = this.f43894g;
        long j37 = this.f43890c;
        long j38 = j29 / j37;
        if (j37 <= 1) {
            pVar.L = j28;
            boolean[] zArr = pVar.W;
            zArr[32] = true;
            pVar.N = nativeHeapAllocatedSize;
            zArr[34] = true;
            pVar.S = j18;
            zArr[38] = true;
        }
        pVar.f177429i = j28;
        boolean[] zArr2 = pVar.W;
        zArr2[6] = true;
        pVar.M = max;
        zArr2[33] = true;
        pVar.f177428h = j38;
        zArr2[5] = true;
        pVar.V = j18;
        zArr2[41] = true;
        pVar.U = this.f43892e;
        zArr2[40] = true;
        pVar.T = j19;
        zArr2[39] = true;
        pVar.R = nativeHeapAllocatedSize;
        zArr2[37] = true;
        pVar.Q = this.f43893f;
        zArr2[36] = true;
        pVar.P = j27;
        zArr2[35] = true;
        com.tencent.mars.xlog.Log.i("vqm", "dump memory info (appMemUsed=" + j28 + ", platformMemUsed=" + j18 + ", nativeMemUsed=" + nativeHeapAllocatedSize + ')');
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public long b() {
        return this.f43888a;
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void c() {
        com.tencent.mars.xlog.Log.i("vqm", "willEnd ...");
        com.tencent.mm.plugin.vqm.p pVar = new com.tencent.mm.plugin.vqm.p();
        a(pVar);
        com.tencent.mm.plugin.vqm.a.f177293b.f(com.tencent.mm.plugin.vqm.b0.Matrix, pVar.toByteArrayOrNull());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x010f, code lost:
    
        if (ip.b.g(mx3.i0.h("")) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x011a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0116, code lost:
    
        if (ip.b.d() != false) goto L25;
     */
    @Override // com.tencent.mm.plugin.vqm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.v.d():void");
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void e() {
        com.tencent.mars.xlog.Log.i("vqm", "didPoll ...");
        qh.b a17 = qh.b.a();
        com.tencent.mm.plugin.vqm.i iVar = com.tencent.mm.plugin.vqm.i.VQMProfileInfoAppStateActive;
        if (this.f43889b) {
            iVar = com.tencent.mm.plugin.vqm.i.VQMProfileInfoAppStateBackground;
        }
        com.tencent.mm.plugin.vqm.q qVar = com.tencent.mm.plugin.vqm.q.VQMProfileInfoMatrixBatteryStateUnplugged;
        if (a17.g()) {
            qVar = com.tencent.mm.plugin.vqm.q.VQMProfileInfoMatrixBatteryStateCharging;
        }
        int i17 = a17.d() == 4 ? 1 : 0;
        com.tencent.mm.plugin.vqm.p pVar = new com.tencent.mm.plugin.vqm.p();
        a(pVar);
        com.tencent.mm.plugin.vqm.a aVar = com.tencent.mm.plugin.vqm.a.f177293b;
        com.tencent.mm.plugin.vqm.b0 b0Var = com.tencent.mm.plugin.vqm.b0.Matrix;
        aVar.f(b0Var, pVar.toByteArrayOrNull());
        android.content.Intent registerReceiver = com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int h17 = h(registerReceiver);
            int intExtra = (registerReceiver.getIntExtra(ya.b.LEVEL, -1) * 100) / registerReceiver.getIntExtra("scale", -1);
            com.tencent.mars.xlog.Log.i("vqm", "get temperature info when poll ... (temp=" + h17 + ";battery_percent=" + intExtra + ')');
            com.tencent.mm.plugin.vqm.p pVar2 = new com.tencent.mm.plugin.vqm.p();
            pVar2.A = (long) h17;
            boolean[] zArr = pVar2.W;
            zArr[21] = true;
            pVar2.F = qVar;
            zArr[26] = true;
            pVar2.f177431n = intExtra;
            zArr[8] = true;
            pVar2.H = i17;
            zArr[28] = true;
            aVar.f(b0Var, pVar2.toByteArrayOrNull());
            com.tencent.mm.plugin.vqm.b0 b0Var2 = com.tencent.mm.plugin.vqm.b0.App;
            com.tencent.mm.plugin.vqm.h hVar = new com.tencent.mm.plugin.vqm.h();
            hVar.f177336e = iVar;
            hVar.f177341m[2] = true;
            aVar.f(b0Var2, hVar.toByteArrayOrNull());
        }
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void f(com.tencent.mm.plugin.vqm.b0 b0Var, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.tencent.mm.plugin.vqm.g
    public void g(com.tencent.mm.plugin.vqm.l lVar, com.tencent.mm.plugin.vqm.h hVar, com.tencent.mm.plugin.vqm.p pVar, com.tencent.mm.plugin.vqm.j jVar, com.tencent.mm.plugin.vqm.z zVar, com.tencent.mm.plugin.vqm.t tVar, com.tencent.mm.plugin.vqm.a0 a0Var, com.tencent.mm.plugin.vqm.y yVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.VQMHelper"
            java.lang.String r1 = "Vivo shell temperature retrieved successfully: "
            java.lang.String r2 = "Vivo Libra SDK only supported on vivo devices, current manufacturer: "
            java.lang.String r3 = "Vivo Libra SDK requires Android 15+, current API level: "
            r4 = -1
            r5 = 0
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L81
            r7 = 34
            if (r6 >= r7) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r1.<init>(r3)     // Catch: java.lang.Exception -> L81
            r1.append(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L81
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L20:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "MANUFACTURER"
            kotlin.jvm.internal.o.f(r3, r6)     // Catch: java.lang.Exception -> L81
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L81
            java.lang.String r3 = r3.toLowerCase(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r3, r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "vivo"
            boolean r6 = r26.n0.B(r3, r6, r5)     // Catch: java.lang.Exception -> L81
            if (r6 != 0) goto L42
            java.lang.String r1 = r2.concat(r3)     // Catch: java.lang.Exception -> L81
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L42:
            com.vivo.libra.VivoLibraManager r2 = com.vivo.libra.VivoLibraManager.getInstance()     // Catch: java.lang.Exception -> L81
            if (r2 != 0) goto L4e
            java.lang.String r1 = "VivoLibraManager.getInstance() returned null"
            com.tencent.mars.xlog.Log.w(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L4e:
            java.lang.String r3 = "d11ac5b1f3ef5772157aec8bc93c0f16d26679126d976cf38abd0c0f196f88ba"
            boolean r3 = r2.checkPermission(r3)     // Catch: java.lang.Exception -> L81
            if (r3 != 0) goto L5c
            java.lang.String r1 = "Vivo Libra SDK authentication failed - authCode: d11ac5b1..."
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L5c:
            int r2 = r2.getShellTemp()     // Catch: java.lang.Exception -> L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r3.<init>(r1)     // Catch: java.lang.Exception -> L81
            r3.append(r2)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = " ("
            r3.append(r1)     // Catch: java.lang.Exception -> L81
            double r6 = (double) r2     // Catch: java.lang.Exception -> L81
            r8 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r6 = r6 / r8
            r3.append(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = "°C)"
            r3.append(r1)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L81
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L8a
        L81:
            r1 = move-exception
            java.lang.String r2 = "getVivoShellTemperature error"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r2, r3)
        L89:
            r2 = r4
        L8a:
            if (r2 == r4) goto L8f
            int r2 = r2 / 10
            goto L97
        L8f:
            java.lang.String r0 = "temperature"
            int r11 = r11.getIntExtra(r0, r5)
            int r2 = r11 / 10
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co5.v.h(android.content.Intent):int");
    }
}
