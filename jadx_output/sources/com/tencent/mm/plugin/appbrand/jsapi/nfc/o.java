package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class o implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public boolean f82418d = false;

    public o(com.tencent.mm.plugin.appbrand.jsapi.nfc.r rVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onActivityPaused");
        cd1.i.f40622l.d();
        this.f82418d = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onActivityResumed");
        if (this.f82418d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "onActivityResumed isPaused and do checLogic");
            this.f82418d = false;
            cd1.i.f40622l.a();
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
