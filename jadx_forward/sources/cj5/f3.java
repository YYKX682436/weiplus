package cj5;

/* loaded from: classes.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.h3 f123652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(cj5.h3 h3Var) {
        super(1);
        this.f123652d = h3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        cj5.h3 h3Var = this.f123652d;
        if (h0Var != null) {
            h3Var.V6().l().setVisibility(0);
            h3Var.V6().l().m79298x40d747ee(new cj5.c3(h3Var));
            h3Var.V6().m().setVisibility(8);
            h3Var.V6().m().m79298x40d747ee(new cj5.d3(h3Var));
        }
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        if (yVar != null) {
            if (!r26.n0.N(yVar.f527896c)) {
                j75.e eVar2 = yVar.f379600a;
                if (eVar2 == null || !(eVar2 instanceof wi5.z)) {
                    eVar2 = null;
                } else if (((wi5.z) eVar2).f527902d) {
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
        if (t0Var != null && (eVar = t0Var.f379600a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                ri5.j jVar = t0Var.f527874b;
                jVar.getClass();
                if (jVar.f477646h.d(jVar)) {
                    h3Var.V6().m().setVisibility(8);
                    h3Var.V6().l().setVisibility(0);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
