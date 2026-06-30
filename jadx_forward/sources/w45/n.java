package w45;

/* loaded from: classes.dex */
public final class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.w0 f524450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w45.p f524451e;

    public n(com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var, w45.p pVar) {
        this.f524450d = w0Var;
        this.f524451e = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        gm0.j1.d().d(this.f524450d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f524451e;
        d17.q(255, pVar.f524456c);
        pVar.f524456c = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = pVar.f524457d;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            pVar.f524457d = null;
        }
        android.app.ProgressDialog progressDialog = pVar.f524459f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        w45.p.a(pVar);
        return false;
    }
}
