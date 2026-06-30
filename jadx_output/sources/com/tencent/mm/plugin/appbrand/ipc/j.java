package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI f78414d;

    public j(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI) {
        this.f78414d = appBrandProcessProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.tencent.mm.plugin.appbrand.ipc.i iVar = new com.tencent.mm.plugin.appbrand.ipc.i(this);
        ((vd0.j2) q1Var).getClass();
        int e17 = v24.o0.e(16777216L);
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI = this.f78414d;
        v24.o0.k(appBrandProcessProxyUI, appBrandProcessProxyUI.getString(e17), new v24.d0(appBrandProcessProxyUI, 16777216L, iVar), true);
    }
}
