package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f92806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f92808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m3 f92809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m f92810h;

    public d(p012xc85e97e9.p087x9da2e250.app.p pVar, android.view.ViewGroup viewGroup, android.view.View view, boolean z17, p012xc85e97e9.p087x9da2e250.app.m3 m3Var, p012xc85e97e9.p087x9da2e250.app.m mVar) {
        this.f92806d = viewGroup;
        this.f92807e = view;
        this.f92808f = z17;
        this.f92809g = m3Var;
        this.f92810h = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.ViewGroup viewGroup = this.f92806d;
        android.view.View view = this.f92807e;
        viewGroup.endViewTransition(view);
        if (this.f92808f) {
            this.f92809g.f92933a.a(view);
        }
        this.f92810h.a();
    }
}
