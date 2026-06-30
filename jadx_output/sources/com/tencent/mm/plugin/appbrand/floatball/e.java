package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.i f78086e;

    public e(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.floatball.i iVar) {
        this.f78085d = appBrandRuntime;
        this.f78086e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.e(this.f78085d)) {
            return;
        }
        this.f78086e.x();
    }
}
