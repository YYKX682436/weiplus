package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.RefCountDelegate */
/* loaded from: classes16.dex */
public final class C29627xdcc09601 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74806x7118e671 = false;

    /* renamed from: mCount */
    private final java.util.concurrent.atomic.AtomicInteger f74807xbde49ca2 = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: mDelegate */
    private final java.lang.Runnable f74808x55d38512;

    public C29627xdcc09601(java.lang.Runnable runnable) {
        this.f74808x55d38512 = runnable;
    }

    /* renamed from: decrement */
    public void m154260x23e5cc93() {
        if (this.f74807xbde49ca2.decrementAndGet() == 0) {
            this.f74808x55d38512.run();
        }
    }

    /* renamed from: increment */
    public void m154261xb0268b6f() {
        this.f74807xbde49ca2.incrementAndGet();
    }
}
