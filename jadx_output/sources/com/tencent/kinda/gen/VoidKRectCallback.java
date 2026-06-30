package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class VoidKRectCallback {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.VoidKRectCallback {
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

        private native void native_call(long j17, com.tencent.kinda.gen.KRect kRect);

        @Override // com.tencent.kinda.gen.VoidKRectCallback
        public void call(com.tencent.kinda.gen.KRect kRect) {
            native_call(this.nativeRef, kRect);
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

    public abstract void call(com.tencent.kinda.gen.KRect kRect);
}
