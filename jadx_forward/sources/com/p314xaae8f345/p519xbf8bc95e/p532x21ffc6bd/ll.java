package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes10.dex */
public final class ll<T, K> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f131862a = 1024;

    /* renamed from: b, reason: collision with root package name */
    private java.util.HashMap<T, K> f131863b;

    /* renamed from: c, reason: collision with root package name */
    private int f131864c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f131865d = 1024;

    private void a(int i17) {
        this.f131865d = i17;
    }

    private synchronized void b(T t17) {
        java.util.HashMap<T, K> hashMap = this.f131863b;
        if (hashMap == null) {
            return;
        }
        hashMap.remove(t17);
    }

    public final synchronized void a(T t17, K k17) {
        if (this.f131863b == null) {
            this.f131863b = new java.util.HashMap<>();
        }
        this.f131863b.put(t17, k17);
    }

    public final synchronized K a(T t17) {
        java.util.HashMap<T, K> hashMap = this.f131863b;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(t17);
    }
}
