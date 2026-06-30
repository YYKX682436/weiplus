package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public enum w {
    INSTANCE;


    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f135407s = com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a();

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f135408t = null;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f135409u = false;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f135410v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public static boolean f135411w = false;

    /* renamed from: x, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.m f135412x = new com.p314xaae8f345.mm.app.m(null);

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f135413y = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f135416e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f135417f;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f135415d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f135418g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f135419h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f135420i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f135421m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f135422n = false;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.t f135423o = new com.p314xaae8f345.mm.app.t(this, null);

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f135424p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f135425q = false;

    w() {
    }

    public static java.lang.ref.WeakReference k() {
        android.util.ArrayMap arrayMap;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            arrayMap = (android.util.ArrayMap) declaredField.get(invoke);
        } catch (java.lang.Exception unused) {
        }
        if (arrayMap.size() < 1) {
            return null;
        }
        for (java.lang.Object obj : arrayMap.values()) {
            java.lang.Class<?> cls2 = obj.getClass();
            java.lang.reflect.Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                declaredField3.setAccessible(true);
                return new java.lang.ref.WeakReference((android.app.Activity) declaredField3.get(obj));
            }
        }
        return null;
    }

    public static java.lang.String l() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (java.lang.Object obj : arrayMap.values()) {
                java.lang.Class<?> cls2 = obj.getClass();
                java.lang.reflect.Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                    declaredField3.setAccessible(true);
                    return ((android.app.Activity) declaredField3.get(obj)).getClass().getCanonicalName();
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static android.app.ActivityManager.RunningTaskInfo m(android.content.Context context) {
        try {
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return null;
            }
            return runningTasks.get(0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppForegroundDelegate", "getTopActivityTaskId Exception:%s", e17.getMessage());
            return null;
        }
    }

    public void a(com.p314xaae8f345.mm.app.t2 t2Var) {
        if (this.f135422n) {
            t2Var.mo8890x1952ea5(this.f135423o.f135309b.f135380a);
        }
        synchronized (this.f135420i) {
            ((java.util.HashSet) this.f135420i).add(t2Var);
        }
    }

    public void b(com.p314xaae8f345.mm.app.y2 y2Var) {
        synchronized (this.f135421m) {
            ((java.util.HashSet) this.f135421m).add(y2Var);
        }
    }

    public java.lang.String h() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f135408t)) {
            f135408t = l();
        }
        return f135408t;
    }

    public java.lang.ref.WeakReference i() {
        java.lang.ref.WeakReference weakReference = this.f135419h;
        if (weakReference == null || weakReference.get() == null) {
            this.f135419h = k();
        }
        return this.f135419h;
    }

    public java.lang.ref.WeakReference j() {
        java.lang.ref.WeakReference weakReference = this.f135418g;
        if (weakReference == null || weakReference.get() == null) {
            this.f135418g = k();
        }
        return this.f135418g;
    }

    public android.content.Context n() {
        android.content.Context context;
        java.lang.ref.WeakReference k17 = k();
        if (k17 != null && (context = (android.content.Context) k17.get()) != null) {
            return context;
        }
        java.lang.ref.WeakReference j17 = INSTANCE.j();
        if (j17 != null) {
            return (android.app.Activity) j17.get();
        }
        return null;
    }

    public boolean o() {
        return this.f135422n;
    }

    public void p(com.p314xaae8f345.mm.app.t2 t2Var) {
        synchronized (this.f135420i) {
            ((java.util.HashSet) this.f135420i).remove(t2Var);
        }
    }
}
