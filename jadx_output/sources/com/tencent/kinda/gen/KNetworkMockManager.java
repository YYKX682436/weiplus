package com.tencent.kinda.gen;

/* loaded from: classes12.dex */
public abstract class KNetworkMockManager {

    /* loaded from: classes12.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KNetworkMockManager {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.concurrent.atomic.AtomicBoolean destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j17;
        }

        private native void nativeDestroy(long j17);

        private native byte[] native_jsonToRequestData(long j17, java.lang.String str);

        private native byte[] native_jsonToResponseData(long j17, java.lang.String str);

        private native java.lang.String native_requestDataToJson(long j17, byte[] bArr);

        private native java.lang.String native_responseDataToJson(long j17, byte[] bArr);

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.kinda.gen.KNetworkMockManager
        public byte[] jsonToRequestData(java.lang.String str) {
            return native_jsonToRequestData(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.KNetworkMockManager
        public byte[] jsonToResponseData(java.lang.String str) {
            return native_jsonToResponseData(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.KNetworkMockManager
        public java.lang.String requestDataToJson(byte[] bArr) {
            return native_requestDataToJson(this.nativeRef, bArr);
        }

        @Override // com.tencent.kinda.gen.KNetworkMockManager
        public java.lang.String responseDataToJson(byte[] bArr) {
            return native_responseDataToJson(this.nativeRef, bArr);
        }
    }

    public static native java.util.HashMap<java.lang.Integer, java.lang.String> getCgiList();

    public abstract byte[] jsonToRequestData(java.lang.String str);

    public abstract byte[] jsonToResponseData(java.lang.String str);

    public abstract java.lang.String requestDataToJson(byte[] bArr);

    public abstract java.lang.String responseDataToJson(byte[] bArr);
}
