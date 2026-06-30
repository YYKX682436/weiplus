package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.aa {

    /* renamed from: c, reason: collision with root package name */
    public cl.q0 f158550c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158551d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f158553f;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ag f158556i;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f158548a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f158549b = {0};

    /* renamed from: e, reason: collision with root package name */
    public jz5.l f158552e = new jz5.l(-1L, -1L);

    /* renamed from: g, reason: collision with root package name */
    public long f158554g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f158555h = -1;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        cl.q0 q0Var = this.f158550c;
        if (q0Var != null) {
            q0Var.c();
        }
        this.f158550c = null;
        ((java.util.ArrayList) this.f158548a).clear();
        this.f158552e = new jz5.l(-1L, -1L);
        this.f158551d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = runtime.C0();
        if (C0 == null || (c17 = C0.c1()) == null) {
            return;
        }
        synchronized (c17.f173920g) {
            c17.f173920g.remove(this);
        }
    }

    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wokrerCreateInterruptor == null:  ");
        sb6.append(this.f158556i == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdWorkerHolder", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ag agVar = this.f158556i;
        if (agVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z7 z7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z7) agVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(z7Var.f173982a.f156428a);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]mAdWorkerHolder.WorkerCreateInterruptor.isInterrupt, qualitySession not open for appId:%s, return", z7Var.f173982a.f156428a.f156336n);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]mAdWorkerHolder.WorkerCreateInterruptor.isInterrupt, appId:%s serviceInitType:%s", z7Var.f173982a.f156428a.f156336n, a17.D);
            if (a17.D != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]  not in preloading");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = z7Var.f173982a.f156428a;
                java.util.Map map = i81.j.f371125a;
                if (!(o6Var == null ? false : i81.j.a(o6Var.u0()))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[createWXLibWorker]  not adcontact");
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc pcVar) {
        synchronized (this.f158549b) {
            cl.q0 q0Var = this.f158550c;
            if (q0Var == null && this.f158551d == null) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b bVar = null;
            if (q0Var == null) {
                java.lang.String str = this.f158551d;
                if (!(str == null || str.length() == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[obtainWorkerAsync]  workerEngine had created, but fail for[" + this.f158551d + "], trigger listener");
                    pcVar.a(null, new jz5.l(-1L, -1L), this.f158551d);
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[obtainWorkerAsync]  workerEngine had created,trigger listener");
            synchronized (this.f158549b) {
                cl.q0 q0Var2 = this.f158550c;
                if (q0Var2 != null) {
                    bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b(q0Var2);
                }
            }
            pcVar.a(bVar, this.f158552e, "");
            return true;
        }
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        if (c(listener)) {
            return true;
        }
        synchronized (this.f158548a) {
            ((java.util.ArrayList) this.f158548a).add(listener);
        }
        return false;
    }

    public void e(em1.c adWorkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adWorkerInfo, "adWorkerInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdWorkerHolder", "AdWorker created. store to holder, " + adWorkerInfo);
        java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("paramsCache").u("paramsCache", null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = adWorkerInfo.f336555g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = e9Var.x();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
        java.lang.String valueOf = java.lang.String.valueOf(x17.i());
        if (u17 == null || !r26.i0.y(u17, valueOf, false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(valueOf);
            sb6.append("#@#");
            sb6.append(adWorkerInfo.f336556h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[createWXLibWorker]  params=" + adWorkerInfo + ".params");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("paramsCache").clear();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("paramsCache").D("paramsCache", sb6.toString());
        }
        f(adWorkerInfo);
    }

    public final void f(em1.c adWorkerInfo) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adWorkerInfo, "adWorkerInfo");
        synchronized (this.f158549b) {
            if (this.f158550c != null) {
                return;
            }
            this.f158550c = adWorkerInfo.f336550b;
            this.f158552e = adWorkerInfo.f336551c;
            this.f158551d = adWorkerInfo.f336552d;
            this.f158555h = adWorkerInfo.f336553e;
            this.f158554g = adWorkerInfo.f336554f;
            this.f158553f = adWorkerInfo.f336555g;
            synchronized (this.f158548a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdWorkerHolder", "[storeWorker]  CreatedListeners size=" + ((java.util.ArrayList) this.f158548a).size());
                linkedList = new java.util.LinkedList(this.f158548a);
                ((java.util.ArrayList) this.f158548a).clear();
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc pcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pcVar);
                c(pcVar);
            }
        }
    }
}
