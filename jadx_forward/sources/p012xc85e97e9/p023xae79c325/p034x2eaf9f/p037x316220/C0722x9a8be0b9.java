package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.LiveDataObservable */
/* loaded from: classes14.dex */
public final class C0722x9a8be0b9<T> implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<T> {

    /* renamed from: mLiveData */
    final p012xc85e97e9.p093xedfae76a.j0 f1702x79766643 = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: mObservers */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter<T>> f1703xfeda5270 = new java.util.HashMap();

    /* renamed from: androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter */
    /* loaded from: classes14.dex */
    public static final class LiveDataObserverAdapter<T> implements p012xc85e97e9.p093xedfae76a.k0 {

        /* renamed from: mActive */
        final java.util.concurrent.atomic.AtomicBoolean f1704xfa9ba5d3 = new java.util.concurrent.atomic.AtomicBoolean(true);

        /* renamed from: mExecutor */
        final java.util.concurrent.Executor f1705x9ec3a060;

        /* renamed from: mObserver */
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> f1706x39c4fa63;

        public LiveDataObserverAdapter(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
            this.f1705x9ec3a060 = executor;
            this.f1706x39c4fa63 = observer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onChanged$0 */
        public void m5507xf32de9c4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result result) {
            if (this.f1704xfa9ba5d3.get()) {
                if (result.m5512xc853ab92()) {
                    this.f1706x39c4fa63.mo5535xbd9a3e8b((java.lang.Object) result.m5514x754a37bb());
                } else {
                    result.m5513x74627852().getClass();
                    this.f1706x39c4fa63.mo5534xaf8aa769(result.m5513x74627852());
                }
            }
        }

        /* renamed from: disable */
        public void m5508x639e22e8() {
            this.f1704xfa9ba5d3.set(false);
        }

        @Override // p012xc85e97e9.p093xedfae76a.k0
        /* renamed from: onChanged, reason: merged with bridge method [inline-methods] */
        public void mo525x7bb163d5(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result<T> result) {
            this.f1705x9ec3a060.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter.this.m5507xf32de9c4(result);
                }
            });
        }
    }

    /* renamed from: androidx.camera.core.impl.LiveDataObservable$Result */
    /* loaded from: classes14.dex */
    public static final class Result<T> {

        /* renamed from: mError */
        private final java.lang.Throwable f1707xbe021d9b;

        /* renamed from: mValue */
        private final T f1708xbee9dd04;

        private Result(T t17, java.lang.Throwable th6) {
            this.f1708xbee9dd04 = t17;
            this.f1707xbe021d9b = th6;
        }

        /* renamed from: fromError */
        public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result<T> m5510x360047e(java.lang.Throwable th6) {
            th6.getClass();
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result<>(null, th6);
        }

        /* renamed from: fromValue */
        public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result<T> m5511x447c3e7(T t17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result<>(t17, null);
        }

        /* renamed from: completedSuccessfully */
        public boolean m5512xc853ab92() {
            return this.f1707xbe021d9b == null;
        }

        /* renamed from: getError */
        public java.lang.Throwable m5513x74627852() {
            return this.f1707xbe021d9b;
        }

        /* renamed from: getValue */
        public T m5514x754a37bb() {
            if (m5512xc853ab92()) {
                return this.f1708xbee9dd04;
            }
            throw new java.lang.IllegalStateException("Result contains an error. Does not contain a value.");
        }

        /* renamed from: toString */
        public java.lang.String m5515x9616526c() {
            java.lang.String str;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[Result: <");
            if (m5512xc853ab92()) {
                str = "Value: " + this.f1708xbee9dd04;
            } else {
                str = "Error: " + this.f1707xbe021d9b;
            }
            sb6.append(str);
            sb6.append(">]");
            return sb6.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addObserver$2 */
    public /* synthetic */ void m5500x26b7bf48(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter liveDataObserverAdapter, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter liveDataObserverAdapter2) {
        if (liveDataObserverAdapter != null) {
            this.f1702x79766643.mo522xb5bdeb7a(liveDataObserverAdapter);
        }
        this.f1702x79766643.mo7807xc74540ab(liveDataObserverAdapter2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchData$0 */
    public void m5501xa49453b3(t2.k kVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result result = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result) this.f1702x79766643.mo3195x754a37bb();
        if (result == null) {
            kVar.b(new java.lang.IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (result.m5512xc853ab92()) {
            kVar.a(result.m5514x754a37bb());
        } else {
            result.m5513x74627852().getClass();
            kVar.b(result.m5513x74627852());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchData$1 */
    public /* synthetic */ java.lang.Object m5502xa49453b4(final t2.k kVar) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.this.m5501xa49453b3(kVar);
            }
        });
        return this + " [fetch@" + android.os.SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeObserver$3 */
    public /* synthetic */ void m5503xb65604c6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter liveDataObserverAdapter) {
        this.f1702x79766643.mo522xb5bdeb7a(liveDataObserverAdapter);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: addObserver */
    public void mo5391xdab4fe97(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
        synchronized (this.f1703xfeda5270) {
            final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter<T> liveDataObserverAdapter = this.f1703xfeda5270.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.m5508x639e22e8();
            }
            final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter<T> liveDataObserverAdapter2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter<>(executor, observer);
            this.f1703xfeda5270.put(observer, liveDataObserverAdapter2);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$d
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.this.m5500x26b7bf48(liveDataObserverAdapter, liveDataObserverAdapter2);
                }
            });
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: fetchData */
    public wa.a mo5392xb6377d84() {
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.LiveDataObservable$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m5502xa49453b4;
                m5502xa49453b4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.this.m5502xa49453b4(kVar);
                return m5502xa49453b4;
            }
        });
    }

    /* renamed from: getLiveData */
    public p012xc85e97e9.p093xedfae76a.g0 m5504xd052fc2c() {
        return this.f1702x79766643;
    }

    /* renamed from: postError */
    public void m5505x75f3ad48(java.lang.Throwable th6) {
        this.f1702x79766643.mo7808x76db6cb1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result.m5510x360047e(th6));
    }

    /* renamed from: postValue */
    public void m5506x76db6cb1(T t17) {
        this.f1702x79766643.mo7808x76db6cb1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.Result.m5511x447c3e7(t17));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: removeObserver */
    public void mo5393xb5bdeb7a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
        synchronized (this.f1703xfeda5270) {
            final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.LiveDataObserverAdapter<T> remove = this.f1703xfeda5270.remove(observer);
            if (remove != null) {
                remove.m5508x639e22e8();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0722x9a8be0b9.this.m5503xb65604c6(remove);
                    }
                });
            }
        }
    }
}
