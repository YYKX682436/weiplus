package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KPatternLockViewOnInputInvalidPatternCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3494x208a3db4 {

    /* renamed from: com.tencent.kinda.gen.KPatternLockViewOnInputInvalidPatternCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3494x208a3db4 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13638x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13639x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13640xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13640xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28080x23caefe3(long j17);

        /* renamed from: native_onInputInvalidPattern */
        private native void m28081x4f6e257c(long j17);

        /* renamed from: destroy */
        public void m28082x5cd39ffa() {
            if (this.f13639x766b9619.getAndSet(true)) {
                return;
            }
            m28080x23caefe3(this.f13640xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28083xd764dc1e() {
            m28082x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3494x208a3db4
        /* renamed from: onInputInvalidPattern */
        public void mo28079xb5b2cfa4() {
            m28081x4f6e257c(this.f13640xc3e764fc);
        }
    }

    /* renamed from: onInputInvalidPattern */
    public abstract void mo28079xb5b2cfa4();
}
