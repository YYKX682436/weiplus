package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KViewOnTouchCallback */
/* loaded from: classes15.dex */
public abstract class AbstractC3549x5ca66d55 {

    /* renamed from: com.tencent.kinda.gen.KViewOnTouchCallback$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3549x5ca66d55 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13701x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13702x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13703xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13703xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28214x23caefe3(long j17);

        /* renamed from: native_onTouch */
        private native void m28215x5104a478(long j17, com.p314xaae8f345.p347x615374d.gen.C3610x16332ebb c3610x16332ebb);

        /* renamed from: destroy */
        public void m28216x5cd39ffa() {
            if (this.f13702x766b9619.getAndSet(true)) {
                return;
            }
            m28214x23caefe3(this.f13703xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28217xd764dc1e() {
            m28216x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3549x5ca66d55
        /* renamed from: onTouch */
        public void mo28213xb05cb4a0(com.p314xaae8f345.p347x615374d.gen.C3610x16332ebb c3610x16332ebb) {
            m28215x5104a478(this.f13703xc3e764fc, c3610x16332ebb);
        }
    }

    /* renamed from: onTouch */
    public abstract void mo28213xb05cb4a0(com.p314xaae8f345.p347x615374d.gen.C3610x16332ebb c3610x16332ebb);
}
