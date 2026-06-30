package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.DynamicRuntime */
/* loaded from: classes13.dex */
public class C25533x32e9deb9 {

    /* renamed from: KEY_RUNTIME_APK */
    private static final java.lang.String f46676xa7ee06f5 = "KEY_RUNTIME_APK";

    /* renamed from: KEY_RUNTIME_LIB */
    private static final java.lang.String f46677xa7ee2f5e = "KEY_RUNTIME_LIB";

    /* renamed from: KEY_RUNTIME_ODEX */
    private static final java.lang.String f46678x55d9076f = "KEY_RUNTIME_ODEX";

    /* renamed from: SP_NAME */
    private static final java.lang.String f46679xb488132d = "ShadowRuntimeLoader";

    /* renamed from: mLogger */
    private static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f46680xe041c5d = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("Shadow.DynamicRuntime");

    /* renamed from: com.tencent.shadow.dynamic.host.DynamicRuntime$RuntimeClassLoader */
    /* loaded from: classes13.dex */
    public static class RuntimeClassLoader extends dalvik.system.BaseDexClassLoader {

        /* renamed from: apkPath */
        private java.lang.String f46681xd064e461;

        public RuntimeClassLoader(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.ClassLoader classLoader) {
            super(str, str2 == null ? null : new java.io.File(str2), str3, classLoader);
            this.f46681xd064e461 = str;
        }
    }

    /* renamed from: getLastRuntimeInfo */
    private static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 m95550x93b989fa(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(f46679xb488132d, 0);
        java.lang.String string = sharedPreferences.getString(f46676xa7ee06f5, null);
        java.lang.String string2 = sharedPreferences.getString(f46678x55d9076f, null);
        java.lang.String string3 = sharedPreferences.getString(f46677xa7ee2f5e, null);
        if (string == null) {
            return null;
        }
        return new com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462(string, string2, string3);
    }

    /* renamed from: getParentField */
    private static java.lang.reflect.Field m95551x14f3c93a() {
        java.lang.Object obj;
        java.lang.ClassLoader classLoader = com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.class.getClassLoader();
        java.lang.ClassLoader parent = classLoader.getParent();
        for (java.lang.reflect.Field field : java.lang.ClassLoader.class.getDeclaredFields()) {
            try {
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                obj = field.get(classLoader);
                field.setAccessible(isAccessible);
            } catch (java.lang.IllegalAccessException unused) {
            }
            if (obj == parent) {
                return field;
            }
        }
        return null;
    }

    /* renamed from: getRuntimeClassLoader */
    private static com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.RuntimeClassLoader m95552x83392ea9() {
        for (java.lang.ClassLoader parent = com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.class.getClassLoader().getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.RuntimeClassLoader) {
                return (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.RuntimeClassLoader) parent;
            }
        }
        return null;
    }

    /* renamed from: hackParentClassLoader */
    public static void m95553x8501c380(java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) {
        java.lang.reflect.Field m95551x14f3c93a = m95551x14f3c93a();
        if (m95551x14f3c93a == null) {
            throw new java.lang.RuntimeException("在ClassLoader.class中没找到类型为ClassLoader的parent域");
        }
        m95551x14f3c93a.setAccessible(true);
        m95551x14f3c93a.set(classLoader, classLoader2);
    }

    /* renamed from: hackParentToRuntime */
    private static void m95554x877e11f2(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, java.lang.ClassLoader classLoader) {
        m95553x8501c380(classLoader, new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.RuntimeClassLoader(c25507x83693462.f46642x1b64b1fd, c25507x83693462.f46644xcae4856d, c25507x83693462.f46643xdba72780, classLoader.getParent()));
    }

    /* renamed from: loadRuntime */
    public static boolean m95555x3de17412(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462) {
        java.lang.ClassLoader classLoader = com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.class.getClassLoader();
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.RuntimeClassLoader m95552x83392ea9 = m95552x83392ea9();
        if (m95552x83392ea9 != null) {
            java.lang.String str = m95552x83392ea9.f46681xd064e461;
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46680xe041c5d;
            if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
                interfaceC25508x87fce1b0.mo46953x3164ae("last apkPath:" + str + " new apkPath:" + c25507x83693462.f46642x1b64b1fd);
            }
            if (android.text.TextUtils.equals(str, c25507x83693462.f46642x1b64b1fd)) {
                if (!interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
                    return false;
                }
                interfaceC25508x87fce1b0.mo46953x3164ae("已经加载相同apkPath的runtime了,不需要加载");
                return false;
            }
            if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
                interfaceC25508x87fce1b0.mo46953x3164ae("加载不相同apkPath的runtime了,先恢复classLoader树结构");
            }
            try {
                m95556xaea3d4d6();
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        try {
            m95554x877e11f2(c25507x83693462, classLoader);
            return true;
        } catch (java.lang.Exception e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    /* renamed from: recoveryClassLoader */
    private static void m95556xaea3d4d6() {
        java.lang.ClassLoader classLoader = com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.class.getClassLoader();
        java.lang.ClassLoader parent = classLoader.getParent();
        while (true) {
            java.lang.ClassLoader classLoader2 = parent;
            java.lang.ClassLoader classLoader3 = classLoader;
            classLoader = classLoader2;
            if (classLoader == null) {
                return;
            }
            if (classLoader instanceof com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.RuntimeClassLoader) {
                m95553x8501c380(classLoader3, classLoader.getParent());
                return;
            }
            parent = classLoader.getParent();
        }
    }

    /* renamed from: recoveryRuntime */
    public static boolean m95557x94de2683(android.content.Context context) {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 m95550x93b989fa = m95550x93b989fa(context);
        if (m95550x93b989fa != null && new java.io.File(m95550x93b989fa.f46642x1b64b1fd).exists()) {
            if (m95550x93b989fa.f46644xcae4856d != null && !new java.io.File(m95550x93b989fa.f46644xcae4856d).exists()) {
                return false;
            }
            try {
                m95554x877e11f2(m95550x93b989fa, com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.class.getClassLoader());
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46680xe041c5d;
                if (interfaceC25508x87fce1b0.mo46959x817b6a63()) {
                    interfaceC25508x87fce1b0.mo46949x5c4d208("recoveryRuntime 错误", (java.lang.Throwable) e17);
                }
                m95558x6c86df0c(context);
            }
        }
        return false;
    }

    /* renamed from: removeLastRuntimeInfo */
    private static void m95558x6c86df0c(android.content.Context context) {
        context.getSharedPreferences(f46679xb488132d, 0).edit().remove(f46676xa7ee06f5).remove(f46678x55d9076f).remove(f46677xa7ee2f5e).commit();
    }

    /* renamed from: saveLastRuntimeInfo */
    public static void m95559x7f93e4f3(android.content.Context context, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462) {
        context.getSharedPreferences(f46679xb488132d, 0).edit().putString(f46676xa7ee06f5, c25507x83693462.f46642x1b64b1fd).putString(f46678x55d9076f, c25507x83693462.f46644xcae4856d).putString(f46677xa7ee2f5e, c25507x83693462.f46643xdba72780).commit();
    }
}
