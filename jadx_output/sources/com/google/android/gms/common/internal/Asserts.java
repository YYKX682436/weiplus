package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class Asserts {
    private Asserts() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static void checkMainThread(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.String.valueOf(java.lang.Thread.currentThread());
        java.lang.String.valueOf(android.os.Looper.getMainLooper().getThread());
        throw new java.lang.IllegalStateException(str);
    }

    public static void checkNotMainThread(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.String.valueOf(java.lang.Thread.currentThread());
        java.lang.String.valueOf(android.os.Looper.getMainLooper().getThread());
        throw new java.lang.IllegalStateException(str);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static void checkNotNull(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("null reference");
        }
    }

    public static void checkNull(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException("non-null reference");
        }
    }

    public static void checkState(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalStateException();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static void checkNotNull(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    public static void checkNull(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    public static void checkState(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
