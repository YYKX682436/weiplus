package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public final class a0 extends java.util.concurrent.PriorityBlockingQueue {
    public a0() {
        super(11, new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.z());
    }

    public static java.lang.String d(java.lang.Runnable runnable) {
        if (!(runnable instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l)) {
            return java.lang.String.format("unknown runnable = %s", runnable);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l lVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l) runnable;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar = lVar.f271214d;
        return kVar instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u ? java.lang.String.format("priority = %d, urlKey = %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) kVar).f271249e), lVar.f271214d.a()) : java.lang.String.format("unknown request = %s", kVar);
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(java.lang.Object obj) {
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        boolean offer = super.offer(runnable);
        d(runnable);
        java.lang.Thread.currentThread().getId();
        return offer;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.concurrent.BlockingQueue
    public java.lang.Object poll(long j17, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runnable runnable = (java.lang.Runnable) super.poll(j17, timeUnit);
        if (runnable != null) {
            d(runnable);
            java.lang.Thread.currentThread().getId();
        }
        return runnable;
    }
}
