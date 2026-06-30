package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KTableViewCellEditActionV2 */
/* loaded from: classes15.dex */
public abstract class AbstractC3530x62b2a1a6 {

    /* renamed from: com.tencent.kinda.gen.KTableViewCellEditActionV2$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13679x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13680x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13681xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13681xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28168x23caefe3(long j17);

        /* renamed from: native_getIsDestructive */
        private native boolean m28169xd60d316a(long j17);

        /* renamed from: native_getTitle */
        private native java.lang.String m28170xe987d3ca(long j17);

        /* renamed from: native_triggered */
        private native void m28171xefc02e2f(long j17);

        /* renamed from: destroy */
        public void m28172x5cd39ffa() {
            if (this.f13680x766b9619.getAndSet(true)) {
                return;
            }
            m28168x23caefe3(this.f13681xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28173xd764dc1e() {
            m28172x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6
        /* renamed from: getIsDestructive */
        public boolean mo28165xfc40ce42() {
            return m28169xd60d316a(this.f13681xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6
        /* renamed from: getTitle */
        public java.lang.String mo28166x7531c8a2() {
            return m28170xe987d3ca(this.f13681xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6
        /* renamed from: triggered */
        public void mo28167xd954d457() {
            m28171xefc02e2f(this.f13681xc3e764fc);
        }
    }

    /* renamed from: getIsDestructive */
    public abstract boolean mo28165xfc40ce42();

    /* renamed from: getTitle */
    public abstract java.lang.String mo28166x7531c8a2();

    /* renamed from: triggered */
    public abstract void mo28167xd954d457();
}
