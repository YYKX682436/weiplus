package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KBankCardTypePickerViewOnSelectCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3425xe805f524 {

    /* renamed from: com.tencent.kinda.gen.KBankCardTypePickerViewOnSelectCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3425xe805f524 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13557x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13558x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13559xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13559xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27875x23caefe3(long j17);

        /* renamed from: native_onSelect */
        private native void m27876xcd4a16e3(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m27877x5cd39ffa() {
            if (this.f13558x766b9619.getAndSet(true)) {
                return;
            }
            m27875x23caefe3(this.f13559xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27878xd764dc1e() {
            m27877x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3425xe805f524
        /* renamed from: onSelect */
        public void mo27874x58f40bbb(java.lang.String str) {
            m27876xcd4a16e3(this.f13559xc3e764fc, str);
        }
    }

    /* renamed from: onSelect */
    public abstract void mo27874x58f40bbb(java.lang.String str);
}
