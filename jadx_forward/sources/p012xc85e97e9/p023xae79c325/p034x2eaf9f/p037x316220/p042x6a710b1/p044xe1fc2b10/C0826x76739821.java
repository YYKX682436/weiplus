package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.utils.futures.ListFuture */
/* loaded from: classes14.dex */
public class C0826x76739821<V> implements wa.a {

    /* renamed from: mAllMustSucceed */
    private final boolean f2038x89037165;

    /* renamed from: mFutures */
    java.util.List<? extends wa.a> f2039x8014dde3;

    /* renamed from: mRemaining */
    private final java.util.concurrent.atomic.AtomicInteger f2040xae8ff809;

    /* renamed from: mResult */
    private final wa.a f2041x17b9eeea;

    /* renamed from: mResultNotifier */
    t2.k f2042xd6d282b0;

    /* renamed from: mValues */
    java.util.List<V> f2043x1e51c3ef;

    public C0826x76739821(java.util.List<? extends wa.a> list, boolean z17, java.util.concurrent.Executor executor) {
        list.getClass();
        this.f2039x8014dde3 = list;
        this.f2043x1e51c3ef = new java.util.ArrayList(list.size());
        this.f2038x89037165 = z17;
        this.f2040xae8ff809 = new java.util.concurrent.atomic.AtomicInteger(list.size());
        this.f2041x17b9eeea = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
            @Override // t2.m
            /* renamed from: attachCompleter */
            public java.lang.Object mo3008x586b6594(t2.k kVar) {
                m3.h.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821.this.f2042xd6d282b0 == null, "The result can only set once!");
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821.this.f2042xd6d282b0 = kVar;
                return "ListFuture[" + this + "]";
            }
        });
        m6039x316510(executor);
    }

    /* renamed from: callAllGets */
    private void m6038xb0f6e8e0() {
        java.util.List<? extends wa.a> list = this.f2039x8014dde3;
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
                    if (this.f2038x89037165) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: init */
    private void m6039x316510(java.util.concurrent.Executor executor) {
        mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821 c0826x76739821 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821.this;
                c0826x76739821.f2043x1e51c3ef = null;
                c0826x76739821.f2039x8014dde3 = null;
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        if (this.f2039x8014dde3.isEmpty()) {
            this.f2042xd6d282b0.a(new java.util.ArrayList(this.f2043x1e51c3ef));
            return;
        }
        for (int i17 = 0; i17 < this.f2039x8014dde3.size(); i17++) {
            this.f2043x1e51c3ef.add(null);
        }
        java.util.List<? extends wa.a> list = this.f2039x8014dde3;
        for (final int i18 = 0; i18 < list.size(); i18++) {
            final wa.a aVar = list.get(i18);
            aVar.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0826x76739821.this.m6040xed65a12d(i18, aVar);
                }
            }, executor);
        }
    }

    @Override // wa.a
    /* renamed from: addListener */
    public void mo606x162a7075(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f2041x17b9eeea.mo606x162a7075(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        java.util.List<? extends wa.a> list = this.f2039x8014dde3;
        if (list != null) {
            java.util.Iterator<? extends wa.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z17);
            }
        }
        return this.f2041x17b9eeea.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2041x17b9eeea.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2041x17b9eeea.isDone();
    }

    /* renamed from: setOneValue */
    public void m6040xed65a12d(int i17, java.util.concurrent.Future<? extends V> future) {
        t2.k kVar;
        java.util.ArrayList arrayList;
        int decrementAndGet;
        java.util.List<V> list = this.f2043x1e51c3ef;
        if (isDone() || list == null) {
            m3.h.e(this.f2038x89037165, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    m3.h.e(future.isDone(), "Tried to set value from future which is not done");
                    list.set(i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6010x394e811a(future));
                    decrementAndGet = this.f2040xae8ff809.decrementAndGet();
                    m3.h.e(decrementAndGet >= 0, "Less than 0 remaining futures");
                } catch (java.lang.Error e17) {
                    this.f2042xd6d282b0.b(e17);
                    int decrementAndGet2 = this.f2040xae8ff809.decrementAndGet();
                    m3.h.e(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet2 != 0) {
                        return;
                    }
                    java.util.List<V> list2 = this.f2043x1e51c3ef;
                    if (list2 != null) {
                        kVar = this.f2042xd6d282b0;
                        arrayList = new java.util.ArrayList(list2);
                    }
                } catch (java.util.concurrent.CancellationException unused) {
                    if (this.f2038x89037165) {
                        cancel(false);
                    }
                    int decrementAndGet3 = this.f2040xae8ff809.decrementAndGet();
                    m3.h.e(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    java.util.List<V> list3 = this.f2043x1e51c3ef;
                    if (list3 != null) {
                        kVar = this.f2042xd6d282b0;
                        arrayList = new java.util.ArrayList(list3);
                    }
                }
            } catch (java.lang.RuntimeException e18) {
                if (this.f2038x89037165) {
                    this.f2042xd6d282b0.b(e18);
                }
                int decrementAndGet4 = this.f2040xae8ff809.decrementAndGet();
                m3.h.e(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                java.util.List<V> list4 = this.f2043x1e51c3ef;
                if (list4 != null) {
                    kVar = this.f2042xd6d282b0;
                    arrayList = new java.util.ArrayList(list4);
                }
            } catch (java.util.concurrent.ExecutionException e19) {
                if (this.f2038x89037165) {
                    this.f2042xd6d282b0.b(e19.getCause());
                }
                int decrementAndGet5 = this.f2040xae8ff809.decrementAndGet();
                m3.h.e(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                java.util.List<V> list5 = this.f2043x1e51c3ef;
                if (list5 != null) {
                    kVar = this.f2042xd6d282b0;
                    arrayList = new java.util.ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                java.util.List<V> list6 = this.f2043x1e51c3ef;
                if (list6 != null) {
                    kVar = this.f2042xd6d282b0;
                    arrayList = new java.util.ArrayList(list6);
                    kVar.a(arrayList);
                    return;
                }
                m3.h.e(isDone(), null);
            }
        } catch (java.lang.Throwable th6) {
            int decrementAndGet6 = this.f2040xae8ff809.decrementAndGet();
            m3.h.e(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                java.util.List<V> list7 = this.f2043x1e51c3ef;
                if (list7 != null) {
                    this.f2042xd6d282b0.a(new java.util.ArrayList(list7));
                } else {
                    m3.h.e(isDone(), null);
                }
            }
            throw th6;
        }
    }

    @Override // java.util.concurrent.Future
    public java.util.List<V> get() {
        m6038xb0f6e8e0();
        return (java.util.List) this.f2041x17b9eeea.get();
    }

    @Override // java.util.concurrent.Future
    public java.util.List<V> get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return (java.util.List) this.f2041x17b9eeea.get(j17, timeUnit);
    }
}
