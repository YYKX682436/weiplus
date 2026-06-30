package com.p314xaae8f345.mm.p815xbe0af3c9.app;

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
        com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150033e = com.p314xaae8f345.mm.p815xbe0af3c9.app.g.a(activity);
        synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
            com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150032d = false;
            com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().remove("kLastCallOnStopClientVersion");
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p815xbe0af3c9.app.g.a(activity);
        synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Calling markOnStartCalled, activity: %s, skip_rest: %s", a17, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150031c));
            if (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150031c) {
                return;
            }
            if (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().getInt("kLastCallOnStartClientVersion", 0) != com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) {
                com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().putInt("kLastCallOnStartClientVersion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h);
            }
            com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150031c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        if (android.text.TextUtils.equals(com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150033e, com.p314xaae8f345.mm.p815xbe0af3c9.app.g.a(activity))) {
            java.lang.String a17 = com.p314xaae8f345.mm.p815xbe0af3c9.app.g.a(activity);
            synchronized (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.class) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Calling markOnStopCalled, activity: %s, skip_rest: %s", a17, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150032d));
                if (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150032d) {
                    return;
                }
                if (com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().getInt("kLastCallOnStopClientVersion", 0) != com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) {
                    com.p314xaae8f345.mm.p815xbe0af3c9.app.g.b().putInt("kLastCallOnStopClientVersion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h);
                }
                com.p314xaae8f345.mm.p815xbe0af3c9.app.g.f150032d = true;
            }
        }
    }
}
