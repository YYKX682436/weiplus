package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class c0 implements nh1.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f85872a = false;

    @Override // nh1.b
    public void a(final android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, final java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.o6 runtime = n7Var.getRuntime();
        if (runtime == null || runtime.C0() == null) {
            return;
        }
        if (this.f85872a) {
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = runtime.C0().getF147808e();
            ae.r rVar = (ae.r) n7Var.U1().z1(ae.r.class);
            if (rVar != null) {
                rVar.w();
            }
            f147808e.evaluateJavascript(";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);", new com.tencent.mm.plugin.appbrand.menu.devtools.c0$$c(this, java.lang.String.format("CPU_%s_%d.cpuprofile", str, java.lang.Long.valueOf(currentTimeMillis)), context));
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
            java.lang.String str2 = ";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);";
            runtime.C0().A1().s0(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$a
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.tencent.mm.plugin.appbrand.menu.devtools.c0 c0Var = com.tencent.mm.plugin.appbrand.menu.devtools.c0.this;
                    c0Var.getClass();
                    ((com.tencent.mm.plugin.appbrand.jsruntime.c0) obj).evaluateJavascript(";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);", new com.tencent.mm.plugin.appbrand.menu.devtools.c0$$c(c0Var, java.lang.String.format("CPU_%s_%d_worker_%d.cpuprofile", str, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(atomicInteger.incrementAndGet())), context));
                }
            });
            java.util.List d17 = d(runtime);
            if (d17 != null) {
                java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var = (com.tencent.mm.plugin.appbrand.jsruntime.c0) it.next();
                    java.lang.String format = java.lang.String.format("CPU_%s_%d_worker_%d.cpuprofile", str, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17));
                    com.tencent.mars.xlog.Log.w("MiroMsg.GameCpuProfile", "hy: not worker instance");
                    com.tencent.mm.plugin.appbrand.menu.devtools.c0$$c c0__c = new com.tencent.mm.plugin.appbrand.menu.devtools.c0$$c(this, format, context);
                    java.lang.String str3 = str2;
                    c0Var.evaluateJavascript(str3, c0__c);
                    i17++;
                    str2 = str3;
                }
                return;
            }
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(lp0.b.D() + "appbrand/trace/");
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e2 = runtime.C0().getF147808e();
        ae.r rVar2 = (ae.r) n7Var.U1().z1(ae.r.class);
        if (rVar2 != null) {
            rVar2.w();
        }
        f147808e2.evaluateJavascript(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new com.tencent.mm.plugin.appbrand.menu.devtools.e0(this, context));
        final java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger();
        runtime.C0().A1().s0(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$b
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                com.tencent.mm.plugin.appbrand.menu.devtools.c0 c0Var2 = com.tencent.mm.plugin.appbrand.menu.devtools.c0.this;
                c0Var2.getClass();
                com.tencent.mars.xlog.Log.i("MiroMsg.GameCpuProfile", "hy: trigger worker cpu profiling: %d", java.lang.Integer.valueOf(atomicInteger2.incrementAndGet()));
                ((com.tencent.mm.plugin.appbrand.jsruntime.c0) obj).evaluateJavascript(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new com.tencent.mm.plugin.appbrand.menu.devtools.e0(c0Var2, context));
            }
        });
        java.util.List d18 = d(runtime);
        if (d18 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) d18;
            com.tencent.mars.xlog.Log.i("MiroMsg.GameCpuProfile", "hy: trigger worker cpu profiling: %d", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.jsruntime.c0) it6.next()).evaluateJavascript(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new com.tencent.mm.plugin.appbrand.menu.devtools.e0(this, context));
            }
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return this.f85872a ? "Stop CPU Profile" : "Start CPU Profile";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        if (appBrandSysConfigWC.f305852r.f75399d == 1 || appBrandSysConfigWC.f305852r.f75399d == 2 || z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            return true;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return com.tencent.mm.plugin.appbrand.m6.a(str).f85722o || z65.c.a();
    }

    public final java.util.List d(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime.C0() == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.GameCpuProfile", "hy: service released. abort walking through workers");
            return null;
        }
        com.tencent.mm.plugin.appbrand.x9 c17 = appBrandRuntime.C0().c1();
        if (c17 != null) {
            return c17.d();
        }
        return null;
    }
}
