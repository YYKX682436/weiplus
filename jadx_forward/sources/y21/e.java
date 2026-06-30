package y21;

/* loaded from: classes14.dex */
public final class e implements x21.d {

    /* renamed from: f, reason: collision with root package name */
    public static int f540577f;

    /* renamed from: a, reason: collision with root package name */
    public final y21.b f540578a;

    /* renamed from: b, reason: collision with root package name */
    public int f540579b;

    /* renamed from: c, reason: collision with root package name */
    public y21.j f540580c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f540581d;

    /* renamed from: e, reason: collision with root package name */
    public long f540582e;

    public e(y21.b dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        this.f540578a = dataSource;
        this.f540581d = new byte[100];
        synchronized (p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(y21.e.class)) {
            f540577f++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SafeStreamSilkDecoder", "Increment reference count: " + f540577f);
        }
    }

    @Override // x21.d
    public x21.m a() {
        return (x21.m) p3325xe03a0797.p3326xc267989b.l.f(null, new y21.c(this, null), 1, null);
    }

    public final void b() {
        int m48253xb3eb4356;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SafeStreamSilkDecoder", "uninitDecoder " + this.f540580c);
        y21.j jVar = this.f540580c;
        if (jVar != null) {
            if (jVar.f540603e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Decoder already released, thread: " + jVar.f540601c);
            } else {
                jVar.f540603e = true;
                if (jVar.f540600b == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Decoder handle is 0, nothing to release");
                } else {
                    java.lang.ThreadLocal threadLocal = y21.j.f540595g;
                    java.lang.ThreadLocal threadLocal2 = y21.j.f540595g;
                    java.util.Map map = (java.util.Map) threadLocal2.get();
                    if (map == null) {
                        map = new java.util.LinkedHashMap();
                        threadLocal2.set(map);
                    }
                    java.lang.ThreadLocal threadLocal3 = y21.j.f540596h;
                    java.util.Map map2 = (java.util.Map) threadLocal3.get();
                    if (map2 == null) {
                        map2 = new java.util.LinkedHashMap();
                        threadLocal3.set(map2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) map2.get(jVar.f540604f);
                    if (atomicInteger == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "No ref count found for key: " + jVar.f540604f);
                    } else if (atomicInteger.decrementAndGet() <= 0) {
                        try {
                            synchronized (y21.j.f540597i) {
                                m48253xb3eb4356 = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48253xb3eb4356(jVar.f540600b);
                            }
                            map.remove(jVar.f540604f);
                            map2.remove(jVar.f540604f);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Native decoder released, thread: " + jVar.f540601c + ", sampleRate: " + jVar.f540599a + ", handle: " + jVar.f540600b + ", ret: " + m48253xb3eb4356);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.ThreadSafeStreamSilkDecoder", "Exception during release: " + e17.getMessage() + ", key: " + jVar.f540604f, e17);
                        }
                    }
                }
            }
        }
        this.f540580c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y21.e.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SafeStreamSilkDecoder", "uninit");
        synchronized (p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(y21.e.class)) {
            f540577f--;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SafeStreamSilkDecoder", "Decrement reference count: " + f540577f);
            if (f540577f == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SafeStreamSilkDecoder", "Reference count is zero, releasing resources");
                b();
            }
        }
    }
}
