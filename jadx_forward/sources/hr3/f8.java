package hr3;

/* loaded from: classes9.dex */
public final class f8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.g8 f365080d;

    public f8(hr3.g8 g8Var) {
        this.f365080d = g8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.g8 g8Var = this.f365080d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = g8Var.f365112e;
        qk.o b17 = r01.z.b(z3Var != null ? z3Var.d1() : null);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = g8Var.f365111d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = g8Var.f365112e;
        ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.a(b17, activity, z3Var2, true, 0);
    }
}
