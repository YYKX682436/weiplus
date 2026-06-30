package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidKCollectPayerMsgCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3630x70764684 {

    /* renamed from: com.tencent.kinda.gen.VoidKCollectPayerMsgCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3630x70764684 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13935x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13936x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13937xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13937xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28491x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28492x68585986(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3438x2308736b interfaceC3438x2308736b);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3630x70764684
        /* renamed from: call */
        public void mo28490x2e7a5e(com.p314xaae8f345.p347x615374d.gen.InterfaceC3438x2308736b interfaceC3438x2308736b) {
            m28492x68585986(this.f13937xc3e764fc, interfaceC3438x2308736b);
        }

        /* renamed from: destroy */
        public void m28493x5cd39ffa() {
            if (this.f13936x766b9619.getAndSet(true)) {
                return;
            }
            m28491x23caefe3(this.f13937xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28494xd764dc1e() {
            m28493x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28490x2e7a5e(com.p314xaae8f345.p347x615374d.gen.InterfaceC3438x2308736b interfaceC3438x2308736b);
}
