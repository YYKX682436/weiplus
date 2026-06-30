package sr2;

/* loaded from: classes10.dex */
public final class d2 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493070a;

    public d2(sr2.y2 y2Var) {
        this.f493070a = y2Var;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        sr2.y2 y2Var = this.f493070a;
        if (booleanValue) {
            y2Var.getClass();
            java.lang.Object a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ya2.o1.t4((ya2.o1) a17, false, null, 2, null);
            return;
        }
        ya2.p1 p1Var = y2Var.f493333d;
        if (p1Var != null) {
            ((yv2.b) p1Var).e();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
            throw null;
        }
    }
}
