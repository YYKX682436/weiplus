package w45;

/* loaded from: classes11.dex */
public final class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f524440d;

    public g(w45.p pVar) {
        this.f524440d = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f524440d;
        d17.q(281, pVar.f524454a);
        gm0.j1.d().q(282, pVar.f524455b);
        pVar.f524454a = null;
        pVar.f524455b = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = pVar.f524458e;
        if (b4Var != null) {
            b4Var.d();
        }
        android.app.ProgressDialog progressDialog = pVar.f524459f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        pVar.c();
        return false;
    }
}
