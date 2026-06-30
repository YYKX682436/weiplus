package sp3;

/* loaded from: classes7.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks, com.p314xaae8f345.mm.app.t2, com.p314xaae8f345.mm.app.h4 {

    /* renamed from: g, reason: collision with root package name */
    public static sp3.b f492836g;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f492837d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f492838e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f492839f;

    public b(java.lang.String str) {
        this.f492839f = str;
        this.f492838e = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("fg_killed_state_" + str);
    }

    public static sp3.b c(java.lang.String str) {
        if (f492836g == null) {
            f492836g = new sp3.b(str.replace(":", "_"));
        }
        return f492836g;
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        int i17 = this.f492837d;
        if (!((this.f492837d & 4) == 4)) {
            this.f492837d |= 4;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f492837d);
    }

    public void b() {
        this.f492837d = this.f492838e.o("state", 0);
        java.lang.Integer.toBinaryString(this.f492837d);
        if ((this.f492837d & 1) == 1) {
            if ((this.f492837d & 2) == 2) {
                if (!((this.f492837d & 4) == 4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForegroundKilledDetect", "%s: LAST STATE ERROR: %s", this.f492839f, java.lang.Integer.toBinaryString(this.f492837d));
                    gm0.j1.i().c(new sp3.a(this));
                }
            }
        }
        this.f492837d &= -2;
        this.f492837d &= -3;
        this.f492837d &= -5;
        d();
    }

    public final void d() {
        this.f492838e.A("state", this.f492837d);
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void e(int i17, java.lang.String str) {
        int i18 = this.f492837d;
        if (!((this.f492837d & 4) == 4)) {
            this.f492837d |= 4;
            d();
        }
        java.lang.Integer.toBinaryString(i18);
        java.lang.Integer.toBinaryString(this.f492837d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        int i17 = this.f492837d;
        if ((this.f492837d & 2) == 2) {
            this.f492837d &= -3;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f492837d);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        int i17 = this.f492837d;
        if (!((this.f492837d & 2) == 2)) {
            this.f492837d |= 2;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f492837d);
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

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        int i17 = this.f492837d;
        if ((this.f492837d & 1) == 1) {
            this.f492837d &= -2;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f492837d);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        int i17 = this.f492837d;
        if (!((this.f492837d & 1) == 1)) {
            this.f492837d |= 1;
            d();
        }
        java.lang.Integer.toBinaryString(i17);
        java.lang.Integer.toBinaryString(this.f492837d);
    }
}
