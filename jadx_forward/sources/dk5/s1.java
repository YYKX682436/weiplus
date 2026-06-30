package dk5;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.t1 f316405d;

    public s1(dk5.t1 t1Var) {
        this.f316405d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f316405d.f316431h.f292501u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316405d.f316431h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC22567x42e895b8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activityC22567x42e895b8, null, null);
        ku5.u0 u0Var = ku5.t0.f394148d;
        dk5.r1 r1Var = new dk5.r1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(r1Var, 2000L, false);
    }
}
