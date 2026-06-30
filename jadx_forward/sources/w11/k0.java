package w11;

/* loaded from: classes12.dex */
public class k0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f523604d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.StringBuilder f523605e;

    /* renamed from: f, reason: collision with root package name */
    public final x11.t f523606f;

    public k0(com.p314xaae8f345.mm.p944x882e457a.v0 v0Var, android.content.Context context) {
        java.lang.String valueOf;
        int i17;
        long j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f523605e = sb6;
        x11.t tVar = new x11.t(this);
        this.f523606f = tVar;
        m48022x4479fa06().h(1000);
        t4.a.a("NewInitAll", 10086);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "NetSceneInit hash:%d stack:%s", valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        sb6.append("stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3() + " time:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        this.f523604d = new java.lang.ref.WeakReference(v0Var);
        x11.f0 a17 = tVar.a();
        a17.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        a17.f532898f = elapsedRealtime;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            valueOf = activity.getIntent().getStringExtra("KEY_NEWINIT_LOGIN_IN_SESSION_ID");
            if (valueOf == null || r26.n0.N(valueOf)) {
                valueOf = java.lang.String.valueOf(a17.f532898f);
            } else {
                activity.getIntent().removeExtra("KEY_NEWINIT_LOGIN_IN_SESSION_ID");
            }
        } else {
            valueOf = java.lang.String.valueOf(elapsedRealtime);
        }
        a17.f532899g = valueOf;
        try {
            try {
                i17 = java.lang.Runtime.getRuntime().availableProcessors();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "getCpuCoreNum err", new java.lang.Object[0]);
                i17 = -1;
            }
            try {
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
                j17 = memoryInfo.totalMem;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th7, "getMemorySize err", new java.lang.Object[0]);
                j17 = -1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordInitStart() called sessionId:" + a17.f532899g + " cpuCoreNum:" + i17 + " memorySize:" + j17);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55 c6790x79ba4f55 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55();
            c6790x79ba4f55.f141220d = c6790x79ba4f55.b("reversion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
            c6790x79ba4f55.f141233q = c6790x79ba4f55.b("sessionid", a17.f532899g, true);
            c6790x79ba4f55.f141234r = (long) i17;
            c6790x79ba4f55.f141235s = j17;
            x11.e0[] e0VarArr = x11.e0.f532890d;
            c6790x79ba4f55.f141232p = 1;
            x11.b0.f532883a.a(c6790x79ba4f55, null);
            c6790x79ba4f55.k();
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th8, "report err", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int H(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, r45.cu5 cu5Var, r45.cu5 cu5Var2) {
        int i17;
        this.f523605e.append(" lastd:" + this.f32552xa692e110 + " dotime:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + " net:" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        x11.z zVar = new x11.z();
        x11.t tVar = this.f523606f;
        tVar.getClass();
        if (cu5Var2 == null) {
            java.lang.Object l17 = gm0.j1.u().c().l(8198, null);
            cu5Var2 = x51.j1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(l17 instanceof java.lang.String ? (java.lang.String) l17 : null));
        }
        if (cu5Var == null) {
            java.lang.Object l18 = gm0.j1.u().c().l(8197, null);
            cu5Var = x51.j1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(l18 instanceof java.lang.String ? (java.lang.String) l18 : null));
        }
        o45.zg mo47979x2d63726f = zVar.mo47979x2d63726f();
        if (mo47979x2d63726f != null) {
            java.lang.Object l19 = gm0.j1.u().c().l(16, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(l19 instanceof java.lang.Integer ? (java.lang.Integer) l19 : null) == 0 || (cu5Var != null && cu5Var.f453372d > 0)) {
                i17 = (w11.c2.f523524a.a().length == 0) != false ? 3 : 4;
            } else {
                i17 = 7;
            }
            mo47979x2d63726f.m150629x6027f5dc(i17);
        }
        r45.iu4 iu4Var = tVar.f532929m;
        iu4Var.f458869e = cu5Var;
        iu4Var.f458870f = cu5Var2;
        x11.g gVar = x11.t.D;
        iu4Var.f458872h = gVar.c() ? 1 : 0;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            iu4Var.f458873i = wi6;
        }
        o45.zg mo47979x2d63726f2 = zVar.mo47979x2d63726f();
        o45.vh vhVar = mo47979x2d63726f2 instanceof o45.vh ? (o45.vh) mo47979x2d63726f2 : null;
        if (vhVar != null) {
            vhVar.f424555a = iu4Var;
        }
        ((jz5.n) x11.t.f532922J).mo141623x754a37bb();
        java.lang.String str = "onNewInitDoScene isGetExptBeforeInit:" + gVar.b() + " ForceToInitContact:" + iu4Var.f458872h + " hash:%d time:%d count:%d user%s lan:%s status:%d cur[%s] max[%s] syncFlag:[%s]";
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = java.lang.Integer.valueOf(tVar.hashCode());
        objArr[1] = java.lang.Long.valueOf(tVar.a().a());
        objArr[2] = java.lang.Integer.valueOf(tVar.f532924e);
        objArr[3] = iu4Var.f458868d;
        objArr[4] = iu4Var.f458871g;
        o45.zg mo47979x2d63726f3 = zVar.mo47979x2d63726f();
        objArr[5] = mo47979x2d63726f3 != null ? java.lang.Integer.valueOf(mo47979x2d63726f3.m150615xc9c28268()) : null;
        objArr[6] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(iu4Var.f458869e));
        objArr[7] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(iu4Var.f458870f));
        objArr[8] = java.lang.Integer.valueOf(iu4Var.f458873i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", str, objArr);
        tVar.f532940x = java.lang.System.currentTimeMillis();
        tVar.f532924e++;
        m48022x4479fa06().h(1002);
        t4.a.a("NewInitNetwork", zVar.hashCode());
        return mo9409x10f9447a(sVar, zVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneInit.dkInit", "init cancel by :%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        super.mo9408xae7a2e7a();
        this.f523606f.f532928i = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        m48022x4479fa06().h(1001);
        x11.t tVar = this.f523606f;
        tVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().o0(true);
        x11.f0 a17 = tVar.a();
        a17.getClass();
        a17.f532895c = new fp.j();
        a17.f532896d = android.os.SystemClock.elapsedRealtime();
        a17.f532897e = 0L;
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        r45.iu4 iu4Var = tVar.f532929m;
        iu4Var.f458868d = str;
        iz5.a.g("by DK: req.UserName is null", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        iu4Var.f458871g = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "onNewInitStartScene() called");
        tVar.f532927h = u0Var;
        return H(sVar, null, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getInfo */
    public java.lang.String mo47997xfb80cd24() {
        return this.f523605e.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getPriority */
    public int mo48001x3662b71a() {
        return 99;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 139;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        boolean z18;
        t4.a.b("NewInitNetwork", v0Var.hashCode());
        m48022x4479fa06().h(1010);
        boolean z19 = gm0.j1.e().a() == android.os.Looper.myLooper();
        this.f523605e.append(" endtime:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "summerinit onGYNetEnd [%d, %d, %s], tid:%d isWorker:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19));
        x11.t tVar = this.f523606f;
        tVar.getClass();
        tVar.f532939w += java.lang.System.currentTimeMillis() - tVar.f532940x;
        if (i18 == 4 && (i19 == -100 || i19 == -2023)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR hash:%d [%d,%d] KICK OUT : %s", java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            tVar.c(i18, i19, str);
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            w11.k0 k0Var = tVar.f532923d;
            if ((i18 == 0 && i19 == 0) || (i18 == 4 && i19 == -17)) {
                tVar.f532925f = 0;
                z18 = false;
            } else {
                int i27 = tVar.f532925f + 1;
                tVar.f532925f = i27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR consecutiveFailCount:%d hash:%d [%d,%d] %s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                if (tVar.f532925f >= 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneInit.dkInit", "onGYNetEnd ERROR consecutive fail reached max:%d, give up", 3);
                    tVar.c(3, -1, "");
                } else if (k0Var.H(k0Var.m47995xb7ba1aa7(), null, null) == -1) {
                    tVar.c(3, -1, "");
                }
                z18 = true;
            }
            if (!z18) {
                o45.ah mo13821x7f35c2d1 = v0Var.mo13821x7f35c2d1();
                o45.wh whVar = mo13821x7f35c2d1 instanceof o45.wh ? (o45.wh) mo13821x7f35c2d1 : null;
                r45.ju4 ju4Var = whVar != null ? whVar.f424568a : null;
                if (ju4Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneInit.dkInit", "resp is null");
                } else {
                    tVar.f532930n += ju4Var.f459648h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "onProcessResp hash:%d time:%d cmdSum:%d doscenecount:%d conFlag:%d", java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Long.valueOf(tVar.a().a()), java.lang.Integer.valueOf(tVar.f532930n), java.lang.Integer.valueOf(tVar.f532924e), java.lang.Integer.valueOf(ju4Var.f459646f));
                    java.util.Iterator it = ju4Var.f459649i.iterator();
                    while (it.hasNext()) {
                        r45.b50 b50Var = (r45.b50) it.next();
                        try {
                            if (b50Var.f452063d == 208) {
                                r45.aj6 aj6Var = new r45.aj6();
                                aj6Var.mo11468x92b714fd(x51.j1.d(b50Var.f452064e));
                                int i28 = aj6Var.f451590d;
                                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SYNC_CONTROL_USE_INIT_CONTACT_INT_SYNC, java.lang.Integer.valueOf(i28));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "processSyncControl() useInitContact:%s", java.lang.Integer.valueOf(i28));
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "processSyncControl() err", new java.lang.Object[0]);
                        }
                    }
                    mm.h hVar = mm.h.f410018a;
                    r45.ju4 ju4Var2 = ju4Var;
                    tVar.f(new x11.x(i18, i19, str, ju4Var, 0, 16, null));
                    if ((ju4Var2.f459646f & 7) == 0 || k0Var.mo48014x3a8bbc5f()) {
                        boolean b17 = tVar.b();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "NewInit FINISH onGYNetEnd hash:%d time:%d netCnt:%d isNeedBatchGetContact:" + b17 + " initCount:" + tVar.f532924e + " initDoSceneCost:" + tVar.f532939w, java.lang.Integer.valueOf(tVar.hashCode()), java.lang.Long.valueOf(tVar.a().a()), java.lang.Integer.valueOf(tVar.f532924e));
                        if (b17) {
                            x11.f0 a17 = tVar.a();
                            a17.getClass();
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordSupportInitRsp() called sessionId:" + a17.f532899g);
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55 c6790x79ba4f55 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55();
                                c6790x79ba4f55.f141220d = c6790x79ba4f55.b("reversion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
                                c6790x79ba4f55.f141233q = c6790x79ba4f55.b("sessionid", a17.f532899g, true);
                                x11.e0[] e0VarArr = x11.e0.f532890d;
                                c6790x79ba4f55.f141232p = 2;
                                c6790x79ba4f55.f141221e = a17.b();
                                x11.b0.f532883a.a(c6790x79ba4f55, null);
                                c6790x79ba4f55.k();
                            } catch (java.lang.Throwable th7) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th7, "recordSupportInitRsp err", new java.lang.Object[0]);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() called");
                            java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(1, x11.r.f532919d);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newFixedThreadPool);
                            p3325xe03a0797.p3326xc267989b.g2 g2Var = new p3325xe03a0797.p3326xc267989b.g2(newFixedThreadPool);
                            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                            if (c20976x6ba6452a != null) {
                                p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, g2Var, null, new x11.q(tVar, g2Var, null), 2, null);
                            }
                        } else {
                            tVar.e(true);
                        }
                    } else if (k0Var.H(k0Var.m47995xb7ba1aa7(), ju4Var2.f459644d, ju4Var2.f459645e) == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneInit.dkInit", "doScene Failed stop init");
                        tVar.e(false);
                    }
                }
            }
        }
        m48022x4479fa06().h(1011);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: profileEnabled */
    public boolean mo48012x6ea41958() {
        return q01.a1.f440792a.b();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 4000;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }
}
