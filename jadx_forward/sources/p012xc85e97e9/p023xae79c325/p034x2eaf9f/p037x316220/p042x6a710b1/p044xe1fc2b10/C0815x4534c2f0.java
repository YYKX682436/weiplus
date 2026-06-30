package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10;

/* renamed from: androidx.camera.core.impl.utils.futures.Futures */
/* loaded from: classes14.dex */
public final class C0815x4534c2f0 {

    /* renamed from: IDENTITY_FUNCTION */
    private static final r.a f2028xb87a2a39 = new r.a() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // r.a
        /* renamed from: apply */
        public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
            return obj;
        }
    };

    /* renamed from: androidx.camera.core.impl.utils.futures.Futures$CallbackListener */
    /* loaded from: classes14.dex */
    public static final class CallbackListener<V> implements java.lang.Runnable {

        /* renamed from: mCallback */
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<? super V> f2033x1ab9c7d2;

        /* renamed from: mFuture */
        final java.util.concurrent.Future<V> f2034x421b490;

        public CallbackListener(java.util.concurrent.Future<V> future, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<? super V> interfaceC0813x8ed66b48) {
            this.f2034x421b490 = future;
            this.f2033x1ab9c7d2 = interfaceC0813x8ed66b48;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2033x1ab9c7d2.mo3121xe05b4124(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6009xfb7e8bf8(this.f2034x421b490));
            } catch (java.lang.Error e17) {
                e = e17;
                this.f2033x1ab9c7d2.mo3120xee232ab(e);
            } catch (java.lang.RuntimeException e18) {
                e = e18;
                this.f2033x1ab9c7d2.mo3120xee232ab(e);
            } catch (java.util.concurrent.ExecutionException e19) {
                java.lang.Throwable cause = e19.getCause();
                if (cause == null) {
                    this.f2033x1ab9c7d2.mo3120xee232ab(e19);
                } else {
                    this.f2033x1ab9c7d2.mo3120xee232ab(cause);
                }
            }
        }

        /* renamed from: toString */
        public java.lang.String m6033x9616526c() {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.CallbackListener.class.getSimpleName() + "," + this.f2033x1ab9c7d2;
        }
    }

    private C0815x4534c2f0() {
    }

    /* renamed from: addCallback */
    public static <V> void m6007xbba9cc06(wa.a aVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<? super V> interfaceC0813x8ed66b48, java.util.concurrent.Executor executor) {
        interfaceC0813x8ed66b48.getClass();
        aVar.mo606x162a7075(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.CallbackListener(aVar, interfaceC0813x8ed66b48), executor);
    }

    /* renamed from: allAsList */
    public static <V> wa.a m6008xc771b0f1(java.util.Collection<? extends wa.a> collection) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821(new java.util.ArrayList(collection), true, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: getDone */
    public static <V> V m6009xfb7e8bf8(java.util.concurrent.Future<V> future) {
        m3.h.e(future.isDone(), "Future was expected to be done, " + future);
        return (V) m6010x394e811a(future);
    }

    /* renamed from: getUninterruptibly */
    public static <V> V m6010x394e811a(java.util.concurrent.Future<V> future) {
        V v17;
        boolean z17 = false;
        while (true) {
            try {
                v17 = future.get();
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
        return v17;
    }

    /* renamed from: immediateFailedFuture */
    public static <V> wa.a m6011xd75b36b1(java.lang.Throwable th6) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.ImmediateFailedFuture(th6);
    }

    /* renamed from: immediateFailedScheduledFuture */
    public static <V> java.util.concurrent.ScheduledFuture<V> m6012x79cac7a2(java.lang.Throwable th6) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.ImmediateFailedScheduledFuture(th6);
    }

    /* renamed from: immediateFuture */
    public static <V> wa.a m6013x95a8e8d4(V v17) {
        return v17 == null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.m6034x5d0fbe2a() : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.AbstractC0825x5a3ba0b4.ImmediateSuccessfulFuture(v17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeTimeoutFuture$1 */
    public static /* synthetic */ java.lang.Boolean m6014xb4ec15e6(t2.k kVar, wa.a aVar, long j17) {
        return java.lang.Boolean.valueOf(kVar.b(new java.util.concurrent.TimeoutException("Future[" + aVar + "] is not done within " + j17 + " ms.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeTimeoutFuture$3 */
    public static /* synthetic */ java.lang.Object m6016xb4ec15e8(final wa.a aVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final long j17, final t2.k kVar) {
        m6026xd4b03729(aVar, kVar);
        if (!aVar.isDone()) {
            final java.util.concurrent.ScheduledFuture schedule = scheduledExecutorService.schedule(new java.util.concurrent.Callable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Boolean m6014xb4ec15e6;
                    m6014xb4ec15e6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6014xb4ec15e6(t2.k.this, aVar, j17);
                    return m6014xb4ec15e6;
                }
            }, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$b
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeTimeoutFuture$4 */
    public static /* synthetic */ void m6017xb4ec15e9(t2.k kVar, java.lang.Object obj, boolean z17, wa.a aVar) {
        kVar.a(obj);
        if (z17) {
            aVar.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeTimeoutFuture$6 */
    public static /* synthetic */ java.lang.Object m6019xb4ec15eb(final wa.a aVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final java.lang.Object obj, final boolean z17, long j17, final t2.k kVar) {
        m6026xd4b03729(aVar, kVar);
        if (!aVar.isDone()) {
            final java.util.concurrent.ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$h
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6017xb4ec15e9(t2.k.this, obj, z17, aVar);
                }
            }, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$i
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$nonCancellationPropagating$0 */
    public static /* synthetic */ java.lang.Object m6020xd60da1df(wa.a aVar, t2.k kVar) {
        m6028xe915243(false, aVar, f2028xb87a2a39, kVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$transformAsyncOnCompletion$8 */
    public static /* synthetic */ java.lang.Object m6022x6cc1b73c(wa.a aVar, final t2.k kVar) {
        aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$c
            @Override // java.lang.Runnable
            public final void run() {
                t2.k.this.a(null);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        return "transformVoidFuture [" + aVar + "]";
    }

    /* renamed from: makeTimeoutFuture */
    public static <V> wa.a m6024xe7063736(final long j17, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final wa.a aVar) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$d
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m6016xb4ec15e8;
                m6016xb4ec15e8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6016xb4ec15e8(wa.a.this, scheduledExecutorService, j17, kVar);
                return m6016xb4ec15e8;
            }
        });
    }

    /* renamed from: nonCancellationPropagating */
    public static <V> wa.a m6025x3918f316(final wa.a aVar) {
        aVar.getClass();
        return aVar.isDone() ? aVar : t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$g
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m6020xd60da1df;
                m6020xd60da1df = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6020xd60da1df(wa.a.this, kVar);
                return m6020xd60da1df;
            }
        });
    }

    /* renamed from: propagate */
    public static <V> void m6026xd4b03729(wa.a aVar, t2.k kVar) {
        m6027xe915243(aVar, f2028xb87a2a39, kVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: propagateTransform */
    private static <I, O> void m6028xe915243(boolean z17, final wa.a aVar, final r.a aVar2, final t2.k kVar, java.util.concurrent.Executor executor) {
        aVar.getClass();
        aVar2.getClass();
        kVar.getClass();
        executor.getClass();
        m6007xbba9cc06(aVar, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                t2.k.this.b(th6);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess */
            public void mo3121xe05b4124(I i17) {
                try {
                    t2.k.this.a(aVar2.mo1850x58b836e(i17));
                } catch (java.lang.Throwable th6) {
                    t2.k.this.b(th6);
                }
            }
        }, executor);
        if (z17) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    wa.a.this.cancel(true);
                }
            };
            java.util.concurrent.Executor m5978x5ebfffdc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc();
            t2.t tVar = kVar.f496187c;
            if (tVar != null) {
                tVar.mo606x162a7075(runnable, m5978x5ebfffdc);
            }
        }
    }

    /* renamed from: successfulAsList */
    public static <V> wa.a m6029xf7c1832a(java.util.Collection<? extends wa.a> collection) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821(new java.util.ArrayList(collection), false, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: transform */
    public static <I, O> wa.a m6030x3ebe6b6c(wa.a aVar, final r.a aVar2, java.util.concurrent.Executor executor) {
        aVar2.getClass();
        return m6031x9aa1ea70(aVar, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public wa.a mo3010x58b836e(I i17) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(r.a.this.mo1850x58b836e(i17));
            }
        }, executor);
    }

    /* renamed from: transformAsync */
    public static <I, O> wa.a m6031x9aa1ea70(wa.a aVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54<? super I, ? extends O> interfaceC0811x859ce54, java.util.concurrent.Executor executor) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885 runnableC0812xeb07e885 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.RunnableC0812xeb07e885(interfaceC0811x859ce54, aVar);
        aVar.mo606x162a7075(runnableC0812xeb07e885, executor);
        return runnableC0812xeb07e885;
    }

    /* renamed from: transformAsyncOnCompletion */
    public static <V> wa.a m6032x7f0c59ab(final wa.a aVar) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$e
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m6022x6cc1b73c;
                m6022x6cc1b73c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6022x6cc1b73c(wa.a.this, kVar);
                return m6022x6cc1b73c;
            }
        });
    }

    /* renamed from: makeTimeoutFuture */
    public static <V> wa.a m6023xe7063736(final long j17, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final V v17, final boolean z17, final wa.a aVar) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$f
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m6019xb4ec15eb;
                m6019xb4ec15eb = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6019xb4ec15eb(wa.a.this, scheduledExecutorService, v17, z17, j17, kVar);
                return m6019xb4ec15eb;
            }
        });
    }

    /* renamed from: propagateTransform */
    public static <I, O> void m6027xe915243(wa.a aVar, r.a aVar2, t2.k kVar, java.util.concurrent.Executor executor) {
        m6028xe915243(true, aVar, aVar2, kVar, executor);
    }
}
