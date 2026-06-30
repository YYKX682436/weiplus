package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KTableViewCellManager */
/* loaded from: classes15.dex */
public abstract class AbstractC3531xb42eb743 {

    /* renamed from: com.tencent.kinda.gen.KTableViewCellManager$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13682x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13683x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13684xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13684xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28176x23caefe3(long j17);

        /* renamed from: native_getEditActions */
        private native java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a> m28177x892ec785(long j17);

        /* renamed from: native_getView */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda m28178x9c2e92f3(long j17);

        /* renamed from: destroy */
        public void m28179x5cd39ffa() {
            if (this.f13683x766b9619.getAndSet(true)) {
                return;
            }
            m28176x23caefe3(this.f13684xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28180xd764dc1e() {
            m28179x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743
        /* renamed from: getEditActions */
        public java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a> mo28174x4d3ba5d() {
            return m28177x892ec785(this.f13684xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3531xb42eb743
        /* renamed from: getView */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda mo28175xfb86a31b() {
            return m28178x9c2e92f3(this.f13684xc3e764fc);
        }
    }

    /* renamed from: getEditActions */
    public abstract java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3529xc7a0d18a> mo28174x4d3ba5d();

    /* renamed from: getView */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda mo28175xfb86a31b();
}
