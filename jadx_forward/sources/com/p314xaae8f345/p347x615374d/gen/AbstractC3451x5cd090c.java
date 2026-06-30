package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KDatePickerViewOnSelectCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3451x5cd090c {

    /* renamed from: com.tencent.kinda.gen.KDatePickerViewOnSelectCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3451x5cd090c {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13588x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13589x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13590xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13590xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27960x23caefe3(long j17);

        /* renamed from: native_onSelect */
        private native void m27961xcd4a16e3(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m27962x5cd39ffa() {
            if (this.f13589x766b9619.getAndSet(true)) {
                return;
            }
            m27960x23caefe3(this.f13590xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27963xd764dc1e() {
            m27962x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3451x5cd090c
        /* renamed from: onSelect */
        public void mo27959x58f40bbb(java.lang.String str) {
            m27961xcd4a16e3(this.f13590xc3e764fc, str);
        }
    }

    /* renamed from: onSelect */
    public abstract void mo27959x58f40bbb(java.lang.String str);
}
