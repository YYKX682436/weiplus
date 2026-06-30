package a24;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.AlphaAnimation f82405e;

    public b(android.view.View view, android.view.animation.AlphaAnimation alphaAnimation) {
        this.f82404d = view;
        this.f82405e = alphaAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f82404d.startAnimation(this.f82405e);
    }
}
