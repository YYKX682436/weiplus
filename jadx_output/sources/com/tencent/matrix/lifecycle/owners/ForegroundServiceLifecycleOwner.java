package com.tencent.matrix.lifecycle.owners;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\"B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/tencent/matrix/lifecycle/owners/ForegroundServiceLifecycleOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Ljz5/f0;", "inject", "Landroid/content/Context;", "context", "", "enable", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "hasForegroundService", "", "TAG", "Ljava/lang/String;", "", "CREATE_SERVICE", "I", "STOP_SERVICE", "Ljava/lang/reflect/Field;", "fieldServicemActivityManager", "Ljava/lang/reflect/Field;", "Landroid/app/ActivityManager;", "activityManager", "Landroid/app/ActivityManager;", "Landroid/util/ArrayMap;", "ActivityThreadmServices", "Landroid/util/ArrayMap;", "Landroid/os/Handler;", "ActivityThreadmH", "Landroid/os/Handler;", "Lcom/tencent/matrix/lifecycle/owners/d;", "fgServiceHandler", "Lcom/tencent/matrix/lifecycle/owners/d;", "<init>", "()V", "com/tencent/matrix/lifecycle/owners/i", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ForegroundServiceLifecycleOwner extends com.tencent.matrix.lifecycle.StatefulOwner {
    private static android.os.Handler ActivityThreadmH = null;
    private static android.util.ArrayMap<?, ?> ActivityThreadmServices = null;
    private static final int CREATE_SERVICE = 114;
    public static final com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner INSTANCE = new com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner();
    private static final int STOP_SERVICE = 116;
    private static final java.lang.String TAG = "Matrix.lifecycle.FgService";
    private static android.app.ActivityManager activityManager;
    private static com.tencent.matrix.lifecycle.owners.d fgServiceHandler;
    private static final java.lang.reflect.Field fieldServicemActivityManager;

    static {
        java.lang.reflect.Field field;
        try {
            field = java.lang.Class.forName("android.app.Service").getDeclaredField("mActivityManager");
            field.setAccessible(true);
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
            field = null;
        }
        fieldServicemActivityManager = field;
    }

    private ForegroundServiceLifecycleOwner() {
        super(false, 1, null);
    }

    private final void inject() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mH");
            declaredField.setAccessible(true);
            java.lang.reflect.Method it = cls.getMethod("currentActivityThread", new java.lang.Class[0]);
            kotlin.jvm.internal.o.f(it, "it");
            it.setAccessible(true);
            java.lang.Object invoke = it.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field it6 = cls.getDeclaredField("mServices");
            kotlin.jvm.internal.o.f(it6, "it");
            it6.setAccessible(true);
            ActivityThreadmServices = (android.util.ArrayMap) it6.get(invoke);
            java.lang.Object obj = declaredField.get(invoke);
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
            ActivityThreadmH = (android.os.Handler) obj;
            java.lang.reflect.Field declaredField2 = android.os.Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            android.os.Handler.Callback callback = (android.os.Handler.Callback) declaredField2.get(ActivityThreadmH);
            declaredField2.set(ActivityThreadmH, new com.tencent.matrix.lifecycle.owners.i(callback));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("origin is ");
            sb6.append(callback != null ? callback.getClass().getName() : null);
            oj.j.c(TAG, sb6.toString(), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    public final boolean hasForegroundService() {
        boolean z17;
        com.tencent.matrix.lifecycle.owners.d dVar;
        android.app.ActivityManager activityManager2 = activityManager;
        if (activityManager2 == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        boolean z18 = true;
        try {
            kotlin.jvm.internal.o.d(activityManager2);
            java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager2.getRunningServices(Integer.MAX_VALUE);
            kotlin.jvm.internal.o.f(runningServices, "activityManager!!.getRun…ngServices(Int.MAX_VALUE)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : runningServices) {
                android.app.ActivityManager.RunningServiceInfo runningServiceInfo = (android.app.ActivityManager.RunningServiceInfo) obj;
                if (runningServiceInfo.uid == android.os.Process.myUid() && runningServiceInfo.pid == android.os.Process.myPid()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((android.app.ActivityManager.RunningServiceInfo) it.next()).foreground) {
                        z17 = true;
                        break;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
        }
        z17 = false;
        if (!z17 && (dVar = fgServiceHandler) != null) {
            synchronized (dVar.a()) {
                if (!dVar.a().isEmpty()) {
                    dVar.a().clear();
                    oj.j.c(TAG, "clear done, should turn OFF", new java.lang.Object[0]);
                } else {
                    z18 = false;
                }
            }
            if (z18) {
                oj.j.c(TAG, "fix clear: do turn OFF", new java.lang.Object[0]);
                INSTANCE.turnOff();
            }
        }
        return z17;
    }

    public final void init(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        activityManager = (android.app.ActivityManager) systemService;
        if (z17) {
            inject();
        } else {
            oj.j.c(TAG, "disabled", new java.lang.Object[0]);
        }
    }
}
