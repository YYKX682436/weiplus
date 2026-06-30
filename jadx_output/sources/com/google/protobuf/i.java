package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f45173a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f45174b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f45173a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        f45174b = cls2 != null;
    }

    public static boolean a() {
        return (f45173a == null || f45174b) ? false : true;
    }
}
