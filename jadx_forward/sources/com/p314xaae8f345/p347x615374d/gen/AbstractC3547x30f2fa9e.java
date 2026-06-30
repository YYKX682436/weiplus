package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KViewOnClickCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3547x30f2fa9e {

    /* renamed from: com.tencent.kinda.gen.KViewOnClickCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13695x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13696x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13697xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13697xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28204x23caefe3(long j17);

        /* renamed from: native_onClick */
        private native void m28205x50138ac1(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190);

        /* renamed from: destroy */
        public void m28206x5cd39ffa() {
            if (this.f13696x766b9619.getAndSet(true)) {
                return;
            }
            m28204x23caefe3(this.f13697xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28207xd764dc1e() {
            m28206x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3547x30f2fa9e
        /* renamed from: onClick */
        public void mo28203xaf6b9ae9(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
            m28205x50138ac1(this.f13697xc3e764fc, interfaceC3545x4499190);
        }
    }

    /* renamed from: onClick */
    public abstract void mo28203xaf6b9ae9(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190);
}
