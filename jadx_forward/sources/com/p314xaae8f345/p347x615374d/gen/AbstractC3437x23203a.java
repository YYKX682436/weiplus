package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KCgi */
/* loaded from: classes12.dex */
public abstract class AbstractC3437x23203a {

    /* renamed from: com.tencent.kinda.gen.KCgi$CppProxy */
    /* loaded from: classes12.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13576x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13577x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13578xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13578xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27914x23caefe3(long j17);

        /* renamed from: native_getCgiId */
        private native int m27915xe8972df2(long j17);

        /* renamed from: native_getCgiUrl */
        private native java.lang.String m27916x2a4ebf78(long j17);

        /* renamed from: native_getChannelType */
        private native int m27917x6e889acf(long j17);

        /* renamed from: native_getNeedNotify */
        private native boolean m27918x70fc294d(long j17);

        /* renamed from: native_getNewDNSBusinessType */
        private native com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30 m27919xb7a294f1(long j17);

        /* renamed from: native_getRequestData */
        private native byte[] m27920xa2b6cacb(long j17);

        /* renamed from: native_getRetryCount */
        private native int m27921x83dd0d15(long j17);

        /* renamed from: native_getRouteInfo */
        private native java.lang.String m27922xfff2e709(long j17);

        /* renamed from: native_getTimeout */
        private native int m27923xa67c6a53(long j17);

        /* renamed from: native_onResp */
        private native void m27924xc8cd8b77(long j17, int i17, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        /* renamed from: destroy */
        public void m27925x5cd39ffa() {
            if (this.f13577x766b9619.getAndSet(true)) {
                return;
            }
            m27914x23caefe3(this.f13578xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27926xd764dc1e() {
            m27925x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getCgiId */
        public int mo27904x744122ca() {
            return m27915xe8972df2(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getCgiUrl */
        public java.lang.String mo27905x13e365a0() {
            return m27916x2a4ebf78(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getChannelType */
        public int mo27906xea2d8da7() {
            return m27917x6e889acf(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getNeedNotify */
        public boolean mo27907x96017b75() {
            return m27918x70fc294d(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getNewDNSBusinessType */
        public com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30 mo27908x1de73f19() {
            return m27919xb7a294f1(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getRequestData */
        public byte[] mo27909x1e5bbda3() {
            return m27920xa2b6cacb(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getRetryCount */
        public int mo27910xa8e25f3d() {
            return m27921x83dd0d15(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getRouteInfo */
        public java.lang.String mo27911x966afe1() {
            return m27922xfff2e709(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: getTimeout */
        public int mo27912xef7c892b() {
            return m27923xa67c6a53(this.f13578xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
        /* renamed from: onResp */
        public void mo27913xc39ed64f(int i17, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            m27924xc8cd8b77(this.f13578xc3e764fc, i17, bArr, hashMap);
        }
    }

    /* renamed from: getCgiId */
    public abstract int mo27904x744122ca();

    /* renamed from: getCgiUrl */
    public abstract java.lang.String mo27905x13e365a0();

    /* renamed from: getChannelType */
    public abstract int mo27906xea2d8da7();

    /* renamed from: getNeedNotify */
    public abstract boolean mo27907x96017b75();

    /* renamed from: getNewDNSBusinessType */
    public abstract com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30 mo27908x1de73f19();

    /* renamed from: getRequestData */
    public abstract byte[] mo27909x1e5bbda3();

    /* renamed from: getRetryCount */
    public abstract int mo27910xa8e25f3d();

    /* renamed from: getRouteInfo */
    public abstract java.lang.String mo27911x966afe1();

    /* renamed from: getTimeout */
    public abstract int mo27912xef7c892b();

    /* renamed from: onResp */
    public abstract void mo27913xc39ed64f(int i17, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap);
}
