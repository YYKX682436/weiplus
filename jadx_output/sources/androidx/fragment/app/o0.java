package androidx.fragment.app;

/* loaded from: classes14.dex */
public class o0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f11428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.p2 f11431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j3.h f11432h;

    public o0(android.view.ViewGroup viewGroup, android.view.View view, androidx.fragment.app.Fragment fragment, androidx.fragment.app.p2 p2Var, j3.h hVar) {
        this.f11428d = viewGroup;
        this.f11429e = view;
        this.f11430f = fragment;
        this.f11431g = p2Var;
        this.f11432h = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        boolean z17;
        android.view.ViewGroup viewGroup = this.f11428d;
        android.view.View view = this.f11429e;
        viewGroup.endViewTransition(view);
        androidx.fragment.app.Fragment fragment = this.f11430f;
        android.animation.Animator animator2 = fragment.getAnimator();
        fragment.setAnimator(null);
        if (animator2 == null || viewGroup.indexOfChild(view) >= 0) {
            return;
        }
        j3.h hVar = this.f11432h;
        androidx.fragment.app.d1 d1Var = (androidx.fragment.app.d1) this.f11431g;
        d1Var.getClass();
        synchronized (hVar) {
            z17 = hVar.f297333a;
        }
        if (z17) {
            return;
        }
        d1Var.f11301a.removeCancellationSignal(fragment, hVar);
    }
}
