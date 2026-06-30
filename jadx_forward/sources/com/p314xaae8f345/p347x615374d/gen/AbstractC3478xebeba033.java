package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KListViewCallback */
/* loaded from: classes15.dex */
public abstract class AbstractC3478xebeba033 {

    /* renamed from: com.tencent.kinda.gen.KListViewCallback$CppProxy */
    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13626x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13627x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13628xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13628xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28027x23caefe3(long j17);

        /* renamed from: native_fillData */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 m28028x48d9eaf5(long j17, int i17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda);

        /* renamed from: native_getCount */
        private native int m28029xe89b0281(long j17);

        /* renamed from: native_getViewType */
        private native int m28030xec1de4cd(long j17, int i17);

        /* renamed from: native_getViewTypeCount */
        private native int m28031x90a67442(long j17);

        /* renamed from: destroy */
        public void m28032x5cd39ffa() {
            if (this.f13627x766b9619.getAndSet(true)) {
                return;
            }
            m28027x23caefe3(this.f13628xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033
        /* renamed from: fillData */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 mo28023xd483dfcd(int i17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda) {
            return m28028x48d9eaf5(this.f13628xc3e764fc, i17, interfaceC3546x99da0cda);
        }

        /* renamed from: finalize */
        public void m28033xd764dc1e() {
            m28032x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033
        /* renamed from: getCount */
        public int mo28024x7444f759() {
            return m28029xe89b0281(this.f13628xc3e764fc);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033
        /* renamed from: getViewType */
        public int mo28025xc321a0f5(int i17) {
            return m28030xec1de4cd(this.f13628xc3e764fc, i17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033
        /* renamed from: getViewTypeCount */
        public int mo28026xb6da111a() {
            return m28031x90a67442(this.f13628xc3e764fc);
        }
    }

    /* renamed from: fillData */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 mo28023xd483dfcd(int i17, com.p314xaae8f345.p347x615374d.gen.InterfaceC3546x99da0cda interfaceC3546x99da0cda);

    /* renamed from: getCount */
    public abstract int mo28024x7444f759();

    /* renamed from: getViewType */
    public abstract int mo28025xc321a0f5(int i17);

    /* renamed from: getViewTypeCount */
    public abstract int mo28026xb6da111a();
}
