package androidx.fragment.app;

/* loaded from: classes14.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f11273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m3 f11276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m f11277h;

    public d(androidx.fragment.app.p pVar, android.view.ViewGroup viewGroup, android.view.View view, boolean z17, androidx.fragment.app.m3 m3Var, androidx.fragment.app.m mVar) {
        this.f11273d = viewGroup;
        this.f11274e = view;
        this.f11275f = z17;
        this.f11276g = m3Var;
        this.f11277h = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.ViewGroup viewGroup = this.f11273d;
        android.view.View view = this.f11274e;
        viewGroup.endViewTransition(view);
        if (this.f11275f) {
            this.f11276g.f11400a.a(view);
        }
        this.f11277h.a();
    }
}
