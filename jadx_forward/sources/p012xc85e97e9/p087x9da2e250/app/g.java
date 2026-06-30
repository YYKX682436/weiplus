package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class g implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f92849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m f92851c;

    public g(p012xc85e97e9.p087x9da2e250.app.p pVar, android.view.ViewGroup viewGroup, android.view.View view, p012xc85e97e9.p087x9da2e250.app.m mVar) {
        this.f92849a = viewGroup;
        this.f92850b = view;
        this.f92851c = mVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f92849a.post(new p012xc85e97e9.p087x9da2e250.app.f(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
