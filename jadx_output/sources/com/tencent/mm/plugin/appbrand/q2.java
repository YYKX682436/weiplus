package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87727d;

    public q2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f87727d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        xi1.d dVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f87727d;
        xi1.g windowAndroid = appBrandRuntime.getWindowAndroid();
        if (windowAndroid == null) {
            return;
        }
        k91.r m07 = appBrandRuntime.m0();
        if (m07 == null) {
            dVar = new xi1.d(appBrandRuntime.u0().f77279e, null, 0);
        } else {
            try {
                i17 = ik1.w.l(m07.a().f305715d);
            } catch (java.lang.Exception unused) {
                i17 = -16777216;
            }
            dVar = new xi1.d(appBrandRuntime.u0().f77279e, null, i17);
        }
        windowAndroid.setWindowDescription(dVar);
        l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.p2(this, windowAndroid, dVar), appBrandRuntime.u0().f77280f, l01.q0.f314787d);
    }
}
