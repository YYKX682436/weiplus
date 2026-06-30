package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidI32Callback */
/* loaded from: classes9.dex */
public abstract class AbstractC3626x2cf1699 {

    /* renamed from: com.tencent.kinda.gen.VoidI32Callback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3626x2cf1699 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13923x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13924x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13925xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13925xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28471x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28472x68585986(long j17, int i17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3626x2cf1699
        /* renamed from: call */
        public void mo28470x2e7a5e(int i17) {
            m28472x68585986(this.f13925xc3e764fc, i17);
        }

        /* renamed from: destroy */
        public void m28473x5cd39ffa() {
            if (this.f13924x766b9619.getAndSet(true)) {
                return;
            }
            m28471x23caefe3(this.f13925xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28474xd764dc1e() {
            m28473x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28470x2e7a5e(int i17);
}
