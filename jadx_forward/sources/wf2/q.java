package wf2;

/* loaded from: classes10.dex */
public final class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f527146d;

    public q(wf2.a0 a0Var) {
        this.f527146d = a0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveScreenShotShareEntranceController", "#onEntranceClick cancel dialog by user");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f527146d.f527095s;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
