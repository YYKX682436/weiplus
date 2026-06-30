package w45;

/* loaded from: classes.dex */
public final class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.w0 f524452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w45.p f524453e;

    public o(com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var, w45.p pVar) {
        this.f524452d = w0Var;
        this.f524453e = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f524452d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f524453e;
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
        if (progressDialog == null || progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }
}
