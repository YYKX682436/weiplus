package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidStringStringStringCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3638xb592486c {

    /* renamed from: com.tencent.kinda.gen.VoidStringStringStringCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3638xb592486c {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13959x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13960x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13961xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13961xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28531x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28532x68585986(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3638xb592486c
        /* renamed from: call */
        public void mo28530x2e7a5e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            m28532x68585986(this.f13961xc3e764fc, str, str2, str3);
        }

        /* renamed from: destroy */
        public void m28533x5cd39ffa() {
            if (this.f13960x766b9619.getAndSet(true)) {
                return;
            }
            m28531x23caefe3(this.f13961xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28534xd764dc1e() {
            m28533x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28530x2e7a5e(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
