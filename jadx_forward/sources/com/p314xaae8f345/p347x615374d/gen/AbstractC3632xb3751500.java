package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidKRectCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3632xb3751500 {

    /* renamed from: com.tencent.kinda.gen.VoidKRectCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3632xb3751500 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13941x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13942x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13943xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13943xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28501x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28502x68585986(long j17, com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3632xb3751500
        /* renamed from: call */
        public void mo28500x2e7a5e(com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf) {
            m28502x68585986(this.f13943xc3e764fc, c3514x447b0cf);
        }

        /* renamed from: destroy */
        public void m28503x5cd39ffa() {
            if (this.f13942x766b9619.getAndSet(true)) {
                return;
            }
            m28501x23caefe3(this.f13943xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28504xd764dc1e() {
            m28503x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28500x2e7a5e(com.p314xaae8f345.p347x615374d.gen.C3514x447b0cf c3514x447b0cf);
}
