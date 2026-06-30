package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes7.dex */
public abstract class j0 {
    public static void a(java.lang.Class cls) {
        int modifiers = cls.getModifiers();
        if (java.lang.reflect.Modifier.isInterface(modifiers)) {
            throw new java.lang.UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        }
        if (java.lang.reflect.Modifier.isAbstract(modifiers)) {
            throw new java.lang.UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public abstract java.lang.Object b(java.lang.Class cls);
}
