package w21;

/* loaded from: classes14.dex */
public final class t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.ThreadLocal f524001f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f524002g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f524003h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f524004i;

    /* renamed from: a, reason: collision with root package name */
    public final int f524005a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f524006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f524007c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f524008d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f524009e;

    static {
        new w21.s0(null);
        f524001f = new java.lang.ThreadLocal();
        f524002g = new java.lang.ThreadLocal();
        f524003h = new java.lang.Object();
        f524004i = new java.lang.Object();
    }

    public t0(int i17, byte[] pInData, int i18) {
        long m48245x2f5913fd;
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pInData, "pInData");
        this.f524005a = i17;
        long id6 = java.lang.Thread.currentThread().getId();
        java.lang.Thread.currentThread().getName();
        java.lang.String str = "thread_" + id6 + '_' + i17 + '_' + java.lang.System.nanoTime();
        this.f524006b = str;
        java.lang.ThreadLocal threadLocal = f524001f;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null) {
            map = new java.util.LinkedHashMap();
            threadLocal.set(map);
        }
        java.lang.ThreadLocal threadLocal2 = f524002g;
        java.util.Map map2 = (java.util.Map) threadLocal2.get();
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            threadLocal2.set(map2);
        }
        java.lang.Long l17 = (java.lang.Long) map.get(str);
        if (l17 != null) {
            j17 = l17.longValue();
        } else {
            synchronized (f524003h) {
                m48245x2f5913fd = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48245x2f5913fd(i17, pInData, i18, 0L);
                if (m48245x2f5913fd != 0) {
                    map.put(str, java.lang.Long.valueOf(m48245x2f5913fd));
                    map2.put(str, new java.util.concurrent.atomic.AtomicInteger(0));
                    c(m48245x2f5913fd);
                    this.f524008d = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Failed to create decoder for thread " + id6 + ", sampleRate: " + i17);
                }
            }
            j17 = m48245x2f5913fd;
        }
        this.f524007c = j17;
        if (j17 != 0) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(str);
            if (atomicInteger != null) {
                atomicInteger.incrementAndGet();
            }
            if (this.f524008d) {
                return;
            }
            this.f524008d = true;
        }
    }

    public final int a() {
        int m48246xd1cf9af6;
        if (this.f524009e) {
            return 0;
        }
        this.f524009e = true;
        if (this.f524007c == 0) {
            return 0;
        }
        java.lang.ThreadLocal threadLocal = f524001f;
        java.util.Map map = (java.util.Map) threadLocal.get();
        if (map == null) {
            map = new java.util.LinkedHashMap();
            threadLocal.set(map);
        }
        java.lang.ThreadLocal threadLocal2 = f524002g;
        java.util.Map map2 = (java.util.Map) threadLocal2.get();
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            threadLocal2.set(map2);
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(this.f524006b);
        if (atomicInteger == null || atomicInteger.decrementAndGet() > 0) {
            return 0;
        }
        try {
            synchronized (f524003h) {
                m48246xd1cf9af6 = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48246xd1cf9af6(this.f524007c);
            }
            map.remove(this.f524006b);
            map2.remove(this.f524006b);
            return m48246xd1cf9af6;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Exception during release: " + e17.getMessage(), e17);
            return -1;
        }
    }

    public final int b(byte[] pOutData, short s17) {
        int m48247xb934ae02;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pOutData, "pOutData");
        long id6 = java.lang.Thread.currentThread().getId();
        if (this.f524009e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Decoder already released, thread: " + id6);
            return -1;
        }
        if (this.f524007c == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Decoder not initialized, thread: " + id6 + ", sampleRate: " + this.f524005a);
            return -2;
        }
        if (s17 <= 0 || s17 > pOutData.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Invalid output data length: " + ((int) s17) + ", array size: " + pOutData.length);
            return -3;
        }
        try {
            synchronized (f524004i) {
                m48247xb934ae02 = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48247xb934ae02(pOutData, s17, this.f524007c);
            }
            return m48247xb934ae02;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Exception during decode: " + e17.getMessage(), e17);
            return -6;
        }
    }

    public final void c(long j17) {
        try {
            wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
            boolean bj6 = l1Var != null ? ((u14.t) l1Var).bj() : false;
            int Di = l1Var != null ? ((u14.t) l1Var).Di() : 0;
            int Ni = l1Var != null ? ((u14.t) l1Var).Ni() : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.ThreadSafeSilkDecoder", "WaveHAid, flag:" + bj6 + ", type:" + Di + ", device:" + Ni);
            if (bj6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.ThreadSafeSilkDecoder", "WaveHAid initialized, ret:" + com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48244x55e1dd60(300, new byte[]{(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni & 255), (byte) ((Ni >> 8) & 255), (byte) ((Ni >> 16) & 255), (byte) ((Ni >> 24) & 255)}, 8, j17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Failed to initialize hearing aid: " + e17.getMessage());
        }
    }

    public final int d(int i17, byte[] parameter, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        long j17 = this.f524007c;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Decoder not initialized");
            return -1;
        }
        try {
            return com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48244x55e1dd60(i17, parameter, i18, j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeSilkDecoder", "Exception during setVoiceSilkDecodeControl: " + e17.getMessage(), e17);
            return -1;
        }
    }
}
