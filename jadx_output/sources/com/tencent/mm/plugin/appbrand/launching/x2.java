package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x2 implements com.tencent.mm.plugin.appbrand.launching.l7, com.tencent.mm.plugin.appbrand.launching.b7 {
    public static com.tencent.mm.sdk.platformtools.o4 F1;
    public final boolean A;
    public volatile boolean A1;
    public final boolean B;
    public volatile boolean B1;
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo C;
    public volatile com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel C1;
    public final int D;
    public final java.util.Queue D1;
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer E;
    public final java.lang.String F;
    public final com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle G;
    public final int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f85360J;
    public final int K;
    public final int L;
    public final boolean M;
    public final java.lang.String N;
    public final long P;
    public final boolean Q;
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession R;
    public final com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle S;
    public volatile long T;
    public final java.util.List U;
    public final com.tencent.mm.sdk.event.IListener V;
    public final java.util.List W;
    public final com.tencent.mm.sdk.event.IListener X;
    public final com.tencent.mm.sdk.event.IListener Y;
    public final java.util.LinkedList Z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85361d;

    /* renamed from: e, reason: collision with root package name */
    public final long f85362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85363f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85364g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.i3 f85365h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f85366i;

    /* renamed from: l1, reason: collision with root package name */
    public volatile java.lang.Boolean f85367l1;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f85368m;

    /* renamed from: n, reason: collision with root package name */
    public volatile nm5.c f85369n;

    /* renamed from: o, reason: collision with root package name */
    public volatile long f85370o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f85371p;

    /* renamed from: p0, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.k9 f85372p0;

    /* renamed from: p1, reason: collision with root package name */
    public volatile java.util.HashMap f85373p1;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f85374q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f85375r;

    /* renamed from: s, reason: collision with root package name */
    public final int f85376s;

    /* renamed from: t, reason: collision with root package name */
    public final int f85377t;

    /* renamed from: u, reason: collision with root package name */
    public final int f85378u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f85379v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f85380w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer f85381x;

    /* renamed from: x0, reason: collision with root package name */
    public volatile boolean f85382x0;

    /* renamed from: x1, reason: collision with root package name */
    public volatile java.util.HashMap f85383x1;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f85384y;

    /* renamed from: y0, reason: collision with root package name */
    public volatile boolean f85385y0;

    /* renamed from: y1, reason: collision with root package name */
    public volatile boolean f85386y1;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f85387z;

    /* renamed from: z1, reason: collision with root package name */
    public volatile boolean f85388z1;
    public static final x.b E1 = new x.b();
    public static final nm5.c G1 = nm5.j.d(null, null, null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x2(java.lang.String r2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r4) {
        /*
            r1 = this;
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = com.tencent.mm.plugin.appbrand.appcache.x7.a()
            if (r0 != 0) goto La
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = com.tencent.mm.plugin.appbrand.appcache.e8.a()
        La:
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.x2.<init>(java.lang.String, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject):void");
    }

    public static c01.i8[] g(boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC) {
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        byte[] bArr;
        java.lang.String str = appBrandSysConfigWC.f305842e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mm.plugin.appbrand.appstorage.s(str));
        if (!z17 || ((appRuntimeApiPermissionBundle = appBrandSysConfigWC.A.f47301d) != null && (bArr = appRuntimeApiPermissionBundle.f87393d) != null && bArr.length >= 1073 && bArr[1072] == 1)) {
            long longValue = new kk.v(gm0.j1.b().h()).longValue();
            if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("hadTransferToEncryptMMKV#" + longValue + '#' + str, false)) {
                com.tencent.mm.plugin.appbrand.appstorage.h hVar = com.tencent.mm.plugin.appbrand.appstorage.h.f76191a;
                java.lang.String str2 = java.lang.Long.valueOf(longValue).longValue() + '#' + str + "#is_dirty";
                com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.appbrand.appstorage.h.f76192b;
                boolean z18 = o4Var.getBoolean(str2, false);
                com.tencent.mm.plugin.appbrand.appstorage.g gVar = com.tencent.mm.plugin.appbrand.appstorage.g.f76180d;
                boolean z19 = o4Var.getBoolean((java.lang.String) gVar.invoke(java.lang.Long.valueOf(longValue), str), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer", "[tryCleanDirty] isDirty[" + z18 + "]  hadBeenCleanedDirty[" + z19 + ']');
                if (z18 && !z19) {
                    ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).a(str);
                    o4Var.putBoolean((java.lang.String) gVar.invoke(java.lang.Long.valueOf(longValue), str), true);
                    hVar.a(longValue, str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEncryptMMKVStorageDirtyDataFixer", "[tryCleanDirty] finish clean");
                }
            }
            arrayList.add(new com.tencent.mm.plugin.appbrand.appstorage.b(str, w81.a.f443806a.a(str, gm0.j1.b().h())));
        }
        arrayList.add(new com.tencent.mm.plugin.appbrand.launching.r2(str));
        return (c01.i8[]) arrayList.toArray(new c01.i8[arrayList.size()]);
    }

    public static com.tencent.mm.plugin.appbrand.launching.x2 j(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.launching.x2 x2Var;
        x.b bVar = E1;
        synchronized (bVar) {
            x2Var = (com.tencent.mm.plugin.appbrand.launching.x2) bVar.getOrDefault(str, null);
        }
        return x2Var;
    }

    public static com.tencent.mm.plugin.appbrand.launching.x2 k(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.appbrand.launching.x2 x2Var;
        x.b bVar = E1;
        synchronized (bVar) {
            x2Var = (com.tencent.mm.plugin.appbrand.launching.x2) bVar.remove(str);
        }
        if (z17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Throwable());
            if (x2Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "pollStagingProcess appId(%s) type(%d) instanceId(%s), stacktrace=%s", x2Var.f85375r, java.lang.Integer.valueOf(x2Var.f85376s), str, stackTraceString);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "pollStagingProcess instanceId(%s) get NULL, stacktrace=%s", str, stackTraceString);
            }
        }
        return x2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:73|(4:75|(1:83)(1:79)|80|(1:82))|84|(4:86|(4:89|(3:91|92|93)(1:95)|94|87)|96|97)|98|(1:332)(7:102|(1:331)(1:106)|107|(6:109|(1:111)(1:329)|(5:311|312|(1:314)(3:(1:323)(1:318)|319|(1:321)(1:322))|114|(4:119|(1:121)(1:310)|122|(3:124|125|(12:127|(1:129)(1:307)|130|131|(1:133)(1:306)|134|135|136|137|(1:141)|142|(3:144|(6:148|(1:163)(1:152)|153|(1:155)|(1:162)(1:159)|(1:161))|164)(30:165|(1:167)|168|(5:170|(1:172)(1:178)|173|(1:175)(1:177)|176)|(2:180|(3:182|(1:184)(1:186)|185))|187|(2:190|(5:192|(1:194)(1:199)|195|(1:197)|198))|200|(1:202)(1:285)|203|(1:205)(1:284)|206|(1:208)(1:283)|209|(1:211)|212|(1:214)(1:282)|215|(1:217)|218|697|223|(3:225|6cb|(1:234)(1:259))(2:264|(1:266)(2:267|(2:269|(1:271)(1:272))(2:273|(1:275)(2:276|(1:278)))))|235|236|237|238|239|240|(0)(0)))(1:308))))|113|114|(5:117|119|(0)(0)|122|(0)))|330|125|(0)(0))|309|131|(0)(0)|134|135|136|137|(2:139|141)|142|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0762, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0763, code lost:
    
        if (r4 != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0765, code lost:
    
        com.tencent.mars.xlog.Log.e(r14, "fillConfig, get app pkg timeout, try fallback backup wxaattrs, username[%s] appId[%s] awaitTimeout[%d]", r13.f85374q, r13.f85375r, java.lang.Long.valueOf(r7));
        r0 = r13.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0778, code lost:
    
        if (r0 != null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x077a, code lost:
    
        r0 = r0.f77444d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x077e, code lost:
    
        com.tencent.mm.plugin.appbrand.c6.b(9, r13.f85375r, r0, r13.f85376s, r13.D);
        r13.A1 = true;
        r0 = r13.f85365h;
        r5 = new java.lang.Object[3];
        r5[0] = r13.f85374q;
        r5[1] = r13.f85375r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x079a, code lost:
    
        if (r0 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x079c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x079f, code lost:
    
        r5[2] = java.lang.Boolean.valueOf(r1);
        com.tencent.mars.xlog.Log.i(r14, "notifyFallbackBackupWxaAttrs username[%s] appId[%s] null==callback[%b]", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x07ab, code lost:
    
        if (r0 != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x07ad, code lost:
    
        ((com.tencent.mm.plugin.appbrand.launching.j1) r0).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07b2, code lost:
    
        r0 = new com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct();
        r0.f61893d = r0.b("Appid", r13.f85375r, true);
        r0.f61894e = r0.b("Username", r13.f85374q, true);
        r0.f61895f = r13.f85378u;
        r0.f61896g = r13.C.f77444d;
        r0.f61897h = ((k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(r12)).k1(r13.f85375r, "versionInfo").w0().f77444d;
        r0.f61898i = 1;
        r0.f61899j = ((com.tencent.mm.plugin.appbrand.launching.e9) r3).f84596a;
        r0.f61900k = r0.b("NetType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        r0.f61901l = 0;
        r0.f61902m = r0.b("InstanceId", r13.R.f88134d, true);
        r0.k();
        r1 = r13.R.f88134d;
        r2 = com.tencent.mm.plugin.appbrand.launching.d9.f84571a;
        kotlin.jvm.internal.o.g(r1, "instanceId");
        com.tencent.mm.plugin.appbrand.launching.d9.f84571a.put(r1, r0);
        com.tencent.mm.plugin.appbrand.launching.d9.b(r13.R.f88134d, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0838, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0839, code lost:
    
        com.tencent.mars.xlog.Log.e(r14, "fillConfig, report fallback get exception %s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x079e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x077d, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0843, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0912 A[Catch: Exception -> 0x091c, TRY_LEAVE, TryCatch #1 {Exception -> 0x091c, blocks: (B:41:0x089a, B:43:0x08a0, B:50:0x08bd, B:54:0x08dd, B:56:0x0912, B:58:0x08cc, B:59:0x08ae), top: B:40:0x089a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x08ae A[Catch: Exception -> 0x091c, TryCatch #1 {Exception -> 0x091c, blocks: (B:41:0x089a, B:43:0x08a0, B:50:0x08bd, B:54:0x08dd, B:56:0x0912, B:58:0x08cc, B:59:0x08ae), top: B:40:0x089a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nm5.c a() {
        /*
            Method dump skipped, instructions count: 2381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.x2.a():nm5.c");
    }

    public final void b(java.lang.String str, com.tencent.mm.plugin.appbrand.launching.h3 h3Var) {
        if (!this.f85366i || this.f85365h == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "inqueue CallbackEvent(%s) for appId:%s, instanceId:%s", str, this.f85375r, this.f85361d);
            ((java.util.concurrent.ConcurrentLinkedQueue) this.D1).add(android.util.Pair.create(str, h3Var));
            return;
        }
        if (f()) {
            return;
        }
        boolean a17 = h3Var.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "runCallbackEvent(%s) for appId:%s, instanceId:%s, return %b", str, this.f85375r, this.f85361d, java.lang.Boolean.valueOf(a17));
    }

    public final void c(java.lang.String str) {
        try {
            com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = this.C1;
            if (appBrandBackgroundFetchDataParcel != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "dispatchDeferredBackgroundFetchDataResponse(%s), instanceId:%s, appId:%s, updateTime:%d", str, this.f85361d, this.f85375r, java.lang.Long.valueOf(appBrandBackgroundFetchDataParcel.f76783m));
                com.tencent.mm.plugin.appbrand.ipc.m0.b(this.f85375r, appBrandBackgroundFetchDataParcel);
            }
        } finally {
            this.C1 = null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.b7
    public final boolean d() {
        return !this.f85360J.h();
    }

    public void e(java.lang.String str) {
        java.util.LinkedList linkedList;
        synchronized (this.Z) {
            linkedList = new java.util.LinkedList(this.Z);
            this.Z.clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "emitPendingPluginUpdateStatusChangeEventsToClientProcess, instanceId:%s, events.size:%d, reason:%s", this.f85361d, java.lang.Integer.valueOf(linkedList.size()), str);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.launching.wa waVar = (com.tencent.mm.plugin.appbrand.launching.wa) it.next();
            com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage.f84357n.b(this.f85361d, waVar.f85336a, waVar.f85337b, waVar.f85338c, waVar.f85339d);
        }
    }

    public final boolean f() {
        android.util.Pair pair;
        boolean a17;
        do {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) this.D1;
            if (concurrentLinkedQueue.isEmpty() || (pair = (android.util.Pair) concurrentLinkedQueue.poll()) == null) {
                return false;
            }
            java.lang.String str = (java.lang.String) pair.first;
            a17 = ((com.tencent.mm.plugin.appbrand.launching.h3) pair.second).a();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "runCallbackEvent(%s) for appId:%s, instanceId:%s, return %b", str, this.f85375r, this.f85361d, java.lang.Boolean.valueOf(a17));
        } while (!a17);
        return true;
    }

    public final void h(nm5.c cVar) {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = this.f85375r;
        objArr[1] = java.lang.Integer.valueOf(this.f85376s);
        objArr[2] = this.f85384y;
        objArr[3] = this.f85361d;
        objArr[4] = this.f85371p;
        objArr[5] = java.lang.Boolean.valueOf(this.f85365h != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch] onPrepareDone %s %d in mm process, sessionId:%s, instanceId:%s, receiverProcess:%s, callback?:%b", objArr);
        i(cVar);
        af.d dVar = af.d.f4444a;
        af.c b17 = dVar.b(this.f85361d, false);
        if (b17 instanceof ug1.c) {
            ((ug1.c) b17).b(this.R);
        }
        dVar.a(this.f85361d);
    }

    public final void i(nm5.c cVar) {
        this.f85369n = cVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) cVar.a(0);
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction appBrandLaunchErrorAction = (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction) cVar.a(1);
        if (this.f85372p0 != null) {
            if (appBrandSysConfigWC != null) {
                this.f85372p0.u0(appBrandSysConfigWC);
                appBrandSysConfigWC.A.f47304g = this.f85382x0;
                appBrandSysConfigWC.A.f47305h = this.f85385y0;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][permission] onResult, update permissionBundle[%s] username[%s] appId[%s] relyCommLibUpdate[%b] restartOnWxaAttrAsyncUpdatedByLaunch[%b]", appBrandSysConfigWC.A.f47301d, this.f85374q, this.f85375r, java.lang.Boolean.valueOf(this.f85382x0), java.lang.Boolean.valueOf(this.f85385y0));
            }
            appBrandLaunchErrorAction = com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.CREATOR.a(this.f85375r, this.f85376s, this.f85372p0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][permission] onResult, updated errorAction[%s] username[%s] appId[%s]", appBrandLaunchErrorAction, this.f85374q, this.f85375r);
            if (appBrandLaunchErrorAction != null) {
                appBrandSysConfigWC = null;
            }
        }
        if (this.f85373p1 != null && appBrandSysConfigWC != null) {
            appBrandSysConfigWC.B = this.f85373p1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate]] onResult, update permissionBundle[%s] username[%s] appId[%s]", appBrandSysConfigWC.A.f47301d, this.f85374q, this.f85375r);
        }
        if (this.f85383x1 != null && appBrandSysConfigWC != null) {
            java.util.HashMap hashMap = this.f85383x1;
            appBrandSysConfigWC.C = hashMap;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate]] onResult, update permissionBundle[%s] username[%s] appId[%s]", hashMap, this.f85374q, this.f85375r);
        }
        if (this.f85365h == null) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_ahead_parse_app_config, com.tencent.mm.sdk.platformtools.z.f193112h <= 671097855) || appBrandSysConfigWC == null || android.text.TextUtils.isEmpty(this.f85371p)) {
                return;
            }
            java.lang.String targetProcess = this.f85371p;
            com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs appBrandAppConfigParserHelper$AheadRequestArgs = new com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs(this.f85361d, this.f85375r, k91.l3.a(this.D), this.B, appBrandSysConfigWC.f305852r);
            kotlin.jvm.internal.o.g(targetProcess, "targetProcess");
            if (com.tencent.mm.sdk.platformtools.x2.o(targetProcess)) {
                com.tencent.mm.ipcinvoker.f.b(targetProcess, appBrandAppConfigParserHelper$AheadRequestArgs, com.tencent.mm.plugin.appbrand.launching.i.f84653a);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.i3 i3Var = this.f85365h;
        com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle = (com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle) cVar.a(2);
        com.tencent.mm.plugin.appbrand.launching.j1 j1Var = (com.tencent.mm.plugin.appbrand.launching.j1) i3Var;
        com.tencent.mm.ipcinvoker.r rVar = j1Var.f84681d;
        if (rVar != null) {
            java.lang.String str = j1Var.f84682e;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "AppBrandRuntimeProfile| startPrepare onResult %s", str);
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_PREPARE_DONE;
            appBrandPrepareTask$PrepareResult.f84387f = appBrandSysConfigWC;
            appBrandPrepareTask$PrepareResult.f84386e = appBrandLaunchErrorAction;
            appBrandPrepareTask$PrepareResult.f84388g = appStartupPerformanceReportBundle;
            rVar.a(appBrandPrepareTask$PrepareResult);
            if (appBrandSysConfigWC != null) {
                com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams = j1Var.f84683f;
                com.tencent.mm.plugin.appbrand.launching.p7 p7Var = new com.tencent.mm.plugin.appbrand.launching.p7(appBrandPrepareTask$PrepareParams.f84380d, str);
                if (appBrandPrepareTask$PrepareParams.f84381e || !com.tencent.mm.plugin.appbrand.appcache.g0.b(j1Var.f84684g)) {
                    p7Var.a(ne1.j.NO_UPDATE, 0, null, appBrandSysConfigWC.F1, appBrandSysConfigWC.G1);
                } else {
                    new com.tencent.mm.plugin.appbrand.launching.x4(appBrandPrepareTask$PrepareParams, p7Var).a();
                }
            } else {
                try {
                    com.tencent.mm.plugin.appbrand.config.q.n(k91.k4.f(str));
                } catch (java.lang.Exception unused) {
                }
            }
        }
        k(this.f85361d, false);
        e("notifyResult");
        c("notifyResult");
    }

    public final void l(int i17) {
        if (!this.I && "wxb6d22f922f37b35a".equals(this.f85375r) && com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f85376s)) {
            this.I = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z.CTRL_INDEX, i17);
            java.lang.String str = this.f85375r;
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.C;
            com.tencent.mm.plugin.appbrand.report.v0.i(str, wxaAttributes$WxaVersionInfo == null ? 0 : wxaAttributes$WxaVersionInfo.f77444d, this.f85376s, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z.CTRL_INDEX, i17, 1);
        }
    }

    public final void m() {
        if (this.f85366i) {
            return;
        }
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f85375r, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceGroup);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f85375r, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceProcess);
        this.f85366i = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.T = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch] startPrepare in mm appId[%s] type[%d] scene[%d], instanceId[%s], sessionId[%s]", this.f85375r, java.lang.Integer.valueOf(this.f85376s), java.lang.Integer.valueOf(this.f85378u), this.f85361d, this.f85384y);
        x.b bVar = E1;
        synchronized (bVar) {
            bVar.put(this.f85361d, this);
        }
        com.tencent.mm.plugin.appbrand.launching.g3 g3Var = new com.tencent.mm.plugin.appbrand.launching.g3(this.f85361d, this.R);
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(300L);
        g3Var.c(millis, millis);
        if (this.C != null) {
            new com.tencent.mm.sdk.platformtools.n3(java.lang.String.format(java.util.Locale.US, "AppLaunchPrepareProcess[%s %d]", this.f85375r, java.lang.Integer.valueOf(this.f85376s))).post(new com.tencent.mm.plugin.appbrand.launching.z2(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "startPrepare() NULL wxaVersionInfo username[%s], appId[%s]", this.f85374q, this.f85375r);
        com.tencent.mm.plugin.appbrand.launching.ib.a(com.tencent.mm.R.string.f490191ng, this);
        h(G1);
    }

    public x2(java.lang.String str, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        java.lang.String str2;
        bi1.e a17;
        java.lang.String str3 = appBrandInitConfigWC.f47278x;
        java.lang.String str4 = appBrandInitConfigWC.f77278d;
        int i17 = appBrandInitConfigWC.f77281g;
        int i18 = appBrandStatObject.f87788d;
        int i19 = appBrandStatObject.f87790f;
        java.lang.String str5 = appBrandInitConfigWC.f77283i;
        java.lang.String str6 = appBrandInitConfigWC.f47281y;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = appBrandInitConfigWC.D;
        java.lang.String str7 = appBrandInitConfigWC.f47276v;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = appBrandInitConfigWC.N;
        int i27 = appBrandInitConfigWC.f47284z;
        boolean z17 = appBrandInitConfigWC.G;
        boolean z18 = appBrandInitConfigWC.L1.c() && appBrandInitConfigWC.L1.f77361h;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = appBrandInitConfigWC.f77298k2;
        boolean z19 = z18;
        long j17 = appBrandInitConfigWC.I;
        boolean z27 = appBrandInitConfigWC.f77309v2;
        com.tencent.luggage.sdk.launching.p pVar = appBrandInitConfigWC.W1;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer = appBrandInitConfigWC.f77303p2;
        java.lang.String str8 = (1173 != appBrandStatObject.f87790f || (str2 = appBrandInitConfigWC.S) == null || (a17 = bi1.e.f20977h.a(str2)) == null) ? null : a17.f20978d;
        int i28 = appBrandInitConfigWC.K1;
        int i29 = appBrandInitConfigWC.N1;
        com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = appBrandInitConfigWC.f47268a2;
        boolean z28 = appBrandInitConfigWC.V1;
        java.lang.String str9 = appBrandStatObject.f87791g;
        long j18 = appBrandInitConfigWC.f77310w2;
        boolean c17 = n91.t.c(appBrandInitConfigWC);
        int i37 = appBrandInitConfigWC.P1;
        boolean z29 = appBrandInitConfigWC.f47285z1;
        this.f85370o = -1L;
        this.I = false;
        this.U = new java.util.concurrent.CopyOnWriteArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.V = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KV14609ReportEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$1
            {
                this.__eventId = -356225563;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KV14609ReportEvent kV14609ReportEvent) {
                com.tencent.mm.autogen.events.KV14609ReportEvent kV14609ReportEvent2 = kV14609ReportEvent;
                com.tencent.mm.plugin.appbrand.launching.x2 x2Var = com.tencent.mm.plugin.appbrand.launching.x2.this;
                boolean equals = x2Var.f85375r.equals(kV14609ReportEvent2.f54451g.f6157a.f88029g);
                java.util.List list = x2Var.U;
                com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession2 = x2Var.R;
                am.ai aiVar = kV14609ReportEvent2.f54451g;
                if (equals) {
                    int i38 = x2Var.C.f77444d;
                    com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var = aiVar.f6157a;
                    if (i38 == kv_14609Var.f88033n) {
                        kv_14609Var.A = qualitySession2.f88134d;
                        kv_14609Var.B = qualitySession2.f88137g;
                        kv_14609Var.C = qualitySession2.f88138h;
                        kv_14609Var.f88027e = qualitySession2;
                        ((java.util.concurrent.CopyOnWriteArrayList) list).add(kv_14609Var);
                        ((com.tencent.mm.plugin.appbrand.report.model.p0) aiVar.f6158b).f88066b = true;
                        return true;
                    }
                }
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var2 = aiVar.f6157a;
                if (kv_14609Var2.f88045z != 6) {
                    return false;
                }
                ((java.util.concurrent.CopyOnWriteArrayList) list).add(kv_14609Var2);
                aiVar.f6157a.f88027e = qualitySession2;
                ((com.tencent.mm.plugin.appbrand.report.model.p0) aiVar.f6158b).f88066b = true;
                return true;
            }
        };
        this.W = new java.util.concurrent.CopyOnWriteArrayList();
        this.X = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$2
            {
                this.__eventId = 1901080293;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent wxaGetDownloadUrlReportEvent) {
                com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent wxaGetDownloadUrlReportEvent2 = wxaGetDownloadUrlReportEvent;
                com.tencent.mm.plugin.appbrand.launching.x2 x2Var = com.tencent.mm.plugin.appbrand.launching.x2.this;
                if (x2Var.f85375r.equals(((r45.os3) wxaGetDownloadUrlReportEvent2.f54998g.f8510a.f75983o.f70710a.f70684a).f382481e)) {
                    int i38 = x2Var.C.f77444d;
                    am.z20 z20Var = wxaGetDownloadUrlReportEvent2.f54998g;
                    com.tencent.mm.protobuf.f fVar = z20Var.f8510a.f75983o.f70710a.f70684a;
                    if (i38 == ((r45.os3) fVar).f382482f && (((r45.os3) fVar).f382484h == 0 || ((r45.os3) fVar).f382484h == 4)) {
                        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct weAppQualitySystemGetDownloadCGIStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct();
                        weAppQualitySystemGetDownloadCGIStruct.f62740g = cm.j0.release;
                        long j19 = z20Var.f8513d;
                        long j27 = z20Var.f8512c;
                        weAppQualitySystemGetDownloadCGIStruct.f62742i = j19 - j27;
                        weAppQualitySystemGetDownloadCGIStruct.f62744k = j27;
                        weAppQualitySystemGetDownloadCGIStruct.f62745l = j19;
                        weAppQualitySystemGetDownloadCGIStruct.f62746m = th1.a.b(z20Var.f8511b) ? cm.k0.ok : cm.k0.common_fail;
                        weAppQualitySystemGetDownloadCGIStruct.f62747n = com.tencent.mm.plugin.appbrand.report.quality.u.c();
                        weAppQualitySystemGetDownloadCGIStruct.f62751r = weAppQualitySystemGetDownloadCGIStruct.b("NetworkTypeStr", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
                        ((java.util.concurrent.CopyOnWriteArrayList) x2Var.W).add(weAppQualitySystemGetDownloadCGIStruct);
                        return true;
                    }
                }
                return false;
            }
        };
        this.Y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxaGetTestDownloadUrlReportEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$3
            {
                this.__eventId = 1694589719;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WxaGetTestDownloadUrlReportEvent wxaGetTestDownloadUrlReportEvent) {
                java.lang.String str10 = com.tencent.mm.plugin.appbrand.launching.x2.this.f85375r;
                wxaGetTestDownloadUrlReportEvent.f54999g.getClass();
                throw null;
            }
        };
        this.Z = new java.util.LinkedList();
        this.f85367l1 = null;
        this.f85383x1 = null;
        this.f85386y1 = false;
        this.f85388z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = null;
        this.D1 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f85371p = str;
        this.f85374q = str3;
        this.f85375r = str4;
        this.f85376s = i17;
        this.f85377t = i18;
        this.f85378u = i19;
        this.f85379v = str5;
        this.f85380w = str6;
        this.f85381x = appBrandLaunchReferrer;
        this.f85384y = str7;
        this.f85387z = iCommLibReader;
        java.lang.String str10 = qualitySession.f88134d;
        this.f85361d = str10;
        this.f85362e = j17;
        this.f85363f = z27;
        this.f85360J = pVar;
        this.E = appBrandLaunchFromNotifyReferrer;
        this.F = str8;
        this.K = i28;
        this.L = i29;
        this.G = appBrandRuntimeReloadReportBundle;
        this.f85364g = c17;
        iz5.a.d("<init> NULL wxaVersionInfo " + str4, wxaAttributes$WxaVersionInfo);
        this.C = wxaAttributes$WxaVersionInfo;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = str4;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(wxaAttributes$WxaVersionInfo.f77444d);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str7;
        objArr[7] = str10;
        objArr[8] = java.lang.Boolean.valueOf(z27);
        boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[9] = str5 == null ? "" : str5;
        objArr[10] = str6 == null ? "" : str6;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "<init> receiverProcessName[%s] username[%s] appId[%s] versionType[%d] appVersion[%d], scene[%d] sessionId[%s] instanceId[%s] mIsLaunchedByBackupWxaAttrs[%b] path[%s], entryModule[%s]", objArr);
        if (iCommLibReader == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "<init> NULL acceptedLibReader, instanceId[%s]", str10);
        }
        this.D = i27;
        this.A = z17;
        this.B = z19;
        this.R = qualitySession;
        this.S = new com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle(qualitySession.f88134d);
        this.M = z28;
        this.N = str9;
        this.P = j18;
        this.H = i37;
        this.Q = z29;
        com.tencent.mm.plugin.appbrand.report.w0.a(str4, i27);
    }
}
