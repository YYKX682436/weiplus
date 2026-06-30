package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidITransmitKvDataCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3628xfac5d5f {

    /* renamed from: com.tencent.kinda.gen.VoidITransmitKvDataCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13929x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13930x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13931xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13931xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28481x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28482x68585986(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f
        /* renamed from: call */
        public void mo28480x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m28482x68585986(this.f13931xc3e764fc, abstractC3411xcfaed72e);
        }

        /* renamed from: destroy */
        public void m28483x5cd39ffa() {
            if (this.f13930x766b9619.getAndSet(true)) {
                return;
            }
            m28481x23caefe3(this.f13931xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28484xd764dc1e() {
            m28483x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28480x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);
}
