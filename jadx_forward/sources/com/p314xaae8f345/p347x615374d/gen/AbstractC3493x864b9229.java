package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KPatternLockViewEndWithPatternCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3493x864b9229 {

    /* renamed from: com.tencent.kinda.gen.KPatternLockViewEndWithPatternCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3493x864b9229 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13635x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13636x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13637xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13637xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28075x23caefe3(long j17);

        /* renamed from: native_endWithPattern */
        private native void m28076x80f32d37(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m28077x5cd39ffa() {
            if (this.f13636x766b9619.getAndSet(true)) {
                return;
            }
            m28075x23caefe3(this.f13637xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3493x864b9229
        /* renamed from: endWithPattern */
        public void mo28074xfc98200f(java.lang.String str) {
            m28076x80f32d37(this.f13637xc3e764fc, str);
        }

        /* renamed from: finalize */
        public void m28078xd764dc1e() {
            m28077x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: endWithPattern */
    public abstract void mo28074xfc98200f(java.lang.String str);
}
