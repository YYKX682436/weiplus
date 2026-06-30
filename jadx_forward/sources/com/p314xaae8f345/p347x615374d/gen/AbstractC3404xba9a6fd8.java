package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.IAsyncTask */
/* loaded from: classes15.dex */
public abstract class AbstractC3404xba9a6fd8 {

    /* renamed from: com.tencent.kinda.gen.IAsyncTask$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3404xba9a6fd8 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13529x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13530x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13531xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13531xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27531x23caefe3(long j17);

        /* renamed from: native_execute */
        private native void m27532x5200e74d(long j17);

        /* renamed from: destroy */
        public void m27533x5cd39ffa() {
            if (this.f13530x766b9619.getAndSet(true)) {
                return;
            }
            m27531x23caefe3(this.f13531xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3404xba9a6fd8
        /* renamed from: execute */
        public void mo27530xb158f775() {
            m27532x5200e74d(this.f13531xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27534xd764dc1e() {
            m27533x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: execute */
    public abstract void mo27530xb158f775();
}
