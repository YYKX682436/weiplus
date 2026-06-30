package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class KEditTextOnFocusChangeCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.KEditTextOnFocusChangeCallback {
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

        private native void native_onFocusChange(long j17, boolean z17);

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

        @Override // com.tencent.kinda.gen.KEditTextOnFocusChangeCallback
        public void onFocusChange(boolean z17) {
            native_onFocusChange(this.nativeRef, z17);
        }
    }

    public abstract void onFocusChange(boolean z17);
}
