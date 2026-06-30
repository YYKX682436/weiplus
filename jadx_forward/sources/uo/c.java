package uo;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f511039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f511040e;

    public c(android.content.Context context, yz5.l lVar) {
        this.f511039d = context;
        this.f511040e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f511039d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        uo.n nVar = uo.n.f511055a;
        yz5.l lVar = this.f511040e;
        if (lVar == null) {
            lVar = uo.n.f511059e;
        }
        android.app.Dialog dialog = lVar != null ? (android.app.Dialog) lVar.mo146xb9724478(context) : null;
        uo.n.f511060f = dialog;
        if (dialog != null) {
            dialog.show();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "show: mErrAlertHold=" + uo.n.f511060f);
        ap.a.a(1, "openCameraErrAlert", new java.lang.Throwable(), null, new java.lang.String[0]);
    }
}
