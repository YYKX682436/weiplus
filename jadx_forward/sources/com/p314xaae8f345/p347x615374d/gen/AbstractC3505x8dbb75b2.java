package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3505x8dbb75b2 {

    /* renamed from: com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3505x8dbb75b2 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13646x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13647x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13648xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13648xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28096x23caefe3(long j17);

        /* renamed from: native_onSelectProfession */
        private native void m28097x159fd43f(long j17, java.lang.String str, int i17);

        /* renamed from: destroy */
        public void m28098x5cd39ffa() {
            if (this.f13647x766b9619.getAndSet(true)) {
                return;
            }
            m28096x23caefe3(this.f13648xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28099xd764dc1e() {
            m28098x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3505x8dbb75b2
        /* renamed from: onSelectProfession */
        public void mo28095x7d5f9b17(java.lang.String str, int i17) {
            m28097x159fd43f(this.f13648xc3e764fc, str, i17);
        }
    }

    /* renamed from: onSelectProfession */
    public abstract void mo28095x7d5f9b17(java.lang.String str, int i17);
}
