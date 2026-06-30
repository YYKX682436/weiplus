package rn3;

@j95.b
/* loaded from: classes13.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p f479484d = null;

    /* renamed from: e, reason: collision with root package name */
    public vn3.a f479485e = null;

    /* renamed from: f, reason: collision with root package name */
    public vn3.b f479486f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.e f479487g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.t f479488h = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.t();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.e Ai() {
        gm0.j1.b().c();
        if (Ni().f479487g == null) {
            Ni().f479487g = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.e();
        }
        return Ni().f479487g;
    }

    public static vn3.b Bi() {
        gm0.j1.b().c();
        if (Ni().f479486f == null) {
            rn3.i Ni = Ni();
            gm0.j1.i();
            Ni.f479486f = new vn3.b(gm0.j1.u().f354686f);
        }
        return Ni().f479486f;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di() {
        gm0.j1.b().c();
        if (Ni().f479484d == null) {
            Ni().f479484d = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p();
        }
        return Ni().f479484d;
    }

    public static rn3.i Ni() {
        return (rn3.i) i95.n0.c(rn3.i.class);
    }

    public static vn3.a wi() {
        gm0.j1.b().c();
        if (Ni().f479485e == null) {
            rn3.i Ni = Ni();
            gm0.j1.i();
            Ni.f479485e = new vn3.a(gm0.j1.u().f354686f);
        }
        return Ni().f479485e;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        Di().h(1, 1, 1, "", "me_setting_general_plugin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsManager", "dancy register dynamic newtips, tipsId:%s, path:%s", 1, "me_setting_general_plugin");
    }
}
