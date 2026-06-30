package c61;

/* loaded from: classes10.dex */
public final class v2 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39339d;

    public v2(c61.l7 l7Var) {
        this.f39339d = l7Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        c61.l7 l7Var = this.f39339d;
        ((c61.p2) l7Var.f39134x0).getClass();
        com.tencent.mars.xlog.Log.e("FinderCommonService", "abandonAudioFocus not support!");
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        pm0.v.X(com.tencent.mm.plugin.finder.report.s1.f125341d);
        ms5.f.f331158a.a("onAppBackground");
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3924y0).getValue()).r()).intValue() == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "onAppBackground start delay scan");
            c61.k4 k4Var = l7Var.f39138y1;
            com.tencent.mm.sdk.platformtools.u3.l(k4Var);
            com.tencent.mm.sdk.platformtools.u3.i(k4Var, 300000L);
        }
        gt2.d dVar = gt2.d.f275379b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f275380a;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            ((gt2.a) entry.getValue()).f275375c = c01.id.c();
            dVar.b((java.lang.String) entry.getKey(), (gt2.a) entry.getValue(), "onAppBackground");
        }
        concurrentHashMap.clear();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        c61.l7 l7Var = this.f39339d;
        if (!((c61.p2) l7Var.f39134x0).qj()) {
            if (!(((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).f448088h.size() > 0)) {
                if (!(((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).f448089i.size() > 0)) {
                    return;
                }
            }
        }
        ((c61.p2) l7Var.f39134x0).getClass();
        com.tencent.mars.xlog.Log.e("FinderCommonService", "requestAudioFocus not support!");
    }
}
