package androidx.fragment.app;

/* loaded from: classes14.dex */
public class g implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f11316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m f11318c;

    public g(androidx.fragment.app.p pVar, android.view.ViewGroup viewGroup, android.view.View view, androidx.fragment.app.m mVar) {
        this.f11316a = viewGroup;
        this.f11317b = view;
        this.f11318c = mVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f11316a.post(new androidx.fragment.app.f(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
