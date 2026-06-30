package d0;

/* loaded from: classes14.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.z1 f306777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f306778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f306779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(d0.z1 z1Var, s1.x0 x0Var, s1.o1 o1Var) {
        super(1);
        this.f306777d = z1Var;
        this.f306778e = x0Var;
        this.f306779f = o1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        d0.z1 z1Var = this.f306777d;
        long j17 = ((p2.m) z1Var.f306782d.mo146xb9724478(this.f306778e)).f432923a;
        if (z1Var.f306783e) {
            s1.n1.f(layout, this.f306779f, (int) (j17 >> 32), p2.m.b(j17), 0.0f, null, 12, null);
        } else {
            s1.n1.h(layout, this.f306779f, (int) (j17 >> 32), p2.m.b(j17), 0.0f, null, 12, null);
        }
        return jz5.f0.f384359a;
    }
}
