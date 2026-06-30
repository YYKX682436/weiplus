package zh1;

/* loaded from: classes8.dex */
public abstract class v implements zh1.z0 {

    /* renamed from: n, reason: collision with root package name */
    public static final zh1.u f554478n = new zh1.u(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f554479d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f554480e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f554481f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f554482g;

    /* renamed from: h, reason: collision with root package name */
    public zh1.v0 f554483h;

    /* renamed from: i, reason: collision with root package name */
    public final zh1.c1 f554484i;

    /* renamed from: m, reason: collision with root package name */
    public final di1.f f554485m;

    public v(long j17, bi1.g openMaterialScene, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.v0 v0Var, zh1.c1 launchAppBrandExecutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
        this.f554479d = j17;
        this.f554480e = context;
        this.f554481f = bottomSheet;
        this.f554482g = openMaterialCollection;
        this.f554483h = v0Var;
        this.f554484i = launchAppBrandExecutor;
        this.f554485m = di1.g.a(j17, openMaterialScene, openMaterialCollection);
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).mo46316x322b85(this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "<init>, context is not lifecycle keeper");
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        zh1.v0 v0Var = this.f554483h;
        if (v0Var != null) {
            v0Var.mo178968x30dd42();
        }
        zh1.v0 v0Var2 = this.f554483h;
        if (v0Var2 != null) {
            v0Var2.mo10668x2efc64();
        }
    }
}
