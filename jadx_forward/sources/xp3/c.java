package xp3;

/* loaded from: classes12.dex */
public class c implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537452d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f537453e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f537454f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 f537455g;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 abstractC16790x31088328, xp3.b bVar) {
        this.f537455g = abstractC16790x31088328;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity.getClass().getSimpleName().endsWith("WeChatSplashActivity")) {
            this.f537453e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f537455g.e(), "WeChatSplashActivity was created!");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f537452d)) {
            this.f537452d = activity.getClass().getName();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.f537452d = activity.getClass().getName();
        this.f537454f = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f537452d)) {
            this.f537452d = activity.getClass().getName();
        }
        this.f537454f = false;
    }
}
