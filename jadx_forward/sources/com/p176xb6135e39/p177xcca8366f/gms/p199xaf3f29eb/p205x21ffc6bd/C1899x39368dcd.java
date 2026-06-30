package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.Asserts */
/* loaded from: classes13.dex */
public final class C1899x39368dcd {
    private C1899x39368dcd() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    /* renamed from: checkMainThread */
    public static void m18079x6483284b(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.String.valueOf(java.lang.Thread.currentThread());
        java.lang.String.valueOf(android.os.Looper.getMainLooper().getThread());
        throw new java.lang.IllegalStateException(str);
    }

    /* renamed from: checkNotMainThread */
    public static void m18080xfcae242e(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.String.valueOf(java.lang.Thread.currentThread());
        java.lang.String.valueOf(android.os.Looper.getMainLooper().getThread());
        throw new java.lang.IllegalStateException(str);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: checkNotNull */
    public static void m18081x7b41bcd2(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("null reference");
        }
    }

    /* renamed from: checkNull */
    public static void m18083x17bf5aaf(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException("non-null reference");
        }
    }

    /* renamed from: checkState */
    public static void m18085xe071d469(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalStateException();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    /* renamed from: checkNotNull */
    public static void m18082x7b41bcd2(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    /* renamed from: checkNull */
    public static void m18084x17bf5aaf(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    /* renamed from: checkState */
    public static void m18086xe071d469(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
