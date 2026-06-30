package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class w0 extends h04.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f67500a = jz5.h.b(com.tencent.mm.feature.performance.adpf.v0.f67497d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f67501b = jz5.h.b(new com.tencent.mm.feature.performance.adpf.u0(this));

    @Override // h04.a
    public void onTaskCanceled() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) ((jz5.n) this.f67500a).getValue();
        reentrantLock.lock();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfIdleChargingLifecycleTask", "onTaskCanceled");
            ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Ni(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BG_SCHEDULE, false);
            ((java.util.concurrent.locks.Condition) ((jz5.n) this.f67501b).getValue()).signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // h04.a
    public boolean onTaskExecute(android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(cancellationSignal, "cancellationSignal");
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) ((jz5.n) this.f67500a).getValue();
        reentrantLock.lock();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfIdleChargingLifecycleTask", "onTaskExecute");
            ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Ni(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BG_SCHEDULE, true);
            ((java.util.concurrent.locks.Condition) ((jz5.n) this.f67501b).getValue()).await();
            reentrantLock.unlock();
            return !cancellationSignal.isCanceled();
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }
}
