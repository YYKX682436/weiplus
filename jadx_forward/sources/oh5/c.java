package oh5;

/* loaded from: classes12.dex */
public final class c extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        oh5.d.f427022c = new java.lang.ref.WeakReference(activity);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        oh5.d.f427022c = new java.lang.ref.WeakReference(activity);
    }
}
