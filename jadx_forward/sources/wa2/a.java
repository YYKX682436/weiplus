package wa2;

/* loaded from: classes3.dex */
public final class a implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f525634d;

    public a(yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f525634d = callback;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f525634d.mo147xb9724478(activity, bundle, java.lang.Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f525634d.mo147xb9724478(activity, null, java.lang.Boolean.FALSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity p07, android.os.Bundle p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}
