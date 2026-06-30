package r5;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f474058a;

    /* renamed from: b, reason: collision with root package name */
    public c6.c f474059b;

    /* renamed from: c, reason: collision with root package name */
    public r5.c f474060c;

    /* renamed from: d, reason: collision with root package name */
    public final h6.j f474061d;

    /* renamed from: e, reason: collision with root package name */
    public final double f474062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f474063f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f474064g;

    public i(android.content.Context context) {
        double d17;
        java.lang.Object m9714xac92a5d0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "context.applicationContext");
        this.f474058a = applicationContext;
        this.f474059b = c6.c.f120305m;
        this.f474060c = null;
        this.f474061d = new h6.j(false, false, false, 7, null);
        try {
            m9714xac92a5d0 = b3.l.m9714xac92a5d0(applicationContext, android.app.ActivityManager.class);
        } catch (java.lang.Exception unused) {
        }
        if (m9714xac92a5d0 == null) {
            throw new java.lang.IllegalStateException(("System service of type " + android.app.ActivityManager.class + " was not found.").toString());
        }
        if (((android.app.ActivityManager) m9714xac92a5d0).isLowRamDevice()) {
            d17 = 0.15d;
            this.f474062e = d17;
            this.f474063f = true;
            this.f474064g = true;
        }
        d17 = 0.2d;
        this.f474062e = d17;
        this.f474063f = true;
        this.f474064g = true;
    }

    public final r5.j a() {
        int i17;
        java.lang.Object m9714xac92a5d0;
        android.content.Context context = this.f474058a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            m9714xac92a5d0 = b3.l.m9714xac92a5d0(context, android.app.ActivityManager.class);
        } catch (java.lang.Exception unused) {
            i17 = 256;
        }
        if (m9714xac92a5d0 == null) {
            throw new java.lang.IllegalStateException(("System service of type " + android.app.ActivityManager.class + " was not found.").toString());
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) m9714xac92a5d0;
        i17 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        double d17 = this.f474062e * i17;
        double d18 = 1024;
        long j17 = (long) (d17 * d18 * d18);
        int i18 = (int) (j17 * 0.0d);
        int i19 = (int) (j17 - i18);
        s5.a dVar = i18 == 0 ? new s5.d() : new s5.f(i18, null, null, null, 6, null);
        a6.d0 yVar = this.f474064g ? new a6.y(null) : a6.d.f83182a;
        s5.c gVar = this.f474063f ? new s5.g(yVar, dVar, null) : s5.e.f484539a;
        int i27 = a6.a0.f83174a;
        a6.s sVar = new a6.s(i19 > 0 ? new a6.v(yVar, gVar, i19, null) : yVar instanceof a6.y ? new a6.e(yVar) : a6.b.f83175b, yVar, gVar, dVar);
        android.content.Context context2 = this.f474058a;
        c6.c cVar = this.f474059b;
        s5.a aVar = sVar.f83226d;
        r5.h hVar = new r5.h(this);
        l36.i0 i0Var = h6.d.f360649a;
        final jz5.g b17 = jz5.h.b(hVar);
        l36.m mVar = new l36.m() { // from class: h6.d$$a
            @Override // l36.m
            public final l36.n a(l36.w0 w0Var) {
                jz5.g lazy = jz5.g.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazy, "$lazy");
                return ((l36.m) lazy.mo141623x754a37bb()).a(w0Var);
            }
        };
        r5.f fVar = r5.f.f474055a;
        r5.c cVar2 = this.f474060c;
        if (cVar2 == null) {
            kz5.p0 p0Var = kz5.p0.f395529d;
            cVar2 = new r5.c(p0Var, p0Var, p0Var, p0Var);
        }
        return new r5.p(context2, cVar, aVar, sVar, mVar, fVar, cVar2, this.f474061d, null);
    }
}
