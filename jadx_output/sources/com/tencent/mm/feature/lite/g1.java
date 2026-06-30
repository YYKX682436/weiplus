package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class g1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f67157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67159h;

    public g1(com.tencent.mm.feature.lite.i iVar, java.lang.String str, int i17, long j17, java.lang.String str2) {
        this.f67159h = iVar;
        this.f67155d = str;
        this.f67156e = i17;
        this.f67157f = j17;
        this.f67158g = str2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f67156e);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f67157f);
        java.lang.String str = this.f67155d;
        java.lang.String str2 = this.f67158g;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onActivityDestroyed, appId:%s, engineId:%s, appUuid:%s, page:%s", str, valueOf, valueOf2, str2);
        this.f67159h.Yj(str, str2);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onActivityStopped");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.feature.lite.f1 f1Var = new com.tencent.mm.feature.lite.f1(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(f1Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, false);
    }
}
