package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f225458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f225462i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225463m;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar, boolean z17, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, long j17) {
        this.f225463m = g1Var;
        this.f225457d = k2Var;
        this.f225458e = hVar;
        this.f225459f = z17;
        this.f225460g = str;
        this.f225461h = abstractC3700xe41a2874;
        this.f225462i = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225457d.f225531c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar2 = this.f225458e;
        if (hVar != hVar2 || hVar2 == null) {
            return;
        }
        if (!this.f225459f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkDownloadTimeout, appId:%s syncCheckUpdate:false", this.f225460g);
            this.f225458e.mo25333x2fd71e(this.f225460g, 10);
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225461h;
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.ASYNC_UPDATE_PACKAGE_TIMEOUT);
                return;
            }
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = this.f225463m.y(this.f225460g, null);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f225460g;
        objArr[1] = java.lang.Integer.valueOf(y17 == null ? 0 : 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkDownloadTimeout, appId:%s info:%d", objArr);
        if (y17 != null) {
            this.f225458e.mo25334x90b54003(y17, 10);
        } else {
            if (!this.f225463m.I(this.f225460g) || !j62.e.g().l("clicfg_enable_pay_lite_app_backup_download_android", false, true, true)) {
                this.f225458e.mo25333x2fd71e(this.f225460g, 10);
                return;
            }
            java.lang.String m40070xdc68a9b2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            oq1.q qVar = (oq1.q) ((java.util.concurrent.ConcurrentHashMap) this.f225463m.f225491l).get(this.f225460g);
            ((java.util.concurrent.ConcurrentHashMap) this.f225463m.f225491l).remove(this.f225460g);
            com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28742 = this.f225461h;
            if (abstractC3700xe41a28742 != null) {
                abstractC3700xe41a28742.mo28864xbcd14bec(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.LITE_APP_PACKAGE_DOWNLOAD_TIMEOUT_NET_INFO, m40070xdc68a9b2, qVar != null ? 1L : 2L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225463m;
            final com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28743 = this.f225461h;
            g1Var.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.logic.g1$$b
                /* JADX WARN: Not initialized variable reg: 5, insn: 0x0087: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:21:0x0087 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r13 = this;
                        com.tencent.liteapp.gen.LiteAppReporter r0 = com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874.this
                        java.lang.String r1 = "MicroMsg.LiteApp.LiteAppLogic"
                        r2 = 0
                        long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.lang.String r6 = "https://qq.com"
                        r5.<init>(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
                        r5.connect()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        long r8 = r6 - r3
                        java.lang.String r2 = "reportNetworkLatency, response code: %s, start: %d, end: %d latency: %d"
                        r10 = 4
                        java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        int r11 = r5.getResponseCode()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r12 = 0
                        r10[r12] = r11     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r4 = 1
                        r10[r4] = r3     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r4 = 2
                        r10[r4] = r3     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r4 = 3
                        r10[r4] = r3     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r10)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        if (r0 == 0) goto L63
                        com.tencent.liteapp.gen.DownloadAction r2 = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.LITE_APP_PACKAGE_NETWORK_LATENCY     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r3.<init>()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        int r4 = r5.getResponseCode()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r3.append(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.String r4 = ""
                        r3.append(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        r0.mo28864xbcd14bec(r2, r3, r8)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                    L63:
                        r5.disconnect()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L86
                        goto L82
                    L67:
                        r2 = move-exception
                        goto L6e
                    L69:
                        r0 = move-exception
                        goto L88
                    L6b:
                        r3 = move-exception
                        r5 = r2
                        r2 = r3
                    L6e:
                        java.lang.String r3 = "reportNetworkLatency, exception: %s"
                        java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L86
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r3, r2)     // Catch: java.lang.Throwable -> L86
                        if (r0 == 0) goto L80
                        com.tencent.liteapp.gen.DownloadAction r1 = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.LITE_APP_PACKAGE_NETWORK_LATENCY     // Catch: java.lang.Throwable -> L86
                        java.lang.String r2 = "fail"
                        r0.mo28863xbcd14bec(r1, r2)     // Catch: java.lang.Throwable -> L86
                    L80:
                        if (r5 == 0) goto L85
                    L82:
                        r5.disconnect()
                    L85:
                        return
                    L86:
                        r0 = move-exception
                        r2 = r5
                    L88:
                        if (r2 == 0) goto L8d
                        r2.disconnect()
                    L8d:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.RunnableC16223x5c246f8.run():void");
                }
            });
            if (qVar != null && qVar.f428900v) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE;
                java.lang.String str = qVar.f428882d;
                c1Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "removeDownloadTask, cdnUrl: %s", str);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) c1Var.f225448f;
                if (concurrentHashMap.containsKey(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "removeDownloadTask, taskId: %d", concurrentHashMap.get(str));
                    java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(l17.longValue());
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) c1Var.f225446d;
                    oq1.q qVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1) concurrentHashMap2.get(l17)).f225437b;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) c1Var.f225447e;
                    if (concurrentHashMap3.containsKey(qVar2.f428882d)) {
                        concurrentHashMap3.remove(qVar2.f428882d);
                    }
                    if (concurrentHashMap2.containsKey(l17)) {
                        concurrentHashMap2.remove(l17);
                    }
                    concurrentHashMap.remove(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "removeDownloadTask, success");
                }
                this.f225457d.f225529a = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225457d;
                long j17 = k2Var.f225529a;
                k2Var.f225530b = j17;
                k2Var.f225533e = j17;
                k2Var.f225534f = j17;
                oq1.o oVar = qVar.f428897s;
                qVar.f428882d = oVar.f428876c;
                qVar.f428883e = oVar.f428875b;
                qVar.f428886h = oVar.f428877d;
                qVar.f428896r = oVar.f428874a;
                qVar.f428895q = oVar.f428878e;
                qVar.f428899u = true;
                c1Var.b(qVar, "release", k2Var, this.f225461h, this.f225463m.f225482c);
                this.f225463m.i(this.f225460g, true, this.f225457d, this.f225462i, this.f225461h, this.f225458e);
                return;
            }
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28744 = this.f225461h;
        if (abstractC3700xe41a28744 != null) {
            abstractC3700xe41a28744.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.SYNC_UPDATE_PACKAGE_TIMEOUT);
        }
    }
}
