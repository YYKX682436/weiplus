package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
/* renamed from: org.chromium.base.ApplicationStatus */
/* loaded from: classes13.dex */
public class C29282xd7b5c542 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73127x7118e671 = false;

    /* renamed from: CACHE_ACTIVITY_TASKID_KEY */
    private static final java.lang.String f73128xe8ad8db3 = "cache_activity_taskid_enabled";

    /* renamed from: TOOLBAR_CALLBACK_WRAPPER_CLASS */
    private static final java.lang.String f73129xc041f976 = "androidx.appcompat.app.ToolbarActionBar$ToolbarCallbackWrapper";

    /* renamed from: sActivity */
    private static android.app.Activity f73130x3be434a2;

    /* renamed from: sApplicationStateListeners */
    private static org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener> f73133x59debceb;

    /* renamed from: sGeneralActivityStateListeners */
    private static org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> f73135xbed498f2;

    /* renamed from: sNativeApplicationStateListener */
    private static org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener f73136x5a8ef97f;

    /* renamed from: sTaskVisibilityListeners */
    private static org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener> f73137x6574bb95;

    /* renamed from: sWindowFocusListeners */
    private static org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener> f73138x6759116a;

    /* renamed from: sActivityInfo */
    private static final java.util.Map<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> f73131x8fb7ec70 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: sActivityTaskId */
    public static final java.util.Map<android.app.Activity, java.lang.Integer> f73132x938290c2 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: sCurrentApplicationState */
    private static int f73134xd20296c7 = 0;

    /* renamed from: org.chromium.base.ApplicationStatus$ActivityInfo */
    /* loaded from: classes13.dex */
    public static class ActivityInfo {

        /* renamed from: mListeners */
        private org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> f73141x32131c52;

        /* renamed from: mStatus */
        private int f73142x1a39f6bf;

        /* renamed from: getListeners */
        public org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> m152220xb6c94389() {
            return this.f73141x32131c52;
        }

        /* renamed from: getStatus */
        public int m152221x2fe4f2e8() {
            return this.f73142x1a39f6bf;
        }

        /* renamed from: setStatus */
        public void m152222x231a26f4(int i17) {
            this.f73142x1a39f6bf = i17;
        }

        private ActivityInfo() {
            this.f73142x1a39f6bf = 6;
            this.f73141x32131c52 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        }
    }

    /* renamed from: org.chromium.base.ApplicationStatus$ActivityStateListener */
    /* loaded from: classes13.dex */
    public interface ActivityStateListener {
        /* renamed from: onActivityStateChange */
        void m152223xa03c30b3(android.app.Activity activity, int i17);
    }

    /* renamed from: org.chromium.base.ApplicationStatus$ApplicationStateListener */
    /* loaded from: classes13.dex */
    public interface ApplicationStateListener {
        /* renamed from: onApplicationStateChange */
        void mo152219xd854fcf0(int i17);
    }

    /* renamed from: org.chromium.base.ApplicationStatus$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: onApplicationStateChange */
        void mo152224xd854fcf0(int i17);
    }

    /* renamed from: org.chromium.base.ApplicationStatus$TaskVisibilityListener */
    /* loaded from: classes13.dex */
    public interface TaskVisibilityListener {
        /* renamed from: onTaskVisibilityChanged */
        void m152225x5bbf779e(int i17, boolean z17);
    }

    /* renamed from: org.chromium.base.ApplicationStatus$WindowCallbackProxy */
    /* loaded from: classes13.dex */
    public static class WindowCallbackProxy implements java.lang.reflect.InvocationHandler {

        /* renamed from: mActivity */
        private final android.app.Activity f73143xc2499a9c;

        /* renamed from: mCallback */
        private final android.view.Window.Callback f73144x1ab9c7d2;

        public WindowCallbackProxy(android.app.Activity activity, android.view.Window.Callback callback) {
            this.f73144x1ab9c7d2 = callback;
            this.f73143xc2499a9c = activity;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            if (method.getName().equals("onWindowFocusChanged") && objArr.length == 1) {
                java.lang.Object obj2 = objArr[0];
                if (obj2 instanceof java.lang.Boolean) {
                    m152226xa4ec7b0b(((java.lang.Boolean) obj2).booleanValue());
                    return null;
                }
            }
            try {
                return method.invoke(this.f73144x1ab9c7d2, objArr);
            } catch (java.lang.reflect.InvocationTargetException e17) {
                if (e17.getCause() instanceof java.lang.AbstractMethodError) {
                    throw e17.getCause();
                }
                throw e17;
            }
        }

        /* renamed from: onWindowFocusChanged */
        public void m152226xa4ec7b0b(boolean z17) {
            this.f73144x1ab9c7d2.onWindowFocusChanged(z17);
            if (org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73138x6759116a != null) {
                java.util.Iterator it = org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73138x6759116a.iterator();
                while (it.hasNext()) {
                    ((org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener) it.next()).mo152217xa4ec7b0b(this.f73143xc2499a9c, z17);
                }
            }
        }
    }

    /* renamed from: org.chromium.base.ApplicationStatus$WindowFocusChangedListener */
    /* loaded from: classes13.dex */
    public interface WindowFocusChangedListener {
        /* renamed from: onWindowFocusChanged */
        void mo152217xa4ec7b0b(android.app.Activity activity, boolean z17);
    }

    private C29282xd7b5c542() {
    }

    /* renamed from: createWindowCallbackProxy */
    public static android.view.Window.Callback m152188x7188847d(android.app.Activity activity, android.view.Window.Callback callback) {
        return (android.view.Window.Callback) java.lang.reflect.Proxy.newProxyInstance(android.view.Window.Callback.class.getClassLoader(), new java.lang.Class[]{android.view.Window.Callback.class}, new org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowCallbackProxy(activity, callback));
    }

    /* renamed from: destroyForJUnitTests */
    public static void m152189x78746582() {
        java.util.Map<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> map = f73131x8fb7ec70;
        synchronized (map) {
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener> c29324xf28570b4 = f73133x59debceb;
            if (c29324xf28570b4 != null) {
                c29324xf28570b4.m152533x5a5b64d();
            }
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> c29324xf28570b42 = f73135xbed498f2;
            if (c29324xf28570b42 != null) {
                c29324xf28570b42.m152533x5a5b64d();
            }
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener> c29324xf28570b43 = f73137x6574bb95;
            if (c29324xf28570b43 != null) {
                c29324xf28570b43.m152533x5a5b64d();
            }
            map.clear();
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener> c29324xf28570b44 = f73138x6759116a;
            if (c29324xf28570b44 != null) {
                c29324xf28570b44.m152533x5a5b64d();
            }
            f73134xd20296c7 = 0;
            f73130x3be434a2 = null;
            f73136x5a8ef97f = null;
        }
    }

    /* renamed from: determineApplicationStateLocked */
    private static int m152190x17efbbe() {
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> it = f73131x8fb7ec70.values().iterator();
        boolean z17 = false;
        boolean z18 = false;
        while (it.hasNext()) {
            int m152221x2fe4f2e8 = it.next().m152221x2fe4f2e8();
            if (m152221x2fe4f2e8 != 4 && m152221x2fe4f2e8 != 5 && m152221x2fe4f2e8 != 6) {
                return 1;
            }
            if (m152221x2fe4f2e8 == 4) {
                z17 = true;
            } else if (m152221x2fe4f2e8 == 5) {
                z18 = true;
            }
        }
        if (z17) {
            return 2;
        }
        return z18 ? 3 : 4;
    }

    /* renamed from: getLastTrackedFocusedActivity */
    public static android.app.Activity m152191x48217948() {
        return f73130x3be434a2;
    }

    /* renamed from: getRunningActivities */
    public static java.util.List<android.app.Activity> m152192xfb1bd256() {
        java.util.ArrayList arrayList;
        java.util.Map<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> map = f73131x8fb7ec70;
        synchronized (map) {
            arrayList = new java.util.ArrayList(map.keySet());
        }
        return arrayList;
    }

    /* renamed from: getStateForActivity */
    public static int m152193xaf4a811d(android.app.Activity activity) {
        org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo activityInfo;
        if (activity == null || (activityInfo = f73131x8fb7ec70.get(activity)) == null) {
            return 6;
        }
        return activityInfo.m152221x2fe4f2e8();
    }

    /* renamed from: getStateForApplication */
    public static int m152194x62791482() {
        int i17;
        synchronized (f73131x8fb7ec70) {
            i17 = f73134xd20296c7;
        }
        return i17;
    }

    /* renamed from: getTaskId */
    public static int m152195x30961476(android.app.Activity activity) {
        if (!m152198x8c19d24c()) {
            return activity.getTaskId();
        }
        java.util.Map<android.app.Activity, java.lang.Integer> map = f73132x938290c2;
        if (!map.containsKey(activity)) {
            synchronized (map) {
                map.put(activity, java.lang.Integer.valueOf(activity.getTaskId()));
            }
        }
        return map.get(activity).intValue();
    }

    /* renamed from: hasVisibleActivities */
    public static boolean m152196x30859685() {
        int m152194x62791482 = m152194x62791482();
        return m152194x62791482 == 1 || m152194x62791482 == 2;
    }

    /* renamed from: initialize */
    public static void m152197x33ebcb90(android.app.Application application) {
        synchronized (f73131x8fb7ec70) {
            f73134xd20296c7 = 4;
        }
        m152210x4d4e5ca3(new org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener() { // from class: org.chromium.base.ApplicationStatus.1
            @Override // org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener
            /* renamed from: onWindowFocusChanged */
            public void mo152217xa4ec7b0b(android.app.Activity activity, boolean z17) {
                int m152193xaf4a811d;
                if (!z17 || activity == org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73130x3be434a2 || (m152193xaf4a811d = org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152193xaf4a811d(activity)) == 6 || m152193xaf4a811d == 5) {
                    return;
                }
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73130x3be434a2 = activity;
            }
        });
        application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() { // from class: org.chromium.base.ApplicationStatus.2

            /* renamed from: $assertionsDisabled */
            static final /* synthetic */ boolean f73139x7118e671 = false;

            /* renamed from: checkCallback */
            private void m152218x85a8e16d(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152202x4799dc42(activity, 1);
                activity.getWindow().setCallback(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152188x7188847d(activity, activity.getWindow().getCallback()));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152202x4799dc42(activity, 6);
                m152218x85a8e16d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152202x4799dc42(activity, 4);
                m152218x85a8e16d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(android.app.Activity activity) {
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152202x4799dc42(activity, 3);
                m152218x85a8e16d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                m152218x85a8e16d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(android.app.Activity activity) {
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152202x4799dc42(activity, 2);
                m152218x85a8e16d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152202x4799dc42(activity, 5);
                m152218x85a8e16d(activity);
            }
        });
    }

    /* renamed from: isCachingEnabled */
    public static boolean m152198x8c19d24c() {
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7 = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152645xccdf4b7();
        try {
            boolean z17 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152347xccd281a8().getBoolean(f73128xe8ad8db3, false);
            if (m152645xccdf4b7 != null) {
                m152645xccdf4b7.close();
            }
            return z17;
        } catch (java.lang.Throwable th6) {
            if (m152645xccdf4b7 != null) {
                try {
                    m152645xccdf4b7.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: isEveryActivityDestroyed */
    public static boolean m152199xa989e7b9() {
        return f73131x8fb7ec70.isEmpty();
    }

    /* renamed from: isInitialized */
    public static boolean m152200xf582434a() {
        boolean z17;
        synchronized (f73131x8fb7ec70) {
            z17 = f73134xd20296c7 != 0;
        }
        return z17;
    }

    /* renamed from: isTaskVisible */
    public static boolean m152201x384f9fa3(int i17) {
        int m152221x2fe4f2e8;
        for (java.util.Map.Entry<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> entry : f73131x8fb7ec70.entrySet()) {
            if (m152195x30961476(entry.getKey()) == i17 && ((m152221x2fe4f2e8 = entry.getValue().m152221x2fe4f2e8()) == 3 || m152221x2fe4f2e8 == 4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onStateChange */
    public static void m152202x4799dc42(android.app.Activity activity, int i17) {
        org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo activityInfo;
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener> c29324xf28570b4;
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener> c29324xf28570b42;
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("null activity is not supported");
        }
        if (f73130x3be434a2 == null || i17 == 1 || i17 == 3 || i17 == 2) {
            f73130x3be434a2 = activity;
        }
        int m152194x62791482 = m152194x62791482();
        boolean m152201x384f9fa3 = m152201x384f9fa3(m152195x30961476(activity));
        java.util.Map<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> map = f73131x8fb7ec70;
        synchronized (map) {
            if (i17 == 1) {
                map.put(activity, new org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo());
            }
            activityInfo = map.get(activity);
            activityInfo.m152222x231a26f4(i17);
            if (i17 == 6) {
                map.remove(activity);
                if (activity == f73130x3be434a2) {
                    f73130x3be434a2 = null;
                }
            }
            f73134xd20296c7 = m152190x17efbbe();
        }
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> it = activityInfo.m152220xb6c94389().iterator();
        while (it.hasNext()) {
            it.next().m152223xa03c30b3(activity, i17);
        }
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> c29324xf28570b43 = f73135xbed498f2;
        if (c29324xf28570b43 != null) {
            java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> it6 = c29324xf28570b43.iterator();
            while (it6.hasNext()) {
                it6.next().m152223xa03c30b3(activity, i17);
            }
        }
        boolean m152201x384f9fa32 = m152201x384f9fa3(m152195x30961476(activity));
        if (m152201x384f9fa32 != m152201x384f9fa3 && (c29324xf28570b42 = f73137x6574bb95) != null) {
            java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener> it7 = c29324xf28570b42.iterator();
            while (it7.hasNext()) {
                it7.next().m152225x5bbf779e(m152195x30961476(activity), m152201x384f9fa32);
            }
        }
        int m152194x627914822 = m152194x62791482();
        if (m152194x627914822 != m152194x62791482 && (c29324xf28570b4 = f73133x59debceb) != null) {
            java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener> it8 = c29324xf28570b4.iterator();
            while (it8.hasNext()) {
                it8.next().mo152219xd854fcf0(m152194x627914822);
            }
        }
        java.util.Map<android.app.Activity, java.lang.Integer> map2 = f73132x938290c2;
        synchronized (map2) {
            if (i17 == 6) {
                map2.remove(activity);
            }
        }
    }

    /* renamed from: onStateChangeForTesting */
    public static void m152203xaf63c6e9(android.app.Activity activity, int i17) {
        m152202x4799dc42(activity, i17);
    }

    /* renamed from: reachesWindowCallback */
    public static boolean m152204xf1161416(android.view.Window.Callback callback) {
        if (callback == null) {
            return false;
        }
        if (callback.getClass().getName().equals("androidx.appcompat.app.p0")) {
            return true;
        }
        if (java.lang.reflect.Proxy.isProxyClass(callback.getClass())) {
            return java.lang.reflect.Proxy.getInvocationHandler(callback) instanceof org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowCallbackProxy;
        }
        for (java.lang.Class<?> cls = callback.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().isAssignableFrom(android.view.Window.Callback.class)) {
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        android.view.Window.Callback callback2 = (android.view.Window.Callback) field.get(callback);
                        field.setAccessible(isAccessible);
                        if (m152204xf1161416(callback2)) {
                            return true;
                        }
                    } catch (java.lang.IllegalAccessException unused) {
                        field.setAccessible(isAccessible);
                    } catch (java.lang.Throwable th6) {
                        field.setAccessible(isAccessible);
                        throw th6;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: registerApplicationStateListener */
    public static void m152205x535c72b8(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener applicationStateListener) {
        if (f73133x59debceb == null) {
            f73133x59debceb = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        }
        f73133x59debceb.m152532xdab4fe97(applicationStateListener);
    }

    /* renamed from: registerStateListenerForActivity */
    public static void m152206xb1bfff16(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener activityStateListener, android.app.Activity activity) {
        f73131x8fb7ec70.get(activity).m152220xb6c94389().m152532xdab4fe97(activityStateListener);
    }

    /* renamed from: registerStateListenerForAllActivities */
    public static void m152207x7a251cc7(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener activityStateListener) {
        if (f73135xbed498f2 == null) {
            f73135xbed498f2 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        }
        f73135xbed498f2.m152532xdab4fe97(activityStateListener);
    }

    /* renamed from: registerTaskVisibilityListener */
    public static void m152208x2208c2ce(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener taskVisibilityListener) {
        if (f73137x6574bb95 == null) {
            f73137x6574bb95 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        }
        f73137x6574bb95.m152532xdab4fe97(taskVisibilityListener);
    }

    /* renamed from: registerThreadSafeNativeApplicationStateListener */
    private static void m152209xa480ca86() {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152663x925811a8(new java.lang.Runnable() { // from class: org.chromium.base.ApplicationStatus.3
            @Override // java.lang.Runnable
            public void run() {
                if (org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73136x5a8ef97f != null) {
                    return;
                }
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73136x5a8ef97f = new org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener() { // from class: org.chromium.base.ApplicationStatus.3.1
                    @Override // org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener
                    /* renamed from: onApplicationStateChange */
                    public void mo152219xd854fcf0(int i17) {
                        org.p3343x72743996.p3344x2e06d1.C29283x69d73f03.get().mo152224xd854fcf0(i17);
                    }
                };
                org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152205x535c72b8(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.f73136x5a8ef97f);
            }
        });
    }

    /* renamed from: registerWindowFocusChangedListener */
    public static void m152210x4d4e5ca3(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener windowFocusChangedListener) {
        if (f73138x6759116a == null) {
            f73138x6759116a = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        }
        f73138x6759116a.m152532xdab4fe97(windowFocusChangedListener);
    }

    /* renamed from: resetActivitiesForInstrumentationTests */
    public static void m152211xf69e2f80() {
        java.util.Map<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> map = f73131x8fb7ec70;
        synchronized (map) {
            java.util.Iterator it = new java.util.HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                m152203xaf63c6e9((android.app.Activity) it.next(), 6);
            }
        }
    }

    /* renamed from: setCachingEnabled */
    public static void m152212x9bfc7f84(boolean z17) {
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152347xccd281a8().edit().putBoolean(f73128xe8ad8db3, z17).apply();
    }

    /* renamed from: unregisterActivityStateListener */
    public static void m152213x55beb2ba(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener activityStateListener) {
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityStateListener> c29324xf28570b4 = f73135xbed498f2;
        if (c29324xf28570b4 != null) {
            c29324xf28570b4.m152537xb5bdeb7a(activityStateListener);
        }
        java.util.Map<android.app.Activity, org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> map = f73131x8fb7ec70;
        synchronized (map) {
            java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ActivityInfo> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m152220xb6c94389().m152537xb5bdeb7a(activityStateListener);
            }
        }
    }

    /* renamed from: unregisterApplicationStateListener */
    public static void m152214x5593dd51(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener applicationStateListener) {
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener> c29324xf28570b4 = f73133x59debceb;
        if (c29324xf28570b4 == null) {
            return;
        }
        c29324xf28570b4.m152537xb5bdeb7a(applicationStateListener);
    }

    /* renamed from: unregisterTaskVisibilityListener */
    public static void m152215x5c1bffa7(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener taskVisibilityListener) {
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.TaskVisibilityListener> c29324xf28570b4 = f73137x6574bb95;
        if (c29324xf28570b4 == null) {
            return;
        }
        c29324xf28570b4.m152537xb5bdeb7a(taskVisibilityListener);
    }

    /* renamed from: unregisterWindowFocusChangedListener */
    public static void m152216x9f5584fc(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener windowFocusChangedListener) {
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.WindowFocusChangedListener> c29324xf28570b4 = f73138x6759116a;
        if (c29324xf28570b4 == null) {
            return;
        }
        c29324xf28570b4.m152537xb5bdeb7a(windowFocusChangedListener);
    }
}
