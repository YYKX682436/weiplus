package ty0;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f504528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f504529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f2.p f504530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f2.r f504531h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f2.h f504532i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f504533m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l2.g f504534n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f504535o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f504536p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f504537q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f504538r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.l f504539s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f504540t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, long j17, long j18, f2.p pVar, f2.r rVar, f2.h hVar, long j19, l2.g gVar, int i17, long j27, int i18, boolean z17, yz5.l lVar, a2.o1 o1Var) {
        super(3);
        this.f504527d = str;
        this.f504528e = j17;
        this.f504529f = j18;
        this.f504530g = pVar;
        this.f504531h = rVar;
        this.f504532i = hVar;
        this.f504533m = j19;
        this.f504534n = gVar;
        this.f504535o = i17;
        this.f504536p = j27;
        this.f504537q = i18;
        this.f504538r = z17;
        this.f504539s = lVar;
        this.f504540t = o1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t localModifier = (z0.t) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localModifier, "localModifier");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(localModifier) ? 4 : 2;
        }
        int i17 = intValue;
        if ((i17 & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        l0.e5.c(this.f504527d, localModifier, this.f504528e, this.f504529f, this.f504530g, this.f504531h, this.f504532i, this.f504533m, this.f504534n, new l2.f(this.f504535o), this.f504536p, this.f504537q, this.f504538r, 1, this.f504539s, this.f504540t, oVar, (i17 << 3) & 112, 3072, 0);
        return jz5.f0.f384359a;
    }
}
