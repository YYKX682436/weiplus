package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3433x6f9eee7a {

    /* renamed from: com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3433x6f9eee7a {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13567x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13568x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13569xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13569xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27890x23caefe3(long j17);

        /* renamed from: native_onTextChanged */
        private native void m27891xf1842f40(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m27892x5cd39ffa() {
            if (this.f13568x766b9619.getAndSet(true)) {
                return;
            }
            m27890x23caefe3(this.f13569xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27893xd764dc1e() {
            m27892x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3433x6f9eee7a
        /* renamed from: onTextChanged */
        public void mo27889x16898168(java.lang.String str) {
            m27891xf1842f40(this.f13569xc3e764fc, str);
        }
    }

    /* renamed from: onTextChanged */
    public abstract void mo27889x16898168(java.lang.String str);
}
