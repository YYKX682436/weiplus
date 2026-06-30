package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.WrappedClassLoader */
/* loaded from: classes13.dex */
public class C29382x97ed1606 extends java.lang.ClassLoader {

    /* renamed from: mPrimaryClassLoader */
    private final java.lang.ClassLoader f73491x4ab34b96;

    /* renamed from: mSecondaryClassLoader */
    private final java.lang.ClassLoader f73492x37f20da4;

    public C29382x97ed1606(java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) {
        this.f73491x4ab34b96 = classLoader;
        this.f73492x37f20da4 = classLoader2;
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String str) {
        try {
            return this.f73491x4ab34b96.loadClass(str);
        } catch (java.lang.ClassNotFoundException e17) {
            try {
                return this.f73492x37f20da4.loadClass(str);
            } catch (java.lang.ClassNotFoundException e18) {
                e17.addSuppressed(e18);
                throw e17;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public java.lang.String findLibrary(java.lang.String str) {
        java.lang.String str2;
        java.lang.ClassLoader classLoader = this.f73491x4ab34b96;
        if (classLoader instanceof dalvik.system.BaseDexClassLoader) {
            str2 = ((dalvik.system.BaseDexClassLoader) classLoader).findLibrary(str);
            if (str2 != null) {
                return str2;
            }
        } else {
            str2 = null;
        }
        java.lang.ClassLoader classLoader2 = this.f73492x37f20da4;
        return classLoader2 instanceof dalvik.system.BaseDexClassLoader ? ((dalvik.system.BaseDexClassLoader) classLoader2).findLibrary(str) : str2;
    }
}
