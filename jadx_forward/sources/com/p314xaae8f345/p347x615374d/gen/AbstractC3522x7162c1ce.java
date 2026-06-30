package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KScrollViewOnScrollCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3522x7162c1ce {

    /* renamed from: com.tencent.kinda.gen.KScrollViewOnScrollCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3522x7162c1ce {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13665x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13666x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13667xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13667xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28139x23caefe3(long j17);

        /* renamed from: native_onScroll */
        private native void m28140xcd30c8b4(long j17, float f17, float f18);

        /* renamed from: destroy */
        public void m28141x5cd39ffa() {
            if (this.f13666x766b9619.getAndSet(true)) {
                return;
            }
            m28139x23caefe3(this.f13667xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28142xd764dc1e() {
            m28141x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3522x7162c1ce
        /* renamed from: onScroll */
        public void mo28138x58dabd8c(float f17, float f18) {
            m28140xcd30c8b4(this.f13667xc3e764fc, f17, f18);
        }
    }

    /* renamed from: onScroll */
    public abstract void mo28138x58dabd8c(float f17, float f18);
}
