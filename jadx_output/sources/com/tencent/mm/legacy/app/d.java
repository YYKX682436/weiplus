package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class d implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
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
        com.tencent.mm.legacy.app.g.f68500e = com.tencent.mm.legacy.app.g.a(activity);
        synchronized (com.tencent.mm.legacy.app.g.class) {
            com.tencent.mm.legacy.app.g.f68499d = false;
            com.tencent.mm.legacy.app.g.b().remove("kLastCallOnStopClientVersion");
        }
        java.lang.String a17 = com.tencent.mm.legacy.app.g.a(activity);
        synchronized (com.tencent.mm.legacy.app.g.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Calling markOnStartCalled, activity: %s, skip_rest: %s", a17, java.lang.Boolean.valueOf(com.tencent.mm.legacy.app.g.f68498c));
            if (com.tencent.mm.legacy.app.g.f68498c) {
                return;
            }
            if (com.tencent.mm.legacy.app.g.b().getInt("kLastCallOnStartClientVersion", 0) != com.tencent.mm.sdk.platformtools.z.f193112h) {
                com.tencent.mm.legacy.app.g.b().putInt("kLastCallOnStartClientVersion", com.tencent.mm.sdk.platformtools.z.f193112h);
            }
            com.tencent.mm.legacy.app.g.f68498c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (android.text.TextUtils.equals(com.tencent.mm.legacy.app.g.f68500e, com.tencent.mm.legacy.app.g.a(activity))) {
            java.lang.String a17 = com.tencent.mm.legacy.app.g.a(activity);
            synchronized (com.tencent.mm.legacy.app.g.class) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Calling markOnStopCalled, activity: %s, skip_rest: %s", a17, java.lang.Boolean.valueOf(com.tencent.mm.legacy.app.g.f68499d));
                if (com.tencent.mm.legacy.app.g.f68499d) {
                    return;
                }
                if (com.tencent.mm.legacy.app.g.b().getInt("kLastCallOnStopClientVersion", 0) != com.tencent.mm.sdk.platformtools.z.f193112h) {
                    com.tencent.mm.legacy.app.g.b().putInt("kLastCallOnStopClientVersion", com.tencent.mm.sdk.platformtools.z.f193112h);
                }
                com.tencent.mm.legacy.app.g.f68499d = true;
            }
        }
    }
}
