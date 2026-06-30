package p56;

/* loaded from: classes16.dex */
public abstract class q {

    /* renamed from: d, reason: collision with root package name */
    public static final long f433635d = java.util.concurrent.TimeUnit.MINUTES.toNanos(java.lang.Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: createWorker */
    public abstract p56.p mo157871x6217339a();

    public long now() {
        return java.lang.System.currentTimeMillis();
    }

    /* renamed from: when */
    public <S extends p56.q & p56.s> S m157872x37ab3a(r56.e eVar) {
        return new t56.l0(eVar, this);
    }
}
