package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KRegionEditViewOnRegionSelectedCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3517xa358ce01 {

    /* renamed from: com.tencent.kinda.gen.KRegionEditViewOnRegionSelectedCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3517xa358ce01 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13662x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13663x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13664xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13664xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28134x23caefe3(long j17);

        /* renamed from: native_onRegionSelected */
        private native void m28135xcd765496(long j17);

        /* renamed from: destroy */
        public void m28136x5cd39ffa() {
            if (this.f13663x766b9619.getAndSet(true)) {
                return;
            }
            m28134x23caefe3(this.f13664xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28137xd764dc1e() {
            m28136x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3517xa358ce01
        /* renamed from: onRegionSelected */
        public void mo28133xf3a9f16e() {
            m28135xcd765496(this.f13664xc3e764fc);
        }
    }

    /* renamed from: onRegionSelected */
    public abstract void mo28133xf3a9f16e();
}
