package vi1;

/* loaded from: classes7.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.x20 f519032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f519033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f519034f;

    public x3(r45.x20 x20Var, vi1.z3 z3Var, android.app.ProgressDialog progressDialog) {
        this.f519032d = x20Var;
        this.f519033e = z3Var;
        this.f519034f = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.x20 x20Var = this.f519032d;
        if (x20Var == null) {
            vi1.z3.e(this.f519033e, -1, "", "", "", "");
        } else {
            vi1.z3.e(this.f519033e, x20Var.f471223d, x20Var.f471224e, x20Var.f471225f, x20Var.f471227h, x20Var.f471228i);
        }
        this.f519034f.dismiss();
    }
}
