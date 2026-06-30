package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class n0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f92942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.p2 f92944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j3.h f92945d;

    public n0(android.view.ViewGroup viewGroup, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.p2 p2Var, j3.h hVar) {
        this.f92942a = viewGroup;
        this.f92943b = componentCallbacksC1101xa17d4670;
        this.f92944c = p2Var;
        this.f92945d = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f92942a.post(new p012xc85e97e9.p087x9da2e250.app.m0(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
