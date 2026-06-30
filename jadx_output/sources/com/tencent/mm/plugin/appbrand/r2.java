package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.oc f87746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87749g;

    public r2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.oc ocVar, int i17, int i18) {
        this.f87749g = appBrandRuntime;
        this.f87746d = ocVar;
        this.f87747e = i17;
        this.f87748f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "addKeyEventObserver#scheduled");
        int i17 = this.f87747e;
        com.tencent.mm.plugin.appbrand.oc ocVar = this.f87746d;
        ocVar.f86244b = i17;
        int i18 = this.f87748f;
        ocVar.f86243a = i18;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f87749g;
        boolean z17 = appBrandRuntime.S1.get(i18) != null;
        java.util.Set copyOnWriteArraySet = z17 ? (java.util.Set) appBrandRuntime.S1.get(ocVar.f86243a) : new java.util.concurrent.CopyOnWriteArraySet();
        copyOnWriteArraySet.add(ocVar);
        if (z17) {
            return;
        }
        appBrandRuntime.S1.put(ocVar.f86243a, copyOnWriteArraySet);
    }
}
