package j0;

/* loaded from: classes14.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f378034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f378035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.u4 f378036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f378037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.t0 f378038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.t f378039i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z0.t f378040m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z0.t f378041n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z0.t f378042o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g0.f f378043p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378044q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f378045r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f378046s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f378047t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378048u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i17, a2.o1 o1Var, j0.u4 u4Var, g2.e0 e0Var, g2.t0 t0Var, z0.t tVar, z0.t tVar2, z0.t tVar3, z0.t tVar4, g0.f fVar, j0.c5 c5Var, k0.y0 y0Var, boolean z17, boolean z18, yz5.l lVar) {
        super(2);
        this.f378034d = i17;
        this.f378035e = o1Var;
        this.f378036f = u4Var;
        this.f378037g = e0Var;
        this.f378038h = t0Var;
        this.f378039i = tVar;
        this.f378040m = tVar2;
        this.f378041n = tVar3;
        this.f378042o = tVar4;
        this.f378043p = fVar;
        this.f378044q = c5Var;
        this.f378045r = y0Var;
        this.f378046s = z17;
        this.f378047t = z18;
        this.f378048u = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        z0.t j5Var;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        z0.p pVar = z0.p.f550454d;
        a2.o1 textStyle = this.f378035e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStyle, "textStyle");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        z0.t a17 = z0.m.a(pVar, e3Var, new j0.z2(this.f378034d, textStyle));
        j0.p0 p0Var = new j0.p0(this.f378044q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        j0.u4 scrollerPosition = this.f378036f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollerPosition, "scrollerPosition");
        g2.e0 textFieldValue = this.f378037g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textFieldValue, "textFieldValue");
        g2.t0 visualTransformation = this.f378038h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visualTransformation, "visualTransformation");
        b0.y1 y1Var = (b0.y1) ((n0.q4) scrollerPosition.f378120e).mo128745x754a37bb();
        int i17 = a2.m1.f82315c;
        long j17 = textFieldValue.f349227b;
        int i18 = (int) (j17 >> 32);
        if (i18 == ((int) (scrollerPosition.f378119d >> 32))) {
            i18 = a2.m1.c(j17) != a2.m1.c(scrollerPosition.f378119d) ? a2.m1.c(j17) : a2.m1.f(j17);
        }
        scrollerPosition.f378119d = j17;
        a2.d text = textFieldValue.f349226a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        g2.r0 r0Var = new g2.r0(text, g2.u.f349281a);
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            j5Var = new j0.j5(scrollerPosition, i18, r0Var, p0Var);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            j5Var = new j0.x1(scrollerPosition, i18, r0Var, p0Var);
        }
        z0.t k17 = b1.d.b(a17).k(j5Var).k(this.f378039i).k(this.f378040m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "<this>");
        z0.t k18 = z0.m.b(k17, null, new j0.y4(textStyle), 1, null).k(this.f378041n).k(this.f378042o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k18, "<this>");
        g0.f bringIntoViewRequester = this.f378043p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bringIntoViewRequester, "bringIntoViewRequester");
        k0.o0.a(z0.m.a(k18, e3Var, new g0.k(bringIntoViewRequester)), u0.j.b(oVar, 19580180, true, new j0.o0(this.f378045r, this.f378044q, this.f378046s, this.f378047t, this.f378048u)), oVar, 48, 0);
        return jz5.f0.f384359a;
    }
}
