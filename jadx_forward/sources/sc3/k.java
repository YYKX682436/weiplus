package sc3;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f488002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f488003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f488004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f488005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sc3.k1 k1Var, yz5.l lVar, boolean z17, int i17, int i18) {
        super(0);
        this.f488001d = k1Var;
        this.f488002e = lVar;
        this.f488003f = z17;
        this.f488004g = i17;
        this.f488005h = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f488001d.f488021t;
        if (c4209xd2d3ddad == null || c4209xd2d3ddad.d() || this.f488001d.f488007J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f488001d.Q, "hy: not initializing magicbrush");
            this.f488002e.mo146xb9724478(null);
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new sc3.j(this.f488001d, this.f488002e, this.f488003f, this.f488004g, this.f488005h));
        }
        return jz5.f0.f384359a;
    }
}
