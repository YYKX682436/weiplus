package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.NewClassLoaderInjector */
/* loaded from: classes13.dex */
final class C26598xad6d125f {
    private C26598xad6d125f() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: createNewClassLoader */
    private static java.lang.ClassLoader m104454x9a358a07(java.lang.ClassLoader classLoader, java.io.File file, boolean z17, boolean z18, java.lang.String... strArr) {
        java.lang.ClassLoader c26601xb1ab6eec;
        java.lang.Object obj = m104456x183d66c1(java.lang.Class.forName("dalvik.system.BaseDexClassLoader", false, classLoader), "pathList").get(classLoader);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (int i17 = 0; i17 < strArr.length; i17++) {
                if (i17 > 0) {
                    sb6.append(java.io.File.pathSeparator);
                }
                sb6.append(strArr[i17]);
            }
        }
        java.lang.String sb7 = sb6.toString();
        java.lang.reflect.Field m104456x183d66c1 = m104456x183d66c1(obj.getClass(), "nativeLibraryDirectories");
        java.util.List<java.io.File> asList = m104456x183d66c1.getType().isArray() ? java.util.Arrays.asList((java.io.File[]) m104456x183d66c1.get(obj)) : (java.util.List) m104456x183d66c1.get(obj);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        boolean z19 = true;
        for (java.io.File file2 : asList) {
            if (file2 != null) {
                if (z19) {
                    z19 = false;
                } else {
                    sb8.append(java.io.File.pathSeparator);
                }
                sb8.append(file2.getAbsolutePath());
            }
        }
        java.lang.String sb9 = sb8.toString();
        if (!z17 || !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(27, true)) {
            c26601xb1ab6eec = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26601xb1ab6eec(sb7, file, sb9, classLoader);
        } else if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(31, true)) {
            c26601xb1ab6eec = new dalvik.system.DelegateLastClassLoader(sb7, sb9, classLoader);
        } else {
            c26601xb1ab6eec = new dalvik.system.DelegateLastClassLoader(sb7, sb9, java.lang.ClassLoader.getSystemClassLoader());
            java.lang.reflect.Field declaredField = java.lang.ClassLoader.class.getDeclaredField("parent");
            declaredField.setAccessible(true);
            declaredField.set(c26601xb1ab6eec, classLoader);
        }
        if (z18 && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(26, true)) {
            m104456x183d66c1(obj.getClass(), "definingContext").set(obj, c26601xb1ab6eec);
        }
        return c26601xb1ab6eec;
    }

    /* renamed from: doInject */
    private static void m104455x69acdfc(android.app.Application application, java.lang.ClassLoader classLoader) {
        java.lang.Thread.currentThread().setContextClassLoader(classLoader);
        android.content.Context context = (android.content.Context) m104456x183d66c1(application.getClass(), "mBase").get(application);
        try {
            m104456x183d66c1(context.getClass(), "mClassLoader").set(context, classLoader);
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Object obj = m104456x183d66c1(context.getClass(), "mPackageInfo").get(context);
        m104456x183d66c1(obj.getClass(), "mClassLoader").set(obj, classLoader);
        android.content.res.Resources resources = application.getResources();
        try {
            m104456x183d66c1(resources.getClass(), "mClassLoader").set(resources, classLoader);
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.lang.Object obj2 = m104456x183d66c1(resources.getClass(), "mDrawableInflater").get(resources);
            if (obj2 != null) {
                m104456x183d66c1(obj2.getClass(), "mClassLoader").set(obj2, classLoader);
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    /* renamed from: findField */
    private static java.lang.reflect.Field m104456x183d66c1(java.lang.Class<?> cls, java.lang.String str) {
        java.lang.Class<?> cls2 = cls;
        while (true) {
            try {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (java.lang.Throwable unused) {
                if (cls2 == java.lang.Object.class) {
                    throw new java.lang.NoSuchFieldException("Cannot find field " + str + " in class " + cls.getName() + " and its super classes.");
                }
                cls2 = cls2.getSuperclass();
            }
        }
    }

    /* renamed from: inject */
    public static java.lang.ClassLoader m104457xb96ca991(android.app.Application application, java.lang.ClassLoader classLoader, java.io.File file, boolean z17, java.util.List<java.io.File> list) {
        int size = list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = list.get(i17).getAbsolutePath();
        }
        java.lang.ClassLoader m104454x9a358a07 = m104454x9a358a07(classLoader, file, z17, true, strArr);
        m104455x69acdfc(application, m104454x9a358a07);
        return m104454x9a358a07;
    }

    /* renamed from: triggerDex2Oat */
    public static java.lang.ClassLoader m104458x69bf730f(android.content.Context context, java.io.File file, boolean z17, java.lang.String... strArr) {
        return m104454x9a358a07(context.getClassLoader(), file, z17, false, strArr);
    }
}
