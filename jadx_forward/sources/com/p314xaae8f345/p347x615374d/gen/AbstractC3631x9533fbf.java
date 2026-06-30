package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidKPickerOptionCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3631x9533fbf {

    /* renamed from: com.tencent.kinda.gen.VoidKPickerOptionCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3631x9533fbf {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13938x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13939x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13940xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13940xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28496x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28497x68585986(long j17, com.p314xaae8f345.p347x615374d.gen.C3500xe241968e c3500xe241968e);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3631x9533fbf
        /* renamed from: call */
        public void mo28495x2e7a5e(com.p314xaae8f345.p347x615374d.gen.C3500xe241968e c3500xe241968e) {
            m28497x68585986(this.f13940xc3e764fc, c3500xe241968e);
        }

        /* renamed from: destroy */
        public void m28498x5cd39ffa() {
            if (this.f13939x766b9619.getAndSet(true)) {
                return;
            }
            m28496x23caefe3(this.f13940xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28499xd764dc1e() {
            m28498x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28495x2e7a5e(com.p314xaae8f345.p347x615374d.gen.C3500xe241968e c3500xe241968e);
}
