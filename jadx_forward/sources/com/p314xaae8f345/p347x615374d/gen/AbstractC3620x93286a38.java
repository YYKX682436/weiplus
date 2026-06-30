package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidBoolOptionCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3620x93286a38 {

    /* renamed from: com.tencent.kinda.gen.VoidBoolOptionCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3620x93286a38 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13905x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13906x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13907xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13907xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28442x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28443x68585986(long j17, boolean z17, com.p314xaae8f345.p347x615374d.gen.C3582x8d2f7495 c3582x8d2f7495);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3620x93286a38
        /* renamed from: call */
        public void mo28441x2e7a5e(boolean z17, com.p314xaae8f345.p347x615374d.gen.C3582x8d2f7495 c3582x8d2f7495) {
            m28443x68585986(this.f13907xc3e764fc, z17, c3582x8d2f7495);
        }

        /* renamed from: destroy */
        public void m28444x5cd39ffa() {
            if (this.f13906x766b9619.getAndSet(true)) {
                return;
            }
            m28442x23caefe3(this.f13907xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28445xd764dc1e() {
            m28444x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28441x2e7a5e(boolean z17, com.p314xaae8f345.p347x615374d.gen.C3582x8d2f7495 c3582x8d2f7495);
}
