package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class c7 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f53364d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.ToolsProfile f53365e;

    public c7(com.tencent.mm.app.ToolsProfile toolsProfile) {
        this.f53365e = toolsProfile;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f53365e.f53287b++;
        ((java.util.HashSet) this.f53364d).add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        boolean z17;
        r0.f53287b--;
        if (this.f53365e.f53287b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProcessLocker", "clearLock, beforeReset %d", java.lang.Integer.valueOf(com.tencent.mm.app.d7.f53395a.getAndSet(0)));
            if (com.tencent.xweb.WebView.f220192p && by5.u3.b(org.xwalk.core.XWalkEnvironment.f347970c) > 0) {
                by5.c4.f("WebView", "needRebootProcess, true because of has installed xweb core");
            } else if (!com.tencent.xweb.WebView.y0() || org.xwalk.core.XWalkEnvironment.d() <= 0 || org.xwalk.core.XWalkEnvironment.h() <= org.xwalk.core.XWalkEnvironment.d()) {
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProfile", "onActivityDestroyed, xwebCanReboot = %b", java.lang.Boolean.valueOf(z17));
                if (z17 && !com.tencent.mm.app.d7.b()) {
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProfile", "onActivityDestroyed, xwebCanReboot = %b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                int myPid2 = android.os.Process.myPid();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(myPid2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj2, "com/tencent/mm/app/ToolsProfile$2", "onActivityDestroyed", "(Landroid/app/Activity;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        ((java.util.HashSet) this.f53364d).remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        ((java.util.HashSet) this.f53364d).remove(activity);
        com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProcessLocker", "doLocalLock, counter %d", java.lang.Integer.valueOf(com.tencent.mm.app.d7.f53395a.incrementAndGet()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (((java.util.HashSet) this.f53364d).contains(activity)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ToolsProcessLocker", "doLocalUnlock, counter %d", java.lang.Integer.valueOf(com.tencent.mm.app.d7.f53395a.decrementAndGet()));
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
