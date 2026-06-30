package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidF32F32BoolCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3624x36fac03 {

    /* renamed from: com.tencent.kinda.gen.VoidF32F32BoolCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3624x36fac03 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13917x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13918x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13919xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13919xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28461x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28462x68585986(long j17, float f17, float f18, boolean z17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3624x36fac03
        /* renamed from: call */
        public void mo28460x2e7a5e(float f17, float f18, boolean z17) {
            m28462x68585986(this.f13919xc3e764fc, f17, f18, z17);
        }

        /* renamed from: destroy */
        public void m28463x5cd39ffa() {
            if (this.f13918x766b9619.getAndSet(true)) {
                return;
            }
            m28461x23caefe3(this.f13919xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28464xd764dc1e() {
            m28463x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28460x2e7a5e(float f17, float f18, boolean z17);
}
