package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3436xac97cf48 {

    /* renamed from: com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3436xac97cf48 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13573x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13574x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13575xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13575xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27900x23caefe3(long j17);

        /* renamed from: native_onSelect */
        private native void m27901xcd4a16e3(long j17, int i17);

        /* renamed from: destroy */
        public void m27902x5cd39ffa() {
            if (this.f13574x766b9619.getAndSet(true)) {
                return;
            }
            m27900x23caefe3(this.f13575xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27903xd764dc1e() {
            m27902x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3436xac97cf48
        /* renamed from: onSelect */
        public void mo27899x58f40bbb(int i17) {
            m27901xcd4a16e3(this.f13575xc3e764fc, i17);
        }
    }

    /* renamed from: onSelect */
    public abstract void mo27899x58f40bbb(int i17);
}
