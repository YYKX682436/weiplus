package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidBinaryI32Callback */
/* loaded from: classes9.dex */
public abstract class AbstractC3617x3879e6d8 {

    /* renamed from: com.tencent.kinda.gen.VoidBinaryI32Callback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3617x3879e6d8 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13896x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13897x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13898xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13898xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28427x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28428x68585986(long j17, byte[] bArr, int i17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3617x3879e6d8
        /* renamed from: call */
        public void mo28426x2e7a5e(byte[] bArr, int i17) {
            m28428x68585986(this.f13898xc3e764fc, bArr, i17);
        }

        /* renamed from: destroy */
        public void m28429x5cd39ffa() {
            if (this.f13897x766b9619.getAndSet(true)) {
                return;
            }
            m28427x23caefe3(this.f13898xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28430xd764dc1e() {
            m28429x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28426x2e7a5e(byte[] bArr, int i17);
}
