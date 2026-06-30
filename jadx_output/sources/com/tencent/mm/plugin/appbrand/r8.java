package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class r8 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f87759b;

    public r8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.b7 b7Var) {
        this.f87759b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "MainPrepareProcess";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        java.util.List list;
        if (this.f87759b.L0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "main prepare process ignore, return");
            return;
        }
        m91.f.c(this.f87759b);
        com.tencent.mm.plugin.appbrand.o6 rt6 = this.f87759b;
        m91.j jVar = m91.j.f324955a;
        kotlin.jvm.internal.o.g(rt6, "rt");
        m91.j jVar2 = m91.j.f324955a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(365, 28);
        com.tencent.mars.xlog.Log.getLogLevel();
        this.f87759b.q3();
        com.tencent.mm.plugin.appbrand.o6.E2(this.f87759b);
        this.f87759b.d3();
        if (this.f87759b.q2()) {
            com.tencent.mm.plugin.appbrand.game.preload.i P2 = this.f87759b.P2();
            if (P2 != null && (list = this.f87759b.u0().f77311x2) != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (!arrayList.isEmpty()) {
                    P2.f78217g.addAll(list);
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        uh1.x0 x0Var = P2.f78212b;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f427798b;
                        uh1.h.f427795a.getClass();
                        sb6.append(uh1.i.f427798b.incrementAndGet());
                        sb6.append("");
                        java.lang.String sb7 = sb6.toString();
                        x0Var.getClass();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "doDownloadFileNoCheck taskId:%s url:%s", sb7, str);
                        try {
                            jSONObject.put("url", str);
                        } catch (org.json.JSONException unused) {
                        }
                        x0Var.b(jSONObject, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, new java.util.HashMap(), null, 50, new uh1.u0(x0Var, str), sb7, "test");
                    }
                }
            }
            if (k91.d1.a(this.f87759b.f74803n) || com.tencent.mm.sdk.platformtools.s9.f192974b || this.f87759b.s2()) {
                com.tencent.mm.plugin.appbrand.performance.m.d();
            }
        } else if (k91.d1.a(this.f87759b.f74803n)) {
            com.tencent.mm.plugin.appbrand.performance.m.d();
        }
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f87759b.f74803n, true);
        if (b17 != null) {
            com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.g(this.f87759b.f74803n, b17.f88134d);
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f87759b;
            com.tencent.mm.plugin.appbrand.report.quality.u.e(o6Var, false, com.tencent.mm.plugin.appbrand.utils.t.b(o6Var.u0().f77295h2));
        }
        fe.g a17 = fe.g.a(this.f87759b.f74803n);
        java.lang.String str2 = this.f87759b.f74803n;
        boolean q27 = this.f87759b.q2();
        a17.f261356d = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: appId:%s,isGame:%s", str2, java.lang.Boolean.valueOf(q27));
        if (q27) {
            com.tencent.mm.plugin.appbrand.x0.a(str2, a17.f261363k);
        }
        new java.util.ArrayList();
        qp3.a.a("onCreate", this.f87759b.f74803n, this.f87759b.u0().V);
        com.tencent.mm.plugin.appbrand.o6 rt7 = this.f87759b;
        kotlin.jvm.internal.o.g(rt7, "rt");
        new com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1(rt7, com.tencent.mm.app.a0.f53288d).alive();
        com.tencent.mm.plugin.appbrand.launching.d2.a(this.f87759b, new com.tencent.mm.plugin.appbrand.p8(this));
        this.f87759b.f3();
        java.util.Map map = com.tencent.mm.plugin.appbrand.media.record.h.f85809a;
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.E(this.f87759b.f74803n);
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f87759b;
        java.lang.String str3 = o6Var2.f74803n;
        com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a aVar = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a();
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(str3, aVar);
        o6Var2.N.a(new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.b(aVar));
        com.tencent.mm.plugin.appbrand.backgroundfetch.r0.x(this.f87759b);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.g(this.f87759b);
        com.tencent.mm.plugin.appbrand.o6 o6Var3 = this.f87759b;
        com.tencent.mm.plugin.appbrand.ipc.l0 l0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a;
        if (o6Var3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor");
            java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76995d;
            if (hashSet.add(o6Var3.f74803n)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startListeningOperationReceivedIfNeed");
                if (com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76993b == null) {
                    com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76993b = new com.tencent.mm.plugin.appbrand.backgroundrunning.p();
                    if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
                        com.tencent.mm.plugin.appbrand.backgroundrunning.t0 t0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76993b;
                        com.tencent.mm.plugin.appbrand.backgroundrunning.k kVar = (com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var;
                        if (t0Var == null) {
                            kVar.getClass();
                        } else {
                            synchronized (kVar.f76977e) {
                                kVar.f76977e.add(t0Var);
                            }
                        }
                    }
                }
                java.lang.String str4 = o6Var3.f74803n;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startListeningOperationEvent, appId:%s", str4);
                if (com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a == null) {
                    com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a = new com.tencent.mm.plugin.appbrand.backgroundrunning.q();
                }
                com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(str4, com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a);
                if (1 == hashSet.size()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor, first start, alive listener");
                    com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76994c.alive();
                }
                o6Var3.N.a(new com.tencent.mm.plugin.appbrand.backgroundrunning.o());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor, already start, return");
            }
        }
        this.f87759b.f86178l2 = new com.tencent.mm.plugin.appbrand.report.model.l0();
        com.tencent.mm.plugin.appbrand.report.model.l0 l0Var2 = this.f87759b.f86178l2;
        l0Var2.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        l0Var2.f88047a = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.o6 o6Var4 = this.f87759b;
        com.tencent.mm.plugin.appbrand.report.model.t0 t0Var2 = new com.tencent.mm.plugin.appbrand.report.model.t0();
        o6Var4.M2 = t0Var2;
        if (b17 != null) {
            java.lang.String instanceId = b17.f88134d;
            java.lang.String appId = o6Var4.f74803n;
            long j17 = this.f87759b.u0().f47284z + 1000;
            kotlin.jvm.internal.o.g(instanceId, "instanceId");
            kotlin.jvm.internal.o.g(appId, "appId");
            t0Var2.f88112d = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            t0Var2.f88111c = instanceId;
            t0Var2.f88110b = appId;
            t0Var2.f88109a = java.lang.Long.valueOf(j17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k0.a(this.f87759b.f74803n, this.f87759b.t0(), this.f87759b.l2());
        com.tencent.mm.plugin.appbrand.o6 o6Var5 = this.f87759b;
        o6Var5.f86185q2 = o6Var5.l2().f87790f == 1099;
        if (this.f87759b.e3()) {
            com.tencent.mm.plugin.appbrand.o6 o6Var6 = this.f87759b;
            ((java.util.LinkedList) o6Var6.f86186r2).add(new com.tencent.mm.plugin.appbrand.cc(o6Var6.u0()));
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var7 = this.f87759b;
        ((java.util.LinkedList) o6Var7.f86186r2).add(new com.tencent.mm.plugin.appbrand.cd(o6Var7.u0(), this.f87759b));
        this.f87759b.N.a(new com.tencent.mm.plugin.appbrand.q8(this));
        com.tencent.mm.plugin.appbrand.o6 o6Var8 = this.f87759b;
        if (o6Var8.f74796e != null) {
            o6Var8.b3();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "onCreate appId:%s, skip initFloatBallHelper(), maybe under preRender mode", o6Var8.f74803n);
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var9 = this.f87759b;
        if (o6Var9.f74796e != null) {
            o6Var9.c3();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeWC", "onCreate appId:%s, skip initMultiTaskHelper(), maybe under preRender mode", o6Var9.f74803n);
        }
        if (b17 != null) {
            b17.f88140m = java.lang.System.currentTimeMillis();
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f87759b.f74805p.f77281g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "invoke appId:%s", this.f87759b.f74803n);
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (!this.f87759b.e3()) {
            com.tencent.mm.plugin.appbrand.task.c.a(this.f87759b.f74803n);
        }
        com.tencent.mm.sdk.platformtools.o4.M("" + this.f87759b.f74803n + "_wxa_voip").putBoolean("isCameraStart", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "reset appId:%s isCameraStart false", this.f87759b.f74803n);
        com.tencent.mm.plugin.appbrand.o6 o6Var10 = this.f87759b;
        o6Var10.R2 = new com.tencent.mm.plugin.appbrand.report.quality.h1(o6Var10);
        com.tencent.mm.plugin.appbrand.o6 o6Var11 = this.f87759b;
        o6Var11.I1(new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.e(o6Var11));
        com.tencent.mm.plugin.appbrand.o6 o6Var12 = this.f87759b;
        o6Var12.X2 = o6Var12.u0().V1;
        d();
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public boolean e() {
        return false;
    }
}
