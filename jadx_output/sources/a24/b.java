package a24;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.AlphaAnimation f872e;

    public b(android.view.View view, android.view.animation.AlphaAnimation alphaAnimation) {
        this.f871d = view;
        this.f872e = alphaAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f871d.startAnimation(this.f872e);
    }
}
