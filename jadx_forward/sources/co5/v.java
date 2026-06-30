package co5;

/* loaded from: classes14.dex */
public final class v implements com.p314xaae8f345.mm.p1006xc5476f33.vqm.g {

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f125420j;

    /* renamed from: a, reason: collision with root package name */
    public final long f125421a = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b.d();

    /* renamed from: b, reason: collision with root package name */
    public boolean f125422b;

    /* renamed from: c, reason: collision with root package name */
    public long f125423c;

    /* renamed from: d, reason: collision with root package name */
    public long f125424d;

    /* renamed from: e, reason: collision with root package name */
    public long f125425e;

    /* renamed from: f, reason: collision with root package name */
    public long f125426f;

    /* renamed from: g, reason: collision with root package name */
    public long f125427g;

    /* renamed from: h, reason: collision with root package name */
    public long f125428h;

    /* renamed from: i, reason: collision with root package name */
    public long f125429i;

    static {
        new co5.t(null);
        f125420j = jz5.h.b(co5.s.f125418d);
    }

    public v() {
        co5.u uVar = new co5.u(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "init account ...");
        i95.n0.c(e70.q.class);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.vqm.b.f258849b.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "it is not enable!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.k.f258810b.m73694xbdd923b3();
        uVar.m43071x58998cd();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_vqm_am_enable, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "clicfg_vqm_am_enable is enable.");
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "query last process exit reasons ... ");
                java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, 0, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
                if (historicalProcessExitReasons.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "none reasons!");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : historicalProcessExitReasons) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.app.ApplicationExitInfo) obj).getProcessName(), com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a)) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.List S0 = kz5.n0.S0(arrayList);
                    if (S0.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "none wechat reasons!");
                    } else {
                        android.app.ApplicationExitInfo applicationExitInfo = (android.app.ApplicationExitInfo) kz5.n0.X(S0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "infolist = " + S0 + ", lastProcExitReasons = " + S0);
                        com.p314xaae8f345.mm.p1006xc5476f33.vqm.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootUnknown;
                        switch (applicationExitInfo.getReason()) {
                            case 1:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootExitSelfForAndroid;
                                break;
                            case 2:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootSignaledForAndroid;
                                break;
                            case 3:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootLowMemoryForAndroid;
                                break;
                            case 4:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootCrashForAndroid;
                                break;
                            case 5:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootNativeCrashForAndroid;
                                break;
                            case 6:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootANRForAndroid;
                                break;
                            case 7:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootInitializationFailureForAndroid;
                                break;
                            case 8:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootPermissionChangeForAndroid;
                                break;
                            case 9:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootExcessiveResourceUsageForAndroid;
                                break;
                            case 10:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootUserRequestedForAndroid;
                                break;
                            case 11:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootUserStoppedForAndroid;
                                break;
                            case 12:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootDependencyDiedForAndroid;
                                break;
                            case 13:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootOtherForAndroid;
                                break;
                            case 14:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootFreezerForAndroid;
                                break;
                            case 15:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootPackageStateChangeForAndroid;
                                break;
                            case 16:
                                rVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.r.VQMProfileInfoMatrixRebootPackageUpdatedForAndroid;
                                break;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
                        com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0.Matrix;
                        com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.p();
                        pVar.C = rVar;
                        pVar.W[23] = true;
                        aVar.f(b0Var, pVar.m75963xebb06ba0());
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "it is not supporting to query last process exit reasons!");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
        aVar2.a(new com.p314xaae8f345.mm.p1006xc5476f33.vqm.f(this));
        aVar2.m73737xbdd923b3();
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar) {
        new java.util.ArrayList();
        ob0.s3.b();
        java.lang.Thread.currentThread().getId();
        new java.util.ArrayList();
        new java.util.ArrayList();
        new java.util.ArrayList();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((android.app.ActivityManager) systemService).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        long j17 = java.lang.Runtime.getRuntime().totalMemory();
        long freeMemory = java.lang.Runtime.getRuntime().freeMemory();
        java.lang.Runtime.getRuntime().maxMemory();
        android.os.Debug.getNativeHeapSize();
        long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
        android.os.Debug.getNativeHeapFreeSize();
        this.f125423c++;
        long j18 = j17 - freeMemory;
        this.f125428h += j18;
        this.f125425e = java.lang.Math.max(this.f125425e, j18);
        long j19 = this.f125428h / this.f125423c;
        this.f125429i += nativeHeapAllocatedSize;
        this.f125426f = java.lang.Math.max(this.f125426f, nativeHeapAllocatedSize);
        long j27 = this.f125429i / this.f125423c;
        long j28 = j18 + nativeHeapAllocatedSize;
        this.f125427g += j28;
        long max = java.lang.Math.max(this.f125424d, j28);
        this.f125424d = max;
        long j29 = this.f125427g;
        long j37 = this.f125423c;
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
        pVar.f258962i = j28;
        boolean[] zArr2 = pVar.W;
        zArr2[6] = true;
        pVar.M = max;
        zArr2[33] = true;
        pVar.f258961h = j38;
        zArr2[5] = true;
        pVar.V = j18;
        zArr2[41] = true;
        pVar.U = this.f125425e;
        zArr2[40] = true;
        pVar.T = j19;
        zArr2[39] = true;
        pVar.R = nativeHeapAllocatedSize;
        zArr2[37] = true;
        pVar.Q = this.f125426f;
        zArr2[36] = true;
        pVar.P = j27;
        zArr2[35] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "dump memory info (appMemUsed=" + j28 + ", platformMemUsed=" + j18 + ", nativeMemUsed=" + nativeHeapAllocatedSize + ')');
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public long b() {
        return this.f125421a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "willEnd ...");
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.p();
        a(pVar);
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b.f(com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0.Matrix, pVar.m75963xebb06ba0());
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
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "didPoll ...");
        qh.b a17 = qh.b.a();
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.i.VQMProfileInfoAppStateActive;
        if (this.f125422b) {
            iVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.i.VQMProfileInfoAppStateBackground;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.q.VQMProfileInfoMatrixBatteryStateUnplugged;
        if (a17.g()) {
            qVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.q.VQMProfileInfoMatrixBatteryStateCharging;
        }
        int i17 = a17.d() == 4 ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.p();
        a(pVar);
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0.Matrix;
        aVar.f(b0Var, pVar.m75963xebb06ba0());
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int h17 = h(registerReceiver);
            int intExtra = (registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1) * 100) / registerReceiver.getIntExtra("scale", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "get temperature info when poll ... (temp=" + h17 + ";battery_percent=" + intExtra + ')');
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.p();
            pVar2.A = (long) h17;
            boolean[] zArr = pVar2.W;
            zArr[21] = true;
            pVar2.F = qVar;
            zArr[26] = true;
            pVar2.f258964n = intExtra;
            zArr[8] = true;
            pVar2.H = i17;
            zArr[28] = true;
            aVar.f(b0Var, pVar2.m75963xebb06ba0());
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0 b0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0.App;
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.h();
            hVar.f258869e = iVar;
            hVar.f258874m[2] = true;
            aVar.f(b0Var2, hVar.m75963xebb06ba0());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.vqm.b0 b0Var, byte[] bArr, byte[] bArr2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.vqm.g
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.vqm.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.vqm.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.vqm.y yVar) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L20:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "MANUFACTURER"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r6)     // Catch: java.lang.Exception -> L81
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L81
            java.lang.String r3 = r3.toLowerCase(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "vivo"
            boolean r6 = r26.n0.B(r3, r6, r5)     // Catch: java.lang.Exception -> L81
            if (r6 != 0) goto L42
            java.lang.String r1 = r2.concat(r3)     // Catch: java.lang.Exception -> L81
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L42:
            com.vivo.libra.VivoLibraManager r2 = com.p3270x373cac.p3271x6232374.C28082xff7eac85.m122357x9cf0d20b()     // Catch: java.lang.Exception -> L81
            if (r2 != 0) goto L4e
            java.lang.String r1 = "VivoLibraManager.getInstance() returned null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L4e:
            java.lang.String r3 = "d11ac5b1f3ef5772157aec8bc93c0f16d26679126d976cf38abd0c0f196f88ba"
            boolean r3 = r2.m122358x28e6dcf7(r3)     // Catch: java.lang.Exception -> L81
            if (r3 != 0) goto L5c
            java.lang.String r1 = "Vivo Libra SDK authentication failed - authCode: d11ac5b1..."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L89
        L5c:
            int r2 = r2.m122360x6adfef6e()     // Catch: java.lang.Exception -> L81
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L81
            goto L8a
        L81:
            r1 = move-exception
            java.lang.String r2 = "getVivoShellTemperature error"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r2, r3)
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
