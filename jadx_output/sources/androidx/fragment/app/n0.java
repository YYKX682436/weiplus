package androidx.fragment.app;

/* loaded from: classes14.dex */
public class n0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f11409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.p2 f11411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3.h f11412d;

    public n0(android.view.ViewGroup viewGroup, androidx.fragment.app.Fragment fragment, androidx.fragment.app.p2 p2Var, j3.h hVar) {
        this.f11409a = viewGroup;
        this.f11410b = fragment;
        this.f11411c = p2Var;
        this.f11412d = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f11409a.post(new androidx.fragment.app.m0(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
