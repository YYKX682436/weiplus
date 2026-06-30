package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KTableViewCellEditAction */
/* loaded from: classes15.dex */
public abstract class AbstractC3529xc7a0d18a {

    /* renamed from: com.tencent.kinda.gen.KTableViewCellEditAction$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13676x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13677x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13678xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13678xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28159x23caefe3(long j17);

        /* renamed from: native_getIsDestructive */
        private native boolean m28160xd60d316a(long j17);

        /* renamed from: native_getTitle */
        private native java.lang.String m28161xe987d3ca(long j17);

        /* renamed from: native_triggered */
        private native void m28162xefc02e2f(long j17);

        /* renamed from: destroy */
        public void m28163x5cd39ffa() {
            if (this.f13677x766b9619.getAndSet(true)) {
                return;
            }
            m28159x23caefe3(this.f13678xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28164xd764dc1e() {
            m28163x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a
        /* renamed from: getIsDestructive */
        public boolean mo28156xfc40ce42() {
            return m28160xd60d316a(this.f13678xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a
        /* renamed from: getTitle */
        public java.lang.String mo28157x7531c8a2() {
            return m28161xe987d3ca(this.f13678xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a
        /* renamed from: triggered */
        public void mo28158xd954d457() {
            m28162xefc02e2f(this.f13678xc3e764fc);
        }
    }

    /* renamed from: getIsDestructive */
    public abstract boolean mo28156xfc40ce42();

    /* renamed from: getTitle */
    public abstract java.lang.String mo28157x7531c8a2();

    /* renamed from: triggered */
    public abstract void mo28158xd954d457();
}
