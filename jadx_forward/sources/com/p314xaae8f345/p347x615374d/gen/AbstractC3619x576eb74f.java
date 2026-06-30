package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidBoolI32Callback */
/* loaded from: classes9.dex */
public abstract class AbstractC3619x576eb74f {

    /* renamed from: com.tencent.kinda.gen.VoidBoolI32Callback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13902x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13903x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13904xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13904xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28437x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28438x68585986(long j17, boolean z17, int i17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f
        /* renamed from: call */
        public void mo28436x2e7a5e(boolean z17, int i17) {
            m28438x68585986(this.f13904xc3e764fc, z17, i17);
        }

        /* renamed from: destroy */
        public void m28439x5cd39ffa() {
            if (this.f13903x766b9619.getAndSet(true)) {
                return;
            }
            m28437x23caefe3(this.f13904xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28440xd764dc1e() {
            m28439x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28436x2e7a5e(boolean z17, int i17);
}
