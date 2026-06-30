package zh1;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f554392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f554394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554395h;

    public b(zh1.n nVar, yz5.q qVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f554391d = nVar;
        this.f554392e = qVar;
        this.f554393f = str;
        this.f554394g = i17;
        this.f554395h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh1.n nVar = this.f554391d;
        ei1.b bVar = nVar.f554450i;
        if (bVar != null) {
            ((fi1.d) bVar).m129587x30dd42();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21) this.f554392e.mo147xb9724478(this.f554393f, java.lang.Integer.valueOf(this.f554394g), this.f554395h);
        if (c12474x8b872a21 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "launch#buildHybridBottomSheet, openMaterialModel is null");
        } else {
            ((di1.f) nVar.f554449h).f(c12474x8b872a21);
        }
        java.lang.String str = this.f554393f;
        int i17 = this.f554394g;
        java.lang.String str2 = this.f554395h;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, appId: " + str + ", versionType: " + i17 + ", enterPath: " + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, appBrandLauncher is null");
        } else {
            nVar.f554448g.a(new zh1.m(h6Var, nVar, str, i17, str2));
        }
    }
}
