package x;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: createCount */
    private int f77376xe107fd73;

    /* renamed from: evictionCount */
    private int f77377xa992b530;

    /* renamed from: hitCount */
    private int f77378xafbf113c;
    private final java.util.LinkedHashMap<java.lang.Object, java.lang.Object> map;

    /* renamed from: maxSize */
    private int f77379x324fa785;

    /* renamed from: missCount */
    private int f77380x480cf973;

    /* renamed from: putCount */
    private int f77381x69933f40;

    /* renamed from: size */
    private int f77382x35e001;

    public g(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f77379x324fa785 = i17;
        this.map = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    public final int a(java.lang.Object obj, java.lang.Object obj2) {
        int mo723xca3dedb8 = mo723xca3dedb8(obj, obj2);
        if (mo723xca3dedb8 >= 0) {
            return mo723xca3dedb8;
        }
        throw new java.lang.IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* renamed from: create */
    public java.lang.Object m174733xaf65a0fc(java.lang.Object obj) {
        return null;
    }

    /* renamed from: createCount */
    public final synchronized int m174734xe107fd73() {
        return this.f77376xe107fd73;
    }

    /* renamed from: entryRemoved */
    public void mo722x78d6a38e(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
    }

    /* renamed from: evictAll */
    public final void m174735x16cbb098() {
        m174746x6ebdebde(-1);
    }

    /* renamed from: evictionCount */
    public final synchronized int m174736xa992b530() {
        return this.f77377xa992b530;
    }

    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object put;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            java.lang.Object obj2 = this.map.get(obj);
            if (obj2 != null) {
                this.f77378xafbf113c++;
                return obj2;
            }
            this.f77380x480cf973++;
            java.lang.Object m174733xaf65a0fc = m174733xaf65a0fc(obj);
            if (m174733xaf65a0fc == null) {
                return null;
            }
            synchronized (this) {
                this.f77376xe107fd73++;
                put = this.map.put(obj, m174733xaf65a0fc);
                if (put != null) {
                    this.map.put(obj, put);
                } else {
                    this.f77382x35e001 += a(obj, m174733xaf65a0fc);
                }
            }
            if (put != null) {
                mo722x78d6a38e(false, obj, m174733xaf65a0fc, put);
                return put;
            }
            m174746x6ebdebde(this.f77379x324fa785);
            return m174733xaf65a0fc;
        }
    }

    /* renamed from: hitCount */
    public final synchronized int m174737xafbf113c() {
        return this.f77378xafbf113c;
    }

    /* renamed from: maxSize */
    public final synchronized int m174738x324fa785() {
        return this.f77379x324fa785;
    }

    /* renamed from: missCount */
    public final synchronized int m174739x480cf973() {
        return this.f77380x480cf973;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        if (obj == null || obj2 == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f77381x69933f40++;
            this.f77382x35e001 += a(obj, obj2);
            put = this.map.put(obj, obj2);
            if (put != null) {
                this.f77382x35e001 -= a(obj, put);
            }
        }
        if (put != null) {
            mo722x78d6a38e(false, obj, put, obj2);
        }
        m174746x6ebdebde(this.f77379x324fa785);
        return put;
    }

    /* renamed from: putCount */
    public final synchronized int m174740x69933f40() {
        return this.f77381x69933f40;
    }

    /* renamed from: remove */
    public final java.lang.Object m174741xc84af884(java.lang.Object obj) {
        java.lang.Object remove;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.map.remove(obj);
            if (remove != null) {
                this.f77382x35e001 -= a(obj, remove);
            }
        }
        if (remove != null) {
            mo722x78d6a38e(false, obj, remove, null);
        }
        return remove;
    }

    /* renamed from: resize */
    public void m174742xc84d9cb4(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f77379x324fa785 = i17;
        }
        m174746x6ebdebde(i17);
    }

    /* renamed from: size */
    public final synchronized int m174743x35e001() {
        return this.f77382x35e001;
    }

    /* renamed from: sizeOf */
    public int mo723xca3dedb8(java.lang.Object obj, java.lang.Object obj2) {
        return 1;
    }

    /* renamed from: snapshot */
    public final synchronized java.util.Map<java.lang.Object, java.lang.Object> m174744x10fad5c4() {
        return new java.util.LinkedHashMap(this.map);
    }

    /* renamed from: toString */
    public final synchronized java.lang.String m174745x9616526c() {
        int i17;
        int i18;
        i17 = this.f77378xafbf113c;
        i18 = this.f77380x480cf973 + i17;
        return java.lang.String.format(java.util.Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.f77379x324fa785), java.lang.Integer.valueOf(this.f77378xafbf113c), java.lang.Integer.valueOf(this.f77380x480cf973), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: trimToSize */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m174746x6ebdebde(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f77382x35e001     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r4.map     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f77382x35e001     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f77382x35e001     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r4.map     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r0 = r4.map     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<java.lang.Object, java.lang.Object> r2 = r4.map     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f77382x35e001     // Catch: java.lang.Throwable -> L71
            int r3 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f77382x35e001 = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f77377xa992b530     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f77377xa992b530 = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.mo722x78d6a38e(r3, r1, r0, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: x.g.m174746x6ebdebde(int):void");
    }
}
