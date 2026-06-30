package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f134252a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f134253b;

    /* renamed from: c, reason: collision with root package name */
    public static android.app.ActivityManager f134254c;

    /* renamed from: d, reason: collision with root package name */
    public static android.content.pm.ActivityInfo[] f134255d;

    /* renamed from: p, reason: collision with root package name */
    public static com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.y f134267p;

    /* renamed from: u, reason: collision with root package name */
    public static volatile boolean f134272u;

    /* renamed from: w, reason: collision with root package name */
    public static java.lang.String f134274w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0 f134275x = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0();

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f134256e = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f134257f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.WeakHashMap f134258g = new java.util.WeakHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.WeakHashMap f134259h = new java.util.WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.WeakHashMap f134260i = new java.util.WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.WeakHashMap f134261j = new java.util.WeakHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static boolean f134262k = true;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f134263l = true;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb f134264m = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef() { // from class: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$CreatedStateOwner
        @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
        /* renamed from: active */
        public boolean mo40960xab2f7f06() {
            boolean z17;
            java.lang.Boolean valueOf;
            if (!super.mo40960xab2f7f06()) {
                return false;
            }
            java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
            java.util.WeakHashMap weakHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134258g;
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
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb f134265n = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef();

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb f134266o = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef();

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f134268q = "";

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.Runnable f134269r = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.d0.f134247d;

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f134270s = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.c0.f134244d);

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashSet f134271t = new java.util.HashSet();

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f134273v = "default";

    public static final boolean d() {
        boolean z17;
        if (f134254c == null) {
            throw new java.lang.IllegalStateException("NOT initialized yet");
        }
        try {
            android.app.ActivityManager activityManager = f134254c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityManager);
            java.util.List<android.app.ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appTasks, "activityManager!!.appTasks");
            java.util.ArrayList<android.app.ActivityManager.AppTask> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : appTasks) {
                android.app.ActivityManager.AppTask it = (android.app.ActivityManager.AppTask) obj;
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0 f0Var = f134275x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "it");
                android.app.ActivityManager.RecentTaskInfo taskInfo = it.getTaskInfo();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskInfo, "it.taskInfo");
                if (f0Var.b(taskInfo, f134252a)) {
                    arrayList.add(obj);
                }
            }
            for (android.app.ActivityManager.AppTask it6 : arrayList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f134252a);
                sb6.append(" task: ");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "it");
                android.app.ActivityManager.RecentTaskInfo taskInfo2 = it6.getTaskInfo();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskInfo2, "it.taskInfo");
                sb6.append(oj.z.a(taskInfo2));
                oj.j.c("Matrix.ProcessLifecycle", sb6.toString(), new java.lang.Object[0]);
            }
            if (!arrayList.isEmpty()) {
                for (android.app.ActivityManager.AppTask it7 : arrayList) {
                    oj.j.a("Matrix.ProcessLifecycle", "hasRunningAppTask run any", new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it7, "it");
                        z17 = it7.getTaskInfo().isRunning;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it7, "it");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.HashSet hashSet = f134271t;
        synchronized (hashSet) {
            hashSet.add(listener);
        }
    }

    public final boolean b(android.app.ActivityManager.RecentTaskInfo recentTaskInfo, java.lang.String str) {
        android.content.Intent intent = recentTaskInfo.baseIntent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "this.baseIntent");
        return e(intent.getComponent(), str) || e(recentTaskInfo.origActivity, str) || e(recentTaskInfo.baseActivity, str) || e(recentTaskInfo.topActivity, str);
    }

    public final void c() {
        if (f134260i.isEmpty() && f134262k) {
            f134263l = true;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = f134266o;
            if (interfaceC4661x636abfbb == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef) interfaceC4661x636abfbb).m41056xdb3189ea();
        }
    }

    public final boolean e(android.content.ComponentName componentName, java.lang.String str) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str2;
        if (componentName == null || (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(componentName.getPackageName(), f134253b))) {
            return false;
        }
        if (f134255d == null) {
            return true;
        }
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) f134270s).mo141623x754a37bb();
        java.lang.String className = componentName.getClassName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "component.className");
        java.lang.Object obj = hashMap.get(className);
        if (obj == null) {
            android.content.pm.ActivityInfo[] activityInfoArr = f134255d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityInfoArr);
            int length = activityInfoArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    activityInfo = null;
                    break;
                }
                activityInfo = activityInfoArr[i17];
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityInfo.name, componentName.getClassName())) {
                    break;
                }
                i17++;
            }
            if (activityInfo == null) {
                oj.j.b("Matrix.ProcessLifecycle", "got task info not appeared in package manager " + activityInfo, new java.lang.Object[0]);
                str2 = f134253b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            } else {
                str2 = activityInfo.processName;
            }
            obj = str2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "if (info == null) {\n    …processName\n            }");
            hashMap.put(className, obj);
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, (java.lang.String) obj);
    }

    public final java.util.Map f() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Runtime.getRuntime().gc();
        java.util.Set entrySet = f134261j.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "destroyedActivities.entries");
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
        f134274w = str;
        if (str != null) {
            f134273v = str;
        } else {
            f134273v = "?";
        }
    }

    public final void h(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.y yVar) {
        f134267p = yVar;
        if (yVar == null || !f134266o.mo40960xab2f7f06() || android.text.TextUtils.isEmpty(f134268q)) {
            return;
        }
        ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.w) yVar).a(f134268q, "");
    }
}
