package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class v2 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f93030a;

    public v2(p012xc85e97e9.p087x9da2e250.app.x2 x2Var, java.lang.Runnable runnable) {
        this.f93030a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(android.transition.Transition transition) {
        this.f93030a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(android.transition.Transition transition) {
    }
}
