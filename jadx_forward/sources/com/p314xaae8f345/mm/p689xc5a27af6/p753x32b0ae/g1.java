package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class g1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f148690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148692h;

    public g1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, java.lang.String str, int i17, long j17, java.lang.String str2) {
        this.f148692h = iVar;
        this.f148688d = str;
        this.f148689e = i17;
        this.f148690f = j17;
        this.f148691g = str2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f148689e);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f148690f);
        java.lang.String str = this.f148688d;
        java.lang.String str2 = this.f148691g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onActivityDestroyed, appId:%s, engineId:%s, appUuid:%s, page:%s", str, valueOf, valueOf2, str2);
        this.f148692h.Yj(str, str2);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onActivityStopped");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.f1 f1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.f1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(f1Var, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, false);
    }
}
