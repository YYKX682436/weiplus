package androidx.camera.core.impl.utils.futures;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class ListFuture<V> implements wa.a {
    private final boolean mAllMustSucceed;
    java.util.List<? extends wa.a> mFutures;
    private final java.util.concurrent.atomic.AtomicInteger mRemaining;
    private final wa.a mResult;
    t2.k mResultNotifier;
    java.util.List<V> mValues;

    public ListFuture(java.util.List<? extends wa.a> list, boolean z17, java.util.concurrent.Executor executor) {
        list.getClass();
        this.mFutures = list;
        this.mValues = new java.util.ArrayList(list.size());
        this.mAllMustSucceed = z17;
        this.mRemaining = new java.util.concurrent.atomic.AtomicInteger(list.size());
        this.mResult = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
            @Override // t2.m
            public java.lang.Object attachCompleter(t2.k kVar) {
                m3.h.e(androidx.camera.core.impl.utils.futures.ListFuture.this.mResultNotifier == null, "The result can only set once!");
                androidx.camera.core.impl.utils.futures.ListFuture.this.mResultNotifier = kVar;
                return "ListFuture[" + this + "]";
            }
        });
        init(executor);
    }

    private void callAllGets() {
        java.util.List<? extends wa.a> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (wa.a aVar : list) {
            while (!aVar.isDone()) {
                try {
                    aVar.get();
                } catch (java.lang.Error e17) {
                    throw e17;
                } catch (java.lang.InterruptedException e18) {
                    throw e18;
                } catch (java.lang.Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(java.util.concurrent.Executor executor) {
        addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.camera.core.impl.utils.futures.ListFuture listFuture = androidx.camera.core.impl.utils.futures.ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.a(new java.util.ArrayList(this.mValues));
            return;
        }
        for (int i17 = 0; i17 < this.mFutures.size(); i17++) {
            this.mValues.add(null);
        }
        java.util.List<? extends wa.a> list = this.mFutures;
        for (final int i18 = 0; i18 < list.size(); i18++) {
            final wa.a aVar = list.get(i18);
            aVar.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.camera.core.impl.utils.futures.ListFuture.this.setOneValue(i18, aVar);
                }
            }, executor);
        }
    }

    @Override // wa.a
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        java.util.List<? extends wa.a> list = this.mFutures;
        if (list != null) {
            java.util.Iterator<? extends wa.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z17);
            }
        }
        return this.mResult.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    public void setOneValue(int i17, java.util.concurrent.Future<? extends V> future) {
        t2.k kVar;
        java.util.ArrayList arrayList;
        int decrementAndGet;
        java.util.List<V> list = this.mValues;
        if (isDone() || list == null) {
            m3.h.e(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    m3.h.e(future.isDone(), "Tried to set value from future which is not done");
                    list.set(i17, androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(future));
                    decrementAndGet = this.mRemaining.decrementAndGet();
                    m3.h.e(decrementAndGet >= 0, "Less than 0 remaining futures");
                } catch (java.lang.Error e17) {
                    this.mResultNotifier.b(e17);
                    int decrementAndGet2 = this.mRemaining.decrementAndGet();
                    m3.h.e(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet2 != 0) {
                        return;
                    }
                    java.util.List<V> list2 = this.mValues;
                    if (list2 != null) {
                        kVar = this.mResultNotifier;
                        arrayList = new java.util.ArrayList(list2);
                    }
                } catch (java.util.concurrent.CancellationException unused) {
                    if (this.mAllMustSucceed) {
                        cancel(false);
                    }
                    int decrementAndGet3 = this.mRemaining.decrementAndGet();
                    m3.h.e(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    java.util.List<V> list3 = this.mValues;
                    if (list3 != null) {
                        kVar = this.mResultNotifier;
                        arrayList = new java.util.ArrayList(list3);
                    }
                }
            } catch (java.lang.RuntimeException e18) {
                if (this.mAllMustSucceed) {
                    this.mResultNotifier.b(e18);
                }
                int decrementAndGet4 = this.mRemaining.decrementAndGet();
                m3.h.e(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                java.util.List<V> list4 = this.mValues;
                if (list4 != null) {
                    kVar = this.mResultNotifier;
                    arrayList = new java.util.ArrayList(list4);
                }
            } catch (java.util.concurrent.ExecutionException e19) {
                if (this.mAllMustSucceed) {
                    this.mResultNotifier.b(e19.getCause());
                }
                int decrementAndGet5 = this.mRemaining.decrementAndGet();
                m3.h.e(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                java.util.List<V> list5 = this.mValues;
                if (list5 != null) {
                    kVar = this.mResultNotifier;
                    arrayList = new java.util.ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                java.util.List<V> list6 = this.mValues;
                if (list6 != null) {
                    kVar = this.mResultNotifier;
                    arrayList = new java.util.ArrayList(list6);
                    kVar.a(arrayList);
                    return;
                }
                m3.h.e(isDone(), null);
            }
        } catch (java.lang.Throwable th6) {
            int decrementAndGet6 = this.mRemaining.decrementAndGet();
            m3.h.e(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                java.util.List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.a(new java.util.ArrayList(list7));
                } else {
                    m3.h.e(isDone(), null);
                }
            }
            throw th6;
        }
    }

    @Override // java.util.concurrent.Future
    public java.util.List<V> get() {
        callAllGets();
        return (java.util.List) this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public java.util.List<V> get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return (java.util.List) this.mResult.get(j17, timeUnit);
    }
}
