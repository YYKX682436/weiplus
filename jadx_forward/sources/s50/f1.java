package s50;

/* loaded from: classes12.dex */
public final class f1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f484581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f484584g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f484585h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f484586i;

    public f1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var, int i17, android.app.Application application) {
        this.f484581d = abstractActivityC21394xb3d2c0cf;
        this.f484582e = l1Var;
        this.f484583f = weakReference;
        this.f484584g = v0Var;
        this.f484585h = i17;
        this.f484586i = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity act, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity act) {
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
        if (act != this.f484581d || (activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) this.f484582e.f484616g.remove(java.lang.Integer.valueOf(this.f484585h))) == null) {
            return;
        }
        this.f484586i.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity act) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
        if (act != this.f484581d || ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) act).isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "nativeVoice: activity moved to background from showNativeVoiceForWebView");
        this.f484582e.Vi(this.f484583f);
        this.f484584g.y();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity act) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity act, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity act) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity act) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
    }
}
