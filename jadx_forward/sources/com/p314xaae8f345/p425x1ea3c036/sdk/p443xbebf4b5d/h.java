package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: g */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.e f129172g = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.e(null);

    /* renamed from: a */
    public final java.util.Set f129173a;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicBoolean f129174b;

    /* renamed from: c */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 f129175c;

    /* renamed from: d */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 f129176d;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.p794xb0fa9b5e.s0 f129177e;

    /* renamed from: f */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.b f129178f;

    public h() {
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newSetFromMap, "newSetFromMap(...)");
        this.f129173a = newSetFromMap;
        this.f129174b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f129175c = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129158d.getClass();
        this.f129176d = null;
        this.f129177e = new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.f(this);
    }

    public static /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findAppRecord");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        return hVar.e(str, i17);
    }

    public static /* synthetic */ void q(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479 abstractC3942x17b79479, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageToLuggageProcess");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        hVar.p(abstractC3942x17b79479, aVar);
    }

    public final void a() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.b bVar = this.f129178f;
        if (bVar != null) {
            java.util.Collection<java.lang.String> g17 = g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "process " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.i0) bVar).f156653a + " died, reset directory space[" + ((java.util.ArrayList) g17).size() + "]. ");
            for (java.lang.String appId : g17) {
                com.p314xaae8f345.mm.vfs.r6 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.d();
                if (d17 == null || !gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "[resetDirSpace] appId = " + appId + ", not ready.");
                } else {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e() + appId);
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(d17.u() + '/' + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.g(kk.v.a(gm0.j1.b().h()), appId));
                    java.lang.String u17 = r6Var2.u();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getPath(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7041x51bce378 c7041x51bce378 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7041x51bce378();
                    c7041x51bce378.f143585d = c7041x51bce378.b("appid", appId, true);
                    c7041x51bce378.f143586e = 2;
                    c7041x51bce378.f143587f = -1L;
                    c7041x51bce378.f143588g = -1L;
                    c7041x51bce378.f143589h = c7041x51bce378.b(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, u17, true);
                    c7041x51bce378.f143590i = c7041x51bce378.b("fileOp", "", true);
                    c7041x51bce378.f143591j = -1L;
                    c7041x51bce378.k();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "[resetDirSpace] appId = " + appId + ", appFlattenRoot = " + r6Var.u() + ", appUsrRoot = " + r6Var2.u());
                    ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.k0(appId, r6Var, r6Var2));
                }
            }
        }
        this.f129173a.clear();
    }

    public final void b(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        boolean z17 = record.f129221e;
        java.lang.String appId = record.f129217a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcess", "detachApp: [%s][%d] is persistent, do not detach", appId, java.lang.Integer.valueOf(record.f129218b));
            return;
        }
        if (!this.f129173a.remove(record)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageMiniProgramProcess", "detachApp: detach[%s] fail", record);
        }
        if (k()) {
            this.f129175c = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.b bVar = this.f129178f;
        if (bVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "process " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.i0) bVar).f156653a + " app " + appId + " detached.");
        }
    }

    public final void c(java.lang.String excludeInstanceId, java.lang.String appId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeInstanceId, "excludeInstanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set set = this.f129173a;
        for (java.lang.Object obj : set) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f129217a, appId) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f129224h, excludeInstanceId)) {
                arrayList.add(obj);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        if (z17) {
            java.util.Iterator it = X0.iterator();
            while (it.hasNext()) {
                o((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next());
            }
        }
        set.removeAll(X0);
    }

    public final void d(java.lang.String appId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set set = this.f129173a;
        for (java.lang.Object obj : set) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj).f129217a, appId)) {
                arrayList.add(obj);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        if (z17) {
            java.util.Iterator it = X0.iterator();
            while (it.hasNext()) {
                o((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next());
            }
        }
        set.removeAll(X0);
    }

    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s e(java.lang.String appId, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.Iterator it = this.f129173a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f129217a, appId) && (-1 == i17 || sVar.f129218b == i17)) {
                break;
            }
        }
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj;
    }

    public final java.util.Collection g() {
        java.util.Set set = this.f129173a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next()).f129217a);
        }
        return new java.util.ArrayList(arrayList);
    }

    public final java.util.Collection h() {
        return new java.util.ArrayList(this.f129173a);
    }

    public final java.lang.String i() {
        return f129172g.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) this).f170610h);
    }

    public final void j() {
        boolean z17;
        java.lang.String i17 = i();
        if (i17 != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f129174b;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (!u46.l.c(bm5.f1.a(), i17)) {
                try {
                    java.lang.Object systemService = context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) systemService).getRunningAppProcesses().iterator();
                    while (it.hasNext()) {
                        java.lang.String str = it.next().processName;
                        if (str == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, i17)) {
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.LuggageMiniProgramProcess", "isProcessRunning: ", android.util.Log.getStackTraceString(e17));
                }
                z17 = false;
                atomicBoolean.set(z17);
            }
            z17 = true;
            atomicBoolean.set(z17);
        }
    }

    public final boolean k() {
        return this.f129173a.isEmpty();
    }

    public final boolean l() {
        return this.f129174b.get();
    }

    public abstract void m();

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s n(java.lang.String r17, boolean r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 r21) {
        /*
            r16 = this;
            r0 = r16
            r11 = r17
            r12 = r20
            java.lang.String r1 = "appId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r1)
            java.lang.String r1 = "instanceId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r1)
            java.lang.String r1 = "initConfig"
            r5 = r21
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r1)
            r1 = 2
            r2 = 0
            r3 = 0
            com.tencent.luggage.sdk.processes.s r1 = f(r0, r11, r3, r1, r2)
            java.lang.String r13 = "Luggage.LuggageMiniProgramProcess"
            if (r1 == 0) goto L34
            boolean r2 = r1.f129221e
            r14 = r18
            if (r2 != r14) goto L36
            int r2 = r1.f129218b
            r3 = r19
            if (r2 != r3) goto L38
            java.lang.String r2 = "registerApp: use existed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r2)
            goto L60
        L34:
            r14 = r18
        L36:
            r3 = r19
        L38:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "registerApp: createRecord stack:[%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r2, r1)
            com.tencent.mm.plugin.appbrand.task.o r15 = new com.tencent.mm.plugin.appbrand.task.o
            com.tencent.luggage.sdk.processes.t r4 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.t.f129225d
            r7 = 0
            r8 = 0
            r9 = 96
            r10 = 0
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r15
        L60:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r18)
            int r3 = r1.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r2, r3, r12}
            java.lang.String r3 = "registerApp: appId[%s]isPersistent[%s]record_hash[%s]instanceId[%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r3, r2)
            r1.f129224h = r12
            java.util.Set r2 = r0.f129173a
            boolean r2 = r2.add(r1)
            if (r2 != 0) goto L95
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "registerApp: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = " already added"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r13, r2)
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.n(java.lang.String, boolean, int, java.lang.String, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):com.tencent.luggage.sdk.processes.s");
    }

    public abstract void o(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar);

    public final void p(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479 message, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(i(), message, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.b0.class, new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.g(aVar));
    }

    public final void r(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479 message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(i(), message, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.z.class);
    }

    public final void s() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(i(), new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(i()), com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.a.class);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.a(i(), this.f129177e);
        this.f129174b.set(true);
    }

    public final void t(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99) {
        if (!(enumC3941xa739ed99 != com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f129176d != null) {
            throw new java.lang.IllegalStateException("const field");
        }
        this.f129176d = enumC3941xa739ed99;
    }

    /* renamed from: toString */
    public java.lang.String m32227x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LuggageMiniProgramProcess(appList=");
        sb6.append(this.f129173a);
        sb6.append(", isProcessAlive=");
        sb6.append(this.f129174b);
        sb6.append(", processName='");
        sb6.append(i());
        sb6.append("', usedAs=");
        sb6.append(this.f129175c);
        sb6.append(", isNoAppAttached=");
        sb6.append(k());
        sb6.append(", allAppId=");
        sb6.append(g());
        sb6.append(", supportType=");
        sb6.append(this.f129176d);
        sb6.append(", uiClass=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) this;
        sb6.append(kVar.f170610h);
        sb6.append(", pluginUIClass=");
        sb6.append(kVar.f170611i);
        sb6.append(')');
        return sb6.toString();
    }

    public final boolean u(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99 = this.f129176d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129158d.getClass();
        return enumC3941xa739ed99 == null || this.f129176d == type;
    }
}
