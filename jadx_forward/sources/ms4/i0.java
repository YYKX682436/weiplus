package ms4;

/* loaded from: classes8.dex */
public final class i0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f412575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f412576e;

    public i0(android.app.Activity activity, ms4.j0 j0Var) {
        this.f412575d = activity;
        this.f412576e = j0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Activity activity = this.f412575d;
        boolean isFinishing = activity.isFinishing();
        ms4.j0 j0Var = this.f412576e;
        if (!isFinishing && !activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "cancelPrepareRecharge, mPrepareCgi: " + j0Var.f412583d);
            ks4.h hVar = j0Var.f412583d;
            if (hVar != null) {
                hVar.j();
            }
            activity.finish();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = j0Var.f412582c;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        u3Var.dismiss();
        j0Var.f412582c = null;
    }
}
