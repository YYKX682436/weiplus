package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidBoolStringI32StringCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3622x83841d6f {

    /* renamed from: com.tencent.kinda.gen.VoidBoolStringI32StringCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3622x83841d6f {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13911x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13912x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13913xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13913xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28452x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28453x68585986(long j17, boolean z17, java.lang.String str, int i17, java.lang.String str2);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3622x83841d6f
        /* renamed from: call */
        public void mo28451x2e7a5e(boolean z17, java.lang.String str, int i17, java.lang.String str2) {
            m28453x68585986(this.f13913xc3e764fc, z17, str, i17, str2);
        }

        /* renamed from: destroy */
        public void m28454x5cd39ffa() {
            if (this.f13912x766b9619.getAndSet(true)) {
                return;
            }
            m28452x23caefe3(this.f13913xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28455xd764dc1e() {
            m28454x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28451x2e7a5e(boolean z17, java.lang.String str, int i17, java.lang.String str2);
}
