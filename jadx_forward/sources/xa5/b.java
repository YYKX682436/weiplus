package xa5;

/* loaded from: classes14.dex */
public final class b extends zb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f534372a;

    public b(wa5.f fVar, android.app.Activity activity) {
        this.f534372a = activity;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(android.transition.Transition transition) {
        android.app.Activity activity = this.f534372a;
        activity.getWindow().getSharedElementEnterTransition().removeListener(this);
        wa5.d.f525848a.a(activity).f525847f = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new xa5.a(activity));
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(android.transition.Transition transition) {
    }
}
