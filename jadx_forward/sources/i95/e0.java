package i95;

/* loaded from: classes12.dex */
public class e0 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        i95.n0.f371360k = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        android.view.View decorView;
        if (com.p314xaae8f345.mm.app.v5.a(i95.n0.f371350a) != com.p314xaae8f345.mm.app.v5.f135384h) {
            return;
        }
        if (!k95.b.a(activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceManager", "catch first screen '%s' but not the first business ui, skip notify this time.", activity);
            return;
        }
        if (!i95.n0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceManager", "not login, don't regard this ui '%s' as first screen, skip notify this time.", activity);
            return;
        }
        android.view.Window window = activity.getWindow();
        if (window == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceManager", "fail to get window of '%s', notify account init now.", activity);
            decorView = null;
        } else {
            decorView = window.getDecorView();
            if (decorView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceManager", "fail to get decor view of '%s', notify account init now.", activity);
            }
        }
        if (decorView == null) {
            i95.n0.f371362m.postAtFrontOfQueue(i95.n0.f371365p);
        } else if (decorView.getViewTreeObserver() != null) {
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new i95.d0(this, decorView));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceManager", "fail to get view tree observer of '%s', notify account init now.", activity);
            i95.n0.f371362m.postAtFrontOfQueue(i95.n0.f371365p);
        }
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
