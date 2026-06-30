package sc2;

/* loaded from: classes2.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f487417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487418f;

    public f3(in5.s0 s0Var, sc2.m3 m3Var, android.view.View view) {
        this.f487416d = s0Var;
        this.f487417e = m3Var;
        this.f487418f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f487416d;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.r2o);
        android.view.View view = this.f487418f;
        sc2.m3 m3Var = this.f487417e;
        if (imageView != null) {
            sc2.m3.G(m3Var, s0Var, imageView, "onConfigurationChanged");
            m3Var.M(s0Var, view, true, "onConfigurationChanged");
        }
        m3Var.f487605x = true;
        view.getViewTreeObserver().addOnPreDrawListener(m3Var);
    }
}
