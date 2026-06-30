package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class o0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f92961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.p2 f92964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j3.h f92965h;

    public o0(android.view.ViewGroup viewGroup, android.view.View view, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.p2 p2Var, j3.h hVar) {
        this.f92961d = viewGroup;
        this.f92962e = view;
        this.f92963f = componentCallbacksC1101xa17d4670;
        this.f92964g = p2Var;
        this.f92965h = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        boolean z17;
        android.view.ViewGroup viewGroup = this.f92961d;
        android.view.View view = this.f92962e;
        viewGroup.endViewTransition(view);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92963f;
        android.animation.Animator m7435x4c74685d = componentCallbacksC1101xa17d4670.m7435x4c74685d();
        componentCallbacksC1101xa17d4670.m7561x472cc969(null);
        if (m7435x4c74685d == null || viewGroup.indexOfChild(view) >= 0) {
            return;
        }
        j3.h hVar = this.f92965h;
        p012xc85e97e9.p087x9da2e250.app.d1 d1Var = (p012xc85e97e9.p087x9da2e250.app.d1) this.f92964g;
        d1Var.getClass();
        synchronized (hVar) {
            z17 = hVar.f378866a;
        }
        if (z17) {
            return;
        }
        d1Var.f92834a.m7711x134df12f(componentCallbacksC1101xa17d4670, hVar);
    }
}
