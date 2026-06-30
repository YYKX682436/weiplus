package ij5;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.c f373281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ij5.c cVar) {
        super(1);
        this.f373281d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        ij5.c cVar = this.f373281d;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactBaseMvvmListUIC", "InitAction");
            cVar.U6().b().setVisibility(0);
            cVar.U6().b().m75365x562adaa6(cVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572378b05));
            android.view.View findViewById = cVar.U6().b().findViewById(com.p314xaae8f345.mm.R.id.m7g);
            if (findViewById != null) {
                findViewById.setBackground(null);
            }
            android.view.View findViewById2 = cVar.U6().b().findViewById(com.p314xaae8f345.mm.R.id.f567597k12);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ahm);
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null && (eVar = t0Var.f379600a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                ri5.j jVar = t0Var.f527874b;
                jVar.getClass();
                if (jVar.f477646h.d(jVar)) {
                    cVar.U6().b().c();
                    cVar.U6().b().clearFocus();
                    cVar.m174141x36654fab();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
