package s1;

/* loaded from: classes14.dex */
public final class n0 extends u1.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f483572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f483573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s1.q0 q0Var, yz5.p pVar, java.lang.String str) {
        super(str);
        this.f483572b = q0Var;
        this.f483573c = pVar;
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        s1.q0 q0Var = this.f483572b;
        s1.l0 l0Var = q0Var.f483600g;
        p2.s mo7007x6fcfed3f = measure.mo7007x6fcfed3f();
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mo7007x6fcfed3f, "<set-?>");
        l0Var.f483564d = mo7007x6fcfed3f;
        q0Var.f483600g.f483565e = measure.mo7005x9a59d0b2();
        q0Var.f483600g.f483566f = measure.mo7006xa2f3d785();
        q0Var.f483597d = 0;
        return new s1.m0((s1.u0) this.f483573c.mo149xb9724478(q0Var.f483600g, new p2.c(j17)), q0Var, q0Var.f483597d);
    }
}
