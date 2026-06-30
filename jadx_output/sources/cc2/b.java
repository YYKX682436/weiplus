package cc2;

/* loaded from: classes3.dex */
public final class b implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f40469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f40470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f40471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f40472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f40473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40474g;

    public b(java.lang.ref.WeakReference weakReference, cm2.m0 m0Var, r45.ce0 ce0Var, boolean z17, kotlin.jvm.internal.f0 f0Var, gk2.e eVar, java.lang.String str) {
        this.f40468a = weakReference;
        this.f40469b = m0Var;
        this.f40470c = ce0Var;
        this.f40471d = z17;
        this.f40472e = f0Var;
        this.f40473f = eVar;
        this.f40474g = str;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        boolean z17;
        int i17;
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        android.content.Context context = (android.content.Context) this.f40468a.get();
        if (!(appBundle instanceof l81.b1) || context == null) {
            return;
        }
        cm2.m0 data = this.f40469b;
        r45.ce0 ce0Var = this.f40470c;
        boolean z18 = this.f40471d;
        kotlin.jvm.internal.o.g(data, "data");
        android.content.res.Resources resources = context.getResources();
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        }
        int h07 = (int) ((ae2.in.f3688a.h0() / 100.0f) * f17);
        k91.s2 s2Var = k91.s2.f305760d;
        k91.t2 t2Var = z18 ? k91.t2.f305767e : k91.t2.f305768f;
        boolean z19 = !z18;
        k91.y2 y2Var = k91.y2.f305827d;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo h17 = zl2.q4.f473933a.h(ce0Var);
        int dimension = (int) resources.getDimension(com.tencent.mm.R.dimen.f479706d1);
        if (ce0Var != null) {
            z17 = ce0Var.getInteger(6) == 1;
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, h07, s2Var, true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(resources.getDimension(com.tencent.mm.R.dimen.z_), true, true, false, false, 24, null), true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), s2Var), t2Var, true, z18, null, y2Var, z19, false, null, true, 0, null, 0, 0, 0, !(ce0Var != null && ce0Var.getBoolean(8)), false, false, null, false, h17, dimension, z17, null, true, 0, false, z19, false, false, null, null, null, false, null, null, false, -1545640960, 2045, null);
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.D1(data.f43368v)) {
            com.tencent.mm.plugin.appbrand.config.l e17 = halfScreenConfig.e();
            i17 = 1;
            e17.f77534n = true;
            e17.f77531k = k91.t2.f305767e;
            halfScreenConfig = e17.a();
        } else {
            i17 = 1;
        }
        l81.b1 b1Var = (l81.b1) appBundle;
        b1Var.G = halfScreenConfig;
        if (r4Var.D1(this.f40469b.f43368v)) {
            b1Var.Z = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491483m81);
        }
        b1Var.f317032k = this.f40472e.f310116d;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        cm2.m0 m0Var = this.f40469b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String string = m0Var.f43368v.getString(26);
        if (string == null) {
            string = "";
        }
        jSONObject.put("cookies", string);
        appBrandLaunchReferrer.f77322d = i17;
        appBrandLaunchReferrer.f77325g = jSONObject.toString();
        b1Var.f317041s = appBrandLaunchReferrer;
        r45.hd5 hd5Var = (r45.hd5) this.f40469b.f43368v.getCustom(24);
        if (hd5Var != null) {
            if (((hd5Var.getInteger(5) == 100 || hd5Var.getInteger(5) == 2) ? i17 : 0) == 0) {
                hd5Var = null;
            }
            if (hd5Var != null) {
                long j17 = hd5Var.getLong(4);
                gk2.e eVar = this.f40473f;
                cm2.m0 m0Var2 = this.f40469b;
                java.lang.String str = this.f40474g;
                b1Var.V = com.tencent.mm.plugin.finder.live.view.s8.class;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("finder_username", ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
                jSONObject2.put("productId", m0Var2.f43368v.getLong(0));
                jSONObject2.put("replayId", j17);
                jSONObject2.put("session", str);
                jSONObject2.put("jumpId", m0Var2.f43387f);
                b1Var.W = jSONObject2.toString();
            }
        }
    }
}
