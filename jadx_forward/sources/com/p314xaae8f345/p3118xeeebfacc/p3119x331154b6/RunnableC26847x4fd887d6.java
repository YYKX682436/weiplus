package com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6;

/* renamed from: com.tencent.unit_rc.cleaner.CleanerImpl */
/* loaded from: classes16.dex */
public final class RunnableC26847x4fd887d6 implements java.lang.Runnable {

    /* renamed from: phantomCleanableList */
    final com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> f57680x691a1054 = new com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6.PhantomCleanableRef();

    /* renamed from: queue */
    final java.lang.ref.ReferenceQueue<java.lang.Object> f57681x66f1911 = new java.lang.ref.ReferenceQueue<>();

    /* renamed from: isRunning */
    volatile java.util.concurrent.atomic.AtomicBoolean f57679x39e05d35 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: getCleanerImpl */
    public static com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6 m106056xc64526c0(com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 c26846x9649ec96) {
        return c26846x9649ec96.f57678x316220;
    }

    /* renamed from: ensureStart */
    public void m106057xa182ec4(com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 c26846x9649ec96) {
        if (this.f57679x39e05d35.get()) {
            return;
        }
        m106058x68ac462(c26846x9649ec96);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f57679x39e05d35.compareAndSet(false, true)) {
            com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("Cleaner, break run");
            return;
        }
        while (!this.f57680x691a1054.m106062xfbd5d945()) {
            try {
                com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96.Cleanable cleanable = (com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96.Cleanable) this.f57681x66f1911.remove(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
                if (cleanable != null) {
                    cleanable.mo106055x5a5b649();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        this.f57679x39e05d35.set(false);
    }

    /* renamed from: start */
    public void m106058x68ac462(com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 c26846x9649ec96) {
        if (m106056xc64526c0(c26846x9649ec96) != this) {
            throw new java.lang.AssertionError("wrong cleaner");
        }
        com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("Cleaner, start");
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3.get().mo106002xb158f775(this);
    }

    /* renamed from: com.tencent.unit_rc.cleaner.CleanerImpl$PhantomCleanableRef */
    /* loaded from: classes16.dex */
    public static final class PhantomCleanableRef extends com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<java.lang.Object> {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f57682x7118e671 = false;

        /* renamed from: action */
        private final java.lang.Runnable f57683xab2f7e36;

        public PhantomCleanableRef(java.lang.Object obj, com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 c26846x9649ec96, java.lang.Runnable runnable) {
            super(obj, c26846x9649ec96);
            this.f57683xab2f7e36 = runnable;
            com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6.m106056xc64526c0(c26846x9649ec96).m106057xa182ec4(c26846x9649ec96);
        }

        @Override // com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6, java.lang.ref.Reference
        public void clear() {
            throw new java.lang.UnsupportedOperationException("clear");
        }

        @Override // java.lang.ref.PhantomReference, java.lang.ref.Reference
        public java.lang.Object get() {
            throw new java.lang.UnsupportedOperationException("get");
        }

        @Override // com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6
        /* renamed from: performCleanup */
        public void mo106059x6e702803() {
            this.f57683xab2f7e36.run();
        }

        public PhantomCleanableRef() {
            this.f57683xab2f7e36 = null;
        }
    }
}
