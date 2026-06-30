package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class s0 implements android.app.Application.ActivityLifecycleCallbacks {
    /* renamed from: registerIn */
    public static void m7821x908b1b28(android.app.Activity activity) {
        activity.registerActivityLifecycleCallbacks(new p012xc85e97e9.p093xedfae76a.s0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.t0.a(activity, p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.t0.a(activity, p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.t0.a(activity, p012xc85e97e9.p093xedfae76a.m.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.t0.a(activity, p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.t0.a(activity, p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        p012xc85e97e9.p093xedfae76a.t0.a(activity, p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
