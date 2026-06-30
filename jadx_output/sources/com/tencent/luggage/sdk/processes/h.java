package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: g */
    public static final com.tencent.luggage.sdk.processes.e f47639g = new com.tencent.luggage.sdk.processes.e(null);

    /* renamed from: a */
    public final java.util.Set f47640a;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicBoolean f47641b;

    /* renamed from: c */
    public com.tencent.luggage.sdk.processes.LuggageServiceType f47642c;

    /* renamed from: d */
    public com.tencent.luggage.sdk.processes.LuggageServiceType f47643d;

    /* renamed from: e */
    public final com.tencent.mm.ipcinvoker.s0 f47644e;

    /* renamed from: f */
    public com.tencent.luggage.sdk.processes.b f47645f;

    public h() {
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        kotlin.jvm.internal.o.f(newSetFromMap, "newSetFromMap(...)");
        this.f47640a = newSetFromMap;
        this.f47641b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f47642c = com.tencent.luggage.sdk.processes.LuggageServiceType.f47628g;
        com.tencent.luggage.sdk.processes.LuggageServiceType.f47625d.getClass();
        this.f47643d = null;
        this.f47644e = new com.tencent.luggage.sdk.processes.f(this);
    }

    public static /* synthetic */ com.tencent.luggage.sdk.processes.s f(com.tencent.luggage.sdk.processes.h hVar, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findAppRecord");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        return hVar.e(str, i17);
    }

    public static /* synthetic */ void q(com.tencent.luggage.sdk.processes.h hVar, com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage luggageClientProcessMessage, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageToLuggageProcess");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        hVar.p(luggageClientProcessMessage, aVar);
    }

    public final void a() {
        com.tencent.luggage.sdk.processes.b bVar = this.f47645f;
        if (bVar != null) {
            java.util.Collection<java.lang.String> g17 = g();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "process " + ((com.tencent.mm.plugin.appbrand.app.i0) bVar).f75120a + " died, reset directory space[" + ((java.util.ArrayList) g17).size() + "]. ");
            for (java.lang.String appId : g17) {
                com.tencent.mm.vfs.r6 d17 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.d();
                if (d17 == null || !gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "[resetDirSpace] appId = " + appId + ", not ready.");
                } else {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsapi.file.l2.e() + appId);
                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(d17.u() + '/' + com.tencent.mm.plugin.appbrand.jsapi.file.l2.g(kk.v.a(gm0.j1.b().h()), appId));
                    java.lang.String u17 = r6Var2.u();
                    kotlin.jvm.internal.o.f(u17, "getPath(...)");
                    kotlin.jvm.internal.o.g(appId, "appId");
                    com.tencent.mm.autogen.mmdata.rpt.WAQuotaControlReportStruct wAQuotaControlReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WAQuotaControlReportStruct();
                    wAQuotaControlReportStruct.f62052d = wAQuotaControlReportStruct.b("appid", appId, true);
                    wAQuotaControlReportStruct.f62053e = 2;
                    wAQuotaControlReportStruct.f62054f = -1L;
                    wAQuotaControlReportStruct.f62055g = -1L;
                    wAQuotaControlReportStruct.f62056h = wAQuotaControlReportStruct.b(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, u17, true);
                    wAQuotaControlReportStruct.f62057i = wAQuotaControlReportStruct.b("fileOp", "", true);
                    wAQuotaControlReportStruct.f62058j = -1L;
                    wAQuotaControlReportStruct.k();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "[resetDirSpace] appId = " + appId + ", appFlattenRoot = " + r6Var.u() + ", appUsrRoot = " + r6Var2.u());
                    ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.app.k0(appId, r6Var, r6Var2));
                }
            }
        }
        this.f47640a.clear();
    }

    public final void b(com.tencent.luggage.sdk.processes.s record) {
        kotlin.jvm.internal.o.g(record, "record");
        boolean z17 = record.f47688e;
        java.lang.String appId = record.f47684a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Luggage.LuggageMiniProgramProcess", "detachApp: [%s][%d] is persistent, do not detach", appId, java.lang.Integer.valueOf(record.f47685b));
            return;
        }
        if (!this.f47640a.remove(record)) {
            com.tencent.mars.xlog.Log.w("Luggage.LuggageMiniProgramProcess", "detachApp: detach[%s] fail", record);
        }
        if (k()) {
            this.f47642c = com.tencent.luggage.sdk.processes.LuggageServiceType.f47628g;
        }
        com.tencent.luggage.sdk.processes.b bVar = this.f47645f;
        if (bVar != null) {
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessDiedWatcher[mountTest]", "process " + ((com.tencent.mm.plugin.appbrand.app.i0) bVar).f75120a + " app " + appId + " detached.");
        }
    }

    public final void c(java.lang.String excludeInstanceId, java.lang.String appId, boolean z17) {
        kotlin.jvm.internal.o.g(excludeInstanceId, "excludeInstanceId");
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set set = this.f47640a;
        for (java.lang.Object obj : set) {
            com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) obj;
            if (kotlin.jvm.internal.o.b(sVar.f47684a, appId) && !kotlin.jvm.internal.o.b(sVar.f47691h, excludeInstanceId)) {
                arrayList.add(obj);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        if (z17) {
            java.util.Iterator it = X0.iterator();
            while (it.hasNext()) {
                o((com.tencent.luggage.sdk.processes.s) it.next());
            }
        }
        set.removeAll(X0);
    }

    public final void d(java.lang.String appId, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set set = this.f47640a;
        for (java.lang.Object obj : set) {
            if (kotlin.jvm.internal.o.b(((com.tencent.luggage.sdk.processes.s) obj).f47684a, appId)) {
                arrayList.add(obj);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        if (z17) {
            java.util.Iterator it = X0.iterator();
            while (it.hasNext()) {
                o((com.tencent.luggage.sdk.processes.s) it.next());
            }
        }
        set.removeAll(X0);
    }

    public final com.tencent.luggage.sdk.processes.s e(java.lang.String appId, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.Iterator it = this.f47640a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) obj;
            if (kotlin.jvm.internal.o.b(sVar.f47684a, appId) && (-1 == i17 || sVar.f47685b == i17)) {
                break;
            }
        }
        return (com.tencent.luggage.sdk.processes.s) obj;
    }

    public final java.util.Collection g() {
        java.util.Set set = this.f47640a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.luggage.sdk.processes.s) it.next()).f47684a);
        }
        return new java.util.ArrayList(arrayList);
    }

    public final java.util.Collection h() {
        return new java.util.ArrayList(this.f47640a);
    }

    public final java.lang.String i() {
        return f47639g.a(((com.tencent.mm.plugin.appbrand.task.k) this).f89077h);
    }

    public final void j() {
        boolean z17;
        java.lang.String i17 = i();
        if (i17 != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f47641b;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (!u46.l.c(bm5.f1.a(), i17)) {
                try {
                    java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) systemService).getRunningAppProcesses().iterator();
                    while (it.hasNext()) {
                        java.lang.String str = it.next().processName;
                        if (str == null || !kotlin.jvm.internal.o.b(str, i17)) {
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("Luggage.LuggageMiniProgramProcess", "isProcessRunning: ", android.util.Log.getStackTraceString(e17));
                }
                z17 = false;
                atomicBoolean.set(z17);
            }
            z17 = true;
            atomicBoolean.set(z17);
        }
    }

    public final boolean k() {
        return this.f47640a.isEmpty();
    }

    public final boolean l() {
        return this.f47641b.get();
    }

    public abstract void m();

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.luggage.sdk.processes.s n(java.lang.String r17, boolean r18, int r19, java.lang.String r20, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r21) {
        /*
            r16 = this;
            r0 = r16
            r11 = r17
            r12 = r20
            java.lang.String r1 = "appId"
            kotlin.jvm.internal.o.g(r11, r1)
            java.lang.String r1 = "instanceId"
            kotlin.jvm.internal.o.g(r12, r1)
            java.lang.String r1 = "initConfig"
            r5 = r21
            kotlin.jvm.internal.o.g(r5, r1)
            r1 = 2
            r2 = 0
            r3 = 0
            com.tencent.luggage.sdk.processes.s r1 = f(r0, r11, r3, r1, r2)
            java.lang.String r13 = "Luggage.LuggageMiniProgramProcess"
            if (r1 == 0) goto L34
            boolean r2 = r1.f47688e
            r14 = r18
            if (r2 != r14) goto L36
            int r2 = r1.f47685b
            r3 = r19
            if (r2 != r3) goto L38
            java.lang.String r2 = "registerApp: use existed"
            com.tencent.mars.xlog.Log.i(r13, r2)
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
            com.tencent.mars.xlog.Log.i(r13, r2, r1)
            com.tencent.mm.plugin.appbrand.task.o r15 = new com.tencent.mm.plugin.appbrand.task.o
            com.tencent.luggage.sdk.processes.t r4 = com.tencent.luggage.sdk.processes.t.f47692d
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
            com.tencent.mars.xlog.Log.i(r13, r3, r2)
            r1.f47691h = r12
            java.util.Set r2 = r0.f47640a
            boolean r2 = r2.add(r1)
            if (r2 != 0) goto L95
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "registerApp: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = " already added"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.w(r13, r2)
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.processes.h.n(java.lang.String, boolean, int, java.lang.String, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):com.tencent.luggage.sdk.processes.s");
    }

    public abstract void o(com.tencent.luggage.sdk.processes.s sVar);

    public final void p(com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage message, yz5.a aVar) {
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.ipcinvoker.d0.d(i(), message, com.tencent.luggage.sdk.processes.b0.class, new com.tencent.luggage.sdk.processes.g(aVar));
    }

    public final void r(com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage message) {
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.ipcinvoker.d0.f(i(), message, com.tencent.luggage.sdk.processes.z.class);
    }

    public final void s() {
        com.tencent.mm.ipcinvoker.d0.f(i(), new com.tencent.mm.ipcinvoker.type.IPCString(i()), com.tencent.luggage.sdk.processes.a.class);
        com.tencent.mm.ipcinvoker.d0.a(i(), this.f47644e);
        this.f47641b.set(true);
    }

    public final void t(com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType) {
        if (!(luggageServiceType != com.tencent.luggage.sdk.processes.LuggageServiceType.f47628g)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f47643d != null) {
            throw new java.lang.IllegalStateException("const field");
        }
        this.f47643d = luggageServiceType;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LuggageMiniProgramProcess(appList=");
        sb6.append(this.f47640a);
        sb6.append(", isProcessAlive=");
        sb6.append(this.f47641b);
        sb6.append(", processName='");
        sb6.append(i());
        sb6.append("', usedAs=");
        sb6.append(this.f47642c);
        sb6.append(", isNoAppAttached=");
        sb6.append(k());
        sb6.append(", allAppId=");
        sb6.append(g());
        sb6.append(", supportType=");
        sb6.append(this.f47643d);
        sb6.append(", uiClass=");
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) this;
        sb6.append(kVar.f89077h);
        sb6.append(", pluginUIClass=");
        sb6.append(kVar.f89078i);
        sb6.append(')');
        return sb6.toString();
    }

    public final boolean u(com.tencent.luggage.sdk.processes.LuggageServiceType type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType = this.f47643d;
        com.tencent.luggage.sdk.processes.LuggageServiceType.f47625d.getClass();
        return luggageServiceType == null || this.f47643d == type;
    }
}
