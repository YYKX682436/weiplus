package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
public final class l implements com.tencent.liteav.base.util.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f46448a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.liteav.base.util.CustomHandler f46449b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List<com.tencent.liteav.base.util.l.a> f46450c;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.Runnable f46451a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.Runnable f46452b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.Runnable f46453c = com.tencent.liteav.base.util.p.a(this);

        /* renamed from: e, reason: collision with root package name */
        private final long f46455e;

        public a(java.lang.Runnable runnable, long j17) {
            this.f46451a = runnable;
            this.f46452b = com.tencent.liteav.base.util.o.a(this, runnable);
            this.f46455e = j17;
        }

        public final void a() {
            com.tencent.liteav.base.util.l.this.f46449b.postDelayed(this.f46453c, this.f46455e);
        }
    }

    public l() {
        this((byte) 0);
    }

    @Override // com.tencent.liteav.base.util.s
    public final void a(java.lang.Runnable runnable) {
        this.f46448a.execute(runnable);
    }

    public final void b(java.lang.Runnable runnable) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.f46448a.execute(com.tencent.liteav.base.util.n.a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private l(byte b17) {
        this("SequenceTaskRunner_");
    }

    public final void a(java.lang.Runnable runnable, long j17) {
        com.tencent.liteav.base.util.l.a aVar = new com.tencent.liteav.base.util.l.a(runnable, j17);
        synchronized (this) {
            this.f46450c.add(aVar);
        }
        aVar.a();
    }

    public l(java.lang.String str) {
        this.f46448a = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), com.tencent.liteav.base.util.m.a(str));
        this.f46449b = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.f46450c = new java.util.ArrayList();
    }
}
