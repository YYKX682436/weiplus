package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3509x64dcc82c {

    /* renamed from: com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3509x64dcc82c {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13652x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13653x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13654xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13654xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28106x23caefe3(long j17);

        /* renamed from: native_onPasswordChange */
        private native void m28107xcd122512(long j17, int i17, java.lang.String str, java.lang.String str2);

        /* renamed from: destroy */
        public void m28108x5cd39ffa() {
            if (this.f13653x766b9619.getAndSet(true)) {
                return;
            }
            m28106x23caefe3(this.f13654xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28109xd764dc1e() {
            m28108x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3509x64dcc82c
        /* renamed from: onPasswordChange */
        public void mo28105xf345c1ea(int i17, java.lang.String str, java.lang.String str2) {
            m28107xcd122512(this.f13654xc3e764fc, i17, str, str2);
        }
    }

    /* renamed from: onPasswordChange */
    public abstract void mo28105xf345c1ea(int i17, java.lang.String str, java.lang.String str2);
}
