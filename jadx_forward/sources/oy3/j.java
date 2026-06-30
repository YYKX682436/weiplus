package oy3;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431563d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431563d = activityC17256xc70b42d4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431563d;
        android.app.ProgressDialog progressDialog = activityC17256xc70b42d4.f240133r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        activityC17256xc70b42d4.f240133r = null;
    }
}
