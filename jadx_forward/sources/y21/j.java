package y21;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f540595g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f540596h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f540597i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.Object f540598j;

    /* renamed from: a, reason: collision with root package name */
    public final int f540599a;

    /* renamed from: b, reason: collision with root package name */
    public final long f540600b;

    /* renamed from: c, reason: collision with root package name */
    public final long f540601c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f540602d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f540603e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f540604f;

    static {
        new y21.i(null);
        f540595g = new java.lang.ThreadLocal();
        f540596h = new java.lang.ThreadLocal();
        f540597i = new java.lang.Object();
        f540598j = new java.lang.Object();
    }

    public j(int i17) {
        java.lang.Long valueOf;
        long j17;
        this.f540599a = i17;
        long id6 = java.lang.Thread.currentThread().getId();
        this.f540601c = id6;
        java.lang.String name = java.lang.Thread.currentThread().getName();
        java.lang.String str = "thread_" + id6 + '_' + i17 + '_' + java.lang.System.nanoTime();
        this.f540604f = str;
        java.lang.ThreadLocal threadLocal = f540595g;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null) {
            map = new java.util.LinkedHashMap();
            threadLocal.set(map);
        }
        java.lang.ThreadLocal threadLocal2 = f540596h;
        java.util.Map map2 = (java.util.Map) threadLocal2.get();
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            threadLocal2.set(map2);
        }
        java.lang.Long l17 = (java.lang.Long) map.get(str);
        if (l17 != null) {
            j17 = l17.longValue();
        } else {
            synchronized (f540597i) {
                valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48252x5303545d(i17, 0L));
            }
            long longValue = valueOf.longValue();
            if (longValue != 0) {
                map.put(str, java.lang.Long.valueOf(longValue));
                map2.put(str, new java.util.concurrent.atomic.AtomicInteger(0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Created decoder for thread " + id6 + '(' + name + "), sampleRate: " + i17 + ", handle: " + longValue);
                try {
                    wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
                    boolean bj6 = l1Var != null ? ((u14.t) l1Var).bj() : false;
                    int Di = l1Var != null ? ((u14.t) l1Var).Di() : 0;
                    int Ni = l1Var != null ? ((u14.t) l1Var).Ni() : 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "WaveHAid, flag:" + bj6 + ", type:" + Di + ", device:" + Ni);
                    if (bj6) {
                        byte[] bArr = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni & 255), (byte) ((Ni >> 8) & 255), (byte) ((Ni >> 16) & 255), (byte) ((Ni >> 24) & 255)};
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "WaveHAid initialized, params:[" + kz5.z.a0(bArr, ",", null, null, 0, null, null, 62, null) + "], len:8, ret:" + com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48255x6d6dba18(300, bArr, 8, longValue));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Failed to initialize hearing aid: " + e17.getMessage());
                }
                this.f540602d = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Failed to create decoder for thread " + id6 + ", sampleRate: " + i17);
            }
            j17 = longValue;
        }
        this.f540600b = j17;
        if (j17 != 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(this.f540604f);
            if (atomicInteger != null) {
                atomicInteger.incrementAndGet();
            }
            if (this.f540602d) {
                return;
            }
            this.f540602d = true;
        }
    }
}
