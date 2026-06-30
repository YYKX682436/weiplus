package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class c0 implements nh1.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f167405a = false;

    @Override // nh1.b
    public void a(final android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, final java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 == null || mo32091x9a3f0ba2.C0() == null) {
            return;
        }
        if (this.f167405a) {
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e = mo32091x9a3f0ba2.C0().getF229341e();
            ae.r rVar = (ae.r) n7Var.U1().z1(ae.r.class);
            if (rVar != null) {
                rVar.w();
            }
            f229341e.mo14660x738236e6(";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.C12424x5897496(this, java.lang.String.format("CPU_%s_%d.cpuprofile", str, java.lang.Long.valueOf(currentTimeMillis)), context));
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
            java.lang.String str2 = ";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);";
            mo32091x9a3f0ba2.C0().A1().s0(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$a
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0 c0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0.this;
                    c0Var.getClass();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) obj).mo14660x738236e6(";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.C12424x5897496(c0Var, java.lang.String.format("CPU_%s_%d_worker_%d.cpuprofile", str, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(atomicInteger.incrementAndGet())), context));
                }
            });
            java.util.List d17 = d(mo32091x9a3f0ba2);
            if (d17 != null) {
                java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) it.next();
                    java.lang.String format = java.lang.String.format("CPU_%s_%d_worker_%d.cpuprofile", str, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MiroMsg.GameCpuProfile", "hy: not worker instance");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.C12424x5897496 c12424x5897496 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.C12424x5897496(this, format, context);
                    java.lang.String str3 = str2;
                    c0Var.mo14660x738236e6(str3, c12424x5897496);
                    i17++;
                    str2 = str3;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(lp0.b.D() + "appbrand/trace/");
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e2 = mo32091x9a3f0ba2.C0().getF229341e();
        ae.r rVar2 = (ae.r) n7Var.U1().z1(ae.r.class);
        if (rVar2 != null) {
            rVar2.w();
        }
        f229341e2.mo14660x738236e6(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.e0(this, context));
        final java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger();
        mo32091x9a3f0ba2.C0().A1().s0(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.c0$$b
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0 c0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.c0.this;
                c0Var2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.GameCpuProfile", "hy: trigger worker cpu profiling: %d", java.lang.Integer.valueOf(atomicInteger2.incrementAndGet()));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) obj).mo14660x738236e6(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.e0(c0Var2, context));
            }
        });
        java.util.List d18 = d(mo32091x9a3f0ba2);
        if (d18 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) d18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.GameCpuProfile", "hy: trigger worker cpu profiling: %d", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) it6.next()).mo14660x738236e6(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.e0(this, context));
            }
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        return this.f167405a ? "Stop CPU Profile" : "Start CPU Profile";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195.class);
        if (c11813xf952a195.f387385r.f156932d == 1 || c11813xf952a195.f387385r.f156932d == 2 || z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            return true;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167255o || z65.c.a();
    }

    public final java.util.List d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2.C0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.GameCpuProfile", "hy: service released. abort walking through workers");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c17 = c11510xdd90c2f2.C0().c1();
        if (c17 != null) {
            return c17.d();
        }
        return null;
    }
}
