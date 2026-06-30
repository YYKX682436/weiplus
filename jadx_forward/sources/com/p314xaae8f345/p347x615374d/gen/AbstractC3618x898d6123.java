package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidBoolCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3618x898d6123 {

    /* renamed from: com.tencent.kinda.gen.VoidBoolCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13899x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13900x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13901xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13901xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28432x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28433x68585986(long j17, boolean z17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123
        /* renamed from: call */
        public void mo28431x2e7a5e(boolean z17) {
            m28433x68585986(this.f13901xc3e764fc, z17);
        }

        /* renamed from: destroy */
        public void m28434x5cd39ffa() {
            if (this.f13900x766b9619.getAndSet(true)) {
                return;
            }
            m28432x23caefe3(this.f13901xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28435xd764dc1e() {
            m28434x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28431x2e7a5e(boolean z17);
}
