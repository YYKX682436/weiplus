package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KSecureEditTextOnTextChangedCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3524xb18d4f34 {

    /* renamed from: com.tencent.kinda.gen.KSecureEditTextOnTextChangedCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3524xb18d4f34 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13668x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13669x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13670xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13670xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28144x23caefe3(long j17);

        /* renamed from: native_onTextChanged */
        private native void m28145xf1842f40(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m28146x5cd39ffa() {
            if (this.f13669x766b9619.getAndSet(true)) {
                return;
            }
            m28144x23caefe3(this.f13670xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28147xd764dc1e() {
            m28146x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3524xb18d4f34
        /* renamed from: onTextChanged */
        public void mo28143x16898168(java.lang.String str) {
            m28145xf1842f40(this.f13670xc3e764fc, str);
        }
    }

    /* renamed from: onTextChanged */
    public abstract void mo28143x16898168(java.lang.String str);
}
