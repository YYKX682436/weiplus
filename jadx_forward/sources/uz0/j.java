package uz0;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f513658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f513659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f513660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uz0.n f513661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f513662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f513663i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f513664m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, b0.p2 p2Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, uz0.n nVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f513658d = e0Var;
        this.f513659e = p2Var;
        this.f513660f = e0Var2;
        this.f513661g = nVar;
        this.f513662h = z17;
        this.f513663i = i17;
        this.f513664m = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.o animateDecay = (z.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateDecay, "$this$animateDecay");
        float floatValue = ((java.lang.Number) animateDecay.b()).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f513658d;
        float f17 = floatValue - e0Var.f391648d;
        b0.p2 p2Var = this.f513659e;
        float a17 = p2Var.a(f17);
        e0Var.f391648d = ((java.lang.Number) animateDecay.b()).floatValue();
        this.f513660f.f391648d = ((java.lang.Number) animateDecay.c()).floatValue();
        if (java.lang.Math.abs(f17 - a17) > 0.5f) {
            animateDecay.a();
        }
        uz0.n nVar = this.f513661g;
        uz0.s d17 = nVar.f513676a.d();
        if (d17 == null) {
            animateDecay.a();
        } else {
            boolean d18 = animateDecay.d();
            int i17 = this.f513663i;
            if (d18 && this.f513662h) {
                float floatValue2 = ((java.lang.Number) animateDecay.c()).floatValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f513664m;
                if (floatValue2 > 0.0f && d17.a() == i17 - 1) {
                    c0Var.f391645d = true;
                    animateDecay.a();
                } else if (((java.lang.Number) animateDecay.c()).floatValue() < 0.0f && d17.a() == i17) {
                    c0Var.f391645d = true;
                    animateDecay.a();
                }
            }
            if (animateDecay.d() && uz0.n.b(nVar, animateDecay, d17, i17, new uz0.i(p2Var))) {
                animateDecay.a();
            }
        }
        return jz5.f0.f384359a;
    }
}
