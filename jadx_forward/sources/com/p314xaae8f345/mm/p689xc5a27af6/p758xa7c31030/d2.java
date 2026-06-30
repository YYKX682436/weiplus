package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public class d2 implements ki.a {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f149079d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f149080e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f149081f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f149082g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f149083h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f149084i = false;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 f149085m;

    public d2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 c2Var) {
        this.f149085m = c2Var;
    }

    @Override // ki.a
    public void a(int i17) {
        if (z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "debugger env: flush");
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
        this.f149079d = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_mmkv, true, false);
        this.f149080e = true;
        this.f149081f = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_x_odex, false, false);
        this.f149082g = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_x_base_apk, false, false);
        this.f149083h = true;
        this.f149084i = ih.a.g(e42.d0.clicfg_matrix_trim_memory_madvise_x_mm_apk, false, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: mmkv=%s, xso=%s, xodex=%s, baseApk=%s, tinkerApk=%s, mmApk=%s", java.lang.Boolean.valueOf(this.f149079d), java.lang.Boolean.valueOf(this.f149080e), java.lang.Boolean.valueOf(this.f149081f), java.lang.Boolean.valueOf(this.f149082g), java.lang.Boolean.valueOf(this.f149083h), java.lang.Boolean.valueOf(this.f149084i));
    }

    public final void d() {
        if (!ih.a.h("clicfg_matrix_trim_memory_madvise_enable_solid", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: madvise disabled by expt");
            return;
        }
        if (!fp.q.b("xperf")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginPerformance", "MADV_DONTNEED: ExpansionsProxy: xperf NOT installed");
        } else {
            if (java.lang.System.currentTimeMillis() - this.f149085m.f149070f < java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginPerformance", "MADV_DONTNEED: avoid trimming frequently");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).r(new java.lang.Runnable() { // from class: com.tencent.mm.feature.performance.d2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d2 d2Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d2.this;
                    d2Var.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: do trim");
                        com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.a(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.e2(d2Var));
                    } catch (java.lang.Throwable th6) {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginPerformance", th6, "", new java.lang.Object[0]);
                            d2Var.f149085m.f149070f = java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: trim done. cost [%s]. error[%s]", java.lang.Long.valueOf(d2Var.f149085m.f149070f - currentTimeMillis), java.lang.Boolean.TRUE);
                        } finally {
                            d2Var.f149085m.f149070f = java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance", "MADV_DONTNEED: trim done. cost [%s]. error[%s]", java.lang.Long.valueOf(d2Var.f149085m.f149070f - currentTimeMillis), java.lang.Boolean.FALSE);
                        }
                    }
                }
            }, "trim-madvise");
        }
    }
}
