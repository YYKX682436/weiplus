package com.tencent.mm.app;

/* loaded from: classes12.dex */
public enum w {
    INSTANCE;


    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f53874s = com.tencent.mm.sdk.platformtools.v9.a();

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f53875t = null;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f53876u = false;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f53877v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public static boolean f53878w = false;

    /* renamed from: x, reason: collision with root package name */
    public static final com.tencent.mm.app.m f53879x = new com.tencent.mm.app.m(null);

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f53880y = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f53883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f53884f;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f53882d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f53885g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f53886h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f53887i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f53888m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f53889n = false;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.app.t f53890o = new com.tencent.mm.app.t(this, null);

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f53891p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f53892q = false;

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
                java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
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
                    java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
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
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return null;
            }
            return runningTasks.get(0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppForegroundDelegate", "getTopActivityTaskId Exception:%s", e17.getMessage());
            return null;
        }
    }

    public void a(com.tencent.mm.app.t2 t2Var) {
        if (this.f53889n) {
            t2Var.onAppForeground(this.f53890o.f53776b.f53847a);
        }
        synchronized (this.f53887i) {
            ((java.util.HashSet) this.f53887i).add(t2Var);
        }
    }

    public void b(com.tencent.mm.app.y2 y2Var) {
        synchronized (this.f53888m) {
            ((java.util.HashSet) this.f53888m).add(y2Var);
        }
    }

    public java.lang.String h() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f53875t)) {
            f53875t = l();
        }
        return f53875t;
    }

    public java.lang.ref.WeakReference i() {
        java.lang.ref.WeakReference weakReference = this.f53886h;
        if (weakReference == null || weakReference.get() == null) {
            this.f53886h = k();
        }
        return this.f53886h;
    }

    public java.lang.ref.WeakReference j() {
        java.lang.ref.WeakReference weakReference = this.f53885g;
        if (weakReference == null || weakReference.get() == null) {
            this.f53885g = k();
        }
        return this.f53885g;
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
        return this.f53889n;
    }

    public void p(com.tencent.mm.app.t2 t2Var) {
        synchronized (this.f53887i) {
            ((java.util.HashSet) this.f53887i).remove(t2Var);
        }
    }
}
