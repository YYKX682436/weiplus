package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KindaGlobalReporter */
/* loaded from: classes9.dex */
public abstract class AbstractC3559x53517a31 {

    /* renamed from: com.tencent.kinda.gen.KindaGlobalReporter$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13719x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13720x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13721xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13721xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28236x23caefe3(long j17);

        /* renamed from: native_getCppSessionId */
        private native java.lang.String m28237x1882e3c(long j17);

        /* renamed from: native_getKindaSequenceId */
        private native int m28238x4abb6db(long j17);

        /* renamed from: native_listenSessionId */
        private native void m28239x865f7822(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 interfaceC3571xf2e81e78);

        /* renamed from: native_log */
        private native void m28240xb90b3f1c(long j17, com.p314xaae8f345.p347x615374d.gen.C3563xf0771408 c3563xf0771408);

        /* renamed from: native_setKindaSequenceId */
        private native void m28241x3b82504f(long j17, long j18);

        /* renamed from: native_unlistenSessionId */
        private native void m28242xa968ae69(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 interfaceC3571xf2e81e78);

        /* renamed from: destroy */
        public void m28243x5cd39ffa() {
            if (this.f13720x766b9619.getAndSet(true)) {
                return;
            }
            m28236x23caefe3(this.f13721xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28244xd764dc1e() {
            m28243x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31
        /* renamed from: getCppSessionId */
        public java.lang.String mo28231xfa819664() {
            return m28237x1882e3c(this.f13721xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31
        /* renamed from: getKindaSequenceId */
        public int mo28232x6c6b7db3() {
            return m28238x4abb6db(this.f13721xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31
        /* renamed from: listenSessionId */
        public void mo28233x7f58e04a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 interfaceC3571xf2e81e78) {
            m28239x865f7822(this.f13721xc3e764fc, interfaceC3571xf2e81e78);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31
        public void log(com.p314xaae8f345.p347x615374d.gen.C3563xf0771408 c3563xf0771408) {
            m28240xb90b3f1c(this.f13721xc3e764fc, c3563xf0771408);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31
        /* renamed from: setKindaSequenceId */
        public void mo28234xa3421727(long j17) {
            m28241x3b82504f(this.f13721xc3e764fc, j17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31
        /* renamed from: unlistenSessionId */
        public void mo28235x49a8ac91(com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 interfaceC3571xf2e81e78) {
            m28242xa968ae69(this.f13721xc3e764fc, interfaceC3571xf2e81e78);
        }
    }

    /* renamed from: createReporter */
    public static native com.p314xaae8f345.p347x615374d.gen.AbstractC3559x53517a31 m28230x1d892dfd();

    /* renamed from: getCppSessionId */
    public abstract java.lang.String mo28231xfa819664();

    /* renamed from: getKindaSequenceId */
    public abstract int mo28232x6c6b7db3();

    /* renamed from: listenSessionId */
    public abstract void mo28233x7f58e04a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 interfaceC3571xf2e81e78);

    public abstract void log(com.p314xaae8f345.p347x615374d.gen.C3563xf0771408 c3563xf0771408);

    /* renamed from: setKindaSequenceId */
    public abstract void mo28234xa3421727(long j17);

    /* renamed from: unlistenSessionId */
    public abstract void mo28235x49a8ac91(com.p314xaae8f345.p347x615374d.gen.InterfaceC3571xf2e81e78 interfaceC3571xf2e81e78);
}
