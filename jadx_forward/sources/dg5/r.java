package dg5;

/* loaded from: classes9.dex */
public class r implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f313927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg5.u f313928e;

    public r(dg5.u uVar, android.app.ProgressDialog progressDialog) {
        this.f313928e = uVar;
        this.f313927d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f313928e.f313937g;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f313927d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
