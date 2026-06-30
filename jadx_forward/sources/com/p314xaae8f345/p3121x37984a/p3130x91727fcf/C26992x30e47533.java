package com.p314xaae8f345.p3121x37984a.p3130x91727fcf;

/* renamed from: com.tencent.wcdb.support.LruCache */
/* loaded from: classes12.dex */
public class C26992x30e47533<K, V> {

    /* renamed from: createCount */
    private int f58436xe107fd73;

    /* renamed from: evictionCount */
    private int f58437xa992b530;

    /* renamed from: hitCount */
    private int f58438xafbf113c;
    private final java.util.LinkedHashMap<K, V> map;

    /* renamed from: maxSize */
    private int f58439x324fa785;

    /* renamed from: missCount */
    private int f58440x480cf973;

    /* renamed from: putCount */
    private int f58441x69933f40;

    /* renamed from: size */
    private int f58442x35e001;

    public C26992x30e47533(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f58439x324fa785 = i17;
        this.map = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: safeSizeOf */
    private int m108031xc11bfba5(K k17, V v17) {
        int m108043xca3dedb8 = m108043xca3dedb8(k17, v17);
        if (m108043xca3dedb8 >= 0) {
            return m108043xca3dedb8;
        }
        throw new java.lang.IllegalStateException("Negative size: " + k17 + "=" + v17);
    }

    /* renamed from: create */
    public V m108032xaf65a0fc(K k17) {
        return null;
    }

    /* renamed from: createCount */
    public final synchronized int m108033xe107fd73() {
        return this.f58436xe107fd73;
    }

    /* renamed from: entryRemoved */
    public void mo107552x78d6a38e(boolean z17, K k17, V v17, V v18) {
    }

    /* renamed from: evictAll */
    public final void m108034x16cbb098() {
        m108046x6ebdebde(-1);
    }

    /* renamed from: evictionCount */
    public final synchronized int m108035xa992b530() {
        return this.f58437xa992b530;
    }

    public final V get(K k17) {
        V v17;
        if (k17 == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            V v18 = this.map.get(k17);
            if (v18 != null) {
                this.f58438xafbf113c++;
                return v18;
            }
            this.f58440x480cf973++;
            V m108032xaf65a0fc = m108032xaf65a0fc(k17);
            if (m108032xaf65a0fc == null) {
                return null;
            }
            synchronized (this) {
                this.f58436xe107fd73++;
                v17 = (V) this.map.put(k17, m108032xaf65a0fc);
                if (v17 != null) {
                    this.map.put(k17, v17);
                } else {
                    this.f58442x35e001 += m108031xc11bfba5(k17, m108032xaf65a0fc);
                }
            }
            if (v17 != null) {
                mo107552x78d6a38e(false, k17, m108032xaf65a0fc, v17);
                return v17;
            }
            m108046x6ebdebde(this.f58439x324fa785);
            return m108032xaf65a0fc;
        }
    }

    /* renamed from: hitCount */
    public final synchronized int m108036xafbf113c() {
        return this.f58438xafbf113c;
    }

    /* renamed from: maxSize */
    public final synchronized int m108037x324fa785() {
        return this.f58439x324fa785;
    }

    /* renamed from: missCount */
    public final synchronized int m108038x480cf973() {
        return this.f58440x480cf973;
    }

    public final V put(K k17, V v17) {
        V put;
        if (k17 == null || v17 == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f58441x69933f40++;
            this.f58442x35e001 += m108031xc11bfba5(k17, v17);
            put = this.map.put(k17, v17);
            if (put != null) {
                this.f58442x35e001 -= m108031xc11bfba5(k17, put);
            }
        }
        if (put != null) {
            mo107552x78d6a38e(false, k17, put, v17);
        }
        m108046x6ebdebde(this.f58439x324fa785);
        return put;
    }

    /* renamed from: putCount */
    public final synchronized int m108039x69933f40() {
        return this.f58441x69933f40;
    }

    /* renamed from: remove */
    public final V m108040xc84af884(K k17) {
        V remove;
        if (k17 == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.map.remove(k17);
            if (remove != null) {
                this.f58442x35e001 -= m108031xc11bfba5(k17, remove);
            }
        }
        if (remove != null) {
            mo107552x78d6a38e(false, k17, remove, null);
        }
        return remove;
    }

    /* renamed from: resize */
    public void m108041xc84d9cb4(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f58439x324fa785 = i17;
        }
        m108046x6ebdebde(i17);
    }

    /* renamed from: size */
    public final synchronized int m108042x35e001() {
        return this.f58442x35e001;
    }

    /* renamed from: sizeOf */
    public int m108043xca3dedb8(K k17, V v17) {
        return 1;
    }

    /* renamed from: snapshot */
    public final synchronized java.util.Map<K, V> m108044x10fad5c4() {
        return new java.util.LinkedHashMap(this.map);
    }

    /* renamed from: toString */
    public final synchronized java.lang.String m108045x9616526c() {
        int i17;
        int i18;
        i17 = this.f58438xafbf113c;
        i18 = this.f58440x480cf973 + i17;
        return java.lang.String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.f58439x324fa785), java.lang.Integer.valueOf(this.f58438xafbf113c), java.lang.Integer.valueOf(this.f58440x480cf973), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: trimToSize */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m108046x6ebdebde(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r0 = r5.f58442x35e001     // Catch: java.lang.Throwable -> L87
            if (r0 < 0) goto L68
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L11
            int r0 = r5.f58442x35e001     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L68
        L11:
            int r0 = r5.f58442x35e001     // Catch: java.lang.Throwable -> L87
            if (r0 <= r6) goto L66
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L1e
            goto L66
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L40
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L87
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L87
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 != 0) goto L45
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            goto L67
        L45:
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L87
            java.util.LinkedHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L87
            r3.remove(r2)     // Catch: java.lang.Throwable -> L87
            int r3 = r5.f58442x35e001     // Catch: java.lang.Throwable -> L87
            int r4 = r5.m108031xc11bfba5(r2, r0)     // Catch: java.lang.Throwable -> L87
            int r3 = r3 - r4
            r5.f58442x35e001 = r3     // Catch: java.lang.Throwable -> L87
            int r3 = r5.f58437xa992b530     // Catch: java.lang.Throwable -> L87
            r4 = 1
            int r3 = r3 + r4
            r5.f58437xa992b530 = r3     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            r5.mo107552x78d6a38e(r4, r2, r0, r1)
            goto L0
        L66:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
        L67:
            return
        L68:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L87
            r0.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L87
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L87
            throw r6     // Catch: java.lang.Throwable -> L87
        L87:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26992x30e47533.m108046x6ebdebde(int):void");
    }
}
