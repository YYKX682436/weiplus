package com.tencent.kinda.gen;

/* loaded from: classes12.dex */
public abstract class KCgi {

    /* loaded from: classes12.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KCgi {
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

        private native int native_getCgiId(long j17);

        private native java.lang.String native_getCgiUrl(long j17);

        private native int native_getChannelType(long j17);

        private native boolean native_getNeedNotify(long j17);

        private native com.tencent.kinda.gen.KindaNewDNSBusinessType native_getNewDNSBusinessType(long j17);

        private native byte[] native_getRequestData(long j17);

        private native int native_getRetryCount(long j17);

        private native java.lang.String native_getRouteInfo(long j17);

        private native int native_getTimeout(long j17);

        private native void native_onResp(long j17, int i17, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

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

        @Override // com.tencent.kinda.gen.KCgi
        public int getCgiId() {
            return native_getCgiId(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public java.lang.String getCgiUrl() {
            return native_getCgiUrl(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public int getChannelType() {
            return native_getChannelType(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public boolean getNeedNotify() {
            return native_getNeedNotify(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public com.tencent.kinda.gen.KindaNewDNSBusinessType getNewDNSBusinessType() {
            return native_getNewDNSBusinessType(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public byte[] getRequestData() {
            return native_getRequestData(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public int getRetryCount() {
            return native_getRetryCount(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public java.lang.String getRouteInfo() {
            return native_getRouteInfo(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public int getTimeout() {
            return native_getTimeout(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.KCgi
        public void onResp(int i17, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_onResp(this.nativeRef, i17, bArr, hashMap);
        }
    }

    public abstract int getCgiId();

    public abstract java.lang.String getCgiUrl();

    public abstract int getChannelType();

    public abstract boolean getNeedNotify();

    public abstract com.tencent.kinda.gen.KindaNewDNSBusinessType getNewDNSBusinessType();

    public abstract byte[] getRequestData();

    public abstract int getRetryCount();

    public abstract java.lang.String getRouteInfo();

    public abstract int getTimeout();

    public abstract void onResp(int i17, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> hashMap);
}
