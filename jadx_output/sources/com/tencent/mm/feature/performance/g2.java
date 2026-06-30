package com.tencent.mm.feature.performance;

/* loaded from: classes7.dex */
public class g2 implements ki.a {
    public g2(com.tencent.mm.feature.performance.c2 c2Var) {
    }

    @Override // ki.a
    public void a(int i17) {
        if (!j62.e.g().l("clicfg_matrix_trim_memory_appbrandsimpleimageloader_v2", true, false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "trim disabled");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "systemTrim: level %s", java.lang.Integer.valueOf(i17));
        l01.n nVar = (l01.n) l01.d0.f314761a.f314743e;
        synchronized (nVar.f314781a) {
            ((l01.m) nVar.f314781a).clear();
        }
    }

    @Override // ki.a
    public void b() {
        int size;
        if (!j62.e.g().l("clicfg_matrix_trim_memory_appbrandsimpleimageloader_v2", true, false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "trim disabled");
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        l01.b bVar = l01.d0.f314761a;
        l01.n nVar = (l01.n) bVar.f314743e;
        synchronized (nVar.f314781a) {
            size = ((com.tencent.mm.sdk.platformtools.r2) nVar.f314781a).size();
        }
        objArr[0] = java.lang.Integer.valueOf(size);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "backgroundTrim: %s", objArr);
        l01.n nVar2 = (l01.n) bVar.f314743e;
        synchronized (nVar2.f314781a) {
            ((l01.m) nVar2.f314781a).clear();
        }
    }
}
