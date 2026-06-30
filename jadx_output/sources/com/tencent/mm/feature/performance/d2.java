package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public class d2 implements ki.a {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f67546d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f67547e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f67548f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f67549g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f67550h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f67551i = false;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.c2 f67552m;

    public d2(com.tencent.mm.feature.performance.c2 c2Var) {
        this.f67552m = c2Var;
    }

    @Override // ki.a
    public void a(int i17) {
        if (z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "debugger env: flush");
            c();
            d();
        }
    }

    @Override // ki.a
    public void b() {
        c();
        d();
    }

    public final void c() {
        this.f67546d = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_mmkv, true, false);
        this.f67547e = true;
        this.f67548f = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_x_odex, false, false);
        this.f67549g = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_x_base_apk, false, false);
        this.f67550h = true;
        this.f67551i = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_x_mm_apk, false, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: mmkv=%s, xso=%s, xodex=%s, baseApk=%s, tinkerApk=%s, mmApk=%s", java.lang.Boolean.valueOf(this.f67546d), java.lang.Boolean.valueOf(this.f67547e), java.lang.Boolean.valueOf(this.f67548f), java.lang.Boolean.valueOf(this.f67549g), java.lang.Boolean.valueOf(this.f67550h), java.lang.Boolean.valueOf(this.f67551i));
    }

    public final void d() {
        if (!ih.a.h("clicfg_matrix_trim_memory_madvise_enable_solid", true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: madvise disabled by expt");
            return;
        }
        if (!fp.q.b("xperf")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginPerformance", "MADV_DONTNEED: ExpansionsProxy: xperf NOT installed");
        } else {
            if (java.lang.System.currentTimeMillis() - this.f67552m.f67537f < java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginPerformance", "MADV_DONTNEED: avoid trimming frequently");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).r(new java.lang.Runnable() { // from class: com.tencent.mm.feature.performance.d2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.feature.performance.d2 d2Var = com.tencent.mm.feature.performance.d2.this;
                    d2Var.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: do trim");
                        com.tencent.matrix.mallctl.MallCtl.a(new com.tencent.mm.feature.performance.e2(d2Var));
                    } catch (java.lang.Throwable th6) {
                        try {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginPerformance", th6, "", new java.lang.Object[0]);
                            d2Var.f67552m.f67537f = java.lang.System.currentTimeMillis();
                            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: trim done. cost [%s]. error[%s]", java.lang.Long.valueOf(d2Var.f67552m.f67537f - currentTimeMillis), java.lang.Boolean.TRUE);
                        } finally {
                            d2Var.f67552m.f67537f = java.lang.System.currentTimeMillis();
                            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: trim done. cost [%s]. error[%s]", java.lang.Long.valueOf(d2Var.f67552m.f67537f - currentTimeMillis), java.lang.Boolean.FALSE);
                        }
                    }
                }
            }, "trim-madvise");
        }
    }
}
