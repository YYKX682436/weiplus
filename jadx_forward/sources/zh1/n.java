package zh1;

/* loaded from: classes8.dex */
public final class n implements zh1.v0 {

    /* renamed from: o, reason: collision with root package name */
    public static final zh1.a f554442o = new zh1.a(null);

    /* renamed from: p, reason: collision with root package name */
    public static bi1.g f554443p = null;

    /* renamed from: q, reason: collision with root package name */
    public static long f554444q = 2;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f554445d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f554446e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f554447f;

    /* renamed from: g, reason: collision with root package name */
    public final zh1.c1 f554448g;

    /* renamed from: h, reason: collision with root package name */
    public final zh1.w0 f554449h;

    /* renamed from: i, reason: collision with root package name */
    public ei1.b f554450i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 f554451m;

    /* renamed from: n, reason: collision with root package name */
    public zh1.u0 f554452n;

    public n(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.c1 launchAppBrandExecutor, zh1.w0 openMaterialReporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialReporter, "openMaterialReporter");
        this.f554445d = context;
        this.f554446e = k0Var;
        this.f554447f = openMaterialCollection;
        this.f554448g = launchAppBrandExecutor;
        this.f554449h = openMaterialReporter;
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).mo46316x322b85(this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "<init>, context is not lifecycle keeper");
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        ei1.b bVar = this.f554450i;
        if (bVar != null) {
            ((fi1.d) bVar).mo10668x2efc64();
        }
    }

    @Override // zh1.v0
    public void e(zh1.u0 u0Var) {
        this.f554452n = u0Var;
    }

    @Override // zh1.v0
    /* renamed from: hide */
    public void mo178968x30dd42() {
        ei1.b bVar = this.f554450i;
        if (bVar != null) {
            ((fi1.d) bVar).m129587x30dd42();
        }
    }

    @Override // zh1.v0
    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "showDirectly");
        di1.f fVar = (di1.f) this.f554449h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f314174m, "onLaunchListPageDirectly");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7127x99e920dc c17 = fVar.c();
        c17.p(fVar.f314173l);
        c17.f144437k = fVar.f314162a;
        c17.f144431e = 4L;
        c17.f144432f = fVar.a();
        c17.f144433g = fVar.b();
        c17.f144434h = 0L;
        c17.k();
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        ((gb0.n) kVar).wi(this.f554445d, new zh1.l(this));
    }

    @Override // zh1.v0
    /* renamed from: show */
    public void mo178969x35dafd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "show");
        ((di1.f) this.f554449h).e();
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        ((gb0.n) kVar).wi(this.f554445d, new zh1.l(this));
    }
}
