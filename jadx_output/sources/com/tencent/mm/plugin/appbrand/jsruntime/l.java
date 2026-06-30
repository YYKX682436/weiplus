package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.n f84002g;

    public l(com.tencent.mm.plugin.appbrand.jsruntime.n nVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f84002g = nVar;
        this.f83999d = i17;
        this.f84000e = str;
        this.f84001f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.n nVar = this.f84002g;
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = nVar.f84020e;
        int i17 = this.f83999d;
        if (appBrandJsBridgeBinding == null) {
            nVar.f84020e = new com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8Context", "nativeCreateRuntime triggered by invokeCallbackHandler callbackId[%d]", java.lang.Integer.valueOf(i17));
            nVar.f84020e.createRuntime(nVar.L(), nVar.G());
        }
        nVar.f84020e.invokeCallbackHandler(i17, this.f84000e, this.f84001f);
    }
}
