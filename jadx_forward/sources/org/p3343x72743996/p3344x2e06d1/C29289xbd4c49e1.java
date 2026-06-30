package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.CallbackController */
/* loaded from: classes16.dex */
public final class C29289xbd4c49e1 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73215x7118e671 = false;

    /* renamed from: mCancelables */
    private java.util.ArrayList<java.lang.ref.WeakReference<org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.Cancelable>> f73216x4c73f572 = new java.util.ArrayList<>();

    /* renamed from: mReentrantLock */
    private final java.util.concurrent.locks.ReentrantLock f73217x8f06fd6b = new java.util.concurrent.locks.ReentrantLock(true);

    /* renamed from: org.chromium.base.CallbackController$AutoCloseableLock */
    /* loaded from: classes16.dex */
    public static class AutoCloseableLock implements java.lang.AutoCloseable {

        /* renamed from: mIsLocked */
        private boolean f73218xbc0cc61;

        /* renamed from: mLock */
        private final java.util.concurrent.locks.Lock f73219x6243b38;

        private AutoCloseableLock(java.util.concurrent.locks.Lock lock, boolean z17) {
            this.f73219x6243b38 = lock;
            this.f73218xbc0cc61 = z17;
        }

        /* renamed from: lock */
        public static org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock m152282x32c52b(java.util.concurrent.locks.Lock lock) {
            lock.lock();
            return new org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock(lock, true);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (!this.f73218xbc0cc61) {
                throw new java.lang.IllegalStateException("mLock isn't locked.");
            }
            this.f73218xbc0cc61 = false;
            this.f73219x6243b38.unlock();
        }
    }

    /* renamed from: org.chromium.base.CallbackController$Cancelable */
    /* loaded from: classes16.dex */
    public interface Cancelable {
        /* renamed from: cancel */
        void mo152283xae7a2e7a();
    }

    /* renamed from: org.chromium.base.CallbackController$CancelableCallback */
    /* loaded from: classes16.dex */
    public class CancelableCallback<T> implements org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.Cancelable, org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> {

        /* renamed from: mCallback */
        private org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> f73220x1ab9c7d2;

        @Override // org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.Cancelable
        /* renamed from: cancel */
        public void mo152283xae7a2e7a() {
            this.f73220x1ab9c7d2 = null;
        }

        @Override // org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465
        /* renamed from: onResult */
        public void m152269xd7b79106(T t17) {
            org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock m152282x32c52b = org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock.m152282x32c52b(org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.this.f73217x8f06fd6b);
            try {
                org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465 = this.f73220x1ab9c7d2;
                if (interfaceC29287xf9968465 != null) {
                    interfaceC29287xf9968465.m152269xd7b79106(t17);
                }
                if (m152282x32c52b != null) {
                    m152282x32c52b.close();
                }
            } catch (java.lang.Throwable th6) {
                if (m152282x32c52b != null) {
                    try {
                        m152282x32c52b.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        private CancelableCallback(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
            this.f73220x1ab9c7d2 = interfaceC29287xf9968465;
        }
    }

    /* renamed from: org.chromium.base.CallbackController$CancelableRunnable */
    /* loaded from: classes16.dex */
    public class CancelableRunnable implements org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.Cancelable, java.lang.Runnable {

        /* renamed from: mRunnable */
        private java.lang.Runnable f73222x566d7aaa;

        @Override // org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.Cancelable
        /* renamed from: cancel */
        public void mo152283xae7a2e7a() {
            this.f73222x566d7aaa = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock m152282x32c52b = org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock.m152282x32c52b(org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.this.f73217x8f06fd6b);
            try {
                java.lang.Runnable runnable = this.f73222x566d7aaa;
                if (runnable != null) {
                    runnable.run();
                }
                if (m152282x32c52b != null) {
                    m152282x32c52b.close();
                }
            } catch (java.lang.Throwable th6) {
                if (m152282x32c52b != null) {
                    try {
                        m152282x32c52b.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        private CancelableRunnable(java.lang.Runnable runnable) {
            this.f73222x566d7aaa = runnable;
        }
    }

    /* renamed from: checkNotCanceled */
    private void m152278xc203de64() {
        if (this.f73216x4c73f572 == null) {
            throw new java.lang.IllegalStateException("This CallbackController has already been destroyed.");
        }
    }

    /* renamed from: destroy */
    public void m152279x5cd39ffa() {
        org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock m152282x32c52b = org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock.m152282x32c52b(this.f73217x8f06fd6b);
        try {
            m152278xc203de64();
            java.util.Iterator it = org.p3343x72743996.p3344x2e06d1.C29291xd6d05fe0.m152289xceb250aa(this.f73216x4c73f572).iterator();
            while (it.hasNext()) {
                ((org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.Cancelable) it.next()).mo152283xae7a2e7a();
            }
            this.f73216x4c73f572 = null;
            if (m152282x32c52b != null) {
                m152282x32c52b.close();
            }
        } catch (java.lang.Throwable th6) {
            if (m152282x32c52b != null) {
                try {
                    m152282x32c52b.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: makeCancelable */
    public <T> org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> m152281x67f8c762(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
        org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock m152282x32c52b = org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock.m152282x32c52b(this.f73217x8f06fd6b);
        try {
            m152278xc203de64();
            org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.CancelableCallback cancelableCallback = new org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.CancelableCallback(interfaceC29287xf9968465);
            this.f73216x4c73f572.add(new java.lang.ref.WeakReference<>(cancelableCallback));
            if (m152282x32c52b != null) {
                m152282x32c52b.close();
            }
            return cancelableCallback;
        } catch (java.lang.Throwable th6) {
            if (m152282x32c52b != null) {
                try {
                    m152282x32c52b.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: makeCancelable */
    public java.lang.Runnable m152280x67f8c762(java.lang.Runnable runnable) {
        org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock m152282x32c52b = org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.AutoCloseableLock.m152282x32c52b(this.f73217x8f06fd6b);
        try {
            m152278xc203de64();
            org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.CancelableRunnable cancelableRunnable = new org.p3343x72743996.p3344x2e06d1.C29289xbd4c49e1.CancelableRunnable(runnable);
            this.f73216x4c73f572.add(new java.lang.ref.WeakReference<>(cancelableRunnable));
            if (m152282x32c52b != null) {
                m152282x32c52b.close();
            }
            return cancelableRunnable;
        } catch (java.lang.Throwable th6) {
            if (m152282x32c52b != null) {
                try {
                    m152282x32c52b.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
