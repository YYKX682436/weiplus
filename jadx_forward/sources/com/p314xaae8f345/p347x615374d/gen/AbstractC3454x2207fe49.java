package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KEditTextOnEditorActionCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3454x2207fe49 {

    /* renamed from: com.tencent.kinda.gen.KEditTextOnEditorActionCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3454x2207fe49 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13591x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13592x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13593xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13593xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27965x23caefe3(long j17);

        /* renamed from: native_onEditorAction */
        private native void m27966x9ae89eaa(long j17, com.p314xaae8f345.p347x615374d.gen.EnumC3554x204b6b9b enumC3554x204b6b9b);

        /* renamed from: destroy */
        public void m27967x5cd39ffa() {
            if (this.f13592x766b9619.getAndSet(true)) {
                return;
            }
            m27965x23caefe3(this.f13593xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27968xd764dc1e() {
            m27967x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3454x2207fe49
        /* renamed from: onEditorAction */
        public void mo27964x168d9182(com.p314xaae8f345.p347x615374d.gen.EnumC3554x204b6b9b enumC3554x204b6b9b) {
            m27966x9ae89eaa(this.f13593xc3e764fc, enumC3554x204b6b9b);
        }
    }

    /* renamed from: onEditorAction */
    public abstract void mo27964x168d9182(com.p314xaae8f345.p347x615374d.gen.EnumC3554x204b6b9b enumC3554x204b6b9b);
}
