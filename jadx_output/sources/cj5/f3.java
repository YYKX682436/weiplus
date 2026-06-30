package cj5;

/* loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h3 f42119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(cj5.h3 h3Var) {
        super(1);
        this.f42119d = h3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        cj5.h3 h3Var = this.f42119d;
        if (h0Var != null) {
            h3Var.V6().l().setVisibility(0);
            h3Var.V6().l().setOnScrollBarTouchListener(new cj5.c3(h3Var));
            h3Var.V6().m().setVisibility(8);
            h3Var.V6().m().setOnScrollBarTouchListener(new cj5.d3(h3Var));
        }
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        if (yVar != null) {
            if (!r26.n0.N(yVar.f446363c)) {
                j75.e eVar2 = yVar.f298067a;
                if (eVar2 == null || !(eVar2 instanceof wi5.z)) {
                    eVar2 = null;
                } else if (((wi5.z) eVar2).f446369d) {
                    h3Var.V6().m().setVisibility(0);
                } else {
                    h3Var.V6().m().setVisibility(8);
                }
                if (((wi5.z) eVar2) == null) {
                    h3Var.V6().m().setVisibility(8);
                }
                h3Var.V6().l().setVisibility(8);
            } else {
                h3Var.V6().m().setVisibility(8);
                h3Var.V6().l().setVisibility(0);
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null && (eVar = t0Var.f298067a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                ri5.j jVar = t0Var.f446341b;
                jVar.getClass();
                if (jVar.f396113h.d(jVar)) {
                    h3Var.V6().m().setVisibility(8);
                    h3Var.V6().l().setVisibility(0);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
