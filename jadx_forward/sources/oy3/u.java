package oy3;

/* loaded from: classes13.dex */
public final class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431578d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431578d = activityC17256xc70b42d4;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.ProgressDialog progressDialog = this.f431578d.f240133r;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
