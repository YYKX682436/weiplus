package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f52719a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f52720b;

    /* renamed from: c, reason: collision with root package name */
    public static android.app.ActivityManager f52721c;

    /* renamed from: d, reason: collision with root package name */
    public static android.content.pm.ActivityInfo[] f52722d;

    /* renamed from: p, reason: collision with root package name */
    public static com.tencent.matrix.lifecycle.owners.y f52734p;

    /* renamed from: u, reason: collision with root package name */
    public static volatile boolean f52739u;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f52741w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.owners.f0 f52742x = new com.tencent.matrix.lifecycle.owners.f0();

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f52723e = com.tencent.matrix.lifecycle.q0.f52785f.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f52724f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.WeakHashMap f52725g = new java.util.WeakHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.WeakHashMap f52726h = new java.util.WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.WeakHashMap f52727i = new java.util.WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.WeakHashMap f52728j = new java.util.WeakHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static boolean f52729k = true;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f52730l = true;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IForegroundStatefulOwner f52731m = new com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner() { // from class: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$CreatedStateOwner
        @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
        public boolean active() {
            boolean z17;
            java.lang.Boolean valueOf;
            if (!super.active()) {
                return false;
            }
            java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
            java.util.WeakHashMap weakHashMap = com.tencent.matrix.lifecycle.owners.f0.f52725g;
            synchronized (weakHashMap) {
                try {
                    if (!weakHashMap.isEmpty()) {
                        java.util.Iterator it = weakHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            android.app.Activity activity = (android.app.Activity) ((java.util.Map.Entry) it.next()).getKey();
                            if (!((activity == null || activity.isFinishing()) ? false : true)) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    z17 = true;
                    valueOf = java.lang.Boolean.valueOf(z17);
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            return valueOf.booleanValue();
        }
    };

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IForegroundStatefulOwner f52732n = new com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner();

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.IForegroundStatefulOwner f52733o = new com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner();

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f52735q = "";

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.Runnable f52736r = com.tencent.matrix.lifecycle.owners.d0.f52714d;

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f52737s = jz5.h.b(com.tencent.matrix.lifecycle.owners.c0.f52711d);

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashSet f52738t = new java.util.HashSet();

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f52740v = "default";

    public static final boolean d() {
        boolean z17;
        if (f52721c == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        try {
            android.app.ActivityManager activityManager = f52721c;
            kotlin.jvm.internal.o.d(activityManager);
            java.util.List<android.app.ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            kotlin.jvm.internal.o.f(appTasks, "activityManager!!.appTasks");
            java.util.ArrayList<android.app.ActivityManager.AppTask> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : appTasks) {
                android.app.ActivityManager.AppTask it = (android.app.ActivityManager.AppTask) obj;
                com.tencent.matrix.lifecycle.owners.f0 f0Var = f52742x;
                kotlin.jvm.internal.o.f(it, "it");
                android.app.ActivityManager.RecentTaskInfo taskInfo = it.getTaskInfo();
                kotlin.jvm.internal.o.f(taskInfo, "it.taskInfo");
                if (f0Var.b(taskInfo, f52719a)) {
                    arrayList.add(obj);
                }
            }
            for (android.app.ActivityManager.AppTask it6 : arrayList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f52719a);
                sb6.append(" task: ");
                kotlin.jvm.internal.o.f(it6, "it");
                android.app.ActivityManager.RecentTaskInfo taskInfo2 = it6.getTaskInfo();
                kotlin.jvm.internal.o.f(taskInfo2, "it.taskInfo");
                sb6.append(oj.z.a(taskInfo2));
                oj.j.c("Matrix.ProcessLifecycle", sb6.toString(), new java.lang.Object[0]);
            }
            if (!arrayList.isEmpty()) {
                for (android.app.ActivityManager.AppTask it7 : arrayList) {
                    oj.j.a("Matrix.ProcessLifecycle", "hasRunningAppTask run any", new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        kotlin.jvm.internal.o.f(it7, "it");
                        z17 = it7.getTaskInfo().isRunning;
                    } else {
                        kotlin.jvm.internal.o.f(it7, "it");
                        z17 = it7.getTaskInfo().numActivities > 0;
                    }
                    if (z17) {
                        return true;
                    }
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessLifecycle", th6, "", new java.lang.Object[0]);
            return true;
        }
    }

    public final void a(ei.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.HashSet hashSet = f52738t;
        synchronized (hashSet) {
            hashSet.add(listener);
        }
    }

    public final boolean b(android.app.ActivityManager.RecentTaskInfo recentTaskInfo, java.lang.String str) {
        android.content.Intent intent = recentTaskInfo.baseIntent;
        kotlin.jvm.internal.o.f(intent, "this.baseIntent");
        return e(intent.getComponent(), str) || e(recentTaskInfo.origActivity, str) || e(recentTaskInfo.baseActivity, str) || e(recentTaskInfo.topActivity, str);
    }

    public final void c() {
        if (f52727i.isEmpty() && f52729k) {
            f52730l = true;
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = f52733o;
            if (iForegroundStatefulOwner == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner) iForegroundStatefulOwner).turnOffAsync();
        }
    }

    public final boolean e(android.content.ComponentName componentName, java.lang.String str) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str2;
        if (componentName == null || (!kotlin.jvm.internal.o.b(componentName.getPackageName(), f52720b))) {
            return false;
        }
        if (f52722d == null) {
            return true;
        }
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) f52737s).getValue();
        java.lang.String className = componentName.getClassName();
        kotlin.jvm.internal.o.f(className, "component.className");
        java.lang.Object obj = hashMap.get(className);
        if (obj == null) {
            android.content.pm.ActivityInfo[] activityInfoArr = f52722d;
            kotlin.jvm.internal.o.d(activityInfoArr);
            int length = activityInfoArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    activityInfo = null;
                    break;
                }
                activityInfo = activityInfoArr[i17];
                if (kotlin.jvm.internal.o.b(activityInfo.name, componentName.getClassName())) {
                    break;
                }
                i17++;
            }
            if (activityInfo == null) {
                oj.j.b("Matrix.ProcessLifecycle", "got task info not appeared in package manager " + activityInfo, new java.lang.Object[0]);
                str2 = f52720b;
                kotlin.jvm.internal.o.d(str2);
            } else {
                str2 = activityInfo.processName;
            }
            obj = str2;
            kotlin.jvm.internal.o.f(obj, "if (info == null) {\n    …processName\n            }");
            hashMap.put(className, obj);
        }
        return kotlin.jvm.internal.o.b(str, (java.lang.String) obj);
    }

    public final java.util.Map f() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Runtime.getRuntime().gc();
        java.util.Set entrySet = f52728j.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "destroyedActivities.entries");
        java.lang.Object[] array = entrySet.toArray(new java.util.Map.Entry[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (java.util.Map.Entry entry : (java.util.Map.Entry[]) array) {
            android.app.Activity activity = (android.app.Activity) entry.getKey();
            if (activity != null) {
                java.lang.String simpleName = activity.getClass().getSimpleName();
                java.lang.Object obj = hashMap.get(simpleName);
                if (obj == null) {
                    obj = 0;
                    hashMap.put(simpleName, obj);
                }
                hashMap.put(simpleName, java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + 1));
            }
        }
        return hashMap;
    }

    public final void g(java.lang.String str) {
        oj.j.c("Matrix.ProcessLifecycle", "[setCurrentFragmentName] fragmentName: " + str, new java.lang.Object[0]);
        f52741w = str;
        if (str != null) {
            f52740v = str;
        } else {
            f52740v = "?";
        }
    }

    public final void h(com.tencent.matrix.lifecycle.owners.y yVar) {
        f52734p = yVar;
        if (yVar == null || !f52733o.active() || android.text.TextUtils.isEmpty(f52735q)) {
            return;
        }
        ((com.tencent.matrix.lifecycle.supervisor.w) yVar).a(f52735q, "");
    }
}
