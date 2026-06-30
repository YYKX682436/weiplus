package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.BundleUtils */
/* loaded from: classes13.dex */
public class C29286x5442992f {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73206x7118e671 = false;

    /* renamed from: LOADED_SPLITS_KEY */
    private static final java.lang.String f73207xfd378613 = "split_compat_loaded_splits";
    private static final java.lang.String TAG = "BundleUtils";

    /* renamed from: sIsBundle */
    private static java.lang.Boolean f73210x74a463df;

    /* renamed from: sSplitCompatClassLoaderInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29286x5442992f.SplitCompatClassLoader f73211xc6ee11d7;

    /* renamed from: sSplitsToRestore */
    private static java.util.ArrayList<java.lang.String> f73213x992f0207;

    /* renamed from: sSplitLock */
    private static final java.lang.Object f73212x4c862832 = new java.lang.Object();

    /* renamed from: sCachedClassLoaders */
    private static final android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> f73208x8a4c423d = new android.util.ArrayMap<>();

    /* renamed from: sInflationClassLoaders */
    private static final java.util.Map<java.lang.String, java.lang.ClassLoader> f73209x9990bdbf = java.util.Collections.synchronizedMap(new android.util.ArrayMap());

    /* renamed from: org.chromium.base.BundleUtils$SplitCompatClassLoader */
    /* loaded from: classes13.dex */
    public static class SplitCompatClassLoader extends java.lang.ClassLoader {
        private static final java.lang.String TAG = "SplitCompatClassLoader";

        public SplitCompatClassLoader() {
            super(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getClassLoader());
            org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Splits: %s", org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73213x992f0207);
        }

        /* renamed from: checkSplitsClassLoaders */
        private java.lang.Class<?> m152267x81249889(java.lang.String str) {
            java.util.Iterator it = org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73209x9990bdbf.values().iterator();
            while (it.hasNext()) {
                try {
                    return ((java.lang.ClassLoader) it.next()).loadClass(str);
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
            return null;
        }

        /* renamed from: restoreSplitsClassLoaders */
        private void m152268xfb19708f() {
            java.util.Iterator it = org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73213x992f0207.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73209x9990bdbf.containsKey(str)) {
                    org.p3343x72743996.p3344x2e06d1.C29286x5442992f.m152261xffe68575(str);
                }
            }
            org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73213x992f0207 = null;
        }

