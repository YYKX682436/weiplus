package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.Promise */
/* loaded from: classes16.dex */
public class C29335x50ca50fb<T> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73404x7118e671 = false;

    /* renamed from: mRejectReason */
    private java.lang.Exception f73408x1e6597d0;

    /* renamed from: mResult */
    private T f73409x17b9eeea;

    /* renamed from: mThrowingRejectionHandler */
    private boolean f73412xdd736fea;

    /* renamed from: mState */
    private int f73410xbec81024 = 0;

    /* renamed from: mFulfillCallbacks */
    private final java.util.List<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T>> f73405xa9d166bb = new java.util.LinkedList();

    /* renamed from: mRejectCallbacks */
    private final java.util.List<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.Exception>> f73407x3a2d67c2 = new java.util.LinkedList();

    /* renamed from: mThread */
    private final java.lang.Thread f73411x1b4d34d7 = java.lang.Thread.currentThread();

    /* renamed from: mHandler */
    private final android.os.Handler f73406xc7640a1d = new android.os.Handler();

    /* renamed from: org.chromium.base.Promise$AsyncFunction */
    /* loaded from: classes16.dex */
    public interface AsyncFunction<A, RT> extends java.util.function.Function<A, org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<RT>> {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.base.Promise$PromiseState */
    /* loaded from: classes6.dex */
    public @interface PromiseState {

        /* renamed from: FULFILLED */
        public static final int f73413x386f78ff = 1;

        /* renamed from: REJECTED */
        public static final int f73414xa61047e = 2;

        /* renamed from: UNFULFILLED */
        public static final int f73415x16bf4a86 = 0;
    }

    /* renamed from: org.chromium.base.Promise$UnhandledRejectionException */
    /* loaded from: classes16.dex */
    public static class UnhandledRejectionException extends java.lang.RuntimeException {
        public UnhandledRejectionException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    /* renamed from: checkThread */
    private void m152608x2edbf932() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: exceptInner */
    private void m152609x81d9a0bd(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.Exception> interfaceC29287xf9968465) {
        int i17 = this.f73410xbec81024;
        if (i17 == 2) {
            m152614xb7b8b8d1(interfaceC29287xf9968465, this.f73408x1e6597d0);
        } else if (i17 == 0) {
            this.f73407x3a2d67c2.add(interfaceC29287xf9968465);
        }
    }

    /* renamed from: fulfilled */
    public static <T> org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<T> m152610x9257691f(T t17) {
        org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<T> c29335x50ca50fb = new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<>();
        c29335x50ca50fb.m152618xe1847c80(t17);
        return c29335x50ca50fb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$then$0 */
    public static /* synthetic */ void m152611xf65cc2e6(java.lang.Exception exc) {
        throw new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$then$1 */
    public static /* synthetic */ void m152612xf65cc2e7(org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb c29335x50ca50fb, java.util.function.Function function, java.lang.Object obj) {
        try {
            c29335x50ca50fb.m152618xe1847c80(function.apply(obj));
        } catch (java.lang.Exception e17) {
            c29335x50ca50fb.m152623xc849739f(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$then$2 */
    public static /* synthetic */ void m152613xf65cc2e8(org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.AsyncFunction asyncFunction, final org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb c29335x50ca50fb, java.lang.Object obj) {
        try {
            org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb apply = asyncFunction.apply(obj);
            java.util.Objects.requireNonNull(c29335x50ca50fb);
            apply.m152627x364e1d(new org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465() { // from class: org.chromium.base.Promise$$e
                @Override // org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465
                /* renamed from: onResult */
                public final void m152269xd7b79106(java.lang.Object obj2) {
                    org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.this.m152618xe1847c80(obj2);
                }
            }, new org.p3343x72743996.p3344x2e06d1.C29338xa7c65508(c29335x50ca50fb));
        } catch (java.lang.Exception e17) {
            c29335x50ca50fb.m152623xc849739f(e17);
        }
    }

    /* renamed from: postCallbackToLooper */
    private <S> void m152614xb7b8b8d1(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<S> interfaceC29287xf9968465, S s17) {
        this.f73406xc7640a1d.post(interfaceC29287xf9968465.m152270x2e243d(s17));
    }

    /* renamed from: rejected */
    public static <T> org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<T> m152615xdbbb147e() {
        org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<T> c29335x50ca50fb = new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<>();
        c29335x50ca50fb.m152622xc849739f();
        return c29335x50ca50fb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: thenInner */
    private void m152616x13f5a39(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
        int i17 = this.f73410xbec81024;
        if (i17 == 1) {
            m152614xb7b8b8d1(interfaceC29287xf9968465, this.f73409x17b9eeea);
        } else if (i17 == 0) {
            this.f73405xa9d166bb.add(interfaceC29287xf9968465);
        }
    }

    /* renamed from: except */
    public void m152617xb3230519(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.Exception> interfaceC29287xf9968465) {
        m152608x2edbf932();
        m152609x81d9a0bd(interfaceC29287xf9968465);
    }

    /* renamed from: fulfill */
    public void m152618xe1847c80(T t17) {
        m152608x2edbf932();
        this.f73410xbec81024 = 1;
        this.f73409x17b9eeea = t17;
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T>> it = this.f73405xa9d166bb.iterator();
        while (it.hasNext()) {
            m152614xb7b8b8d1(it.next(), t17);
        }
        this.f73405xa9d166bb.clear();
    }

    /* renamed from: getResult */
    public T m152619x2d64eb13() {
        return this.f73409x17b9eeea;
    }

    /* renamed from: isFulfilled */
    public boolean m152620xd894ab15() {
        m152608x2edbf932();
        return this.f73410xbec81024 == 1;
    }

    /* renamed from: isRejected */
    public boolean m152621xac72bbc8() {
        m152608x2edbf932();
        return this.f73410xbec81024 == 2;
    }

    /* renamed from: reject */
    public void m152623xc849739f(java.lang.Exception exc) {
        m152608x2edbf932();
        this.f73410xbec81024 = 2;
        this.f73408x1e6597d0 = exc;
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.Exception>> it = this.f73407x3a2d67c2.iterator();
        while (it.hasNext()) {
            m152614xb7b8b8d1((org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465) it.next(), exc);
        }
        this.f73407x3a2d67c2.clear();
    }

    /* renamed from: then */
    public void m152626x364e1d(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465) {
        m152608x2edbf932();
        if (this.f73412xdd736fea) {
            m152616x13f5a39(interfaceC29287xf9968465);
        } else {
            m152627x364e1d(interfaceC29287xf9968465, new org.p3343x72743996.p3344x2e06d1.C29336xa7c65506());
            this.f73412xdd736fea = true;
        }
    }

    /* renamed from: reject */
    public void m152622xc849739f() {
        m152623xc849739f(null);
    }

    /* renamed from: then */
    public void m152627x364e1d(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<T> interfaceC29287xf9968465, org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.Exception> interfaceC29287xf99684652) {
        m152608x2edbf932();
        m152616x13f5a39(interfaceC29287xf9968465);
        m152609x81d9a0bd(interfaceC29287xf99684652);
    }

    /* renamed from: then */
    public <RT> org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<RT> m152624x364e1d(final java.util.function.Function<T, RT> function) {
        m152608x2edbf932();
        final org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<RT> c29335x50ca50fb = new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<>();
        m152616x13f5a39(new org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465() { // from class: org.chromium.base.Promise$$b
            @Override // org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465
            /* renamed from: onResult */
            public final void m152269xd7b79106(java.lang.Object obj) {
                org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.m152612xf65cc2e7(org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.this, function, obj);
            }
        });
        m152609x81d9a0bd(new org.p3343x72743996.p3344x2e06d1.C29338xa7c65508(c29335x50ca50fb));
        return c29335x50ca50fb;
    }

    /* renamed from: then */
    public <RT> org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<RT> m152625x364e1d(final org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.AsyncFunction<T, RT> asyncFunction) {
        m152608x2edbf932();
        final org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<RT> c29335x50ca50fb = new org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb<>();
        m152616x13f5a39(new org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465() { // from class: org.chromium.base.Promise$$d
            @Override // org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465
            /* renamed from: onResult */
            public final void m152269xd7b79106(java.lang.Object obj) {
                org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.m152613xf65cc2e8(org.p3343x72743996.p3344x2e06d1.C29335x50ca50fb.AsyncFunction.this, c29335x50ca50fb, obj);
            }
        });
        m152609x81d9a0bd(new org.p3343x72743996.p3344x2e06d1.C29338xa7c65508(c29335x50ca50fb));
        return c29335x50ca50fb;
    }
}
