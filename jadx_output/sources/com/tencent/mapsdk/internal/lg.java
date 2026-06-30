package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class lg<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashMap<K, V> f50297a;

    /* renamed from: b, reason: collision with root package name */
    private int f50298b;

    /* renamed from: c, reason: collision with root package name */
    private int f50299c;

    /* renamed from: d, reason: collision with root package name */
    private int f50300d;

    /* renamed from: e, reason: collision with root package name */
    private int f50301e;

    /* renamed from: f, reason: collision with root package name */
    private int f50302f;

    /* renamed from: g, reason: collision with root package name */
    private int f50303g;

    /* renamed from: h, reason: collision with root package name */
    private int f50304h;

    public lg(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f50299c = i17;
        this.f50297a = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    private static V e() {
        return null;
    }

    private synchronized int f() {
        return this.f50303g;
    }

    private synchronized int g() {
        return this.f50304h;
    }

    private synchronized int h() {
        return this.f50301e;
    }

    private synchronized int i() {
        return this.f50300d;
    }

    private synchronized int j() {
        return this.f50302f;
    }

    public int a(V v17) {
        return 1;
    }

    public final V b(K k17) {
        if (k17 != null) {
            synchronized (this) {
                V v17 = this.f50297a.get(k17);
                if (v17 != null) {
                    this.f50303g++;
                    return v17;
                }
                this.f50304h++;
                return null;
            }
        }
        throw new java.lang.NullPointerException("key == null");
    }

    public final V c(K k17) {
        V remove;
        if (k17 != null) {
            synchronized (this) {
                remove = this.f50297a.remove(k17);
                if (remove != null) {
                    this.f50298b -= b(k17, remove);
                }
            }
            if (remove != null) {
                a(false, k17, remove, null);
            }
            return remove;
        }
        throw new java.lang.NullPointerException("key == null");
    }

    public final synchronized java.util.Map<K, V> d() {
        return new java.util.LinkedHashMap(this.f50297a);
    }

    public final synchronized java.lang.String toString() {
        int i17;
        int i18;
        i17 = this.f50303g;
        i18 = this.f50304h + i17;
        return java.lang.String.format(java.util.Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.f50299c), java.lang.Integer.valueOf(this.f50303g), java.lang.Integer.valueOf(this.f50304h), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    public void a(boolean z17, K k17, V v17, V v18) {
    }

    public final void a(int i17) {
        if (i17 > 0) {
            synchronized (this) {
                this.f50299c = i17;
            }
            b(i17);
            return;
        }
        throw new java.lang.IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f50298b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f50297a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f50298b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f50298b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f50297a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f50297a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f50297a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f50298b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.b(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f50298b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f50302f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f50302f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.a(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.lg.b(int):void");
    }

    public final synchronized int c() {
        return this.f50299c;
    }

    public final V a(K k17, V v17) {
        V put;
        if (k17 != null && v17 != null) {
            synchronized (this) {
                this.f50300d++;
                this.f50298b += b(k17, v17);
                put = this.f50297a.put(k17, v17);
                if (put != null) {
                    this.f50298b -= b(k17, put);
                }
            }
            if (put != null) {
                a(false, k17, put, v17);
            }
            b(this.f50299c);
            return put;
        }
        throw new java.lang.NullPointerException("key == null || value == null");
    }

    public final void a() {
        b(-1);
    }

    private int b(K k17, V v17) {
        int a17 = a((com.tencent.mapsdk.internal.lg<K, V>) v17);
        if (a17 >= 0) {
            return a17;
        }
        throw new java.lang.IllegalStateException("Negative size: " + k17 + "=" + v17);
    }

    public final synchronized int b() {
        return this.f50298b;
    }
}
