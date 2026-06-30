package j0;

/* loaded from: classes14.dex */
public final class n0 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f377988b;

    public n0(j0.c5 c5Var, yz5.l lVar) {
        this.f377987a = c5Var;
        this.f377988b = lVar;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.d(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.a(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.c(this, uVar, list, i17);
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        j0.c5 c5Var = this.f377987a;
        j0.k3 textDelegate = c5Var.f377766a;
        p2.s layoutDirection = measure.mo7007x6fcfed3f();
        j0.d5 d5Var = c5Var.f377772g;
        a2.k1 k1Var = d5Var != null ? d5Var.f377798a : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textDelegate, "textDelegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        a2.k1 a17 = textDelegate.a(j17, layoutDirection, k1Var);
        long j18 = a17.f82300c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (j18 >> 32));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(p2.q.b(j18));
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        j0.d5 d5Var2 = c5Var.f377772g;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d5Var2 != null ? d5Var2.f377798a : null, a17)) {
            c5Var.f377772g = new j0.d5(a17);
            this.f377988b.mo146xb9724478(a17);
        }
        return measure.W(intValue, intValue2, kz5.c1.k(new jz5.l(s1.d.f483532a, java.lang.Integer.valueOf(a06.d.b(a17.f82301d))), new jz5.l(s1.d.f483533b, java.lang.Integer.valueOf(a06.d.b(a17.f82302e)))), j0.m0.f377978d);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        j0.c5 c5Var = this.f377987a;
        c5Var.f377766a.b(uVar.mo7007x6fcfed3f());
        if (c5Var.f377766a.f377944i != null) {
            return (int) java.lang.Math.ceil(r1.c());
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }
}
