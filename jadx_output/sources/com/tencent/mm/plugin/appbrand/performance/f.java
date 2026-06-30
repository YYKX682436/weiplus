package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f87341d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f87342e;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f87347m;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.performance.t f87349o;

    /* renamed from: f, reason: collision with root package name */
    public volatile double f87343f = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f87344g = 4;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f87345h = true;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f87346i = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v0 f87350p = new com.tencent.mm.plugin.appbrand.performance.e(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.performance.o f87348n = new com.tencent.mm.plugin.appbrand.performance.o(android.os.Process.myPid());

    public f(ze.n nVar) {
        this.f87347m = false;
        this.f87341d = nVar;
        this.f87342e = nVar.f74803n;
        this.f87347m = false;
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
        int b07 = com.tencent.mm.sdk.platformtools.t8.b0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.appbrand.performance.h.e(this.f87341d, 102, b07 + "m");
        com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "MEMORY", (double) b07);
    }

    public void g() {
        if (!this.f87347m) {
            com.tencent.mm.plugin.appbrand.performance.c cVar = new com.tencent.mm.plugin.appbrand.performance.c(this);
            com.tencent.mm.plugin.appbrand.performance.t tVar = new com.tencent.mm.plugin.appbrand.performance.t();
            this.f87349o = tVar;
            tVar.f87382g = 100L;
            tVar.f87384i = cVar;
        }
        this.f87345h = true;
        ik1.h0.a().postToWorker(this);
        com.tencent.mm.plugin.appbrand.x0.a(this.f87342e, this.f87350p);
        com.tencent.mm.plugin.appbrand.performance.t tVar2 = this.f87349o;
        if (tVar2 != null) {
            tVar2.a();
        }
    }

    public void h() {
        this.f87345h = false;
        com.tencent.mm.plugin.appbrand.x0.e(this.f87342e, this.f87350p);
        com.tencent.mm.plugin.appbrand.performance.t tVar = this.f87349o;
        if (tVar != null) {
            tVar.b();
        }
        com.tencent.mm.plugin.appbrand.performance.o oVar = this.f87348n;
        if (oVar != null) {
            oVar.close();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f87341d.L0()) {
            return;
        }
        if (this.f87345h && !this.f87346i) {
            double b17 = this.f87348n.b();
            com.tencent.mm.plugin.appbrand.performance.h.e(this.f87341d, 101, ((int) b17) + "%");
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "CPU", b17);
            f();
            e();
            b();
            a();
            d();
            c();
            this.f87344g++;
            if (this.f87344g >= 4) {
                this.f87344g = 0;
                ze.n nVar = this.f87341d;
                com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = nVar.E0();
                if (E0 != null) {
                    int i17 = E0.f305853s;
                    java.lang.String str = this.f87342e;
                    if (i17 == 1) {
                        com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask getStorageSizeTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask();
                        getStorageSizeTask.f83340f = str;
                        getStorageSizeTask.f83342h = new com.tencent.mm.plugin.appbrand.performance.d(this, getStorageSizeTask);
                        getStorageSizeTask.d();
                    } else {
                        com.tencent.mm.plugin.appbrand.performance.h.e(nVar, 401, com.tencent.mm.sdk.platformtools.t8.f0(((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(str, E0.f305853s, E0.f305855u).K(str)));
                    }
                }
            }
        }
        if (this.f87345h) {
            ik1.h0.a().b(this, 1000L);
        }
    }
}
