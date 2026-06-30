package com.facebook.soloader;

/* loaded from: classes12.dex */
public abstract class a0 {
    public static java.lang.String a() {
        java.lang.ClassLoader classLoader = com.facebook.soloader.c0.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof dalvik.system.BaseDexClassLoader)) {
            try {
                return (java.lang.String) dalvik.system.BaseDexClassLoader.class.getMethod("getLdLibraryPath", new java.lang.Class[0]).invoke((dalvik.system.BaseDexClassLoader) classLoader, new java.lang.Object[0]);
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Cannot call getLdLibraryPath", e17);
            }
        }
        throw new java.lang.IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }
}
