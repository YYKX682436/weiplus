package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class u2 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f93018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f93020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f93022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.x2 f93024g;

    public u2(p012xc85e97e9.p087x9da2e250.app.x2 x2Var, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
        this.f93024g = x2Var;
        this.f93018a = obj;
        this.f93019b = arrayList;
        this.f93020c = obj2;
        this.f93021d = arrayList2;
        this.f93022e = obj3;
        this.f93023f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(android.transition.Transition transition) {
        p012xc85e97e9.p087x9da2e250.app.x2 x2Var = this.f93024g;
        java.lang.Object obj = this.f93018a;
        if (obj != null) {
            x2Var.o(obj, this.f93019b, null);
        }
        java.lang.Object obj2 = this.f93020c;
        if (obj2 != null) {
            x2Var.o(obj2, this.f93021d, null);
        }
        java.lang.Object obj3 = this.f93022e;
        if (obj3 != null) {
            x2Var.o(obj3, this.f93023f, null);
        }
    }
}
