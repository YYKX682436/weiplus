package au3;

/* loaded from: classes10.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ au3.l f14103e;

    public g(boolean z17, au3.l lVar) {
        this.f14102d = z17;
        this.f14103e = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f14102d) {
            nu3.i.f340218a.n("KEY_WESEE_DIALOG_OPERATION", 2);
        } else {
            nu3.i.f340218a.n("KEY_WESEE_DIALOG_OPERATION", 4);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "dialog cancel");
        au3.l lVar = this.f14103e;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = lVar.f14121q;
        if (j0Var != null) {
            kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type android.app.Dialog");
            if (j0Var.isShowing()) {
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = lVar.f14121q;
                if (j0Var2 != null) {
                    j0Var2.dismiss();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "click no dismiss dialog");
            }
        }
    }
}
