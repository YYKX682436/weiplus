package zh1;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 f554425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12480x1c9fd528 f554427f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 c12479xe0723f03, zh1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12480x1c9fd528 c12480x1c9fd528) {
        this.f554425d = c12479xe0723f03;
        this.f554426e = nVar;
        this.f554427f = c12480x1c9fd528;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv4.g g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(7);
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, openMaterialTemplate is null");
            return;
        }
        java.lang.String str = g17.l() + "/app.html";
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        if (N != null) {
            if (!(N.length == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 c12479xe0723f03 = this.f554425d;
                bi1.g gVar = ((di1.f) this.f554426e.f554449h).f314163b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getOpenMaterialScene(...)");
                java.util.List<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21> appBrandOpenMaterialDetailModels = this.f554426e.f554447f.f167785g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
                ((ku5.t0) ku5.t0.f394148d).B(new zh1.i(this.f554427f, "file://" + str, c12479xe0723f03.m52087xc587783b(N, gVar, appBrandOpenMaterialDetailModels)));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, rawHtmlContent is empty");
    }
}