        @Override // java.lang.ClassLoader
        public java.lang.Class<?> findClass(java.lang.String str) {
            java.lang.Class<?> m152267x81249889 = m152267x81249889(str);
            if (m152267x81249889 != null) {
                return m152267x81249889;
            }
            if (!str.startsWith("android.")) {
                if (org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73213x992f0207 != null) {
                    m152268xfb19708f();
                    java.lang.Class<?> m152267x812498892 = m152267x81249889(str);
                    if (m152267x812498892 != null) {
                        return m152267x812498892;
                    }
                }
                org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "No class %s amongst %s", str, android.text.TextUtils.join("\n", org.p3343x72743996.p3344x2e06d1.C29286x5442992f.f73209x9990bdbf.keySet()));
            }
            throw new java.lang.ClassNotFoundException(str);
        }
    }

    /* renamed from: canLoadClass */
    public static boolean m152245x24a07e42(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            java.lang.Class.forName(str, false, classLoader);
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: checkContextClassLoader */
    public static void m152246x7a5399a4(android.content.Context context, android.app.Activity activity) {
        java.lang.ClassLoader classLoader = activity.getClass().getClassLoader();
        if (classLoader != context.getClassLoader()) {
            org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Mismatched ClassLoaders between Activity and context (fixing): %s", activity.getClass());
            m152262xf97ac857(context, classLoader);
        }
    }

    /* renamed from: createContextForInflation */
    public static android.content.Context m152247x30e49714(android.content.Context context, java.lang.String str) {
        if (!m152258x18c158c3(str)) {
            return context;
        }
        final java.lang.ClassLoader m152261xffe68575 = m152261xffe68575(str);
        return new android.content.ContextWrapper(context) { // from class: org.chromium.base.BundleUtils.1
            @Override // android.content.ContextWrapper, android.content.Context
            public java.lang.ClassLoader getClassLoader() {
                return m152261xffe68575;
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public java.lang.Object getSystemService(java.lang.String str2) {
                java.lang.Object systemService = super.getSystemService(str2);
                return "layout_inflater".equals(str2) ? ((android.view.LayoutInflater) systemService).cloneInContext(this) : systemService;
            }
        };
    }

    /* renamed from: createIsolatedSplitContext */
    public static android.content.Context m152248x658e8c0a(android.content.Context context, java.lang.String str) {
        android.content.Context m152820x2afe2e04;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return context;
        }
        try {
            if (m152255x2db8c109(context)) {
                m152820x2afe2e04 = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29392xdcec370e.m152820x2afe2e04(context, str);
            } else {
                synchronized (m152254x436fdf76()) {
                    m152820x2afe2e04 = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29392xdcec370e.m152820x2afe2e04(context, str);
                }
            }
            java.lang.ClassLoader parent = m152820x2afe2e04.getClassLoader().getParent();
            android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
            boolean z17 = true;
            boolean z18 = (!m152259x58c4f7cf() || parent.equals(org.p3343x72743996.p3344x2e06d1.C29286x5442992f.class.getClassLoader()) || m152349x6e669035 == null || parent.equals(m152349x6e669035.getClassLoader())) ? false : true;
            android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> arrayMap = f73208x8a4c423d;
            synchronized (arrayMap) {
                if (z18) {
                    if (!arrayMap.containsKey(str)) {
                        arrayMap.put(str, new dalvik.system.PathClassLoader(m152252x1e81225d(str), m152349x6e669035.getClassLoader()));
                    }
                }
                java.lang.ClassLoader classLoader = arrayMap.get(str);
                if (classLoader == null) {
                    arrayMap.put(str, m152820x2afe2e04.getClassLoader());
                } else if (!classLoader.equals(m152820x2afe2e04.getClassLoader())) {
                    m152262xf97ac857(m152820x2afe2e04, classLoader);
                }
                z17 = z18;
            }
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152925xa16fd08d("Android.IsolatedSplits.ClassLoaderReplaced." + str, z17);
            return m152820x2afe2e04;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getNativeLibraryPath */
    public static java.lang.String m152249x866e233(java.lang.String str, java.lang.String str2) {
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7 = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152645xccdf4b7();
        try {
            java.lang.String findLibrary = ((dalvik.system.BaseDexClassLoader) org.p3343x72743996.p3344x2e06d1.C29286x5442992f.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                if (m152645xccdf4b7 != null) {
                    m152645xccdf4b7.close();
                }
                return findLibrary;
            }
            java.lang.ClassLoader classLoader = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getClassLoader();
            if (classLoader instanceof dalvik.system.BaseDexClassLoader) {
                findLibrary = ((dalvik.system.BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof org.p3343x72743996.p3344x2e06d1.C29382x97ed1606) {
                findLibrary = ((org.p3343x72743996.p3344x2e06d1.C29382x97ed1606) classLoader).findLibrary(str);
            }
            if (findLibrary != null) {
                if (m152645xccdf4b7 != null) {
                    m152645xccdf4b7.close();
                }
                return findLibrary;
            }
            java.lang.String m152251x286a7a48 = m152251x286a7a48(str, str2);
            if (m152645xccdf4b7 != null) {
                m152645xccdf4b7.close();
            }
            return m152251x286a7a48;
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

    /* renamed from: getOrCreateSplitClassLoader */
    public static java.lang.ClassLoader m152250xbbde2086(java.lang.String str) {
        java.lang.ClassLoader classLoader;
        android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> arrayMap = f73208x8a4c423d;
        synchronized (arrayMap) {
            classLoader = arrayMap.get(str);
        }
        if (classLoader == null) {
            m152248x658e8c0a(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), str);
            synchronized (arrayMap) {
                classLoader = arrayMap.get(str);
            }
        }
        return classLoader;
    }

    /* renamed from: getSplitApkLibraryPath */
    private static java.lang.String m152251x286a7a48(java.lang.String str, java.lang.String str2) {
        java.lang.String m152252x1e81225d;
        if (android.os.Build.VERSION.SDK_INT < 26 || (m152252x1e81225d = m152252x1e81225d(str2)) == null) {
            return null;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo();
            return m152252x1e81225d + "!/lib/" + ((java.lang.String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + java.lang.System.mapLibraryName(str);
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getSplitApkPath */
    private static java.lang.String m152252x1e81225d(java.lang.String str) {
        int binarySearch;
        android.content.pm.ApplicationInfo applicationInfo = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = java.util.Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    /* renamed from: getSplitCompatClassLoader */
    public static java.lang.ClassLoader m152253x84af4dc5() {
        if (f73211xc6ee11d7 == null) {
            f73211xc6ee11d7 = new org.p3343x72743996.p3344x2e06d1.C29286x5442992f.SplitCompatClassLoader();
        }
        return f73211xc6ee11d7;
    }

    /* renamed from: getSplitContextLock */
    public static java.lang.Object m152254x436fdf76() {
        return f73212x4c862832;
    }

    /* renamed from: isApplicationContext */
    private static boolean m152255x2db8c109(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Application) {
                return true;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    /* renamed from: isBundle */
    public static boolean m152256xd60c224c() {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73668x851629e0) {
            return f73210x74a463df.booleanValue();
        }
        return false;
    }

    /* renamed from: isBundleForNative */
    public static boolean m152257x2cce2154() {
        return m152256xd60c224c();
    }

    /* renamed from: isIsolatedSplitInstalled */
    public static boolean m152258x18c158c3(java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 26 && m152252x1e81225d(str) != null;
    }

    /* renamed from: isolatedSplitsEnabled */
    public static boolean m152259x58c4f7cf() {
        return org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73670x39572561;
    }

    /* renamed from: newInstance */
    public static java.lang.Object m152260x6bff0255(android.content.Context context, java.lang.String str) {
        android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
        if (m152349x6e669035 != null && m152245x24a07e42(m152349x6e669035.getClassLoader(), str)) {
            context = m152349x6e669035;
        }
        try {
            return context.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: registerSplitClassLoaderForInflation */
    public static java.lang.ClassLoader m152261xffe68575(java.lang.String str) {
        java.lang.ClassLoader m152250xbbde2086 = m152250xbbde2086(str);
        f73209x9990bdbf.put(str, m152250xbbde2086);
        return m152250xbbde2086;
    }

    /* renamed from: replaceClassLoader */
    public static void m152262xf97ac857(android.content.Context context, java.lang.ClassLoader classLoader) {
        while (context instanceof android.content.ContextWrapper) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        try {
            java.lang.reflect.Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException("Error setting ClassLoader.", e17);
        }
    }

    /* renamed from: resetForTesting */
    public static void m152263x2c3fdbb6() {
        f73210x74a463df = null;
        f73208x8a4c423d.clear();
        f73209x9990bdbf.clear();
        f73211xc6ee11d7 = null;
        f73213x992f0207 = null;
    }

    /* renamed from: restoreLoadedSplits */
    public static void m152264xc6a84eac(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        f73213x992f0207 = bundle.getStringArrayList(f73207xfd378613);
    }

    /* renamed from: saveLoadedSplits */
    public static void m152265x22d14f1b(android.os.Bundle bundle) {
        bundle.putStringArrayList(f73207xfd378613, new java.util.ArrayList<>(f73209x9990bdbf.keySet()));
    }

    /* renamed from: setIsBundle */
    public static void m152266x4c9ec0ce(boolean z17) {
        f73210x74a463df = java.lang.Boolean.valueOf(z17);
    }
}
