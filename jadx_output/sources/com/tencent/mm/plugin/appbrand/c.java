package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.plugin.appbrand.aa {

    /* renamed from: c, reason: collision with root package name */
    public cl.q0 f77017c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77018d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.e9 f77020f;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ag f77023i;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f77015a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f77016b = {0};

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f77019e = new jz5.l(-1L, -1L);

    /* renamed from: g, reason: collision with root package name */
    public long f77021g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f77022h = -1;

    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        com.tencent.mm.plugin.appbrand.x9 c17;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        cl.q0 q0Var = this.f77017c;
        if (q0Var != null) {
            q0Var.c();
        }
        this.f77017c = null;
        ((java.util.ArrayList) this.f77015a).clear();
        this.f77019e = new jz5.l(-1L, -1L);
        this.f77018d = null;
        com.tencent.mm.plugin.appbrand.e9 C0 = runtime.C0();
        if (C0 == null || (c17 = C0.c1()) == null) {
            return;
        }
        synchronized (c17.f92387g) {
            c17.f92387g.remove(this);
        }
    }

    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wokrerCreateInterruptor == null:  ");
        sb6.append(this.f77023i == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdWorkerHolder", sb6.toString());
        com.tencent.mm.plugin.appbrand.ag agVar = this.f77023i;
        if (agVar == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.z7 z7Var = (com.tencent.mm.plugin.appbrand.z7) agVar;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(z7Var.f92449a.f74895a);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]mAdWorkerHolder.WorkerCreateInterruptor.isInterrupt, qualitySession not open for appId:%s, return", z7Var.f92449a.f74895a.f74803n);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]mAdWorkerHolder.WorkerCreateInterruptor.isInterrupt, appId:%s serviceInitType:%s", z7Var.f92449a.f74895a.f74803n, a17.D);
            if (a17.D != com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]  not in preloading");
                com.tencent.mm.plugin.appbrand.o6 o6Var = z7Var.f92449a.f74895a;
                java.util.Map map = i81.j.f289592a;
                if (!(o6Var == null ? false : i81.j.a(o6Var.u0()))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]  not adcontact");
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(com.tencent.mm.plugin.appbrand.pc pcVar) {
        synchronized (this.f77016b) {
            cl.q0 q0Var = this.f77017c;
            if (q0Var == null && this.f77018d == null) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.b bVar = null;
            if (q0Var == null) {
                java.lang.String str = this.f77018d;
                if (!(str == null || str.length() == 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[obtainWorkerAsync]  workerEngine had created, but fail for[" + this.f77018d + "], trigger listener");
                    pcVar.a(null, new jz5.l(-1L, -1L), this.f77018d);
                    return true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[obtainWorkerAsync]  workerEngine had created,trigger listener");
            synchronized (this.f77016b) {
                cl.q0 q0Var2 = this.f77017c;
                if (q0Var2 != null) {
                    bVar = new com.tencent.mm.plugin.appbrand.b(q0Var2);
                }
            }
            pcVar.a(bVar, this.f77019e, "");
            return true;
        }
    }

    public final boolean d(com.tencent.mm.plugin.appbrand.pc listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        if (c(listener)) {
            return true;
        }
        synchronized (this.f77015a) {
            ((java.util.ArrayList) this.f77015a).add(listener);
        }
        return false;
    }

    public void e(em1.c adWorkerInfo) {
        kotlin.jvm.internal.o.g(adWorkerInfo, "adWorkerInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdWorkerHolder", "AdWorker created. store to holder, " + adWorkerInfo);
        java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("paramsCache").u("paramsCache", null);
        com.tencent.mm.plugin.appbrand.e9 e9Var = adWorkerInfo.f255022g;
        kotlin.jvm.internal.o.d(e9Var);
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = e9Var.x();
        kotlin.jvm.internal.o.d(x17);
        java.lang.String valueOf = java.lang.String.valueOf(x17.i());
        if (u17 == null || !r26.i0.y(u17, valueOf, false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(valueOf);
            sb6.append("#@#");
            sb6.append(adWorkerInfo.f255023h);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[createWXLibWorker]  params=" + adWorkerInfo + ".params");
            com.tencent.mm.sdk.platformtools.o4.M("paramsCache").clear();
            com.tencent.mm.sdk.platformtools.o4.M("paramsCache").D("paramsCache", sb6.toString());
        }
        f(adWorkerInfo);
    }

    public final void f(em1.c adWorkerInfo) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(adWorkerInfo, "adWorkerInfo");
        synchronized (this.f77016b) {
            if (this.f77017c != null) {
                return;
            }
            this.f77017c = adWorkerInfo.f255017b;
            this.f77019e = adWorkerInfo.f255018c;
            this.f77018d = adWorkerInfo.f255019d;
            this.f77022h = adWorkerInfo.f255020e;
            this.f77021g = adWorkerInfo.f255021f;
            this.f77020f = adWorkerInfo.f255022g;
            synchronized (this.f77015a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[storeWorker]  CreatedListeners size=" + ((java.util.ArrayList) this.f77015a).size());
                linkedList = new java.util.LinkedList(this.f77015a);
                ((java.util.ArrayList) this.f77015a).clear();
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.pc pcVar = (com.tencent.mm.plugin.appbrand.pc) it.next();
                kotlin.jvm.internal.o.d(pcVar);
                c(pcVar);
            }
        }
    }
}
