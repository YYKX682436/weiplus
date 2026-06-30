package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class w0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.d2 f93032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.x0 f93033e;

    public w0(p012xc85e97e9.p087x9da2e250.app.x0 x0Var, p012xc85e97e9.p087x9da2e250.app.d2 d2Var) {
        this.f93033e = x0Var;
        this.f93032d = d2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var = this.f93032d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
        d2Var.j();
        p012xc85e97e9.p087x9da2e250.app.n3.f((android.view.ViewGroup) componentCallbacksC1101xa17d4670.f3462x628b0b2.getParent(), this.f93033e.f93045d).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
