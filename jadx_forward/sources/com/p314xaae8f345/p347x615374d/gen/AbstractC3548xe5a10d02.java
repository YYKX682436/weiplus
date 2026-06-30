package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KViewOnLongClickCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3548xe5a10d02 {

    /* renamed from: com.tencent.kinda.gen.KViewOnLongClickCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3548xe5a10d02 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13698x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13699x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13700xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13700xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28209x23caefe3(long j17);

        /* renamed from: native_onLongClick */
        private native void m28210x2d3b3d25(long j17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190);

        /* renamed from: destroy */
        public void m28211x5cd39ffa() {
            if (this.f13699x766b9619.getAndSet(true)) {
                return;
            }
            m28209x23caefe3(this.f13700xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28212xd764dc1e() {
            m28211x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3548xe5a10d02
        /* renamed from: onLongClick */
        public void mo28208x43ef94d(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
            m28210x2d3b3d25(this.f13700xc3e764fc, interfaceC3545x4499190);
        }
    }

    /* renamed from: onLongClick */
    public abstract void mo28208x43ef94d(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190);
}
