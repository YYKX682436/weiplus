package androidx.fragment.app;

/* loaded from: classes14.dex */
public class u2 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.x2 f11491g;

    public u2(androidx.fragment.app.x2 x2Var, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
        this.f11491g = x2Var;
        this.f11485a = obj;
        this.f11486b = arrayList;
        this.f11487c = obj2;
        this.f11488d = arrayList2;
        this.f11489e = obj3;
        this.f11490f = arrayList3;
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
        androidx.fragment.app.x2 x2Var = this.f11491g;
        java.lang.Object obj = this.f11485a;
        if (obj != null) {
            x2Var.o(obj, this.f11486b, null);
        }
        java.lang.Object obj2 = this.f11487c;
        if (obj2 != null) {
            x2Var.o(obj2, this.f11488d, null);
        }
        java.lang.Object obj3 = this.f11489e;
        if (obj3 != null) {
            x2Var.o(obj3, this.f11490f, null);
        }
    }
}
