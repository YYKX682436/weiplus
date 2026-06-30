package com.tencent.mapsdk.internal;

/* loaded from: classes10.dex */
public final class ll<T, K> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f50329a = 1024;

    /* renamed from: b, reason: collision with root package name */
    private java.util.HashMap<T, K> f50330b;

    /* renamed from: c, reason: collision with root package name */
    private int f50331c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f50332d = 1024;

    private void a(int i17) {
        this.f50332d = i17;
    }

    private synchronized void b(T t17) {
        java.util.HashMap<T, K> hashMap = this.f50330b;
        if (hashMap == null) {
            return;
        }
        hashMap.remove(t17);
    }

    public final synchronized void a(T t17, K k17) {
        if (this.f50330b == null) {
            this.f50330b = new java.util.HashMap<>();
        }
        this.f50330b.put(t17, k17);
    }

    public final synchronized K a(T t17) {
        java.util.HashMap<T, K> hashMap = this.f50330b;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(t17);
    }
}
