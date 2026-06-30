package com.p314xaae8f345.mm.obb.p978xbe953013;

/* renamed from: com.tencent.mm.obb.loader.ObbClassLoader */
/* loaded from: classes13.dex */
public class C11195x1ded775c extends dalvik.system.PathClassLoader {
    private static final java.lang.String TAG = "MicroMsg.ObbClassLoader";

    /* renamed from: mAppClassLoader */
    private final java.lang.ClassLoader f32690x7d1a1497;

    /* renamed from: mAppClassName */
    private final java.lang.String f32691xfcefb00f;

    /* renamed from: com.tencent.mm.obb.loader.ObbClassLoader$CompoundEnumeration */
    /* loaded from: classes13.dex */
    public class CompoundEnumeration<E> implements java.util.Enumeration<E> {

        /* renamed from: enums */
        private java.util.Enumeration<E>[] f32692x5c30b92;

        /* renamed from: index */
        private int f32693x5fb28d2 = 0;

        public CompoundEnumeration(java.util.Enumeration<E>[] enumerationArr) {
            this.f32692x5c30b92 = enumerationArr;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            while (true) {
                int i17 = this.f32693x5fb28d2;
                java.util.Enumeration<E>[] enumerationArr = this.f32692x5c30b92;
                if (i17 >= enumerationArr.length) {
                    return false;
                }
                java.util.Enumeration<E> enumeration = enumerationArr[i17];
                if (enumeration != null && enumeration.hasMoreElements()) {
                    return true;
                }
                this.f32693x5fb28d2++;
            }
        }

        @Override // java.util.Enumeration
        public E nextElement() {
            if (hasMoreElements()) {
                return this.f32692x5c30b92[this.f32693x5fb28d2].nextElement();
            }
            throw new java.util.NoSuchElementException();
        }
    }

    private C11195x1ded775c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.ClassLoader classLoader) {
        super(str2, str3, classLoader.getParent());
        this.f32691xfcefb00f = str;
        this.f32690x7d1a1497 = classLoader;
    }

    /* renamed from: findField */
    private static final java.lang.reflect.Field m48363x183d66c1(java.lang.Class<?> cls, java.lang.String str) {
        java.lang.Class<?> cls2 = cls;
        do {
            try {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (java.lang.Throwable unused) {
                if (cls2 == java.lang.Object.class) {
                    break;
                }
                cls2 = cls2.getSuperclass();
                throw new java.lang.NoSuchFieldException("Cannot find field '" + str + "' in class " + cls.getName() + " or its super classes.");
            }
        } while (cls2 != null);
        throw new java.lang.NoSuchFieldException("Cannot find field '" + str + "' in class " + cls.getName() + " or its super classes.");
    }

    /* renamed from: injectOnDemand */
    public static java.lang.ClassLoader m48364xf8acadbb(android.app.Application application) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return application.getClass().getClassLoader();
    }

    /* renamed from: newInstance */
    private static com.p314xaae8f345.mm.obb.p978xbe953013.C11195x1ded775c m48365x6bff0255(android.app.Application application) {
        java.lang.ClassLoader classLoader = application.getClass().getClassLoader();
        java.lang.Object obj = m48363x183d66c1(dalvik.system.BaseDexClassLoader.class, "pathList").get(classLoader);
        android.content.pm.ApplicationInfo applicationInfo = application.getApplicationInfo();
        java.lang.String str = "/" + applicationInfo.packageName + "/";
        java.lang.Object[] objArr = (java.lang.Object[]) m48363x183d66c1(obj.getClass(), "dexElements").get(obj);
        java.lang.reflect.Field m48363x183d66c1 = m48363x183d66c1(objArr.getClass().getComponentType(), "dexFile");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        boolean z18 = true;
        for (java.lang.Object obj2 : objArr) {
            if (z18) {
                z18 = false;
            } else {
                sb6.append(java.io.File.pathSeparator);
            }
            java.lang.String name = ((dalvik.system.DexFile) m48363x183d66c1.get(obj2)).getName();
            if (name.equals(applicationInfo.sourceDir) || name.contains(str)) {
                sb6.append(name);
            }
        }
        java.util.List<java.io.File> list = (java.util.List) ak0.c0.a(obj, "nativeLibraryDirectories").get(obj);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (java.io.File file : list) {
            if (z17) {
                z17 = false;
            } else {
                sb7.append(java.io.File.pathSeparator);
            }
            sb7.append(file.getAbsolutePath());
        }
        return new com.p314xaae8f345.mm.obb.p978xbe953013.C11195x1ded775c(application.getClass().getName(), sb6.toString(), sb7.toString(), classLoader);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String str) {
        java.lang.Class<?> cls;
        if (str.equals(this.f32691xfcefb00f)) {
            return this.f32690x7d1a1497.loadClass(str);
        }
        if (str.startsWith("com.tencent.tinker.loader.") && !str.startsWith("com.tencent.tinker.loader.shareutil.")) {
            return this.f32690x7d1a1497.loadClass(str);
        }
        try {
            cls = super.findClass(str);
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        return cls != null ? cls : this.f32690x7d1a1497.loadClass(str);
    }

    @Override // java.lang.ClassLoader
    public java.net.URL getResource(java.lang.String str) {
        java.net.URL resource = java.lang.Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        java.net.URL findResource = findResource(str);
        return findResource != null ? findResource : this.f32690x7d1a1497.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String str) {
        return new com.p314xaae8f345.mm.obb.p978xbe953013.C11195x1ded775c.CompoundEnumeration(new java.util.Enumeration[]{java.lang.Object.class.getClassLoader().getResources(str), findResources(str), this.f32690x7d1a1497.getResources(str)});
    }
}
