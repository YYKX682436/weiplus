package uz0;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f513671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f513672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f513673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uz0.n f513674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f513675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, b0.p2 p2Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, uz0.n nVar, int i17) {
        super(1);
        this.f513671d = e0Var;
        this.f513672e = p2Var;
        this.f513673f = e0Var2;
        this.f513674g = nVar;
        this.f513675h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.o animateTo = (z.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateTo, "$this$animateTo");
        float floatValue = ((java.lang.Number) animateTo.b()).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f513671d;
        float f17 = floatValue - e0Var.f391648d;
        b0.p2 p2Var = this.f513672e;
        float a17 = p2Var.a(f17);
        e0Var.f391648d = ((java.lang.Number) animateTo.b()).floatValue();
        this.f513673f.f391648d = ((java.lang.Number) animateTo.c()).floatValue();
        uz0.n nVar = this.f513674g;
        uz0.s d17 = nVar.f513676a.d();
        if (d17 == null) {
            animateTo.a();
        } else {
            if (uz0.n.b(nVar, animateTo, d17, this.f513675h, new uz0.l(p2Var))) {
                animateTo.a();
            } else if (java.lang.Math.abs(f17 - a17) > 0.5f) {
                animateTo.a();
            }
        }
        return jz5.f0.f384359a;
    }
}
