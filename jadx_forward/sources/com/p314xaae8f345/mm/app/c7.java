package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public class c7 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f134897d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.C5028x8918ef6e f134898e;

    public c7(com.p314xaae8f345.mm.app.C5028x8918ef6e c5028x8918ef6e) {
        this.f134898e = c5028x8918ef6e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f134898e.f134820b++;
        ((java.util.HashSet) this.f134897d).add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        boolean z17;
        r0.f134820b--;
        if (this.f134898e.f134820b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessLocker", "clearLock, beforeReset %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.d7.f134928a.getAndSet(0)));
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301725p && by5.u3.b(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c) > 0) {
                by5.c4.f("WebView", "needRebootProcess, true because of has installed xweb core");
            } else if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0() || org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d() <= 0 || org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.h() <= org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d()) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProfile", "onActivityDestroyed, xwebCanReboot = %b", java.lang.Boolean.valueOf(z17));
                if (z17 && !com.p314xaae8f345.mm.app.d7.b()) {
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            } else {
                by5.c4.f("WebView", "needRebootProcess, true because of has newer xweb version");
            }
            z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProfile", "onActivityDestroyed, xwebCanReboot = %b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                int myPid2 = android.os.Process.myPid();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(myPid2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj2, "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        ((java.util.HashSet) this.f134897d).remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        ((java.util.HashSet) this.f134897d).remove(activity);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessLocker", "doLocalLock, counter %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.d7.f134928a.incrementAndGet()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (((java.util.HashSet) this.f134897d).contains(activity)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessLocker", "doLocalUnlock, counter %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.app.d7.f134928a.decrementAndGet()));
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
