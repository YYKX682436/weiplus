package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes7.dex */
public class g2 implements ki.a {
    public g2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2 c2Var) {
    }

    @Override // ki.a
    public void a(int i17) {
        if (!j62.e.g().l("clicfg_matrix_trim_memory_appbrandsimpleimageloader_v2", true, false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "trim disabled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "systemTrim: level %s", java.lang.Integer.valueOf(i17));
        l01.n nVar = (l01.n) l01.d0.f396294a.f396276e;
        synchronized (nVar.f396314a) {
            ((l01.m) nVar.f396314a).mo143584x5a5b64d();
        }
    }

    @Override // ki.a
    public void b() {
        int m77804x35e001;
        if (!j62.e.g().l("clicfg_matrix_trim_memory_appbrandsimpleimageloader_v2", true, false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "trim disabled");
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        l01.b bVar = l01.d0.f396294a;
        l01.n nVar = (l01.n) bVar.f396276e;
        synchronized (nVar.f396314a) {
            m77804x35e001 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) nVar.f396314a).m77804x35e001();
        }
        objArr[0] = java.lang.Integer.valueOf(m77804x35e001);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginPerformance.AppBrandSimpleImageLoader.BackgroundTrim", "backgroundTrim: %s", objArr);
        l01.n nVar2 = (l01.n) bVar.f396276e;
        synchronized (nVar2.f396314a) {
            ((l01.m) nVar2.f396314a).mo143584x5a5b64d();
        }
    }
}
