package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidStringStringCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3637x4fc395bb {

    /* renamed from: com.tencent.kinda.gen.VoidStringStringCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3637x4fc395bb {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13956x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13957x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13958xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13958xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28526x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28527x68585986(long j17, java.lang.String str, java.lang.String str2);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3637x4fc395bb
        /* renamed from: call */
        public void mo28525x2e7a5e(java.lang.String str, java.lang.String str2) {
            m28527x68585986(this.f13958xc3e764fc, str, str2);
        }

        /* renamed from: destroy */
        public void m28528x5cd39ffa() {
            if (this.f13957x766b9619.getAndSet(true)) {
                return;
            }
            m28526x23caefe3(this.f13958xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28529xd764dc1e() {
            m28528x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28525x2e7a5e(java.lang.String str, java.lang.String str2);
}
