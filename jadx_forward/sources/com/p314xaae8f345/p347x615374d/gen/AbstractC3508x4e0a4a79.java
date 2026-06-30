package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KPwdInputViewOnEndEnterPasswordCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3508x4e0a4a79 {

    /* renamed from: com.tencent.kinda.gen.KPwdInputViewOnEndEnterPasswordCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3508x4e0a4a79 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13649x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13650x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13651xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13651xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28101x23caefe3(long j17);

        /* renamed from: native_onEndEnterPassword */
        private native void m28102xe2d7dd9f(long j17, java.lang.String str, java.lang.String str2);

        /* renamed from: destroy */
        public void m28103x5cd39ffa() {
            if (this.f13650x766b9619.getAndSet(true)) {
                return;
            }
            m28101x23caefe3(this.f13651xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28104xd764dc1e() {
            m28103x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3508x4e0a4a79
        /* renamed from: onEndEnterPassword */
        public void mo28100x4a97a477(java.lang.String str, java.lang.String str2) {
            m28102xe2d7dd9f(this.f13651xc3e764fc, str, str2);
        }
    }

    /* renamed from: onEndEnterPassword */
    public abstract void mo28100x4a97a477(java.lang.String str, java.lang.String str2);
}
