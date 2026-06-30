package uy3;

/* loaded from: classes8.dex */
public final class d0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f513466d;

    public d0(uy3.j0 j0Var) {
        this.f513466d = j0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        uy3.j0 j0Var = this.f513466d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "dismiss dialog exitType: %s", java.lang.Integer.valueOf(j0Var.f513491s));
        uy3.k0 k0Var = j0Var.f513488p;
        if (k0Var != null) {
            ((uy3.m0) k0Var).a(dialogInterface, j0Var.f513491s);
        }
        ((jz5.n) j0Var.F).mo141623x754a37bb();
    }
}
