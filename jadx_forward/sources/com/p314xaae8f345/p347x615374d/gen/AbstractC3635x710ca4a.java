package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidStringCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3635x710ca4a {

    /* renamed from: com.tencent.kinda.gen.VoidStringCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13950x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13951x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13952xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13952xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28516x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28517x68585986(long j17, java.lang.String str);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a
        /* renamed from: call */
        public void mo28515x2e7a5e(java.lang.String str) {
            m28517x68585986(this.f13952xc3e764fc, str);
        }

        /* renamed from: destroy */
        public void m28518x5cd39ffa() {
            if (this.f13951x766b9619.getAndSet(true)) {
                return;
            }
            m28516x23caefe3(this.f13952xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28519xd764dc1e() {
            m28518x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28515x2e7a5e(java.lang.String str);
}
