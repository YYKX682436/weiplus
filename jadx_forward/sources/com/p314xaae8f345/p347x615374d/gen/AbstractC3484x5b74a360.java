package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.KNetworkMockManager */
/* loaded from: classes12.dex */
public abstract class AbstractC3484x5b74a360 {

    /* renamed from: com.tencent.kinda.gen.KNetworkMockManager$CppProxy */
    /* loaded from: classes12.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360 {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13632x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13633x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13634xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13634xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m28044x23caefe3(long j17);

        /* renamed from: native_jsonToRequestData */
        private native byte[] m28045x5f00432e(long j17, java.lang.String str);

        /* renamed from: native_jsonToResponseData */
        private native byte[] m28046x8aa02dd6(long j17, java.lang.String str);

        /* renamed from: native_requestDataToJson */
        private native java.lang.String m28047xf893d814(long j17, byte[] bArr);

        /* renamed from: native_responseDataToJson */
        private native java.lang.String m28048xfb8b3a96(long j17, byte[] bArr);

        /* renamed from: destroy */
        public void m28049x5cd39ffa() {
            if (this.f13633x766b9619.getAndSet(true)) {
                return;
            }
            m28044x23caefe3(this.f13634xc3e764fc);
        }

        /* renamed from: finalize */
        public void m28050xd764dc1e() {
            m28049x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360
        /* renamed from: jsonToRequestData */
        public byte[] mo28040xff404156(java.lang.String str) {
            return m28045x5f00432e(this.f13634xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360
        /* renamed from: jsonToResponseData */
        public byte[] mo28041xf25ff4ae(java.lang.String str) {
            return m28046x8aa02dd6(this.f13634xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360
        /* renamed from: requestDataToJson */
        public java.lang.String mo28042x98d3d63c(byte[] bArr) {
            return m28047xf893d814(this.f13634xc3e764fc, bArr);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3484x5b74a360
        /* renamed from: responseDataToJson */
        public java.lang.String mo28043x634b016e(byte[] bArr) {
            return m28048xfb8b3a96(this.f13634xc3e764fc, bArr);
        }
    }

    /* renamed from: getCgiList */
    public static native java.util.HashMap<java.lang.Integer, java.lang.String> m28039x6885168d();

    /* renamed from: jsonToRequestData */
    public abstract byte[] mo28040xff404156(java.lang.String str);

    /* renamed from: jsonToResponseData */
    public abstract byte[] mo28041xf25ff4ae(java.lang.String str);

    /* renamed from: requestDataToJson */
    public abstract java.lang.String mo28042x98d3d63c(byte[] bArr);

    /* renamed from: responseDataToJson */
    public abstract java.lang.String mo28043x634b016e(byte[] bArr);
}
