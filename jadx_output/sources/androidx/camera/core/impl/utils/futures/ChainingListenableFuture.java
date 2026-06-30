package androidx.camera.core.impl.utils.futures;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class ChainingListenableFuture<I, O> extends androidx.camera.core.impl.utils.futures.FutureChain<O> implements java.lang.Runnable {
    private androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> mFunction;
    private wa.a mInputFuture;
    private final java.util.concurrent.BlockingQueue<java.lang.Boolean> mMayInterruptIfRunningChannel = new java.util.concurrent.LinkedBlockingQueue(1);
    private final java.util.concurrent.CountDownLatch mOutputCreated = new java.util.concurrent.CountDownLatch(1);
    volatile wa.a mOutputFuture;

    public ChainingListenableFuture(androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> asyncFunction, wa.a aVar) {
        asyncFunction.getClass();
        this.mFunction = asyncFunction;
        aVar.getClass();
        this.mInputFuture = aVar;
    }

    private <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> blockingQueue, E e17) {
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

    private <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> blockingQueue) {
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

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        if (!super.cancel(z17)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, java.lang.Boolean.valueOf(z17));
        cancel(this.mInputFuture, z17);
        cancel(this.mOutputFuture, z17);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            wa.a aVar = this.mInputFuture;
            if (aVar != null) {
                aVar.get();
            }
            this.mOutputCreated.await();
            wa.a aVar2 = this.mOutputFuture;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        final wa.a apply;
        try {
            try {
                try {
                    try {
                        apply = this.mFunction.apply(androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(this.mInputFuture));
                        this.mOutputFuture = apply;
                    } catch (java.lang.Error e17) {
                        setException(e17);
                    } catch (java.lang.reflect.UndeclaredThrowableException e18) {
                        setException(e18.getCause());
                    }
                } catch (java.lang.Throwable th6) {
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                    throw th6;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                cancel(false);
            } catch (java.util.concurrent.ExecutionException e19) {
                setException(e19.getCause());
            }
        } catch (java.lang.Exception e27) {
            setException(e27);
        }
        if (!isCancelled()) {
            apply.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        try {
                            androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.set(androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(apply));
                        } catch (java.util.concurrent.CancellationException unused2) {
                            androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.cancel(false);
                            androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.mOutputFuture = null;
                            return;
                        } catch (java.util.concurrent.ExecutionException e28) {
                            androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.setException(e28.getCause());
                        }
                        androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.mOutputFuture = null;
                    } catch (java.lang.Throwable th7) {
                        androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.mOutputFuture = null;
                        throw th7;
                    }
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            this.mFunction = null;
            this.mInputFuture = null;
            this.mOutputCreated.countDown();
            return;
        }
        apply.cancel(((java.lang.Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
        this.mOutputFuture = null;
        this.mFunction = null;
        this.mInputFuture = null;
        this.mOutputCreated.countDown();
    }

    private void cancel(java.util.concurrent.Future<?> future, boolean z17) {
        if (future != null) {
            future.cancel(z17);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (!isDone()) {
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j17 = timeUnit2.convert(j17, timeUnit);
                timeUnit = timeUnit2;
            }
            wa.a aVar = this.mInputFuture;
            if (aVar != null) {
                long nanoTime = java.lang.System.nanoTime();
                aVar.get(j17, timeUnit);
                j17 -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime);
            }
            long nanoTime2 = java.lang.System.nanoTime();
            if (this.mOutputCreated.await(j17, timeUnit)) {
                j17 -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime2);
                wa.a aVar2 = this.mOutputFuture;
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
