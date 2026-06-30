package cw2;

/* loaded from: classes15.dex */
public final class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f305504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f305506f;

    public r5(android.view.Surface surface, cw2.z5 z5Var, cw2.d6 d6Var) {
        this.f305504d = surface;
        this.f305505e = z5Var;
        this.f305506f = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Surface surface = this.f305504d;
        java.util.Objects.toString(surface);
        cw2.z5 z5Var = this.f305505e;
        java.util.Objects.toString(z5Var);
        long j17 = z5Var.f305669d;
        cw2.d6 d6Var = this.f305506f;
        if (j17 != 0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z5Var.f305671f, surface)) {
                return;
            } else {
                d6Var.f305182c.m47853xa1e5e8a7(z5Var.f305669d);
            }
        }
        z5Var.f305669d = d6Var.f305182c.m47843x5b51b352(surface, 0, 0);
        if (z5Var.f305669d == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Create swap chain failed. " + z5Var);
        } else {
            z5Var.f305671f = surface;
            z5Var.f305674i = null;
            java.util.Objects.toString(surface);
            java.util.Objects.toString(z5Var);
        }
    }
}
