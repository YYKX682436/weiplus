package androidx.camera.core.impl.utils.futures;

/* loaded from: classes14.dex */
public final class Futures {
    private static final r.a IDENTITY_FUNCTION = new r.a() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // r.a
        public java.lang.Object apply(java.lang.Object obj) {
            return obj;
        }
    };

    /* loaded from: classes14.dex */
    public static final class CallbackListener<V> implements java.lang.Runnable {
        final androidx.camera.core.impl.utils.futures.FutureCallback<? super V> mCallback;
        final java.util.concurrent.Future<V> mFuture;

        public CallbackListener(java.util.concurrent.Future<V> future, androidx.camera.core.impl.utils.futures.FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(androidx.camera.core.impl.utils.futures.Futures.getDone(this.mFuture));
            } catch (java.lang.Error e17) {
                e = e17;
                this.mCallback.onFailure(e);
            } catch (java.lang.RuntimeException e18) {
                e = e18;
                this.mCallback.onFailure(e);
            } catch (java.util.concurrent.ExecutionException e19) {
                java.lang.Throwable cause = e19.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e19);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        public java.lang.String toString() {
            return androidx.camera.core.impl.utils.futures.Futures.CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(wa.a aVar, androidx.camera.core.impl.utils.futures.FutureCallback<? super V> futureCallback, java.util.concurrent.Executor executor) {
        futureCallback.getClass();
        aVar.addListener(new androidx.camera.core.impl.utils.futures.Futures.CallbackListener(aVar, futureCallback), executor);
    }

    public static <V> wa.a allAsList(java.util.Collection<? extends wa.a> collection) {
        return new androidx.camera.core.impl.utils.futures.ListFuture(new java.util.ArrayList(collection), true, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <V> V getDone(java.util.concurrent.Future<V> future) {
        m3.h.e(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) {
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

    public static <V> wa.a immediateFailedFuture(java.lang.Throwable th6) {
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture(th6);
    }

    public static <V> java.util.concurrent.ScheduledFuture<V> immediateFailedScheduledFuture(java.lang.Throwable th6) {
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedScheduledFuture(th6);
    }

    public static <V> wa.a immediateFuture(V v17) {
        return v17 == null ? androidx.camera.core.impl.utils.futures.ImmediateFuture.nullFuture() : new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture(v17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean lambda$makeTimeoutFuture$1(t2.k kVar, wa.a aVar, long j17) {
        return java.lang.Boolean.valueOf(kVar.b(new java.util.concurrent.TimeoutException("Future[" + aVar + "] is not done within " + j17 + " ms.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$makeTimeoutFuture$3(final wa.a aVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final long j17, final t2.k kVar) {
        propagate(aVar, kVar);
        if (!aVar.isDone()) {
            final java.util.concurrent.ScheduledFuture schedule = scheduledExecutorService.schedule(new java.util.concurrent.Callable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Boolean lambda$makeTimeoutFuture$1;
                    lambda$makeTimeoutFuture$1 = androidx.camera.core.impl.utils.futures.Futures.lambda$makeTimeoutFuture$1(t2.k.this, aVar, j17);
                    return lambda$makeTimeoutFuture$1;
                }
            }, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$b
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeTimeoutFuture$4(t2.k kVar, java.lang.Object obj, boolean z17, wa.a aVar) {
        kVar.a(obj);
        if (z17) {
            aVar.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$makeTimeoutFuture$6(final wa.a aVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final java.lang.Object obj, final boolean z17, long j17, final t2.k kVar) {
        propagate(aVar, kVar);
        if (!aVar.isDone()) {
            final java.util.concurrent.ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$h
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.utils.futures.Futures.lambda$makeTimeoutFuture$4(t2.k.this, obj, z17, aVar);
                }
            }, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$i
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$nonCancellationPropagating$0(wa.a aVar, t2.k kVar) {
        propagateTransform(false, aVar, IDENTITY_FUNCTION, kVar, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$transformAsyncOnCompletion$8(wa.a aVar, final t2.k kVar) {
        aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$c
            @Override // java.lang.Runnable
            public final void run() {
                t2.k.this.a(null);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + aVar + "]";
    }

    public static <V> wa.a makeTimeoutFuture(final long j17, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final wa.a aVar) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$d
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$makeTimeoutFuture$3;
                lambda$makeTimeoutFuture$3 = androidx.camera.core.impl.utils.futures.Futures.lambda$makeTimeoutFuture$3(wa.a.this, scheduledExecutorService, j17, kVar);
                return lambda$makeTimeoutFuture$3;
            }
        });
    }

    public static <V> wa.a nonCancellationPropagating(final wa.a aVar) {
        aVar.getClass();
        return aVar.isDone() ? aVar : t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$g
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$nonCancellationPropagating$0;
                lambda$nonCancellationPropagating$0 = androidx.camera.core.impl.utils.futures.Futures.lambda$nonCancellationPropagating$0(wa.a.this, kVar);
                return lambda$nonCancellationPropagating$0;
            }
        });
    }

    public static <V> void propagate(wa.a aVar, t2.k kVar) {
        propagateTransform(aVar, IDENTITY_FUNCTION, kVar, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    private static <I, O> void propagateTransform(boolean z17, final wa.a aVar, final r.a aVar2, final t2.k kVar, java.util.concurrent.Executor executor) {
        aVar.getClass();
        aVar2.getClass();
        kVar.getClass();
        executor.getClass();
        addCallback(aVar, new androidx.camera.core.impl.utils.futures.FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                t2.k.this.b(th6);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I i17) {
                try {
                    t2.k.this.a(aVar2.apply(i17));
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
            java.util.concurrent.Executor directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
            t2.t tVar = kVar.f414654c;
            if (tVar != null) {
                tVar.addListener(runnable, directExecutor);
            }
        }
    }

    public static <V> wa.a successfulAsList(java.util.Collection<? extends wa.a> collection) {
        return new androidx.camera.core.impl.utils.futures.ListFuture(new java.util.ArrayList(collection), false, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <I, O> wa.a transform(wa.a aVar, final r.a aVar2, java.util.concurrent.Executor executor) {
        aVar2.getClass();
        return transformAsync(aVar, new androidx.camera.core.impl.utils.futures.AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public wa.a apply(I i17) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r.a.this.apply(i17));
            }
        }, executor);
    }

    public static <I, O> wa.a transformAsync(wa.a aVar, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> asyncFunction, java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.futures.ChainingListenableFuture chainingListenableFuture = new androidx.camera.core.impl.utils.futures.ChainingListenableFuture(asyncFunction, aVar);
        aVar.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <V> wa.a transformAsyncOnCompletion(final wa.a aVar) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$e
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$transformAsyncOnCompletion$8;
                lambda$transformAsyncOnCompletion$8 = androidx.camera.core.impl.utils.futures.Futures.lambda$transformAsyncOnCompletion$8(wa.a.this, kVar);
                return lambda$transformAsyncOnCompletion$8;
            }
        });
    }

    public static <V> wa.a makeTimeoutFuture(final long j17, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final V v17, final boolean z17, final wa.a aVar) {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.Futures$$f
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$makeTimeoutFuture$6;
                lambda$makeTimeoutFuture$6 = androidx.camera.core.impl.utils.futures.Futures.lambda$makeTimeoutFuture$6(wa.a.this, scheduledExecutorService, v17, z17, j17, kVar);
                return lambda$makeTimeoutFuture$6;
            }
        });
    }

    public static <I, O> void propagateTransform(wa.a aVar, r.a aVar2, t2.k kVar, java.util.concurrent.Executor executor) {
        propagateTransform(true, aVar, aVar2, kVar, executor);
    }
}
