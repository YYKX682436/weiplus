package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.c2 f279602a = new com.p314xaae8f345.mm.ui.c2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f279603b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f279604c = new java.util.LinkedHashMap();

    public final java.lang.Object a(java.lang.Class clazz) {
        java.lang.reflect.Constructor constructor;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f279604c;
        java.lang.Object obj = linkedHashMap.get(clazz);
        if (obj == null) {
            obj = null;
            try {
                java.lang.String name = clazz.getName();
                java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) f279603b;
                java.lang.Object obj2 = linkedHashMap2.get(name);
                java.lang.Object obj3 = obj2;
                if (obj2 == null) {
                    try {
                        java.lang.reflect.Constructor declaredConstructor = clazz.getDeclaredConstructor(new java.lang.Class[0]);
                        declaredConstructor.setAccessible(true);
                        constructor = declaredConstructor;
                    } catch (java.lang.NoSuchMethodException unused) {
                        constructor = null;
                    }
                    linkedHashMap2.put(name, constructor);
                    obj3 = constructor;
                }
                java.lang.reflect.Constructor constructor2 = (java.lang.reflect.Constructor) obj3;
                if (constructor2 != null) {
                    obj = constructor2.newInstance(new java.lang.Object[0]);
                }
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            linkedHashMap.put(clazz, obj);
        }
        return obj;
    }
}
