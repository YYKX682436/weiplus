package cj5;

/* loaded from: classes.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n3 f123688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(cj5.n3 n3Var) {
        super(1);
        this.f123688d = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.i0 i0Var;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            wi5.h0 h0Var = (wi5.h0) dVar;
            cj5.n3 n3Var = this.f123688d;
            if (n3Var.m158359x1e885992().getBooleanExtra("KEY_NEED_SEAR_HEADER", true)) {
                j75.e eVar = h0Var.f379600a;
                if (eVar != null) {
                    i0Var = (wi5.i0) eVar;
                } else {
                    i0Var = new wi5.i0();
                    h0Var.f379600a = i0Var;
                }
                i0Var.f527828a[0] = new cj5.i3(n3Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
