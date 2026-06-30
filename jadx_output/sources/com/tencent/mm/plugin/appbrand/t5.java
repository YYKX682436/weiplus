package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f88965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC f88966e;

    public t5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, boolean z17) {
        this.f88966e = appBrandRuntimeContainerWC;
        this.f88965d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.f88966e;
        appBrandRuntimeContainerWC.getClass();
        boolean z17 = this.f88965d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "handleWxAssistantInner(%b)", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.tencent.mm.plugin.appbrand.wxassistant.c2 e07 = appBrandRuntimeContainerWC.e0();
            if (e07.getParent() != null) {
                ((android.view.ViewGroup) e07.getParent()).removeView(e07);
            }
            final java.util.HashSet hashSet = new java.util.HashSet();
            new java.util.LinkedList(appBrandRuntimeContainerWC.f74839r).forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$c
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    ze.n nVar = (ze.n) obj;
                    android.util.SparseIntArray sparseIntArray2 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
                    if (nVar.N0()) {
                        hashSet.add(nVar.u0().f());
                        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) nVar.K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class);
                        if (q2Var != null) {
                            q2Var.l1(com.tencent.mm.plugin.appbrand.wxassistant.b3.f92138g);
                        }
                    }
                }
            });
            hashSet.forEach(new com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$d());
            return;
        }
        android.view.ViewParent parent = appBrandRuntimeContainerWC.f74838q.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeContainerWC", "handleWxAssistant: containerParent:%s isn't ViewGroup", parent);
            return;
        }
        com.tencent.mm.plugin.appbrand.wxassistant.c2 e08 = appBrandRuntimeContainerWC.e0();
        if (e08.getParent() != null) {
            ((android.view.ViewGroup) e08.getParent()).removeView(e08);
        }
        ((android.view.ViewGroup) parent).addView(appBrandRuntimeContainerWC.e0(), new android.view.ViewGroup.LayoutParams(-1, -1));
    }
}
