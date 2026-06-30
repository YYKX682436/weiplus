package cc2;

/* loaded from: classes3.dex */
public final class c implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f40476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2.e f40477c;

    public c(java.lang.ref.WeakReference weakReference, r45.ce0 ce0Var, gk2.e eVar) {
        this.f40475a = weakReference;
        this.f40476b = ce0Var;
        this.f40477c = eVar;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        android.content.Context context = (android.content.Context) this.f40475a.get();
        if (!(appBundle instanceof l81.b1) || context == null) {
            return;
        }
        l81.b1 b1Var = (l81.b1) appBundle;
        b1Var.f317032k = 1177;
        r45.ce0 page = this.f40476b;
        kotlin.jvm.internal.o.g(page, "page");
        android.content.res.Resources resources = context.getResources();
        boolean z17 = page.getInteger(5) == 1;
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        }
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, (int) ((ae2.in.f3688a.h0() / 100.0f) * f17), k91.s2.f305761e, true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(resources.getDimension(com.tencent.mm.R.dimen.z_), true, true, false, false, 24, null), true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), k91.s2.f305760d), z17 ? k91.t2.f305767e : k91.t2.f305768f, false, z17, null, k91.y2.f305827d, !z17, true, null, true, 0, null, 0, 0, 0, false, false, false, null, false, zl2.q4.f473933a.h(page), (int) resources.getDimension(com.tencent.mm.R.dimen.f479706d1), false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -469810176, 2047, null);
        mm2.f6 f6Var = (mm2.f6) this.f40477c.a(mm2.f6.class);
        java.lang.String appId = b1Var.f317014b;
        kotlin.jvm.internal.o.f(appId, "appId");
        f6Var.A = appId;
        ((com.tencent.mm.feature.finder.live.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Ai(b1Var);
    }
}
