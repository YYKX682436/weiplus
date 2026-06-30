package y;

/* loaded from: classes14.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.x1 f539999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y.x1 x1Var) {
        super(1);
        this.f539999d = x1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.k0 k0Var;
        z.k0 k0Var2;
        z.d2 d2Var = (z.d2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d2Var, "$this$null");
        y.g0 g0Var = y.g0.PreEnter;
        y.g0 g0Var2 = y.g0.Visible;
        z.e2 e2Var = (z.e2) d2Var;
        boolean a17 = e2Var.a(g0Var, g0Var2);
        y.x1 x1Var = this.f539999d;
        if (a17) {
            y.t1 t1Var = (y.t1) x1Var.f540008e.mo128745x754a37bb();
            return (t1Var == null || (k0Var2 = t1Var.f539981b) == null) ? y.x0.f540005d : k0Var2;
        }
        if (!e2Var.a(g0Var2, y.g0.PostExit)) {
            return y.x0.f540005d;
        }
        y.t1 t1Var2 = (y.t1) x1Var.f540009f.mo128745x754a37bb();
        return (t1Var2 == null || (k0Var = t1Var2.f539981b) == null) ? y.x0.f540005d : k0Var;
    }
}
