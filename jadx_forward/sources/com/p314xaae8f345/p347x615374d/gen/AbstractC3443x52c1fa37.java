package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KCountPickerViewOnSelectCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3443x52c1fa37 {

    /* renamed from: com.tencent.kinda.gen.KCountPickerViewOnSelectCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3443x52c1fa37 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13579x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13580x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13581xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13581xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27946x23caefe3(long j17);

        /* renamed from: native_onSelect */
        private native void m27947xcd4a16e3(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m27948x5cd39ffa() {
            if (this.f13580x766b9619.getAndSet(true)) {
                return;
            }
            m27946x23caefe3(this.f13581xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27949xd764dc1e() {
            m27948x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3443x52c1fa37
        /* renamed from: onSelect */
        public void mo27945x58f40bbb(java.lang.String str) {
            m27947xcd4a16e3(this.f13581xc3e764fc, str);
        }
    }

    /* renamed from: onSelect */
    public abstract void mo27945x58f40bbb(java.lang.String str);
}
