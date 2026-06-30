package b0;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f97956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f97957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f97958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, b0.p2 p2Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2) {
        super(1);
        this.f97956d = e0Var;
        this.f97957e = p2Var;
        this.f97958f = e0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.o animateDecay = (z.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateDecay, "$this$animateDecay");
        float floatValue = ((java.lang.Number) animateDecay.b()).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f97956d;
        float f17 = floatValue - e0Var.f391648d;
        float a17 = this.f97957e.a(f17);
        e0Var.f391648d = ((java.lang.Number) animateDecay.b()).floatValue();
        this.f97958f.f391648d = ((java.lang.Number) animateDecay.c()).floatValue();
        if (java.lang.Math.abs(f17 - a17) > 0.5f) {
            animateDecay.a();
        }
        return jz5.f0.f384359a;
    }
}
