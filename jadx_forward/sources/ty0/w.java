package ty0;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.d f504543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f504544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f504545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f2.p f504546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f2.r f504547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f2.h f504548i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f504549m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l2.g f504550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f504551o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f504552p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f504553q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f504554r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.l f504555s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f504556t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a2.d dVar, long j17, long j18, f2.p pVar, f2.r rVar, f2.h hVar, long j19, l2.g gVar, int i17, long j27, int i18, boolean z17, yz5.l lVar, a2.o1 o1Var) {
        super(3);
        this.f504543d = dVar;
        this.f504544e = j17;
        this.f504545f = j18;
        this.f504546g = pVar;
        this.f504547h = rVar;
        this.f504548i = hVar;
        this.f504549m = j19;
        this.f504550n = gVar;
        this.f504551o = i17;
        this.f504552p = j27;
        this.f504553q = i18;
        this.f504554r = z17;
        this.f504555s = lVar;
        this.f504556t = o1Var;
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
        l0.e5.b(this.f504543d, localModifier, this.f504544e, this.f504545f, this.f504546g, this.f504547h, this.f504548i, this.f504549m, this.f504550n, new l2.f(this.f504551o), this.f504552p, this.f504553q, this.f504554r, 1, null, this.f504555s, this.f504556t, oVar, (i17 << 3) & 112, 3072, 16384);
        return jz5.f0.f384359a;
    }
}
