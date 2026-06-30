package fg1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final sf.f f343428a;

    /* renamed from: b, reason: collision with root package name */
    public final fg1.x0 f343429b;

    /* renamed from: c, reason: collision with root package name */
    public final gg1.g f343430c;

    /* renamed from: d, reason: collision with root package name */
    public final b06.d f343431d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f343432e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f343433f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f343434g;

    /* renamed from: h, reason: collision with root package name */
    public final b06.d f343435h;

    /* renamed from: i, reason: collision with root package name */
    public final fg1.r f343436i;

    /* renamed from: j, reason: collision with root package name */
    public final fg1.t f343437j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f343438k;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f343427m = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(fg1.u.class, "isForeground", "isForeground()Z", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(fg1.u.class, "isCastMediaPresent", "isCastMediaPresent()Z", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final fg1.j f343426l = new fg1.j(null);

    public u(dg.a eventHandler, sf.f invokeContext) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventHandler, "eventHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        this.f343428a = invokeContext;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = invokeContext.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getComponent(...)");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String str = null;
        this.f343429b = new fg1.x0(context, null);
        jz5.h.b(fg1.k.f343405d);
        gg1.g gVar = (gg1.g) i95.n0.c(gg1.g.class);
        this.f343430c = gVar;
        this.f343431d = new fg1.m(java.lang.Boolean.TRUE, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = gg1.h.a(invokeContext);
        if (gVar != null) {
            java.lang.String str2 = a17.f156336n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getAppId(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1) gVar;
            j1Var.f169420f = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = a17.x0();
            if (x07 != null && (m52174xaf156f4a = x07.m52174xaf156f4a()) != null) {
                str = m52174xaf156f4a.X1();
            }
            j1Var.f169421g = str == null ? "" : str;
        }
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) m17;
            tVar.U(new fg1.h(this));
            tVar.R(new fg1.i(this));
        }
        this.f343432e = "";
        this.f343435h = new fg1.n(java.lang.Boolean.FALSE, this);
        this.f343436i = new fg1.r(this);
        this.f343437j = new fg1.t(this);
        this.f343438k = jz5.h.b(new fg1.p(this, eventHandler));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a() {
        sf.f fVar = this.f343428a;
        if (!(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).m();
        if (m17 == null) {
            return null;
        }
        if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) m17).t3();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final gg1.c1 b() {
        return (gg1.c1) ((jz5.n) this.f343438k).mo141623x754a37bb();
    }

    public final void c(boolean z17) {
        ((b06.b) this.f343435h).a(this, f343427m[1], java.lang.Boolean.valueOf(z17));
    }
}
