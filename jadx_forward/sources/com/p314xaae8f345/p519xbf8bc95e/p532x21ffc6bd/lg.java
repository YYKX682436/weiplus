package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class lg<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashMap<K, V> f131830a;

    /* renamed from: b, reason: collision with root package name */
    private int f131831b;

    /* renamed from: c, reason: collision with root package name */
    private int f131832c;

    /* renamed from: d, reason: collision with root package name */
    private int f131833d;

    /* renamed from: e, reason: collision with root package name */
    private int f131834e;

    /* renamed from: f, reason: collision with root package name */
    private int f131835f;

    /* renamed from: g, reason: collision with root package name */
    private int f131836g;

    /* renamed from: h, reason: collision with root package name */
    private int f131837h;

    public lg(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f131832c = i17;
        this.f131830a = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    private static V e() {
        return null;
    }

    private synchronized int f() {
        return this.f131836g;
    }

    private synchronized int g() {
        return this.f131837h;
    }

    private synchronized int h() {
        return this.f131834e;
    }

    private synchronized int i() {
        return this.f131833d;
    }

    private synchronized int j() {
        return this.f131835f;
    }

    public int a(V v17) {
        return 1;
    }

    public final V b(K k17) {
        if (k17 != null) {
            synchronized (this) {
                V v17 = this.f131830a.get(k17);
                if (v17 != null) {
                    this.f131836g++;
                    return v17;
                }
                this.f131837h++;
                return null;
            }
        }
        throw new java.lang.NullPointerException("key == null");
    }

    public final V c(K k17) {
        V remove;
        if (k17 != null) {
            synchronized (this) {
                remove = this.f131830a.remove(k17);
                if (remove != null) {
                    this.f131831b -= b(k17, remove);
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
        return new java.util.LinkedHashMap(this.f131830a);
    }

    /* renamed from: toString */
    public final synchronized java.lang.String m36822x9616526c() {
        int i17;
        int i18;
        i17 = this.f131836g;
        i18 = this.f131837h + i17;
        return java.lang.String.format(java.util.Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.f131832c), java.lang.Integer.valueOf(this.f131836g), java.lang.Integer.valueOf(this.f131837h), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    public void a(boolean z17, K k17, V v17, V v18) {
    }

    public final void a(int i17) {
        if (i17 > 0) {
            synchronized (this) {
                this.f131832c = i17;
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
            int r0 = r4.f131831b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f131830a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f131831b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f131831b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f131830a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f131830a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f131830a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f131831b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.b(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f131831b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f131835f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f131835f = r2     // Catch: java.lang.Throwable -> L71
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lg.b(int):void");
    }

    public final synchronized int c() {
        return this.f131832c;
    }

    public final V a(K k17, V v17) {
        V put;
        if (k17 != null && v17 != null) {
            synchronized (this) {
                this.f131833d++;
                this.f131831b += b(k17, v17);
                put = this.f131830a.put(k17, v17);
                if (put != null) {
                    this.f131831b -= b(k17, put);
                }
            }
            if (put != null) {
                a(false, k17, put, v17);
            }
            b(this.f131832c);
            return put;
        }
        throw new java.lang.NullPointerException("key == null || value == null");
    }

    public final void a() {
        b(-1);
    }

    private int b(K k17, V v17) {
        int a17 = a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lg<K, V>) v17);
        if (a17 >= 0) {
            return a17;
        }
        throw new java.lang.IllegalStateException("Negative size: " + k17 + "=" + v17);
    }

    public final synchronized int b() {
        return this.f131831b;
    }
}
