package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KEditTextOnFocusChangeCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3455x7a4da80c {

    /* renamed from: com.tencent.kinda.gen.KEditTextOnFocusChangeCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3455x7a4da80c {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13594x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13595x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13596xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13596xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27970x23caefe3(long j17);

        /* renamed from: native_onFocusChange */
        private native void m27971x42898921(long j17, boolean z17);

        /* renamed from: destroy */
        public void m27972x5cd39ffa() {
            if (this.f13595x766b9619.getAndSet(true)) {
                return;
            }
            m27970x23caefe3(this.f13596xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27973xd764dc1e() {
            m27972x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3455x7a4da80c
        /* renamed from: onFocusChange */
        public void mo27969x678edb49(boolean z17) {
            m27971x42898921(this.f13596xc3e764fc, z17);
        }
    }

    /* renamed from: onFocusChange */
    public abstract void mo27969x678edb49(boolean z17);
}
