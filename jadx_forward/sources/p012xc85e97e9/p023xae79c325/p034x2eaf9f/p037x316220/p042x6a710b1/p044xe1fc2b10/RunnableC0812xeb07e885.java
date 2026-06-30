package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.utils.futures.ChainingListenableFuture */
/* loaded from: classes14.dex */
public class RunnableC0812xeb07e885<I, O> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e<O> implements java.lang.Runnable {

    /* renamed from: mFunction */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54<? super I, ? extends O> f2018x774d1b65;

    /* renamed from: mInputFuture */
    private wa.a f2019x81b06380;

    /* renamed from: mMayInterruptIfRunningChannel */
    private final java.util.concurrent.BlockingQueue<java.lang.Boolean> f2020x9cc8ce6c = new java.util.concurrent.LinkedBlockingQueue(1);

    /* renamed from: mOutputCreated */
    private final java.util.concurrent.CountDownLatch f2021x17a7133a = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: mOutputFuture */
    volatile wa.a f2022x79b02731;

    public RunnableC0812xeb07e885(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54<? super I, ? extends O> interfaceC0811x859ce54, wa.a aVar) {
        interfaceC0811x859ce54.getClass();
        this.f2018x774d1b65 = interfaceC0811x859ce54;
        aVar.getClass();
        this.f2019x81b06380 = aVar;
    }

    /* renamed from: putUninterruptibly */
    private <E> void m5999x2d0d5441(java.util.concurrent.BlockingQueue<E> blockingQueue, E e17) {
        boolean z17 = false;
        while (true) {
            try {
                blockingQueue.put(e17);
                break;
            } catch (java.lang.InterruptedException unused) {
                z17 = true;
            } catch (java.lang.Throwable th6) {
                if (z17) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th6;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* renamed from: takeUninterruptibly */
    private <E> E m6000x7b86b3c9(java.util.concurrent.BlockingQueue<E> blockingQueue) {
        E take;
        boolean z17 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (java.lang.InterruptedException unused) {
                z17 = true;
            } catch (java.lang.Throwable th6) {
                if (z17) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th6;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e, java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        if (!super.cancel(z17)) {
            return false;
        }
        m5999x2d0d5441(this.f2020x9cc8ce6c, java.lang.Boolean.valueOf(z17));
        m5998xae7a2e7a(this.f2019x81b06380, z17);
        m5998xae7a2e7a(this.f2022x79b02731, z17);
        return true;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            wa.a aVar = this.f2019x81b06380;
            if (aVar != null) {
                aVar.get();
            }
            this.f2021x17a7133a.await();
            wa.a aVar2 = this.f2022x79b02731;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        final wa.a mo3010x58b836e;
        try {
            try {
                try {
                    try {
                        mo3010x58b836e = this.f2018x774d1b65.mo3010x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6010x394e811a(this.f2019x81b06380));
                        this.f2022x79b02731 = mo3010x58b836e;
                    } catch (java.lang.Error e17) {
                        m6003xb411020d(e17);
                    } catch (java.lang.reflect.UndeclaredThrowableException e18) {
                        m6003xb411020d(e18.getCause());
                    }
                } catch (java.lang.Throwable th6) {
                    this.f2018x774d1b65 = null;
                    this.f2019x81b06380 = null;
                    this.f2021x17a7133a.countDown();
                    throw th6;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                cancel(false);
            } catch (java.util.concurrent.ExecutionException e19) {
                m6003xb411020d(e19.getCause());
            }
        } catch (java.lang.Exception e27) {
            m6003xb411020d(e27);
        }
        if (!isCancelled()) {
            mo3010x58b836e.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        try {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885.this.set(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6010x394e811a(mo3010x58b836e));
                        } catch (java.util.concurrent.CancellationException unused2) {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885.this.cancel(false);
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885.this.f2022x79b02731 = null;
                            return;
                        } catch (java.util.concurrent.ExecutionException e28) {
                            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885.this.m6003xb411020d(e28.getCause());
                        }
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885.this.f2022x79b02731 = null;
                    } catch (java.lang.Throwable th7) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885.this.f2022x79b02731 = null;
                        throw th7;
                    }
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            this.f2018x774d1b65 = null;
            this.f2019x81b06380 = null;
            this.f2021x17a7133a.countDown();
            return;
        }
        mo3010x58b836e.cancel(((java.lang.Boolean) m6000x7b86b3c9(this.f2020x9cc8ce6c)).booleanValue());
        this.f2022x79b02731 = null;
        this.f2018x774d1b65 = null;
        this.f2019x81b06380 = null;
        this.f2021x17a7133a.countDown();
    }

    /* renamed from: cancel */
    private void m5998xae7a2e7a(java.util.concurrent.Future<?> future, boolean z17) {
        if (future != null) {
            future.cancel(z17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0814x43c6229e, java.util.concurrent.Future
    public O get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (!isDone()) {
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j17 = timeUnit2.convert(j17, timeUnit);
                timeUnit = timeUnit2;
            }
            wa.a aVar = this.f2019x81b06380;
            if (aVar != null) {
                long nanoTime = java.lang.System.nanoTime();
                aVar.get(j17, timeUnit);
                j17 -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime);
            }
            long nanoTime2 = java.lang.System.nanoTime();
            if (this.f2021x17a7133a.await(j17, timeUnit)) {
                j17 -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime2);
                wa.a aVar2 = this.f2022x79b02731;
                if (aVar2 != null) {
                    aVar2.get(j17, timeUnit);
                }
            } else {
                throw new java.util.concurrent.TimeoutException();
            }
        }
        return (O) super.get(j17, timeUnit);
    }
}
