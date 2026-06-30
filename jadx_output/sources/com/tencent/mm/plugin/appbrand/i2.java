package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78328d;

    public i2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f78328d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f78328d.z1(null, "performServiceReconnected");
    }
}
