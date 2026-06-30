package um0;

/* loaded from: classes7.dex */
public final class d implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Application f510238d;

    public d(android.app.Application application) {
        this.f510238d = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        android.app.Application application = this.f510238d;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.samsung.android.emergencymode.SemEmergencyManager");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("sInstance");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mContext");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, application);
        } catch (java.lang.Exception unused) {
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
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
