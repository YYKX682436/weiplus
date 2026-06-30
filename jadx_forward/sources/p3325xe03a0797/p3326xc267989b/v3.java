package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.v3 f392217a = new p3325xe03a0797.p3326xc267989b.v3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f392218b = new java.lang.ThreadLocal();

    public final p3325xe03a0797.p3326xc267989b.w1 a() {
        java.lang.ThreadLocal threadLocal = f392218b;
        p3325xe03a0797.p3326xc267989b.w1 w1Var = (p3325xe03a0797.p3326xc267989b.w1) threadLocal.get();
        if (w1Var != null) {
            return w1Var;
        }
        p3325xe03a0797.p3326xc267989b.k kVar = new p3325xe03a0797.p3326xc267989b.k(java.lang.Thread.currentThread());
        threadLocal.set(kVar);
        return kVar;
    }
}
