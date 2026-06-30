package gz1;

/* loaded from: classes13.dex */
public abstract class e implements rk5.a {
    @Override // rk5.a
    public void D5(java.lang.Object caller, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
    }

    @Override // rk5.a
    public void H(android.app.Activity caller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
    }

    public abstract void a(android.app.Activity activity);

    @Override // rk5.a
    public void cc(android.app.Activity caller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        gz1.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz1.d.f359251h;
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(activity.hashCode())) || (bVar = (gz1.b) gz1.d.f359250g.get(concurrentHashMap.get(java.lang.Integer.valueOf(activity.hashCode())))) == null) {
            return;
        }
        bVar.f359243i = false;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) bVar.f359235a.get();
        if (componentCallbacksC1101xa17d4670 != null) {
            gz1.d.f359247d.p(componentCallbacksC1101xa17d4670, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        a(activity);
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
