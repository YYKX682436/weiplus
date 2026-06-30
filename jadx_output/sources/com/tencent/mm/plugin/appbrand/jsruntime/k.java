package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.n f83997d;

    public k(com.tencent.mm.plugin.appbrand.jsruntime.n nVar) {
        this.f83997d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.n nVar = this.f83997d;
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = nVar.f84020e;
        if (appBrandJsBridgeBinding != null) {
            appBrandJsBridgeBinding.destroyRuntime();
            nVar.f84020e = null;
        }
    }
}
