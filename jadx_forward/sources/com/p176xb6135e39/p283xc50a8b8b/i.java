package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f126706a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f126707b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f126706a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        f126707b = cls2 != null;
    }

    public static boolean a() {
        return (f126706a == null || f126707b) ? false : true;
    }
}
