package sf5;

/* loaded from: classes15.dex */
public final class c implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final android.app.Activity activity, final android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (z17) {
            sf5.e.f489164c.c(activity, bundle);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = z17 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
        if (activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.ui.component.support.ActivityLifecycleInjector$registerActivityLifecycleCallbacks$1$onActivityCreated$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
            /* renamed from: onPostCreate */
            public final void m80400xc2f8cfb() {
                sf5.e.f489164c.a(activity, bundle);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onPreDestroy */
            public final void m80401x699b3716() {
                sf5.e.f489164c.d(activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            sf5.e.f489164c.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }
}
