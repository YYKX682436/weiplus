package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KTableViewCellManagerV2 */
/* loaded from: classes15.dex */
public abstract class AbstractC3532x635dfd1f {

    /* renamed from: com.tencent.kinda.gen.KTableViewCellManagerV2$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3532x635dfd1f {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13685x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13686x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13687xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13687xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28183x23caefe3(long j17);

        /* renamed from: native_getEditActions */
        private native java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6> m28184x892ec785(long j17);

        /* renamed from: native_getView */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda m28185x9c2e92f3(long j17);

        /* renamed from: destroy */
        public void m28186x5cd39ffa() {
            if (this.f13686x766b9619.getAndSet(true)) {
                return;
            }
            m28183x23caefe3(this.f13687xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28187xd764dc1e() {
            m28186x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3532x635dfd1f
        /* renamed from: getEditActions */
        public java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6> mo28181x4d3ba5d() {
            return m28184x892ec785(this.f13687xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3532x635dfd1f
        /* renamed from: getView */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda mo28182xfb86a31b() {
            return m28185x9c2e92f3(this.f13687xc3e764fc);
        }
    }

    /* renamed from: getEditActions */
    public abstract java.util.ArrayList<com.p314xaae8f345.p347x615374d.gen.AbstractC3530x62b2a1a6> mo28181x4d3ba5d();

    /* renamed from: getView */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda mo28182xfb86a31b();
}
