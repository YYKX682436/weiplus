package y00;

/* loaded from: classes3.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f540029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f540030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f540031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f540032h;

    public b0(java.lang.String str, long j17, java.util.Map map, long j18, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        this.f540028d = str;
        this.f540029e = j17;
        this.f540030f = map;
        this.f540031g = j18;
        this.f540032h = atomicInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            android.util.LruCache r0 = y00.h.f540060a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = r9.f540028d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            int r3 = r0.length()
            if (r3 != 0) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            if (r3 != 0) goto L6c
            long r3 = r9.f540029e
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L6c
            java.util.Map r5 = r9.f540030f
            if (r5 == 0) goto L37
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L35
            goto L37
        L35:
            r6 = r2
            goto L38
        L37:
            r6 = r1
        L38:
            if (r6 == 0) goto L3b
            goto L6c
        L3b:
            android.util.LruCache r6 = y00.h.f540060a
            android.util.LruCache r6 = y00.h.f540060a
            java.lang.Object r7 = r6.get(r0)
            android.util.LruCache r7 = (android.util.LruCache) r7
            if (r7 == 0) goto L48
            goto L52
        L48:
            android.util.LruCache r7 = new android.util.LruCache
            r8 = 15
            r7.<init>(r8)
            r6.put(r0, r7)
        L52:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L5d
            goto L6c
        L5d:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            y00.g r2 = new y00.g
            long r3 = r9.f540031g
            r2.<init>(r5, r3)
            r7.put(r0, r2)
            goto L6d
        L6c:
            r1 = r2
        L6d:
            if (r1 == 0) goto L74
            java.util.concurrent.atomic.AtomicInteger r0 = r9.f540032h
            r0.incrementAndGet()
        L74:
            return
        L75:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EcsKfProductCardMemCache.putIfAbsent must be called on main thread, actual="
            r0.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.b0.run():void");
    }
}
