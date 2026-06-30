package ts3;

/* loaded from: classes9.dex */
public class e implements ss3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f503195a;

    public e(ts3.f fVar, android.app.ProgressDialog progressDialog) {
        this.f503195a = progressDialog;
    }

    @Override // ss3.c0
    public boolean a() {
        return false;
    }

    @Override // ss3.c0
    public void b() {
        android.app.ProgressDialog progressDialog = this.f503195a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
