package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidStringBinaryCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3634x887151ab {

    /* renamed from: com.tencent.kinda.gen.VoidStringBinaryCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3634x887151ab {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13947x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13948x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13949xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13949xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28511x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28512x68585986(long j17, java.lang.String str, byte[] bArr);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3634x887151ab
        /* renamed from: call */
        public void mo28510x2e7a5e(java.lang.String str, byte[] bArr) {
            m28512x68585986(this.f13949xc3e764fc, str, bArr);
        }

        /* renamed from: destroy */
        public void m28513x5cd39ffa() {
            if (this.f13948x766b9619.getAndSet(true)) {
                return;
            }
            m28511x23caefe3(this.f13949xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28514xd764dc1e() {
            m28513x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28510x2e7a5e(java.lang.String str, byte[] bArr);
}
