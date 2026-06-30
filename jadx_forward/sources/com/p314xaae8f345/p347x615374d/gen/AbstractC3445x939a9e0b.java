package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KCountryCallingCodeViewOnSelectCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3445x939a9e0b {

    /* renamed from: com.tencent.kinda.gen.KCountryCallingCodeViewOnSelectCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3445x939a9e0b {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13582x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13583x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13584xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13584xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27951x23caefe3(long j17);

        /* renamed from: native_onSelect */
        private native void m27952xcd4a16e3(long j17, java.lang.String str, java.lang.String str2);

        /* renamed from: destroy */
        public void m27953x5cd39ffa() {
            if (this.f13583x766b9619.getAndSet(true)) {
                return;
            }
            m27951x23caefe3(this.f13584xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27954xd764dc1e() {
            m27953x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3445x939a9e0b
        /* renamed from: onSelect */
        public void mo27950x58f40bbb(java.lang.String str, java.lang.String str2) {
            m27952xcd4a16e3(this.f13584xc3e764fc, str, str2);
        }
    }

    /* renamed from: onSelect */
    public abstract void mo27950x58f40bbb(java.lang.String str, java.lang.String str2);
}
