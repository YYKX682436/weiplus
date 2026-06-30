package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.TenpayCgiCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3605xf145375f {

    /* renamed from: com.tencent.kinda.gen.TenpayCgiCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3605xf145375f {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13860x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13861x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13862xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13862xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28377x23caefe3(long j17);

        /* renamed from: native_onError */
        private native void m28378x50329741(long j17, int i17, java.lang.String str);

        /* renamed from: native_onSuccess */
        private native void m28379xf6c69afc(long j17, java.lang.String str);

        /* renamed from: destroy */
        public void m28380x5cd39ffa() {
            if (this.f13861x766b9619.getAndSet(true)) {
                return;
            }
            m28377x23caefe3(this.f13862xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28381xd764dc1e() {
            m28380x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3605xf145375f
        /* renamed from: onError */
        public void mo28375xaf8aa769(int i17, java.lang.String str) {
            m28378x50329741(this.f13862xc3e764fc, i17, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3605xf145375f
        /* renamed from: onSuccess */
        public void mo28376xe05b4124(java.lang.String str) {
            m28379xf6c69afc(this.f13862xc3e764fc, str);
        }
    }

    /* renamed from: onError */
    public abstract void mo28375xaf8aa769(int i17, java.lang.String str);

    /* renamed from: onSuccess */
    public abstract void mo28376xe05b4124(java.lang.String str);
}
