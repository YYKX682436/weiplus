package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RefCountDelegate */
/* loaded from: classes16.dex */
class C29845xdcc09601 implements org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb {

    /* renamed from: refCount */
    private final java.util.concurrent.atomic.AtomicInteger f75865xd30e0c3c = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: releaseCallback */
    private final java.lang.Runnable f75866x68ceb56c;

    public C29845xdcc09601(java.lang.Runnable runnable) {
        this.f75866x68ceb56c = runnable;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        java.lang.Runnable runnable;
        int decrementAndGet = this.f75865xd30e0c3c.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new java.lang.IllegalStateException("release() called on an object with refcount < 1");
        }
        if (decrementAndGet != 0 || (runnable = this.f75866x68ceb56c) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        if (this.f75865xd30e0c3c.incrementAndGet() < 2) {
            throw new java.lang.IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    /* renamed from: safeRetain */
    public boolean m156225xbf2bfef2() {
        int i17 = this.f75865xd30e0c3c.get();
        while (i17 != 0) {
            if (this.f75865xd30e0c3c.weakCompareAndSet(i17, i17 + 1)) {
                return true;
            }
            i17 = this.f75865xd30e0c3c.get();
        }
        return false;
    }
}
