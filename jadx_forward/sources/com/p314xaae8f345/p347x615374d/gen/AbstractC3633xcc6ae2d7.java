package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.VoidListCallback */
/* loaded from: classes9.dex */
public abstract class AbstractC3633xcc6ae2d7 {

    /* renamed from: com.tencent.kinda.gen.VoidListCallback$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3633xcc6ae2d7 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13944x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13945x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13946xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13946xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28506x23caefe3(long j17);

        /* renamed from: native_call */
        private native void m28507x68585986(long j17, java.util.ArrayList<java.lang.Integer> arrayList);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3633xcc6ae2d7
        /* renamed from: call */
        public void mo28505x2e7a5e(java.util.ArrayList<java.lang.Integer> arrayList) {
            m28507x68585986(this.f13946xc3e764fc, arrayList);
        }

        /* renamed from: destroy */
        public void m28508x5cd39ffa() {
            if (this.f13945x766b9619.getAndSet(true)) {
                return;
            }
            m28506x23caefe3(this.f13946xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28509xd764dc1e() {
            m28508x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: call */
    public abstract void mo28505x2e7a5e(java.util.ArrayList<java.lang.Integer> arrayList);
}
