package ty0;

/* loaded from: classes14.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f504441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f504442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f504443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f504444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f504445h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f504446i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f504447m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504448n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, boolean z17, float f17, float f18, long j17, float f19, float f27, n0.v2 v2Var) {
        super(1);
        this.f504441d = i17;
        this.f504442e = z17;
        this.f504443f = f17;
        this.f504444g = f18;
        this.f504445h = j17;
        this.f504446i = f19;
        this.f504447m = f27;
        this.f504448n = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBehind, "$this$drawBehind");
        int intValue = ((java.lang.Number) this.f504448n.mo128745x754a37bb()).intValue();
        c06.g gVar = new c06.g(intValue, intValue >> 31);
        for (int i17 = 0; i17 < this.f504441d; i17++) {
            float b17 = (this.f504442e ? gVar.b() * 0.9f : 0.0f) + this.f504443f;
            float f17 = this.f504444g;
            float f18 = b17 * f17;
            long j17 = this.f504445h;
            float f19 = this.f504446i;
            g1.h.h(drawBehind, j17, d1.f.a(i17 * f19, f17 - f18), d1.l.a(f19 - this.f504447m, f18 * 2), 0.0f, null, null, 0, 120, null);
        }
        return jz5.f0.f384359a;
    }
}
