package hb5;

/* loaded from: classes11.dex */
public class r0 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f361787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 f361788e;

    public r0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8, android.app.ProgressDialog progressDialog) {
        this.f361788e = activityC21589xad4109a8;
        this.f361787d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f361788e.F;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f361787d;
        if (progressDialog != null) {
            s01.g aj6 = r01.q3.aj();
            com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361788e;
            aj6.D0(activityC21589xad4109a8.f279478p);
            r01.q3.Ui().y0(activityC21589xad4109a8.f279478p);
            progressDialog.dismiss();
        }
    }
}
