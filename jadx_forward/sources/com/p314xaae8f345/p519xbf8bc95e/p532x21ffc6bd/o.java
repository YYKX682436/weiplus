package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.String> f132123a = new java.util.HashMap<>();

    private o() {
    }

    public static <T extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p> void a(java.lang.Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            if (newInstance != null) {
                java.lang.String mo36073xff691c23 = newInstance.mo36073xff691c23();
                if ("".equals(mo36073xff691c23)) {
                    mo36073xff691c23 = cls.getName();
                }
                f132123a.put(mo36073xff691c23, cls.getName());
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
    }

    public static java.lang.String a(java.lang.String str) {
        return f132123a.get(str);
    }
}
