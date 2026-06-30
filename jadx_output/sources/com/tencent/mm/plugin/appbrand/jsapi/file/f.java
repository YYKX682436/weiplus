package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.file.l2 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f81055p = 0;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.file.h f81056f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f81057g;

    /* renamed from: h, reason: collision with root package name */
    public final long f81058h;

    /* renamed from: i, reason: collision with root package name */
    public final long f81059i;

    /* renamed from: m, reason: collision with root package name */
    public final long f81060m;

    /* renamed from: n, reason: collision with root package name */
    public long f81061n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.file.n3 f81062o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.appbrand.o6 rt6, com.tencent.mm.plugin.appbrand.jsapi.file.h config) {
        super(rt6, config);
        com.tencent.mm.plugin.appbrand.jsapi.file.i iVar;
        boolean z17;
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(config, "config");
        this.f81056f = config;
        java.lang.String appId = rt6.f74803n;
        this.f81057g = appId;
        this.f81058h = 314572800L;
        this.f81059i = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH;
        this.f81060m = 314572800L;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = rt6.S2(false);
        if (S2 != null) {
            S2.i();
            kotlin.jvm.internal.o.f(appId, "appId");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_dir_space_statics_enable, 0) == 1) {
                z17 = true;
            } else {
                com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
                if (a17 != null) {
                    z17 = a17.getBoolean("appbrand_enable_file_storage_space_statistics_for_" + appId, false);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                kotlin.jvm.internal.o.f(appId, "appId");
                com.tencent.mm.plugin.appbrand.jsapi.file.n3 n3Var = new com.tencent.mm.plugin.appbrand.jsapi.file.n3(appId);
                com.tencent.mm.sdk.platformtools.o4 a18 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
                n3Var.f81110f = a18 != null && a18.getBoolean("enable_appbrand_file_size_statistics_debug", false);
                this.f81062o = n3Var;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init WxaStorageSpaceStatisticsService ?  ");
        sb6.append(this.f81062o != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeFileSystemRegistry", sb6.toString());
        java.util.LinkedList linkedList = this.f76189d;
        java.util.Map map = i81.j.f289592a;
        linkedList.addFirst(i81.i.f289590a);
        if (rt6.e3()) {
            java.util.LinkedList linkedList2 = this.f76189d;
            java.lang.String a19 = kk.v.a(rt6.u0().f47279x0);
            kotlin.jvm.internal.o.f(a19, "getString(...)");
            com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = new com.tencent.mm.plugin.appbrand.appstorage.j3(com.tencent.mm.plugin.appbrand.jsapi.file.l2.h(a19, "magicbrushframedata"), "wxfile://magicbrushframedata");
            j3Var.f76227f = 10485760L;
            j3Var.initialize();
            linkedList2.addFirst(j3Var);
        }
        java.util.LinkedList linkedList3 = this.f76189d;
        kotlin.jvm.internal.o.f(linkedList3, "getOrderedFileSystemList(...)");
        kotlin.jvm.internal.o.f(appId, "appId");
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(appId, true);
        if (b17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList3.iterator();
            while (true) {
                jz5.l lVar = null;
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) it.next();
                if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.n1) {
                    com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = (com.tencent.mm.plugin.appbrand.appstorage.n1) u1Var;
                    n1Var.getClass();
                    lVar = new jz5.l("tmp", n1Var.f76276e);
                } else if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.j3) {
                    com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var2 = (com.tencent.mm.plugin.appbrand.appstorage.j3) u1Var;
                    java.lang.String str = j3Var2.f76226e;
                    kotlin.jvm.internal.o.f(str, "getPathPrefix(...)");
                    lVar = new jz5.l(r26.i0.t(str, "wxfile://", "", false), j3Var2.f76225d);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "unknown type: %s", u1Var.getClass().getSimpleName());
                }
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            pm0.v.K(null, new com.tencent.mm.plugin.appbrand.jsapi.file.a(arrayList, appId, b17));
        }
        com.tencent.mm.plugin.appbrand.appstorage.k0.f76246b.clear();
        ((java.util.LinkedHashMap) com.tencent.mm.plugin.appbrand.appstorage.k0.f76247c).clear();
        java.util.LinkedList linkedList4 = this.f76189d;
        kotlin.jvm.internal.o.f(linkedList4, "getOrderedFileSystemList(...)");
        java.util.Iterator it6 = linkedList4.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            iVar = com.tencent.mm.plugin.appbrand.jsapi.file.i.f81070a;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.u1) it6.next();
            boolean z18 = u1Var2 instanceof com.tencent.mm.plugin.appbrand.appstorage.n1;
            com.tencent.mm.plugin.appbrand.jsapi.file.n3 n3Var2 = this.f81062o;
            java.lang.String appId2 = this.f81057g;
            if (z18) {
                com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.n1) u1Var2;
                java.lang.String str2 = n1Var2.f76276e;
                if (str2 == null || str2.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "fs root path is null, skip");
                } else if (kotlin.jvm.internal.o.b(n1Var2.f76277f, "wxfile://")) {
                    com.tencent.mm.plugin.appbrand.appstorage.k0 k0Var = com.tencent.mm.plugin.appbrand.appstorage.k0.f76245a;
                    java.lang.String str3 = n1Var2.f76276e;
                    kotlin.jvm.internal.o.f(str3, "getRootPath(...)");
                    k0Var.d("temp", str3);
                    java.lang.String str4 = n1Var2.f76276e;
                    kotlin.jvm.internal.o.f(str4, "getRootPath(...)");
                    k0Var.d("saved_temp", str4);
                    kotlin.jvm.internal.o.f(appId2, "appId");
                    long b18 = !k0Var.b(appId2, "saved_temp") ? Long.MIN_VALUE : iVar.b(appId2, "saved_temp");
                    if (n3Var2 != null) {
                        java.lang.String str5 = n1Var2.f76276e;
                        kotlin.jvm.internal.o.f(str5, "getRootPath(...)");
                        kotlin.jvm.internal.o.d(u1Var2);
                        n3Var2.j(str5, new com.tencent.mm.plugin.appbrand.jsapi.file.m3((com.tencent.mm.plugin.appbrand.appstorage.n1) u1Var2), b18);
                    }
                    k0Var.c(appId2, "saved_temp");
                    n1Var2.f76279h = n3Var2;
                }
            } else if (u1Var2 instanceof com.tencent.mm.plugin.appbrand.appstorage.j3) {
                com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var3 = (com.tencent.mm.plugin.appbrand.appstorage.j3) u1Var2;
                java.lang.String str6 = j3Var3.f76225d;
                if (str6 == null || str6.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "fs root path is null, skip");
                } else if (kotlin.jvm.internal.o.b(j3Var3.f76226e, "wxfile://usr")) {
                    com.tencent.mm.plugin.appbrand.appstorage.k0 k0Var2 = com.tencent.mm.plugin.appbrand.appstorage.k0.f76245a;
                    java.lang.String str7 = j3Var3.f76225d;
                    kotlin.jvm.internal.o.f(str7, "getRootPath(...)");
                    k0Var2.d("normal_none_flatten", str7);
                    kotlin.jvm.internal.o.f(appId2, "appId");
                    long b19 = !k0Var2.b(appId2, "normal_none_flatten") ? Long.MIN_VALUE : iVar.b(appId2, "normal_none_flatten");
                    if (n3Var2 != null) {
                        java.lang.String str8 = j3Var3.f76225d;
                        kotlin.jvm.internal.o.f(str8, "getRootPath(...)");
                        n3Var2.j(str8, new com.tencent.mm.plugin.appbrand.jsapi.file.l3(), b19);
                    }
                    k0Var2.c(appId2, "normal_none_flatten");
                    j3Var3.f76228g = n3Var2;
                }
            }
        }
        java.lang.String appId3 = this.f81057g;
        kotlin.jvm.internal.o.f(appId3, "appId");
        this.f81061n = iVar.b(appId3, "temp");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeFileSystemRegistry", this.f81057g + " currentTempSize " + this.f81061n);
        com.tencent.mm.plugin.appbrand.jsapi.file.h hVar = this.f81056f;
        long j17 = (long) 1048576;
        this.f81058h = hVar.f81066f * j17;
        this.f81059i = hVar.f81067g * j17;
        this.f81060m = hVar.f81065e * j17;
        if (rt6.q2()) {
            com.tencent.mm.minigame.y.f69160h = new com.tencent.mm.plugin.appbrand.jsapi.file.e(new java.lang.ref.WeakReference(this), rt6.f74803n);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.l2, com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.vfs.r6 allocTempFile(java.lang.String str) {
        if (m(0L)) {
            return null;
        }
        return super.allocTempFile(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.l2, com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17;
        if (m(r6Var != null ? r6Var.C() : 0L)) {
            if (b0Var != null) {
                b0Var.f291824a = null;
            }
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        this.f81061n += r6Var != null ? r6Var.C() : 0L;
        long c17 = r6Var != null ? a06.d.c(r6Var.C() / 1024.0d) : -1L;
        com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = super.createTempFileFrom(r6Var, str, z17, b0Var);
        if (createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.OK && (b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f81057g, true)) != null) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileSingleAllocStatStruct a17 = com.tencent.mm.plugin.appbrand.jsapi.file.g.a(b17);
            a17.f62273h = c17;
            a17.k();
        }
        return createTempFileFrom;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.x1 getStorageSpaceStatistics() {
        return this.f81062o;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 getTempDirectory(ik1.b0 b0Var) {
        if (m(0L)) {
            if (b0Var != null) {
                b0Var.f291824a = null;
            }
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 tempDirectory = super.getTempDirectory(b0Var);
        kotlin.jvm.internal.o.f(tempDirectory, "getTempDirectory(...)");
        return tempDirectory;
    }

    public final boolean m(long j17) {
        long j18 = this.f81061n + j17;
        long j19 = this.f81058h;
        boolean z17 = j18 > j19;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.nfc.j.CTRL_INDEX, 225);
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "temp file size exceed limit! %d limit:%d", java.lang.Long.valueOf(this.f81061n + j17), java.lang.Long.valueOf(j19));
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        com.tencent.mm.plugin.appbrand.appstorage.k0 k0Var = com.tencent.mm.plugin.appbrand.appstorage.k0.f76245a;
        java.lang.String appId = this.f81057g;
        kotlin.jvm.internal.o.f(appId, "appId");
        k0Var.a(appId, this.f81059i, this.f81058h, this.f81060m);
        com.tencent.mm.plugin.appbrand.jsapi.file.n3 n3Var = this.f81062o;
        if (n3Var != null) {
            synchronized (n3Var.f81109e) {
                ((java.util.LinkedHashMap) n3Var.f81108d).clear();
                ((java.util.LinkedHashMap) n3Var.f81107c).clear();
            }
        }
        super.release();
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.g2, com.tencent.mm.plugin.appbrand.appstorage.u1
    public com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        this.f81061n -= r6Var != null ? r6Var.C() : 0L;
        com.tencent.mm.plugin.appbrand.appstorage.j1 saveFile = super.saveFile(r6Var, str, b0Var);
        kotlin.jvm.internal.o.f(saveFile, "saveFile(...)");
        return saveFile;
    }
}
