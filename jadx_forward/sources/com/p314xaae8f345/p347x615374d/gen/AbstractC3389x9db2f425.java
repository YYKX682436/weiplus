package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.CppUtil */
/* loaded from: classes9.dex */
public abstract class AbstractC3389x9db2f425 {

    /* renamed from: com.tencent.kinda.gen.CppUtil$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3389x9db2f425 {

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13475x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13476xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13476xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27423x23caefe3(long j17);

        /* renamed from: destroy */
        public void m27424x5cd39ffa() {
            if (this.f13475x766b9619.getAndSet(true)) {
                return;
            }
            m27423x23caefe3(this.f13476xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27425xd764dc1e() {
            m27424x5cd39ffa();
            super.finalize();
        }
    }

    /* renamed from: getFilterLog */
    public static native java.lang.String m27422xcae47df6(java.lang.String str);
}
