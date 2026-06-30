package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class w0 implements com.tencent.mm.plugin.finder.feed.model.internal.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f108063a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f108064b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108065c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f108066d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f108067e;

    public w0(long j17, int i17, kotlin.jvm.internal.i iVar) {
        this.f108063a = (i17 & 1) != 0 ? 0L : j17;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f108066d = reentrantLock;
        this.f108067e = reentrantLock.newCondition();
    }

    public final boolean a() {
        try {
            this.f108066d.lock();
            boolean z17 = this.f108065c != null;
            this.f108065c = null;
            return z17;
        } finally {
            this.f108066d.unlock();
        }
    }

    public void b(yz5.l call) {
        kotlin.jvm.internal.o.g(call, "call");
        this.f108066d.lock();
        try {
            if (this.f108064b) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                this.f108067e.await(1L, java.util.concurrent.TimeUnit.MINUTES);
                long uptimeMillis2 = this.f108063a - (android.os.SystemClock.uptimeMillis() - uptimeMillis);
                if (uptimeMillis2 > 0) {
                    this.f108067e.await(uptimeMillis2, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            } else if (this.f108065c != null) {
                long j17 = this.f108063a;
                if (j17 > 0) {
                    this.f108067e.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
            this.f108066d.unlock();
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f108065c;
            this.f108065c = null;
            call.invoke(iResponse);
        } catch (java.lang.Throwable th6) {
            this.f108066d.unlock();
            throw th6;
        }
    }
}
