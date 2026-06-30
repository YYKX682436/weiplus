package e0;

/* loaded from: classes14.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f327094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(e0.f1 f1Var) {
        super(1);
        this.f327094d = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.t tVar;
        float f17 = -((java.lang.Number) obj).floatValue();
        e0.f1 f1Var = this.f327094d;
        if ((f17 >= 0.0f || f1Var.f327122o) && (f17 <= 0.0f || f1Var.f327121n)) {
            if (!(java.lang.Math.abs(f1Var.f327111d) <= 0.5f)) {
                throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + f1Var.f327111d).toString());
            }
            float f18 = f1Var.f327111d + f17;
            f1Var.f327111d = f18;
            if (java.lang.Math.abs(f18) > 0.5f) {
                float f19 = f1Var.f327111d;
                s1.r1 r1Var = f1Var.f327117j;
                if (r1Var != null) {
                    ((u1.w) r1Var).h();
                }
                boolean z17 = f1Var.f327113f;
                if (z17) {
                    float f27 = f19 - f1Var.f327111d;
                    if (z17) {
                        e0.h0 f28 = f1Var.f();
                        if (!f28.b().isEmpty()) {
                            boolean z18 = f27 < 0.0f;
                            int i17 = z18 ? ((e0.q0) ((e0.n) kz5.n0.i0(f28.b()))).f327212b + 1 : ((e0.q0) ((e0.n) kz5.n0.X(f28.b()))).f327212b - 1;
                            if (i17 != f1Var.f327114g) {
                                if (i17 >= 0 && i17 < f28.a()) {
                                    if (f1Var.f327116i != z18 && (tVar = f1Var.f327115h) != null) {
                                        tVar.mo7002xae7a2e7a();
                                    }
                                    f1Var.f327116i = z18;
                                    f1Var.f327114g = i17;
                                    f1Var.f327115h = f1Var.f327123p.a(i17, f1Var.f327120m);
                                }
                            }
                        }
                    }
                }
            }
            if (java.lang.Math.abs(f1Var.f327111d) > 0.5f) {
                f17 -= f1Var.f327111d;
                f1Var.f327111d = 0.0f;
            }
        } else {
            f17 = 0.0f;
        }
        return java.lang.Float.valueOf(-f17);
    }
}
