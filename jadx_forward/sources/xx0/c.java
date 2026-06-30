package xx0;

/* loaded from: classes5.dex */
public final class c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f539394d;

    /* renamed from: e, reason: collision with root package name */
    public final xx0.i f539395e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f539396f;

    /* renamed from: g, reason: collision with root package name */
    public xx0.f0 f539397g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f539398h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f539399i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f539400m;

    /* renamed from: n, reason: collision with root package name */
    public final int f539401n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, p3325xe03a0797.p3326xc267989b.y0 scope, xx0.i dataProvider, xx0.j jVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataProvider, "dataProvider");
        this.f539394d = scope;
        this.f539395e = dataProvider;
        this.f539399i = new java.util.ArrayList();
        this.f539401n = 1;
        setOrientation(1);
        setGravity(17);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f539398h = p3325xe03a0797.p3326xc267989b.l.d(scope, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xx0.b(context, this, jVar, null), 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f539398h;
            if (((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
