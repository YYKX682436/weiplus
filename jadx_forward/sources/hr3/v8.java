package hr3;

/* loaded from: classes9.dex */
public class v8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.w8 f365639d;

    public v8(hr3.w8 w8Var) {
        this.f365639d = w8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.q6 q6Var = (qk.q6) i95.n0.c(qk.q6.class);
        hr3.w8 w8Var = this.f365639d;
        java.lang.String d17 = w8Var.f365680e.d1();
        ((c01.p0) q6Var).getClass();
        qk.o b17 = r01.z.b(d17);
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = (android.app.Activity) w8Var.f365679d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = w8Var.f365680e;
        ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.a(b17, activity, z3Var, false, 0);
        w8Var.b();
        w8Var.a("clearAllMessage", true);
    }
}
