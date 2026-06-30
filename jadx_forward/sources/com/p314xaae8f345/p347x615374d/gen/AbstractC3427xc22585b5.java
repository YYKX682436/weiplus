package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KBankEditViewOnSeletBankCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3427xc22585b5 {

    /* renamed from: com.tencent.kinda.gen.KBankEditViewOnSeletBankCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3427xc22585b5 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13560x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13561x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13562xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13562xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27880x23caefe3(long j17);

        /* renamed from: native_onSeletBank */
        private native void m27881xc1b7a91e(long j17, java.lang.String str, java.lang.String str2);

        /* renamed from: destroy */
        public void m27882x5cd39ffa() {
            if (this.f13561x766b9619.getAndSet(true)) {
                return;
            }
            m27880x23caefe3(this.f13562xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27883xd764dc1e() {
            m27882x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3427xc22585b5
        /* renamed from: onSeletBank */
        public void mo27879x98bb6546(java.lang.String str, java.lang.String str2) {
            m27881xc1b7a91e(this.f13562xc3e764fc, str, str2);
        }
    }

    /* renamed from: onSeletBank */
    public abstract void mo27879x98bb6546(java.lang.String str, java.lang.String str2);
}
