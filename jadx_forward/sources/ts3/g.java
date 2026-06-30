package ts3;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f503200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f503201e;

    public g(ts3.h hVar, android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f503200d = progressDialog;
        this.f503201e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f503200d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f503201e.mo50305x3d8a09a2(0);
        }
    }
}
