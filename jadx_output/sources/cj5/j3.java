package cj5;

/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.n3 f42155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(cj5.n3 n3Var) {
        super(1);
        this.f42155d = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.i0 i0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            wi5.h0 h0Var = (wi5.h0) dVar;
            cj5.n3 n3Var = this.f42155d;
            if (n3Var.getIntent().getBooleanExtra("KEY_NEED_SEAR_HEADER", true)) {
                j75.e eVar = h0Var.f298067a;
                if (eVar != null) {
                    i0Var = (wi5.i0) eVar;
                } else {
                    i0Var = new wi5.i0();
                    h0Var.f298067a = i0Var;
                }
                i0Var.f446295a[0] = new cj5.i3(n3Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
