package l0;

/* loaded from: classes14.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f395849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f395850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1.n f395851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f395852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f395853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f395854i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f395855m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(float f17, long j17, g1.n nVar, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3, n0.e5 e5Var4) {
        super(1);
        this.f395849d = f17;
        this.f395850e = j17;
        this.f395851f = nVar;
        this.f395852g = e5Var;
        this.f395853h = e5Var2;
        this.f395854i = e5Var3;
        this.f395855m = e5Var4;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Canvas, "$this$Canvas");
        float floatValue = ((java.lang.Number) this.f395853h.mo128745x754a37bb()).floatValue();
        n0.e5 e5Var = this.f395854i;
        float abs = java.lang.Math.abs(floatValue - ((java.lang.Number) e5Var.mo128745x754a37bb()).floatValue());
        float floatValue2 = ((java.lang.Number) e5Var.mo128745x754a37bb()).floatValue() + (((((java.lang.Number) this.f395852g.mo128745x754a37bb()).intValue() * 216.0f) % 360.0f) - 90.0f) + ((java.lang.Number) this.f395855m.mo128745x754a37bb()).floatValue();
        long j17 = this.f395850e;
        float f17 = 2;
        float f18 = floatValue2 + (((this.f395849d / (l0.o1.f395935a / f17)) * 57.29578f) / 2.0f);
        float max = java.lang.Math.max(abs, 0.1f);
        g1.n nVar = this.f395851f;
        float f19 = nVar.f349046a / f17;
        float d17 = d1.k.d(Canvas.a()) - (f17 * f19);
        g1.h.a(Canvas, j17, f18, max, false, d1.f.a(f19, f19), d1.l.a(d17, d17), 0.0f, nVar, null, 0, 832, null);
        return jz5.f0.f384359a;
    }
}
