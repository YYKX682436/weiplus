package w45;

/* loaded from: classes11.dex */
public final class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f524441d;

    public h(w45.p pVar) {
        this.f524441d = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f524441d;
        d17.q(281, pVar.f524454a);
        gm0.j1.d().q(282, pVar.f524455b);
        pVar.f524454a = null;
        pVar.f524455b = null;
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
