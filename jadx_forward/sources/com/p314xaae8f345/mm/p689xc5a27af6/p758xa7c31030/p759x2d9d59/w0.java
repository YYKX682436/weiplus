package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class w0 extends h04.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f149033a = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.v0.f149030d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f149034b = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.u0(this));

    @Override // h04.a
    /* renamed from: onTaskCanceled */
    public void mo45117xe8454bd() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) ((jz5.n) this.f149033a).mo141623x754a37bb();
        reentrantLock.lock();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfIdleChargingLifecycleTask", "onTaskCanceled");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Ni(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28891x6a6f3283, false);
            ((java.util.concurrent.locks.Condition) ((jz5.n) this.f149034b).mo141623x754a37bb()).signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // h04.a
    /* renamed from: onTaskExecute */
    public boolean mo45118x3e7092d1(android.os.CancellationSignal cancellationSignal) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancellationSignal, "cancellationSignal");
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) ((jz5.n) this.f149033a).mo141623x754a37bb();
        reentrantLock.lock();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfIdleChargingLifecycleTask", "onTaskExecute");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Ni(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.f28891x6a6f3283, true);
            ((java.util.concurrent.locks.Condition) ((jz5.n) this.f149034b).mo141623x754a37bb()).await();
            reentrantLock.unlock();
            return !cancellationSignal.isCanceled();
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }
}
