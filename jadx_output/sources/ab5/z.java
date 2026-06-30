package ab5;

/* loaded from: classes9.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f2986b;

    /* renamed from: c, reason: collision with root package name */
    public ab5.y f2987c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2989e;

    /* renamed from: h, reason: collision with root package name */
    public int f2992h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2993i;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaExposedParams f2988d = new k91.z5().a();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2990f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f2991g = "";

    public z(android.content.Context context) {
        this.f2986b = context;
    }

    public static void a(ab5.z zVar, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(zVar.d())) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13798, java.lang.Integer.valueOf(i17), zVar.d(), 0, zVar.f2991g, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
    }

    public static java.lang.String b(ab5.z zVar) {
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams = zVar.f2988d;
        if (wxaExposedParams == null) {
            return "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wxaExposedParams.f77482h)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(zVar.f2988d.f77481g)) {
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams2 = zVar.f2988d;
                wxaExposedParams2.f77482h = ab5.c0.c(wxaExposedParams2.f77481g);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(zVar.f2988d.f77482h)) {
                zVar.f2988d.f77482h = "";
            }
        }
        return zVar.f2986b.getString(com.tencent.mm.R.string.f490014ii, zVar.f2988d.f77482h);
    }

    public final void c(int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(d())) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13918, d(), java.lang.Integer.valueOf(i17), this.f2991g, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
    }

    public final java.lang.String d() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f2989e)) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f2990f)) {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(this.f2989e);
            if (Bi != null) {
                this.f2990f = Bi.field_appId;
            }
        }
        return this.f2990f;
    }

    public void e(int i17) {
        this.f2985a = new com.tencent.mm.ui.widget.dialog.k0(this.f2986b, 1, true);
        switch (i17) {
            case 1:
                this.f2987c = new ab5.p(this);
                break;
            case 2:
                this.f2987c = new ab5.q(this);
                break;
            case 3:
                this.f2987c = new ab5.w(this);
                break;
            case 4:
                this.f2987c = new ab5.x(this);
                break;
            case 5:
                this.f2987c = new ab5.u(this);
                break;
            case 6:
                this.f2987c = new ab5.v(this);
                break;
            default:
                return;
        }
        ab5.y yVar = this.f2987c;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceActionSheet", "resetTitleView, state is null");
        } else {
            android.view.View a17 = yVar.a();
            if (a17 != null) {
                this.f2985a.s(a17, false);
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f2985a;
        k0Var.f211872n = new ab5.o(this);
        k0Var.f211881s = new ab5.n(this);
        k0Var.C = new ab5.m(this);
        k0Var.v();
    }
}
