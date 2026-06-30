package sx5;

/* loaded from: classes13.dex */
public class k0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495279d;

    public k0(sx5.a1 a1Var) {
        this.f495279d = a1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.ref.WeakReference weakReference;
        sx5.a1 a1Var = this.f495279d;
        if (activity == a1Var.z() || ((weakReference = a1Var.f495204e) != null && weakReference.get() == activity)) {
            by5.c4.f("XWebNativeInterface", "onActivityDestroyed");
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = a1Var.f495202J;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        sx5.a1 a1Var = this.f495279d;
        if (activity == a1Var.z()) {
            by5.c4.f("XWebNativeInterface", "onActivityPaused");
            a1Var.G1 = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        sx5.a1 a1Var = this.f495279d;
        if (activity == a1Var.z()) {
            by5.c4.f("XWebNativeInterface", "onActivityResumed");
            a1Var.G1 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        if (activity == this.f495279d.z()) {
            by5.c4.f("XWebNativeInterface", "onActivityStarted");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        sx5.a1 a1Var = this.f495279d;
        if (activity == a1Var.z()) {
            by5.c4.f("XWebNativeInterface", "onActivityStopped");
            a1Var.G1 = false;
        }
    }
}
