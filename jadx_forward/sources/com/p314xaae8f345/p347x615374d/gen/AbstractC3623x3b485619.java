package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3623x3b485619 {

    /* renamed from: com.tencent.kinda.gen.VoidCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13914x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13915x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13916xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13916xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28456x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28457x68585986(long j17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619
        /* renamed from: call */
        public void mo25801x2e7a5e() {
            m28457x68585986(this.f13916xc3e764fc);
        }

        /* renamed from: destroy */
        public void m28458x5cd39ffa() {
            if (this.f13915x766b9619.getAndSet(true)) {
                return;
            }
            m28456x23caefe3(this.f13916xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28459xd764dc1e() {
            m28458x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo25801x2e7a5e();
}
