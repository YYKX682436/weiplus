package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
public final class i implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.util.r<java.lang.Boolean> f46434a = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.util.j.a());

    /* renamed from: b, reason: collision with root package name */
    private volatile java.lang.ref.WeakReference<android.app.Activity> f46435b;

    /* renamed from: c, reason: collision with root package name */
    private volatile java.lang.Boolean f46436c;

    /* renamed from: d, reason: collision with root package name */
    private volatile com.tencent.liteav.base.util.i.a f46437d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.Set<java.lang.Integer> f46438e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Set<java.lang.Integer> f46439f;

    /* loaded from: classes13.dex */
    public interface a {
        void a(boolean z17);
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final com.tencent.liteav.base.util.i f46440a = new com.tencent.liteav.base.util.i(0);
    }

    public /* synthetic */ i(byte b17) {
        this();
    }

    public static void a(boolean z17) {
        f46434a.a(java.lang.Boolean.valueOf(z17));
    }

    public final synchronized boolean b() {
        if (this.f46436c == null) {
            this.f46436c = f46434a.a();
        }
        return this.f46436c.booleanValue();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(android.app.Activity activity) {
        com.tencent.liteav.base.Log.i("ProcessLifecycleOwner", "onActivityDestroyed, activity=".concat(java.lang.String.valueOf(activity)), new java.lang.Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(android.app.Activity activity) {
        this.f46439f.add(java.lang.Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(android.app.Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(android.app.Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(android.app.Activity activity) {
        int hashCode = activity.hashCode();
        boolean z17 = true;
        if (this.f46438e.contains(java.lang.Integer.valueOf(hashCode))) {
            this.f46438e.remove(java.lang.Integer.valueOf(hashCode));
            if (this.f46438e.size() != 0) {
                z17 = false;
            }
            b(z17);
        } else if (this.f46438e.size() != 0) {
            b(false);
        } else if (this.f46439f.contains(java.lang.Integer.valueOf(hashCode))) {
            b(true);
        }
        this.f46439f.remove(java.lang.Integer.valueOf(hashCode));
    }

    private i() {
        this.f46435b = null;
        this.f46436c = null;
        this.f46438e = new java.util.HashSet();
        this.f46439f = new java.util.HashSet();
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            com.tencent.liteav.base.Log.e("ProcessLifecycleOwner", "ProcessStateOwner init failed. Context is null", new java.lang.Object[0]);
        } else {
            ((android.app.Application) applicationContext.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        }
    }

    public static com.tencent.liteav.base.util.i a() {
        return com.tencent.liteav.base.util.i.b.f46440a;
    }

    public final synchronized void a(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.f46435b;
        if ((weakReference != null ? weakReference.get() : null) != null) {
            com.tencent.liteav.base.Log.i("ProcessLifecycleOwner", "activity is exists, don't need activity from user", new java.lang.Object[0]);
            return;
        }
        this.f46435b = new java.lang.ref.WeakReference<>(activity);
        com.tencent.liteav.base.Log.i("ProcessLifecycleOwner", "update activity to " + activity + " from user", new java.lang.Object[0]);
    }

    private synchronized void b(boolean z17) {
        if (this.f46436c == null || this.f46436c.booleanValue() != z17) {
            this.f46436c = java.lang.Boolean.valueOf(z17);
            f46434a.a(java.lang.Boolean.valueOf(z17));
            if (this.f46437d != null) {
                this.f46437d.a(this.f46436c.booleanValue());
            }
        }
    }

    private void b(android.app.Activity activity) {
        this.f46438e.add(java.lang.Integer.valueOf(activity.hashCode()));
        this.f46435b = new java.lang.ref.WeakReference<>(activity);
        b(false);
        com.tencent.liteav.base.Log.i("ProcessLifecycleOwner", "update activity to ".concat(java.lang.String.valueOf(activity)), new java.lang.Object[0]);
    }

    public final synchronized void a(com.tencent.liteav.base.util.i.a aVar) {
        this.f46437d = aVar;
    }

    private static boolean a(android.content.Context context) {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null) {
                com.tencent.liteav.base.Log.e("ProcessLifecycleOwner", "activityManager is null.", new java.lang.Object[0]);
                return false;
            }
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.tencent.liteav.base.Log.e("ProcessLifecycleOwner", "processInfoList is null.", new java.lang.Object[0]);
                return false;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e("ProcessLifecycleOwner", "Get App background state failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return false;
        }
    }
}
