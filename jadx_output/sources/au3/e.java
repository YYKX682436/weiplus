package au3;

/* loaded from: classes10.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f14099d;

    public e(au3.l lVar) {
        this.f14099d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "dialog cancel");
        au3.l lVar = this.f14099d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = lVar.f14122r;
        if (j0Var != null) {
            kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type android.app.Dialog");
            if (j0Var.isShowing()) {
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = lVar.f14122r;
                if (j0Var2 != null) {
                    j0Var2.dismiss();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EditCropVideoPlugin", "click no dismiss dialog");
            }
        }
    }
}
