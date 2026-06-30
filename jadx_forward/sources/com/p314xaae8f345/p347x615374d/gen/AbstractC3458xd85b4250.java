package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3458xd85b4250 {

    /* renamed from: com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3458xd85b4250 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13603x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13604x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13605xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13605xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27985x23caefe3(long j17);

        /* renamed from: native_onTextEndEditing */
        private native void m27986xa18ac031(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m27987x5cd39ffa() {
            if (this.f13604x766b9619.getAndSet(true)) {
                return;
            }
            m27985x23caefe3(this.f13605xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27988xd764dc1e() {
            m27987x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3458xd85b4250
        /* renamed from: onTextEndEditing */
        public void mo27984xc7be5d09(java.lang.String str) {
            m27986xa18ac031(this.f13605xc3e764fc, str);
        }
    }

    /* renamed from: onTextEndEditing */
    public abstract void mo27984xc7be5d09(java.lang.String str);
}
