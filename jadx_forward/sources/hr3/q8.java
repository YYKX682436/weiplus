package hr3;

/* loaded from: classes5.dex */
public class q8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f365450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f365451e;

    public q8(android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f365450d = progressDialog;
        this.f365451e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f365450d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f365451e.mo50305x3d8a09a2(0);
        }
    }
}
