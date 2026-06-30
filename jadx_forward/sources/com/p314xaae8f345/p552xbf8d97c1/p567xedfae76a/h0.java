package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class h0 extends java.util.concurrent.SynchronousQueue {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f134231d = new java.util.concurrent.LinkedBlockingQueue();

    @Override // java.util.concurrent.SynchronousQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj != null ? obj instanceof java.lang.Runnable : true) {
            return super.contains((java.lang.Runnable) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.SynchronousQueue, java.util.concurrent.BlockingQueue
    public java.lang.Object poll(long j17, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f134231d.poll();
        return runnable != null ? runnable : (java.lang.Runnable) super.poll(j17, timeUnit);
    }

    @Override // java.util.concurrent.SynchronousQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj != null ? obj instanceof java.lang.Runnable : true) {
            return super.remove((java.lang.Runnable) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.SynchronousQueue, java.util.concurrent.BlockingQueue
    public java.lang.Object take() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f134231d.poll();
        if (runnable != null) {
            return runnable;
        }
        java.lang.Object take = super.take();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(take, "super.take()");
        return (java.lang.Runnable) take;
    }

    @Override // java.util.concurrent.SynchronousQueue, java.util.Queue
    public java.lang.Object poll() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f134231d.poll();
        return runnable != null ? runnable : (java.lang.Runnable) super.poll();
    }
}
