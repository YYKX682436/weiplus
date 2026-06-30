package au3;

/* loaded from: classes10.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f95635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ au3.l f95636e;

    public g(boolean z17, au3.l lVar) {
        this.f95635d = z17;
        this.f95636e = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f95635d) {
            nu3.i.f421751a.n("KEY_WESEE_DIALOG_OPERATION", 2);
        } else {
            nu3.i.f421751a.n("KEY_WESEE_DIALOG_OPERATION", 4);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCropVideoPlugin", "dialog cancel");
        au3.l lVar = this.f95636e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = lVar.f95654q;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j0Var, "null cannot be cast to non-null type android.app.Dialog");
            if (j0Var.isShowing()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = lVar.f95654q;
                if (j0Var2 != null) {
                    j0Var2.dismiss();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCropVideoPlugin", "click no dismiss dialog");
            }
        }
    }
}
