package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
public final class i implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.Boolean> f127967a = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.j.a());

    /* renamed from: b, reason: collision with root package name */
    private volatile java.lang.ref.WeakReference<android.app.Activity> f127968b;

    /* renamed from: c, reason: collision with root package name */
    private volatile java.lang.Boolean f127969c;

    /* renamed from: d, reason: collision with root package name */
    private volatile com.tencent.liteav.base.util.i.a f127970d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.Set<java.lang.Integer> f127971e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Set<java.lang.Integer> f127972f;

    /* loaded from: classes13.dex */
    public interface a {
        void a(boolean z17);
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i f127973a = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i(0);
    }

    public /* synthetic */ i(byte b17) {
        this();
    }

    public static void a(boolean z17) {
        f127967a.a(java.lang.Boolean.valueOf(z17));
    }

    public final synchronized boolean b() {
        if (this.f127969c == null) {
            this.f127969c = f127967a.a();
        }
        return this.f127969c.booleanValue();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(android.app.Activity activity) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("ProcessLifecycleOwner", "onActivityDestroyed, activity=".concat(java.lang.String.valueOf(activity)), new java.lang.Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(android.app.Activity activity) {
        this.f127972f.add(java.lang.Integer.valueOf(activity.hashCode()));
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
        if (this.f127971e.contains(java.lang.Integer.valueOf(hashCode))) {
            this.f127971e.remove(java.lang.Integer.valueOf(hashCode));
            if (this.f127971e.size() != 0) {
                z17 = false;
            }
            b(z17);
        } else if (this.f127971e.size() != 0) {
            b(false);
        } else if (this.f127972f.contains(java.lang.Integer.valueOf(hashCode))) {
            b(true);
        }
        this.f127972f.remove(java.lang.Integer.valueOf(hashCode));
    }

    private i() {
        this.f127968b = null;
        this.f127969c = null;
        this.f127971e = new java.util.HashSet();
        this.f127972f = new java.util.HashSet();
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("ProcessLifecycleOwner", "ProcessStateOwner init failed. Context is null", new java.lang.Object[0]);
        } else {
            ((android.app.Application) m29240x6e669035.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        }
    }

    public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i a() {
        return com.tencent.liteav.base.util.i.b.f127973a;
    }

    public final synchronized void a(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.f127968b;
        if ((weakReference != null ? weakReference.get() : null) != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("ProcessLifecycleOwner", "activity is exists, don't need activity from user", new java.lang.Object[0]);
            return;
        }
        this.f127968b = new java.lang.ref.WeakReference<>(activity);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("ProcessLifecycleOwner", "update activity to " + activity + " from user", new java.lang.Object[0]);
    }

    private synchronized void b(boolean z17) {
        if (this.f127969c == null || this.f127969c.booleanValue() != z17) {
            this.f127969c = java.lang.Boolean.valueOf(z17);
            f127967a.a(java.lang.Boolean.valueOf(z17));
            if (this.f127970d != null) {
                this.f127970d.a(this.f127969c.booleanValue());
            }
        }
    }

    private void b(android.app.Activity activity) {
        this.f127971e.add(java.lang.Integer.valueOf(activity.hashCode()));
        this.f127968b = new java.lang.ref.WeakReference<>(activity);
        b(false);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("ProcessLifecycleOwner", "update activity to ".concat(java.lang.String.valueOf(activity)), new java.lang.Object[0]);
    }

    public final synchronized void a(com.tencent.liteav.base.util.i.a aVar) {
        this.f127970d = aVar;
    }

    private static boolean a(android.content.Context context) {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager == null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("ProcessLifecycleOwner", "activityManager is null.", new java.lang.Object[0]);
                return false;
            }
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("ProcessLifecycleOwner", "processInfoList is null.", new java.lang.Object[0]);
                return false;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("ProcessLifecycleOwner", "Get App background state failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return false;
        }
    }
}
