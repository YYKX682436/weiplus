package cc2;

/* loaded from: classes3.dex */
public final class a implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f40464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f40465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f40466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40467e;

    public a(java.lang.ref.WeakReference weakReference, cm2.m0 m0Var, r45.ce0 ce0Var, gk2.e eVar, java.lang.String str) {
        this.f40463a = weakReference;
        this.f40464b = m0Var;
        this.f40465c = ce0Var;
        this.f40466d = eVar;
        this.f40467e = str;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        android.content.Context context = (android.content.Context) this.f40463a.get();
        if (!(appBundle instanceof l81.b1) || context == null) {
            return;
        }
        cm2.m0 data = this.f40464b;
        r45.ce0 ce0Var = this.f40465c;
        kotlin.jvm.internal.o.g(data, "data");
        android.content.res.Resources resources = context.getResources();
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        }
        int h07 = (int) ((ae2.in.f3688a.h0() / 100.0f) * f17);
        k91.s2 s2Var = k91.s2.f305761e;
        k91.t2 t2Var = k91.t2.f305768f;
        k91.y2 y2Var = k91.y2.f305828e;
        r45.ce0 ce0Var2 = data.E;
        l81.b1 b1Var = (l81.b1) appBundle;
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, h07, s2Var, true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(resources.getDimension(com.tencent.mm.R.dimen.z_), true, true, false, false, 24, null), true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), k91.s2.f305760d), t2Var, false, false, null, y2Var, ce0Var2 != null && ce0Var2.getInteger(5) == 1, false, null, true, 0, null, 0, 0, 0, false, false, false, null, false, zl2.q4.f473933a.h(ce0Var), (int) resources.getDimension(com.tencent.mm.R.dimen.f479706d1), false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -201366272, 2047, null);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        cm2.m0 m0Var = this.f40464b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String string = m0Var.f43368v.getString(26);
        if (string == null) {
            string = "";
        }
        jSONObject.put("cookies", string);
        appBrandLaunchReferrer.f77322d = 1;
        appBrandLaunchReferrer.f77325g = jSONObject.toString();
        b1Var.f317041s = appBrandLaunchReferrer;
        cc2.d dVar = cc2.d.f40478a;
        gk2.e eVar = this.f40466d;
        java.lang.String str = this.f40467e;
        java.lang.String appId = b1Var.f317014b;
        kotlin.jvm.internal.o.f(appId, "appId");
        dVar.b(eVar, str, appId);
        mm2.f6 f6Var = (mm2.f6) this.f40466d.a(mm2.f6.class);
        java.lang.String appId2 = b1Var.f317014b;
        kotlin.jvm.internal.o.f(appId2, "appId");
        f6Var.A = appId2;
        ((com.tencent.mm.feature.finder.live.z5) ((s40.a1) i95.n0.c(s40.a1.class))).Ai(b1Var);
    }
}
