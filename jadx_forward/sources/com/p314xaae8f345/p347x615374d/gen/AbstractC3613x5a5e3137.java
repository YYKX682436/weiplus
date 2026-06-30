package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.UseCase */
/* loaded from: classes9.dex */
public abstract class AbstractC3613x5a5e3137 {

    /* renamed from: com.tencent.kinda.gen.UseCase$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13882x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13883x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13884xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13884xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28409x23caefe3(long j17);

        /* renamed from: native_notify */
        private native void m28410xc7364c71(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_preStepDidDestory */
        private native void m28411x1397e6dc(long j17);

        /* renamed from: destroy */
        public void m28412x5cd39ffa() {
            if (this.f13883x766b9619.getAndSet(true)) {
                return;
            }
            m28409x23caefe3(this.f13884xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28413xd764dc1e() {
            m28412x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137
        /* renamed from: notify */
        public void mo25794xc2079749(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m28410xc7364c71(this.f13884xc3e764fc, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137
        /* renamed from: preStepDidDestory */
        public void mo25795xb3d7e504() {
            m28411x1397e6dc(this.f13884xc3e764fc);
        }
    }

    /* renamed from: notify */
    public abstract void mo25794xc2079749(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: preStepDidDestory */
    public abstract void mo25795xb3d7e504();
}
