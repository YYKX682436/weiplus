package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.weapp_core.JsBridge f47502a;

    /* renamed from: b, reason: collision with root package name */
    public final u81.f f47503b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.e9 f47504c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f47505d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f47506e = new java.lang.Object();

    public n2() {
        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f47502a = new com.tencent.luggage.sdk.jsapi.component.service.j2(this);
        this.f47503b = new com.tencent.luggage.sdk.jsapi.component.service.l2(this);
    }

    public final java.nio.ByteBuffer a(byte[] bArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.flip();
        return allocateDirect;
    }

    public final java.util.List b(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle = (com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle) entry.getValue();
            byte[] bArr = appRuntimeApiPermissionBundle.f87393d;
            kotlin.jvm.internal.o.f(bArr, "getForegroundBytes(...)");
            java.nio.ByteBuffer a17 = a(bArr);
            byte[] bArr2 = appRuntimeApiPermissionBundle.f87394e;
            kotlin.jvm.internal.o.f(bArr2, "getBackgroundBytes(...)");
            java.nio.ByteBuffer a18 = a(bArr2);
            byte[] bArr3 = appRuntimeApiPermissionBundle.f87395f;
            kotlin.jvm.internal.o.f(bArr3, "getSuspendBytes(...)");
            arrayList.add(new vp5.g(new vp5.f(a17, a18, a(bArr3)), str));
        }
        return arrayList;
    }

    public final void c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, long j17) {
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle2;
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle3;
        si1.h hVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f47505d = runtime;
        runtime.N.a(this.f47503b);
        synchronized (this.f47506e) {
            this.f47504c = runtime.C0();
        }
        ze.n nVar = (ze.n) runtime;
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("WeAppCoreJsApiBridge", "runtimeReady: permissionCtrl is null");
            return;
        }
        synchronized (gVar.f408251e) {
            appRuntimeApiPermissionBundle = gVar.f408252f;
        }
        byte[] bArr = appRuntimeApiPermissionBundle.f87393d;
        synchronized (gVar.f408251e) {
            appRuntimeApiPermissionBundle2 = gVar.f408252f;
        }
        byte[] bArr2 = appRuntimeApiPermissionBundle2.f87394e;
        synchronized (gVar.f408251e) {
            appRuntimeApiPermissionBundle3 = gVar.f408252f;
        }
        byte[] bArr3 = appRuntimeApiPermissionBundle3.f87395f;
        kotlin.jvm.internal.o.d(bArr);
        java.nio.ByteBuffer a17 = a(bArr);
        kotlin.jvm.internal.o.d(bArr2);
        java.nio.ByteBuffer a18 = a(bArr2);
        kotlin.jvm.internal.o.d(bArr3);
        vp5.f fVar = new vp5.f(a17, a18, a(bArr3));
        synchronized (gVar.f408253g) {
            java.util.HashMap hashMap = gVar.f408254h;
            hVar = (hashMap == null || hashMap.isEmpty()) ? null : new si1.h(gVar);
        }
        java.util.List<vp5.g> b17 = b(hVar);
        java.lang.String str = x51.o1.f452060m;
        if (str == null) {
            str = "";
        }
        boolean b18 = kotlin.jvm.internal.o.b(str, "1");
        com.tencent.mm.weapp_core.JsBridge jsBridge = this.f47502a;
        if (jsBridge == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = runtime.getFileSystem();
        if (fileSystem != null) {
            if (!(fileSystem instanceof com.tencent.mm.plugin.appbrand.appstorage.g2)) {
                throw new java.lang.IllegalStateException("getFileSystem not LuggageFileSystemRegistry".toString());
            }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appstorage.u1> linkedList = ((com.tencent.mm.plugin.appbrand.appstorage.g2) fileSystem).f76189d;
            kotlin.jvm.internal.o.f(linkedList, "getOrderedFileSystemList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var : linkedList) {
                if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.j3) {
                    com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = (com.tencent.mm.plugin.appbrand.appstorage.j3) u1Var;
                    java.lang.String str2 = j3Var.f76225d;
                    kotlin.jvm.internal.o.f(str2, "getRootPath(...)");
                    java.lang.String str3 = j3Var.f76226e;
                    kotlin.jvm.internal.o.f(str3, "getPathPrefix(...)");
                    arrayList.add(new vp5.e(false, str3, str2, j3Var.f76227f));
                } else if (u1Var instanceof com.tencent.mm.plugin.appbrand.appstorage.n1) {
                    com.tencent.mm.plugin.appbrand.appstorage.n1 n1Var = (com.tencent.mm.plugin.appbrand.appstorage.n1) u1Var;
                    java.lang.String str4 = n1Var.f76276e;
                    java.lang.String str5 = n1Var.f76277f;
                    kotlin.jvm.internal.o.d(str5);
                    kotlin.jvm.internal.o.d(str4);
                    arrayList.add(new vp5.e(true, str5, str4, 0L));
                }
            }
            jsBridge.onFsDataReady(arrayList);
        }
        long j18 = nVar.E0() == null ? 0L : nVar.E0().f305852r.pkgVersion;
        long j19 = nVar.E0() != null ? nVar.E0().f305852r.f75399d + 1 : 0L;
        java.lang.String str6 = nVar.f74803n;
        kotlin.jvm.internal.o.f(str6, "getAppId(...)");
        vp5.i iVar = new vp5.i(str6, j18, j19, j17, b18);
        com.tencent.mm.weapp_core.JsBridge jsBridge2 = this.f47502a;
        if (jsBridge2 == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        jsBridge2.runtimeReady(iVar, fVar, b17);
        com.tencent.luggage.sdk.jsapi.component.service.m2 m2Var = new com.tencent.luggage.sdk.jsapi.component.service.m2(this);
        synchronized (gVar.f408251e) {
            ((java.util.ArrayList) gVar.f408257k).add(m2Var);
        }
    }
}
