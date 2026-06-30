package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class j2 extends com.tencent.mm.weapp_core.JsBridge {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n2 f47459a;

    public j2(com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var) {
        this.f47459a = n2Var;
    }

    @Override // com.tencent.mm.weapp_core.JsBridge
    public void fileSizeChangeEvent(java.lang.String filePath, long j17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var;
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem;
        com.tencent.mm.plugin.appbrand.appstorage.x1 storageSpaceStatistics;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = this.f47459a;
        synchronized (n2Var.f47506e) {
            e9Var = n2Var.f47504c;
        }
        if (e9Var == null || (fileSystem = e9Var.getFileSystem()) == null || (storageSpaceStatistics = fileSystem.getStorageSpaceStatistics()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) storageSpaceStatistics).g(filePath, j17, "");
    }

    @Override // com.tencent.mm.weapp_core.JsBridge
    public long getFolderUsedSize(java.lang.String dirPath) {
        com.tencent.mm.plugin.appbrand.e9 e9Var;
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem;
        com.tencent.mm.plugin.appbrand.appstorage.x1 storageSpaceStatistics;
        kotlin.jvm.internal.o.g(dirPath, "dirPath");
        com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = this.f47459a;
        synchronized (n2Var.f47506e) {
            e9Var = n2Var.f47504c;
        }
        if (e9Var == null || (fileSystem = e9Var.getFileSystem()) == null || (storageSpaceStatistics = fileSystem.getStorageSpaceStatistics()) == null) {
            return -1L;
        }
        return ((com.tencent.mm.plugin.appbrand.jsapi.file.n3) storageSpaceStatistics).c(dirPath, "");
    }

    @Override // com.tencent.mm.weapp_core.JsBridge
    public void requestUserAuth(long j17, java.lang.String apiName) {
        com.tencent.mm.plugin.appbrand.e9 e9Var;
        kotlin.jvm.internal.o.g(apiName, "apiName");
        com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = this.f47459a;
        synchronized (n2Var.f47506e) {
            e9Var = n2Var.f47504c;
        }
        if (e9Var == null) {
            return;
        }
        boolean z17 = false;
        java.util.Set c17 = ui1.t.f428082d.c(e9Var.getAppId(), false);
        if (c17 != null) {
            synchronized (c17) {
                z17 = c17.contains(apiName);
            }
        }
        if (!z17) {
            ui1.t.c(new ui1.a0(e9Var, apiName, null, null, 0), new com.tencent.luggage.sdk.jsapi.component.service.i2(n2Var, j17));
            return;
        }
        com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var.f47502a;
        if (jsBridge != null) {
            jsBridge.onUserAuthResult(j17, vp5.j.f439121d);
        } else {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
    }

    @Override // com.tencent.mm.weapp_core.JsBridge
    public void showJsApiBanAlert(java.lang.String apiName) {
        com.tencent.mm.plugin.appbrand.e9 e9Var;
        kotlin.jvm.internal.o.g(apiName, "apiName");
        com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = this.f47459a;
        synchronized (n2Var.f47506e) {
            e9Var = n2Var.f47504c;
        }
        if (e9Var == null) {
            return;
        }
        si1.o0.f408278a.F6(e9Var, apiName);
    }
}
