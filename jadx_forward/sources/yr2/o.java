package yr2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static int f546245c = 180000;

    /* renamed from: a, reason: collision with root package name */
    public long f546246a = android.os.SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f546247b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209429q9).mo141623x754a37bb()).r()).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PreloadGlobalInfoCGIFetcher", "fetch return for disable");
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f546246a;
        if (uptimeMillis < f546245c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PreloadGlobalInfoCGIFetcher", "fetch return for invalid interval:" + uptimeMillis + " < " + f546245c);
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f546247b;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PreloadGlobalInfoCGIFetcher", "fetch return for isRequesting");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadGlobalInfoCGIFetcher", "fetch start");
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        new bq.k1(new r45.qt2()).l().q(new cq.g1(new yr2.m(this), new yr2.n(this)));
        atomicBoolean.set(true);
    }
}
