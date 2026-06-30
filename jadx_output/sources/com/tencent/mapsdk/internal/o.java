package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.String> f50590a = new java.util.HashMap<>();

    private o() {
    }

    public static <T extends com.tencent.mapsdk.internal.p> void a(java.lang.Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            if (newInstance != null) {
                java.lang.String className = newInstance.className();
                if ("".equals(className)) {
                    className = cls.getName();
                }
                f50590a.put(className, cls.getName());
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
    }

    public static java.lang.String a(java.lang.String str) {
        return f50590a.get(str);
    }
}
