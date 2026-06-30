package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidITransmitKvDataNoticeItemCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3629x24a2c80a {

    /* renamed from: com.tencent.kinda.gen.VoidITransmitKvDataNoticeItemCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3629x24a2c80a {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13932x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13933x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13934xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13934xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28486x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28487x68585986(long j17, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.C3581x2b25362b c3581x2b25362b);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3629x24a2c80a
        /* renamed from: call */
        public void mo28485x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.C3581x2b25362b c3581x2b25362b) {
            m28487x68585986(this.f13934xc3e764fc, abstractC3411xcfaed72e, c3581x2b25362b);
        }

        /* renamed from: destroy */
        public void m28488x5cd39ffa() {
            if (this.f13933x766b9619.getAndSet(true)) {
                return;
            }
            m28486x23caefe3(this.f13934xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28489xd764dc1e() {
            m28488x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28485x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.C3581x2b25362b c3581x2b25362b);
}
