package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
public final class l implements com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f127981a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f127982b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List<com.tencent.liteav.base.util.l.a> f127983c;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.Runnable f127984a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.Runnable f127985b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.Runnable f127986c = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.p.a(this);

        /* renamed from: e, reason: collision with root package name */
        private final long f127988e;

        public a(java.lang.Runnable runnable, long j17) {
            this.f127984a = runnable;
            this.f127985b = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.o.a(this, runnable);
            this.f127988e = j17;
        }

        public final void a() {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l.this.f127982b.postDelayed(this.f127986c, this.f127988e);
        }
    }

    public l() {
        this((byte) 0);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.s
    public final void a(java.lang.Runnable runnable) {
        this.f127981a.execute(runnable);
    }

    public final void b(java.lang.Runnable runnable) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.f127981a.execute(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.n.a(runnable, countDownLatch));
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
            this.f127983c.add(aVar);
        }
        aVar.a();
    }

    public l(java.lang.String str) {
        this.f127981a = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.m.a(str));
        this.f127982b = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f127983c = new java.util.ArrayList();
    }
}
