package vi1;

/* loaded from: classes7.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f518974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f518975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f518976f;

    public r3(r45.yz5 yz5Var, vi1.z3 z3Var, android.app.ProgressDialog progressDialog) {
        this.f518974d = yz5Var;
        this.f518975e = z3Var;
        this.f518976f = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.z3 z3Var = this.f518975e;
        r45.yz5 yz5Var = this.f518974d;
        if (yz5Var == null) {
            vi1.z3.c(z3Var, -1);
        } else {
            vi1.z3.c(z3Var, yz5Var.f473071d);
        }
        z3Var.f519061r.b();
        this.f518976f.dismiss();
    }
}
