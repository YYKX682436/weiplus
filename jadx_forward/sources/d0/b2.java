package d0;

/* loaded from: classes14.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.c2 f306612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f306613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f306614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d0.c2 c2Var, s1.o1 o1Var, s1.x0 x0Var) {
        super(1);
        this.f306612d = c2Var;
        this.f306613e = o1Var;
        this.f306614f = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        d0.c2 c2Var = this.f306612d;
        boolean z17 = c2Var.f306626h;
        float f17 = c2Var.f306623e;
        float f18 = c2Var.f306622d;
        s1.x0 x0Var = this.f306614f;
        if (z17) {
            s1.n1.e(layout, this.f306613e, x0Var.G(f18), x0Var.G(f17), 0.0f, 4, null);
        } else {
            s1.n1.b(layout, this.f306613e, x0Var.G(f18), x0Var.G(f17), 0.0f, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
