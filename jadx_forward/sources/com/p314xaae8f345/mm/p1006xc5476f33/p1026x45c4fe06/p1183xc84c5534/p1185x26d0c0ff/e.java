package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j f169705a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f169706b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d f169707c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321;
        if (c11510xdd90c2f2 == null) {
            return null;
        }
        java.util.HashMap hashMap = f169706b;
        synchronized (hashMap) {
            c12567x34ba321 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321) hashMap.get(c11510xdd90c2f2.f156336n);
        }
        if (c12567x34ba321 == null || c11510xdd90c2f2 != c12567x34ba321.f169677p) {
            return null;
        }
        return c12567x34ba321;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321;
        java.util.HashMap hashMap = f169706b;
        synchronized (hashMap) {
            c12567x34ba321 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321) hashMap.get(str);
        }
        if (c12567x34ba321 == null) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "QualitySession not open. appId=%s", str);
            if (z17) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandQualitySystem", new java.lang.Throwable(), format, new java.lang.Object[0]);
        }
        return c12567x34ba321;
    }

    public static void c(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a c12340xb447464a, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, long j17) {
        long k17;
        if (c12567x34ba321 == null) {
            return;
        }
        c12567x34ba321.f169680s = j17;
        c12567x34ba321.f169684w = c12340xb447464a;
        if (c12340xb447464a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandQualitySystem", "ReportBundle == null in resourceReady");
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7113xe7277ef c7113xe7277ef = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7113xe7277ef();
            c7113xe7277ef.f144321e = c7113xe7277ef.b("AppId", c12567x34ba321.f169668e, true);
            c7113xe7277ef.f144320d = c7113xe7277ef.b("InstanceId", c12567x34ba321.f169667d, true);
            int i17 = c12567x34ba321.f169669f;
            int i18 = 3;
            c7113xe7277ef.f144323g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.r0.demo : cm.r0.debug : cm.r0.release;
            c7113xe7277ef.f144324h = c12567x34ba321.f169670g;
            c7113xe7277ef.f144326j = c12567x34ba321.f169671h;
            c7113xe7277ef.f144322f = c12567x34ba321.f169672i;
            long j18 = c12567x34ba321.f169678q;
            c7113xe7277ef.f144327k = j18;
            c7113xe7277ef.f144328l = j17;
            c7113xe7277ef.f144325i = j17 - j18;
            c7113xe7277ef.f144337u = c12340xb447464a.f165945m;
            c7113xe7277ef.f144338v = c12340xb447464a.f165947o;
            c7113xe7277ef.f144339w = c12567x34ba321.f169673m;
            c7113xe7277ef.f144340x = c12340xb447464a.f165952t;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
            c7113xe7277ef.f144330n = c12340xb447464a.f165953u ? cm.t0.sync : cm.t0.unsync;
            c7113xe7277ef.f144331o = u07.S1 ? cm.s0.sync : cm.s0.unsync;
            c7113xe7277ef.f144333q = o6Var.f167713m2 ? 1L : 0L;
            if (!com.p314xaae8f345.mm.vfs.w6.j(c11813xf952a195.f387385r.f33455xe121c411)) {
                java.util.Iterator it = c11813xf952a195.f387385r.f156935g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        k17 = 0;
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) it.next();
                    if (com.p314xaae8f345.mm.vfs.w6.j(c11656xaf63146e.f33455xe121c411)) {
                        k17 = com.p314xaae8f345.mm.vfs.w6.k(c11656xaf63146e.f33455xe121c411);
                        break;
                    }
                }
            } else {
                k17 = com.p314xaae8f345.mm.vfs.w6.k(c11813xf952a195.f387385r.f33455xe121c411);
            }
            if (!o6Var.f167713m2) {
                k17 = 0;
            }
            c7113xe7277ef.f144329m = k17;
            c7113xe7277ef.f144332p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
            c7113xe7277ef.f144336t = c12567x34ba321.H;
            c7113xe7277ef.f144334r = c12567x34ba321.a();
            c7113xe7277ef.f144335s = c12567x34ba321.f169684w.f165943h - c12567x34ba321.f169684w.f165942g;
            c7113xe7277ef.f144341y = c12340xb447464a.f165954v ? cm.v0.sync : cm.v0.unsync;
            c7113xe7277ef.f144342z = c12340xb447464a.f165949q - c12340xb447464a.f165948p;
            c7113xe7277ef.C = c12340xb447464a.f165955w ? cm.u0.sync : cm.u0.unsync;
            c7113xe7277ef.D = c12340xb447464a.f165951s - c12340xb447464a.f165950r;
            c7113xe7277ef.A = c12567x34ba321.b();
            c7113xe7277ef.B = c7113xe7277ef.b("NetworkTypeStr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
            if (gf.y0.b(o6Var, o6Var.t0(), false)) {
                i18 = 5;
            } else if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
                i18 = 4;
            }
            c7113xe7277ef.E = i18;
            c7113xe7277ef.G = (c12567x34ba321.f169684w == null || !c12567x34ba321.f169684w.a()) ? 0L : 1L;
            try {
                java.lang.String str = o6Var.u0().f158816i;
                if (str == null) {
                    str = "";
                }
                c7113xe7277ef.H = c7113xe7277ef.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, fp.s0.a(str), true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandQualitySystem", "resourceReady appId %s, encode enterPath failed %s", o6Var.f156336n, e17);
            }
            c7113xe7277ef.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f(c7113xe7277ef.f144321e, "ResourcePrepare", c7113xe7277ef.f144327k, c7113xe7277ef.f144328l, null);
        }
        ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.quality.e$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba3212 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = o6Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a1952 = c11813xf952a195;
                if (c12567x34ba3212 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(o6Var2) || c12567x34ba3212.f169677p.L0() || c12567x34ba3212.A) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = c12567x34ba3212.f169687z;
                tVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "AppBrandRuntimeEventReporter.mayStartDependOnClientSampleRate");
                int i19 = c12567x34ba3212.f169677p.u0().f128812x0;
                double d17 = c11813xf952a1952.Y.G;
                double nextDouble = new java.util.Random(i19 ^ java.lang.System.nanoTime()).nextDouble();
                boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d;
                boolean z18 = nextDouble <= d17 || z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "shouldEnableReport() returned: [%b], localRandom = [%f] serverPercent = [%f] monkeyMode[%b]", java.lang.Boolean.valueOf(z18), java.lang.Double.valueOf(nextDouble), java.lang.Double.valueOf(d17), java.lang.Boolean.valueOf(z17));
                if (z18) {
                    synchronized (tVar) {
                        tVar.c(c12567x34ba3212, c11813xf952a1952.Y.H, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Full, false);
                    }
                }
            }
        });
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.String str, long j17, java.lang.String str2, int i17, long j18, int i18, cl.k1 k1Var) {
        e(yVar, str, j17, str2, i17, j18, i18, k1Var, str.endsWith("app-service.js") || "game.js".equals(str));
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.String str, long j17, java.lang.String str2, int i17, long j18, int i18, cl.k1 k1Var, boolean z17) {
        int i19;
        int i27;
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = b(mo48798x74292566, true);
        if (b17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject appId = [%s] session.runtime.hashCode = [%d] runtimeHashCode = [%d] name = [%s].", mo48798x74292566, java.lang.Integer.valueOf(b17.f169677p.hashCode()), java.lang.Integer.valueOf(i18), str);
        if (i18 != b17.f169677p.hashCode()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject runtime hashCode mismatch");
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7094xb60328db c7094xb60328db = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7094xb60328db();
        c7094xb60328db.f144031e = c7094xb60328db.b("AppId", b17.f169668e, true);
        c7094xb60328db.f144030d = c7094xb60328db.b("InstanceId", b17.f169667d, true);
        c7094xb60328db.f144033g = b17.f169669f;
        c7094xb60328db.f144034h = b17.f169670g;
        c7094xb60328db.f144032f = b17.f169672i;
        c7094xb60328db.f144036j = b17.f169671h;
        c7094xb60328db.f144037k = j18;
        long i28 = c7094xb60328db.i();
        c7094xb60328db.f144038l = i28;
        c7094xb60328db.f144035i = i28 - c7094xb60328db.f144037k;
        c7094xb60328db.f144039m = j17;
        c7094xb60328db.f144040n = c7094xb60328db.b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0.a(yVar.getF229341e());
        boolean z18 = false;
        switch (a17) {
            case X5:
                i19 = 1;
                break;
            case MMV8:
                i19 = 2;
                break;
            case WebViewBased:
                i19 = 3;
                break;
            case NativeScript:
                i19 = 4;
                break;
            case NodeJS:
                i19 = 6;
                break;
            case J2V8:
                i19 = 5;
                break;
            case WebViewX5:
                i19 = 102;
                break;
            case WebViewXW:
                i19 = 103;
                break;
            case WebViewSystem:
                i19 = 104;
                break;
            default:
                i19 = 0;
                break;
        }
        c7094xb60328db.f144041o = i19;
        c7094xb60328db.f144042p = (k1Var == null || (i27 = k1Var.f4717x67f135e7) < 0 || i27 >= 7) ? 4L : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.f165536t0[i27];
        if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) {
            z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) yVar).X1();
        } else if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) {
            z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) yVar).U1().X1();
        }
        c7094xb60328db.f144043q = z18 ? 1L : 0L;
        c7094xb60328db.f144044r = k1Var != null ? k1Var.f4718xa1600be : 0L;
        if (u46.a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0.f169416m, a17)) {
            c7094xb60328db.f144045s = c7094xb60328db.b("engineVersion", com.p159x477cd522.p160x333422.V8.m16074x88682140(), true);
        } else if (yVar.getF229341e() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) {
            c7094xb60328db.f144045s = c7094xb60328db.b("engineVersion", f169705a.d() + "", true);
        }
        c7094xb60328db.f144046t = c7094xb60328db.b("pluginAppid", str2, true);
        c7094xb60328db.f144047u = c7094xb60328db.b("pluginVersion", java.lang.String.valueOf(i17), true);
        c7094xb60328db.k();
        if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            od1.c cVar = new od1.c();
            cVar.f426135a = "evaluateJavaScript";
            cVar.f426136b = c7094xb60328db.f144037k;
            cVar.f426137c = c7094xb60328db.f144038l;
            cVar.b(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, c7094xb60328db.f144040n);
            cVar.b("size", java.lang.Long.valueOf(c7094xb60328db.f144039m));
            cVar.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) yVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h hVar = b17.f169686y;
        if (hVar.f169731a || !z17) {
            return;
        }
        hVar.f169731a = true;
        b17.f169681t = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = b17.f169677p;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7095xef91b37d c7095xef91b37d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7095xef91b37d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b18 = b(mo48798x74292566, true);
        if (b18 == null) {
            return;
        }
        c7095xef91b37d.f144049e = c7095xef91b37d.b("AppId", b18.f169668e, true);
        c7095xef91b37d.f144048d = c7095xef91b37d.b("InstanceId", b18.f169667d, true);
        int i29 = b18.f169669f;
        c7095xef91b37d.f144051g = i29 != 1 ? i29 != 2 ? i29 != 3 ? null : cm.x.demo : cm.x.debug : cm.x.release;
        c7095xef91b37d.f144052h = b18.f169670g;
        c7095xef91b37d.f144050f = b18.f169672i;
        c7095xef91b37d.f144054j = b18.f169671h;
        c7095xef91b37d.f144055k = b18.f169678q;
        long i37 = c7095xef91b37d.i();
        c7095xef91b37d.f144056l = i37;
        c7095xef91b37d.f144053i = i37 - b18.f169678q;
        c7095xef91b37d.f144057m = c7095xef91b37d.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, fp.s0.a(o6Var.t0()), true);
        c7095xef91b37d.f144058n = o6Var.f167713m2 ? 1L : 0L;
        if (b18.f169684w != null) {
            c7095xef91b37d.f144059o = b18.f169684w.a() ? 1L : 0L;
        } else {
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        c7095xef91b37d.f144060p = b18.a();
        c7095xef91b37d.f144061q = c7095xef91b37d.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        c7095xef91b37d.f144062r = b18.H;
        c7095xef91b37d.f144063s = b18.b();
        c7095xef91b37d.f144064t = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5) o6Var.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5.class)).a() ? 1L : 2L;
        c7095xef91b37d.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f(mo48798x74292566, "StartupToJsInject", c7095xef91b37d.f144055k, c7095xef91b37d.f144056l, null);
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        g(o6Var, false, 0L);
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, boolean z17, long j17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7106x40267533 c7106x40267533 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7106x40267533();
        c7106x40267533.f144237d = c7106x40267533.b("AppId", o6Var.f156336n, true);
        c7106x40267533.f144238e = c7106x40267533.b("InstanceId", o6Var.u0().f128810w, true);
        c7106x40267533.f144239f = o6Var.u0().f128817z + 1000;
        c7106x40267533.f144241h = java.lang.System.currentTimeMillis();
        c7106x40267533.f144242i = o6Var.A2 != null ? r1.f371061e : 9;
        c7106x40267533.f144243j = z17 ? 1L : 0L;
        c7106x40267533.f144244k = j17;
        if (i81.a0.a(o6Var) != null) {
            c7106x40267533.f144240g = r4.f371115z;
            c7106x40267533.f144245l = r4.f371109t;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystem", "reportSplashAdShowAdState, instanceId: %s, showAdState: %d, appOpenMode: %d, preloadStatus: %d, isExitMidway: %b", c7106x40267533.f144238e, java.lang.Long.valueOf(c7106x40267533.f144242i), java.lang.Long.valueOf(c7106x40267533.f144240g), java.lang.Long.valueOf(c7106x40267533.f144245l), java.lang.Boolean.valueOf(z17));
        c7106x40267533.k();
    }

    public static void h(long j17, long j18, long j19) {
        if (j19 < j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 1L, 1L);
            return;
        }
        if (j19 < 2 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 2L, 1L);
            return;
        }
        if (j19 < 3 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 3L, 1L);
            return;
        }
        if (j19 < 4 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 4L, 1L);
            return;
        }
        if (j19 < 5 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 5L, 1L);
            return;
        }
        if (j19 < 6 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 6L, 1L);
            return;
        }
        if (j19 < 7 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 7L, 1L);
            return;
        }
        if (j19 < 8 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 8L, 1L);
            return;
        }
        if (j19 < 9 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 9L, 1L);
        } else if (j19 < 10 * j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 10L, 1L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, 11L, 1L);
        }
    }

    public static void i(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] startSession appId = [%s] runtime.hashCode = [%d]", o6Var.f156336n, java.lang.Integer.valueOf(o6Var.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = o6Var.u0().f158831k2;
        if (c12566x87f2d8b7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandQualitySystem", "startSession with NULL qualityReportSession in InitConfig");
            c12566x87f2d8b7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t.a(o6Var.u0().f128812x0), o6Var.u0(), o6Var.l2(), 0L);
            o6Var.u0().f158831k2 = c12566x87f2d8b7;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        obtain.setDataPosition(0);
        c12566x87f2d8b7.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321(obtain);
        obtain.recycle();
        c12567x34ba321.f169677p = o6Var;
        c12567x34ba321.A = o6Var.q2();
        c12567x34ba321.f169679r = java.lang.System.currentTimeMillis();
        c12567x34ba321.f169678q = o6Var.u0().I;
        double d17 = o6Var.u0().K;
        c12567x34ba321.F = o6Var.u0().Y1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d dVar = f169707c;
        java.lang.String instanceId = c12567x34ba321.f169667d;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7092xaf6e1c70 c7092xaf6e1c70 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7092xaf6e1c70();
        c7092xaf6e1c70.f144027e = c7092xaf6e1c70.b("flags", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d.f169692a.a(), true);
        c7092xaf6e1c70.f144026d = c7092xaf6e1c70.b("instanceId", instanceId, true);
        c7092xaf6e1c70.k();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.f(c12567x34ba321));
        if (1 == o6Var.u0().f128808u) {
            c12567x34ba321.H = 2L;
        } else {
            c12567x34ba321.H = o6Var.u0().f158829i2 ? 0L : 1L;
        }
        java.util.HashMap hashMap = f169706b;
        synchronized (hashMap) {
            hashMap.put(c12567x34ba321.f169668e, c12567x34ba321);
        }
        o6Var.f156327J.add(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.quality.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] closeSession appId = [%s] runtime.hashCode = [%d]", o6Var2.f156336n, java.lang.Integer.valueOf(o6Var2.hashCode()));
                java.lang.String str = o6Var2.f156336n;
                if (android.text.TextUtils.isEmpty(str) || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(str, false)) == null || b17.f169677p != o6Var2) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = b17.f169687z;
                synchronized (tVar) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "dl: destroyed");
                    tVar.f169841h = null;
                    android.os.Handler handler = tVar.f169834a;
                    if (handler != null) {
                        handler.removeCallbacks(tVar.f169835b);
                        tVar.f169834a = null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar2 = tVar.f169844k;
                    if (tVar2 != null) {
                        tVar2.b();
                        tVar.f169844k = null;
                    }
                    if (tVar.f169843j) {
                        tVar.f169843j = false;
                    }
                }
                java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169706b;
                synchronized (hashMap2) {
                    hashMap2.put(str, null);
                }
            }
        });
    }
}
