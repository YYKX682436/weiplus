package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidF32I32F32I32Callback */
/* loaded from: classes9.dex */
public abstract class AbstractC3625xf3e9d61f {

    /* renamed from: com.tencent.kinda.gen.VoidF32I32F32I32Callback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3625xf3e9d61f {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13920x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13921x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13922xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13922xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28466x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28467x68585986(long j17, float f17, int i17, float f18, int i18);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3625xf3e9d61f
        /* renamed from: call */
        public void mo28465x2e7a5e(float f17, int i17, float f18, int i18) {
            m28467x68585986(this.f13922xc3e764fc, f17, i17, f18, i18);
        }

        /* renamed from: destroy */
        public void m28468x5cd39ffa() {
            if (this.f13921x766b9619.getAndSet(true)) {
                return;
            }
            m28466x23caefe3(this.f13922xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28469xd764dc1e() {
            m28468x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28465x2e7a5e(float f17, int i17, float f18, int i18);
}
