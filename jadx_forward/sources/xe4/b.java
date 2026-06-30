package xe4;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe4.c f535500d;

    public b(xe4.c cVar) {
        this.f535500d = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        xe4.c cVar = this.f535500d;
        qk.o b17 = r01.z.b(cVar.f535503e.d1());
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = (android.app.Activity) cVar.f535502d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = cVar.f535503e;
        ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.a(b17, activity, z3Var, false, 0);
        cVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.b(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj().J0(gm0.j1.b().k());
    }
}
