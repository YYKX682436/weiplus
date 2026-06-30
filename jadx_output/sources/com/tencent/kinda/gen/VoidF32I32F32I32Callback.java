package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class VoidF32I32F32I32Callback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.VoidF32I32F32I32Callback {
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

        private native void native_call(long j17, float f17, int i17, float f18, int i18);

        @Override // com.tencent.kinda.gen.VoidF32I32F32I32Callback
        public void call(float f17, int i17, float f18, int i18) {
            native_call(this.nativeRef, f17, i17, f18, i18);
        }

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
    }

    public abstract void call(float f17, int i17, float f18, int i18);
}
