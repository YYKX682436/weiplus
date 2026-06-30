package qe5;

/* loaded from: classes12.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final qe5.x0 f443759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f443760b;

    public z0(qe5.n1 n1Var) {
        this.f443760b = n1Var;
        android.widget.Button c17 = n1Var.U6().c();
        em.d0 U6 = n1Var.U6();
        if (U6.f335746v == null) {
            U6.f335746v = (android.widget.TextView) U6.f335725a.findViewById(com.p314xaae8f345.mm.R.id.f565652d35);
        }
        android.widget.TextView textView = U6.f335746v;
        kd5.e T6 = n1Var.T6();
        this.f443759a = new qe5.x0(c17, textView, T6 != null ? T6.f388414i : null, n1Var.U6());
    }

    public final void a() {
        qe5.n1 n1Var = this.f443760b;
        em.d0 U6 = n1Var.U6();
        U6.b().setVisibility(0);
        kd5.e T6 = n1Var.T6();
        if ((T6 != null ? T6.f388426x : null) != null) {
            U6.k().setVisibility(0);
            if (n1Var.V6()) {
                U6.p().setVisibility(0);
                U6.k().setText(n1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nhp));
                j75.f Q6 = n1Var.Q6();
                if (Q6 != null) {
                    kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291256h);
                    nVar.f388437c = true;
                    Q6.B3(nVar);
                }
            } else {
                U6.k().setText(n1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nho));
            }
        }
        kd5.e T62 = n1Var.T6();
        if (T62 != null && T62.P) {
            U6.b().setEnabled(false);
            U6.n().setVisibility(0);
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar2 = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291258m);
            nVar2.f388437c = true;
            nVar2.f388438d = com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291220h;
            Q62.B3(nVar2);
        }
    }
}
