package p61;

/* loaded from: classes11.dex */
public class r4 implements y61.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 f433898a;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494) {
        this.f433898a = activityC11370x9b57e494;
    }

    @Override // y61.f
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendUI", "syncAddrBookAndUpload onSyncEnd suc:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.System.currentTimeMillis();
            gm0.j1.d().g(new r61.t1(r61.q0.g(), r61.q0.e()));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494 activityC11370x9b57e494 = this.f433898a;
            android.app.ProgressDialog progressDialog = activityC11370x9b57e494.f154619g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                activityC11370x9b57e494.f154619g = null;
            }
        }
    }
}
