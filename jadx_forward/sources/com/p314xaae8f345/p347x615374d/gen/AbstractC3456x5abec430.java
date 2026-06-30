package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3456x5abec430 {

    /* renamed from: com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3456x5abec430 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13597x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13598x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13599xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13599xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27975x23caefe3(long j17);

        /* renamed from: native_onTextBeginChange */
        private native void m27976x627b3c45(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m27977x5cd39ffa() {
            if (this.f13598x766b9619.getAndSet(true)) {
                return;
            }
            m27975x23caefe3(this.f13599xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27978xd764dc1e() {
            m27977x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3456x5abec430
        /* renamed from: onTextBeginChange */
        public void mo27974x2bb3a6d(java.lang.String str) {
            m27976x627b3c45(this.f13599xc3e764fc, str);
        }
    }

    /* renamed from: onTextBeginChange */
    public abstract void mo27974x2bb3a6d(java.lang.String str);
}
