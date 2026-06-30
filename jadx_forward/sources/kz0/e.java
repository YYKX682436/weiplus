package kz0;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f395213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f395214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f395215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, b0.p2 p2Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2) {
        super(1);
        this.f395213d = e0Var;
        this.f395214e = p2Var;
        this.f395215f = e0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.o animateDecay = (z.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateDecay, "$this$animateDecay");
        float floatValue = ((java.lang.Number) animateDecay.b()).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f395213d;
        float f17 = floatValue - e0Var.f391648d;
        float a17 = this.f395214e.a(f17);
        e0Var.f391648d = ((java.lang.Number) animateDecay.b()).floatValue();
        this.f395215f.f391648d = ((java.lang.Number) animateDecay.c()).floatValue();
        if (java.lang.Math.abs(f17 - a17) > 0.5f) {
            animateDecay.a();
        }
        return jz5.f0.f384359a;
    }
}
