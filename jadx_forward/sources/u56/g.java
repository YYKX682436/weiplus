package u56;

/* loaded from: classes16.dex */
public abstract class g implements t56.d0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Queue f506358d;

    /* renamed from: e, reason: collision with root package name */
    public final int f506359e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f506360f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final long f506361g = 67;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f506362h = new java.util.concurrent.atomic.AtomicReference();

    public g() {
        if (rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30147x2a467aca.m163335x5c51bd39()) {
            this.f506358d = new rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30117x51e529b1(java.lang.Math.max(0, 1024));
        } else {
            this.f506358d = new java.util.concurrent.ConcurrentLinkedQueue();
        }
        mo165921x68ac462();
    }

    public abstract java.lang.Object a();

    @Override // t56.d0
    /* renamed from: shutdown */
    public void mo165920xf5e80656() {
        java.util.concurrent.Future future = (java.util.concurrent.Future) this.f506362h.getAndSet(null);
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // t56.d0
    /* renamed from: start */
    public void mo165921x68ac462() {
        boolean z17;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f506362h;
            if (atomicReference.get() != null) {
                return;
            }
            java.util.concurrent.ScheduledExecutorService a17 = t56.r.a();
            try {
                u56.f fVar = new u56.f(this);
                long j17 = this.f506361g;
                java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate = a17.scheduleAtFixedRate(fVar, j17, j17, java.util.concurrent.TimeUnit.SECONDS);
                while (true) {
                    if (atomicReference.compareAndSet(null, scheduleAtFixedRate)) {
                        z17 = true;
                        break;
                    } else if (atomicReference.get() != null) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return;
                } else {
                    scheduleAtFixedRate.cancel(false);
                }
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                x56.m.a(e17);
                return;
            }
        }
    }
}
