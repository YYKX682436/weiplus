package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f274479a;

    /* renamed from: b, reason: collision with root package name */
    public int f274480b;

    /* renamed from: c, reason: collision with root package name */
    public int f274481c;

    /* renamed from: d, reason: collision with root package name */
    public int f274482d;

    /* renamed from: e, reason: collision with root package name */
    public int f274483e;

    /* renamed from: f, reason: collision with root package name */
    public int f274484f;

    /* renamed from: g, reason: collision with root package name */
    public int f274485g;

    /* renamed from: h, reason: collision with root package name */
    public int f274486h;

    public r2(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f274481c = i17;
        this.f274479a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public final synchronized int a() {
        return this.f274486h;
    }

    public final synchronized int b() {
        return this.f274483e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f274480b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap r0 = r4.f274479a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f274480b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f274480b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap r0 = r4.f274479a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap r0 = r4.f274479a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap r2 = r4.f274479a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f274480b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.r(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f274480b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f274484f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f274484f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.o(r3, r1, r0, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.r2.d(int):void");
    }

    public final synchronized int e() {
        return this.f274485g;
    }

    public final synchronized int f() {
        return this.f274482d;
    }

    public int g(java.lang.Object obj, java.lang.Object obj2) {
        return 1;
    }

    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object put;
        if (obj == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LruMap", "key == null %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            return null;
        }
        synchronized (this) {
            java.lang.Object obj2 = this.f274479a.get(obj);
            if (obj2 != null) {
                this.f274485g++;
                return obj2;
            }
            this.f274486h++;
            java.lang.Object n17 = n(obj);
            if (n17 == null) {
                return null;
            }
            synchronized (this) {
                this.f274483e++;
                put = this.f274479a.put(obj, n17);
                if (put != null) {
                    this.f274479a.put(obj, put);
                } else {
                    this.f274480b += r(obj, n17);
                }
            }
            if (put != null) {
                o(false, obj, n17, put);
                return put;
            }
            d(this.f274481c);
            return n17;
        }
    }

    public final synchronized int h() {
        return this.f274484f;
    }

    public java.lang.Object i(java.lang.Object obj) {
        return get(obj);
    }

    public synchronized boolean k(java.lang.Object obj) {
        return this.f274479a.containsKey(obj);
    }

    /* renamed from: keySet */
    public java.util.Set m77802xbc5e1583() {
        return this.f274479a.keySet();
    }

    public final synchronized java.util.Map l() {
        return new java.util.LinkedHashMap(this.f274479a);
    }

    public synchronized boolean m(java.lang.Object obj) {
        return get(obj) != null;
    }

    public java.lang.Object n(java.lang.Object obj) {
        return null;
    }

    public void o(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
    }

    public java.util.Set p() {
        return this.f274479a.entrySet();
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        if (obj == null || obj2 == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LruMap", "put key == null or value == null [%s, %s], %s", obj, obj2, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        }
        synchronized (this) {
            this.f274482d++;
            this.f274480b += r(obj, obj2);
            put = this.f274479a.put(obj, obj2);
            if (put != null) {
                this.f274480b -= r(obj, put);
            }
        }
        if (put != null) {
            o(false, obj, put, obj2);
        }
        d(this.f274481c);
        return put;
    }

    public final synchronized int q() {
        return this.f274481c;
    }

    public final int r(java.lang.Object obj, java.lang.Object obj2) {
        int g17 = g(obj, obj2);
        if (g17 >= 0) {
            return g17;
        }
        throw new java.lang.IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    /* renamed from: remove */
    public final java.lang.Object m77803xc84af884(java.lang.Object obj) {
        java.lang.Object remove;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f274479a.remove(obj);
            if (remove != null) {
                this.f274480b -= r(obj, remove);
            }
        }
        if (remove != null) {
            o(false, obj, remove, null);
        }
        return remove;
    }

    public synchronized void s(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LruCache", "setMaxSize %s", java.lang.Integer.valueOf(i17));
        this.f274481c = i17;
    }

    /* renamed from: size */
    public final synchronized int m77804x35e001() {
        return this.f274480b;
    }

    /* renamed from: toString */
    public final synchronized java.lang.String m77805x9616526c() {
        int i17;
        int i18;
        i17 = this.f274485g;
        i18 = this.f274486h + i17;
        return java.lang.String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.f274481c), java.lang.Integer.valueOf(this.f274485g), java.lang.Integer.valueOf(this.f274486h), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    /* renamed from: values */
    public java.util.Collection m77806xcee59d22() {
        return this.f274479a.values();
    }
}
