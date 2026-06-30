package vn2;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final vn2.d1 f519789a = new vn2.d1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f519790b = jz5.h.b(vn2.c1.f519782d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f519791c = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f519792d = jz5.h.b(vn2.b1.f519776d);

    public final void a(java.lang.String tag, long j17) {
        java.lang.Long l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (!((java.lang.Boolean) ((jz5.n) f519790b).mo141623x754a37bb()).booleanValue() || (l17 = (java.lang.Long) ((java.util.HashMap) ((jz5.n) f519792d).mo141623x754a37bb()).remove(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "count" + j17 + " time cost=" + (android.os.SystemClock.elapsedRealtime() - l17.longValue()));
    }

    public final long b() {
        if (!((java.lang.Boolean) ((jz5.n) f519790b).mo141623x754a37bb()).booleanValue()) {
            return 0L;
        }
        long incrementAndGet = f519791c.incrementAndGet();
        ((java.util.HashMap) ((jz5.n) f519792d).mo141623x754a37bb()).put(java.lang.Long.valueOf(incrementAndGet), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        return incrementAndGet;
    }
}
