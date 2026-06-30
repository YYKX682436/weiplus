package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.StateObservable */
/* loaded from: classes14.dex */
public abstract class AbstractC0755x8c0f8c94<T> implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163<T> {

    /* renamed from: INITIAL_VERSION */
    private static final int f1780x4749ce9d = 0;

    /* renamed from: mState */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> f1783xbec81024;

    /* renamed from: mLock */
    private final java.lang.Object f1781x6243b38 = new java.lang.Object();

    /* renamed from: mVersion */
    private int f1785xb30dcfab = 0;

    /* renamed from: mUpdating */
    private boolean f1784x73d2eed3 = false;

    /* renamed from: mWrapperMap */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<T>> f1786xb6bdf416 = new java.util.HashMap();

    /* renamed from: mNotifySet */
    private final java.util.concurrent.CopyOnWriteArraySet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<T>> f1782xec16c66c = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* renamed from: androidx.camera.core.impl.StateObservable$ErrorWrapper */
    /* loaded from: classes14.dex */
    public static abstract class ErrorWrapper {
        /* renamed from: wrap */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper m5668x37d04a(java.lang.Throwable th6) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0655x6659e993(th6);
        }

        /* renamed from: getError */
        public abstract java.lang.Throwable mo5184x74627852();
    }

    /* renamed from: androidx.camera.core.impl.StateObservable$ObserverWrapper */
    /* loaded from: classes14.dex */
    public static final class ObserverWrapper<T> implements java.lang.Runnable {

        /* renamed from: NOT_SET */
        private static final java.lang.Object f1787xa9c10cb6 = new java.lang.Object();

        /* renamed from: NO_VERSION */
        private static final int f1788xfbcf083a = -1;

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f1790x9ec3a060;

        /* renamed from: mObserver */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> f1793x39c4fa63;

        /* renamed from: mStateRef */
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> f1794x738f8dcf;

        /* renamed from: mActive */
        private final java.util.concurrent.atomic.AtomicBoolean f1789xfa9ba5d3 = new java.util.concurrent.atomic.AtomicBoolean(true);

        /* renamed from: mLastState */
        private java.lang.Object f1791xf20eb9ae = f1787xa9c10cb6;

        /* renamed from: mLatestSignalledVersion */
        private int f1792xef91cf69 = -1;

        /* renamed from: mWrapperUpdating */
        private boolean f1795xc4ff1ccc = false;

        public ObserverWrapper(java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference, java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
            this.f1794x738f8dcf = atomicReference;
            this.f1790x9ec3a060 = executor;
            this.f1793x39c4fa63 = observer;
        }

        /* renamed from: close */
        public void m5670x5a5ddf8() {
            this.f1789xfa9ba5d3.set(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (!this.f1789xfa9ba5d3.get()) {
                    this.f1795xc4ff1ccc = false;
                    return;
                }
                java.lang.Object obj = this.f1794x738f8dcf.get();
                int i17 = this.f1792xef91cf69;
                while (true) {
                    if (!java.util.Objects.equals(this.f1791xf20eb9ae, obj)) {
                        this.f1791xf20eb9ae = obj;
                        if (obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper) {
                            this.f1793x39c4fa63.mo5534xaf8aa769(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper) obj).mo5184x74627852());
                        } else {
                            this.f1793x39c4fa63.mo5535xbd9a3e8b(obj);
                        }
                    }
                    synchronized (this) {
                        if (i17 == this.f1792xef91cf69 || !this.f1789xfa9ba5d3.get()) {
                            break;
                        }
                        obj = this.f1794x738f8dcf.get();
                        i17 = this.f1792xef91cf69;
                    }
                }
                this.f1795xc4ff1ccc = false;
            }
        }

        /* renamed from: update */
        public void m5671xce0038c9(int i17) {
            synchronized (this) {
                if (!this.f1789xfa9ba5d3.get()) {
                    return;
                }
                if (i17 <= this.f1792xef91cf69) {
                    return;
                }
                this.f1792xef91cf69 = i17;
                if (this.f1795xc4ff1ccc) {
                    return;
                }
                this.f1795xc4ff1ccc = true;
                try {
                    this.f1790x9ec3a060.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            }
        }
    }

    public AbstractC0755x8c0f8c94(java.lang.Object obj, boolean z17) {
        if (!z17) {
            this.f1783xbec81024 = new java.util.concurrent.atomic.AtomicReference<>(obj);
        } else {
            m3.h.b(obj instanceof java.lang.Throwable, "Initial errors must be Throwable");
            this.f1783xbec81024 = new java.util.concurrent.atomic.AtomicReference<>(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper.m5668x37d04a((java.lang.Throwable) obj));
        }
    }

    /* renamed from: removeObserverLocked */
    private void m5663xca150724(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<T> remove = this.f1786xb6bdf416.remove(observer);
        if (remove != null) {
            remove.m5670x5a5ddf8();
            this.f1782xec16c66c.remove(remove);
        }
    }

    /* renamed from: updateStateInternal */
    private void m5664x5f011425(java.lang.Object obj) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<T>> it;
        int i17;
        synchronized (this.f1781x6243b38) {
            if (java.util.Objects.equals(this.f1783xbec81024.getAndSet(obj), obj)) {
                return;
            }
            int i18 = this.f1785xb30dcfab + 1;
            this.f1785xb30dcfab = i18;
            if (this.f1784x73d2eed3) {
                return;
            }
            this.f1784x73d2eed3 = true;
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<T>> it6 = this.f1782xec16c66c.iterator();
            while (true) {
                if (it6.hasNext()) {
                    it6.next().m5671xce0038c9(i18);
                } else {
                    synchronized (this.f1781x6243b38) {
                        if (this.f1785xb30dcfab == i18) {
                            this.f1784x73d2eed3 = false;
                            return;
                        } else {
                            it = this.f1782xec16c66c.iterator();
                            i17 = this.f1785xb30dcfab;
                        }
                    }
                    it6 = it;
                    i18 = i17;
                }
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: addObserver */
    public void mo5391xdab4fe97(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<T> observerWrapper;
        synchronized (this.f1781x6243b38) {
            m5663xca150724(observer);
            observerWrapper = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ObserverWrapper<>(this.f1783xbec81024, executor, observer);
            this.f1786xb6bdf416.put(observer, observerWrapper);
            this.f1782xec16c66c.add(observerWrapper);
        }
        observerWrapper.m5671xce0038c9(0);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: fetchData */
    public wa.a mo5392xb6377d84() {
        java.lang.Object obj = this.f1783xbec81024.get();
        return obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper) obj).mo5184x74627852()) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(obj);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163
    /* renamed from: removeObserver */
    public void mo5393xb5bdeb7a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer<? super T> observer) {
        synchronized (this.f1781x6243b38) {
            m5663xca150724(observer);
        }
    }

    /* renamed from: removeObservers */
    public void m5665x1ff8439() {
        synchronized (this.f1781x6243b38) {
            java.util.Iterator it = new java.util.HashSet(this.f1786xb6bdf416.keySet()).iterator();
            while (it.hasNext()) {
                m5663xca150724((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0734x770dd163.Observer) it.next());
            }
        }
    }

    /* renamed from: updateState */
    public void m5666xdd28b148(T t17) {
        m5664x5f011425(t17);
    }

    /* renamed from: updateStateAsError */
    public void m5667xa3e70a8e(java.lang.Throwable th6) {
        m5664x5f011425(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94.ErrorWrapper.m5668x37d04a(th6));
    }
}
