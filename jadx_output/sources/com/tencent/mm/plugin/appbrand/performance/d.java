package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask f87338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.performance.f f87339e;

    public d(com.tencent.mm.plugin.appbrand.performance.f fVar, com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask getStorageSizeTask) {
        this.f87339e = fVar;
        this.f87338d = getStorageSizeTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        ze.n nVar = this.f87339e.f87341d;
        com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask getStorageSizeTask = this.f87338d;
        com.tencent.mm.plugin.appbrand.performance.h.e(nVar, 401, com.tencent.mm.sdk.platformtools.t8.f0(getStorageSizeTask.f83341g));
        getStorageSizeTask.x();
    }
}
