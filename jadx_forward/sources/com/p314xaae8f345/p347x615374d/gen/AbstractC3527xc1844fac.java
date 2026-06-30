package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback */
/* loaded from: classes15.dex */
public abstract class AbstractC3527xc1844fac {

    /* renamed from: com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3527xc1844fac {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13673x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13674x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13675xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13675xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28152x23caefe3(long j17);

        /* renamed from: native_onChangeSwitch */
        private native void m28153xf443cbab(long j17);

        /* renamed from: destroy */
        public void m28154x5cd39ffa() {
            if (this.f13674x766b9619.getAndSet(true)) {
                return;
            }
            m28152x23caefe3(this.f13675xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28155xd764dc1e() {
            m28154x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3527xc1844fac
        /* renamed from: onChangeSwitch */
        public void mo28151x6fe8be83() {
            m28153xf443cbab(this.f13675xc3e764fc);
        }
    }

    /* renamed from: onChangeSwitch */
    public abstract void mo28151x6fe8be83();
}
