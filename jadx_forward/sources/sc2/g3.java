package sc2;

/* loaded from: classes2.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f487441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487442f;

    public g3(in5.s0 s0Var, sc2.m3 m3Var, android.view.View view) {
        this.f487440d = s0Var;
        this.f487441e = m3Var;
        this.f487442f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f487440d;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.r2o);
        if (imageView != null) {
            sc2.m3 m3Var = this.f487441e;
            sc2.m3.G(m3Var, s0Var, imageView, "onPreDraw");
            m3Var.M(s0Var, this.f487442f, true, "onPreDraw");
        }
    }
}
