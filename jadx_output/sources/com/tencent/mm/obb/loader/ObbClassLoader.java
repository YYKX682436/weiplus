package com.tencent.mm.obb.loader;

/* loaded from: classes13.dex */
public class ObbClassLoader extends dalvik.system.PathClassLoader {
    private static final java.lang.String TAG = "MicroMsg.ObbClassLoader";
    private final java.lang.ClassLoader mAppClassLoader;
    private final java.lang.String mAppClassName;

    /* loaded from: classes13.dex */
    public class CompoundEnumeration<E> implements java.util.Enumeration<E> {
        private java.util.Enumeration<E>[] enums;
        private int index = 0;

        public CompoundEnumeration(java.util.Enumeration<E>[] enumerationArr) {
            this.enums = enumerationArr;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            while (true) {
                int i17 = this.index;
                java.util.Enumeration<E>[] enumerationArr = this.enums;
                if (i17 >= enumerationArr.length) {
                    return false;
                }
                java.util.Enumeration<E> enumeration = enumerationArr[i17];
                if (enumeration != null && enumeration.hasMoreElements()) {
                    return true;
                }
                this.index++;
            }
        }

        @Override // java.util.Enumeration
        public E nextElement() {
            if (hasMoreElements()) {
                return this.enums[this.index].nextElement();
            }
            throw new java.util.NoSuchElementException();
        }
    }

    private ObbClassLoader(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.ClassLoader classLoader) {
        super(str2, str3, classLoader.getParent());
        this.mAppClassName = str;
        this.mAppClassLoader = classLoader;
    }

    private static final java.lang.reflect.Field findField(java.lang.Class<?> cls, java.lang.String str) {
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

    public static java.lang.ClassLoader injectOnDemand(android.app.Application application) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return application.getClass().getClassLoader();
    }

    private static com.tencent.mm.obb.loader.ObbClassLoader newInstance(android.app.Application application) {
        java.lang.ClassLoader classLoader = application.getClass().getClassLoader();
        java.lang.Object obj = findField(dalvik.system.BaseDexClassLoader.class, "pathList").get(classLoader);
        android.content.pm.ApplicationInfo applicationInfo = application.getApplicationInfo();
        java.lang.String str = "/" + applicationInfo.packageName + "/";
        java.lang.Object[] objArr = (java.lang.Object[]) findField(obj.getClass(), "dexElements").get(obj);
        java.lang.reflect.Field findField = findField(objArr.getClass().getComponentType(), "dexFile");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        boolean z18 = true;
        for (java.lang.Object obj2 : objArr) {
            if (z18) {
                z18 = false;
            } else {
                sb6.append(java.io.File.pathSeparator);
            }
            java.lang.String name = ((dalvik.system.DexFile) findField.get(obj2)).getName();
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
        return new com.tencent.mm.obb.loader.ObbClassLoader(application.getClass().getName(), sb6.toString(), sb7.toString(), classLoader);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String str) {
        java.lang.Class<?> cls;
        if (str.equals(this.mAppClassName)) {
            return this.mAppClassLoader.loadClass(str);
        }
        if (str.startsWith("com.tencent.tinker.loader.") && !str.startsWith("com.tencent.tinker.loader.shareutil.")) {
            return this.mAppClassLoader.loadClass(str);
        }
        try {
            cls = super.findClass(str);
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        return cls != null ? cls : this.mAppClassLoader.loadClass(str);
    }

    @Override // java.lang.ClassLoader
    public java.net.URL getResource(java.lang.String str) {
        java.net.URL resource = java.lang.Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        java.net.URL findResource = findResource(str);
        return findResource != null ? findResource : this.mAppClassLoader.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String str) {
        return new com.tencent.mm.obb.loader.ObbClassLoader.CompoundEnumeration(new java.util.Enumeration[]{java.lang.Object.class.getClassLoader().getResources(str), findResources(str), this.mAppClassLoader.getResources(str)});
    }
}
