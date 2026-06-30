package vi1;

/* loaded from: classes7.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f518991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f518992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f518993f;

    public t3(r45.yz5 yz5Var, vi1.z3 z3Var, android.app.ProgressDialog progressDialog) {
        this.f518991d = yz5Var;
        this.f518992e = z3Var;
        this.f518993f = progressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.z3 z3Var = this.f518992e;
        r45.yz5 yz5Var = this.f518991d;
        if (yz5Var == null) {
            vi1.z3.c(z3Var, -1);
        } else {
            vi1.z3.c(z3Var, yz5Var.f473071d);
        }
        z3Var.f519061r.b();
        this.f518993f.dismiss();
    }
}
