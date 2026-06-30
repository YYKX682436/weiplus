package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class TenpayCgiCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.TenpayCgiCallback {
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

        private native void native_onError(long j17, int i17, java.lang.String str);

        private native void native_onSuccess(long j17, java.lang.String str);

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

        @Override // com.tencent.kinda.gen.TenpayCgiCallback
        public void onError(int i17, java.lang.String str) {
            native_onError(this.nativeRef, i17, str);
        }

        @Override // com.tencent.kinda.gen.TenpayCgiCallback
        public void onSuccess(java.lang.String str) {
            native_onSuccess(this.nativeRef, str);
        }
    }

    public abstract void onError(int i17, java.lang.String str);

    public abstract void onSuccess(java.lang.String str);
}
