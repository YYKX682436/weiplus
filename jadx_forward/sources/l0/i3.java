package l0;

/* loaded from: classes14.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f395792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n0.e5 e5Var) {
        super(1);
        this.f395792d = e5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(Canvas, "$this$Canvas");
        long j17 = ((e1.y) this.f395792d.mo128745x754a37bb()).f327855a;
        float R = Canvas.R(l0.l3.f395896a);
        float R2 = Canvas.R(l0.l3.f395897b);
        float f17 = R2 / 2;
        long a17 = d1.f.a(f17, d1.e.d(Canvas.r()));
        long a18 = d1.f.a(R - f17, d1.e.d(Canvas.r()));
        int i17 = g1.i.J0;
        Canvas.F(j17, a17, a18, R2, 1, null, 1.0f, null, 3);
        return jz5.f0.f384359a;
    }
}
